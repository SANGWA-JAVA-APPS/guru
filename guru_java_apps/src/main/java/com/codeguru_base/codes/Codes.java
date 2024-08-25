/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes;

import com.codeguru_base.codes.backend.Controller_content;
import com.codeguru_base.codes.backend.Dto_content;
import com.codeguru_base.codes.backend.ExceptionFileContent;
import com.codeguru_base.codes.backend.Mdl_AppParams;
import com.codeguru_base.codes.backend.Mdl_SpaceParams;
import com.codeguru_base.codes.backend.ModelsContent;
import com.codeguru_base.codes.backend.Pub_methods;
import com.codeguru_base.codes.backend.Repos;
import com.codeguru_base.codes.frontendreact.MakeFrontEndDirs;
import com.codeguru_base.codes.frontendreact.Page;
import com.codeguru_base.codes.frontendreact.PageHelper;
import com.codeguru_base.codes.frontendreact.WriteOnStaticFiles;
import com.codeguru_base.exception.ResourceNotFoundException;
import com.codeguru_base.files.Read_File;
import com.codeguru_base.layouts.ChildRepository;
import com.codeguru_base.layouts.DTOChild;
import com.codeguru_base.layouts.DTOParent;
import com.codeguru_base.layouts.LayoutRepo;
import com.codeguru_base.layouts.Mdl_children;
import com.codeguru_base.layouts.ParentRepository;
import com.codeguru_base.models.Mdl_structure;
import com.codeguru_base.models.Mdl_unit;
import com.codeguru_base.repo.StructureRepository;
import com.codeguru_base.repo.UnitRepository;
import io.swagger.v3.oas.annotations.Operation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@RestController
@RequestMapping("/guru/api/codes")
@Slf4j
public class Codes extends Mdl_AppParams {

    @Autowired
    UnitRepository unitRepository;

    @Autowired
    LayoutRepo layoutrepository;
    @Autowired
    ChildRepository childRepository;
    @Autowired
    ParentRepository parentRepository;
    @Autowired
    StructureRepository structureRepository;
    static final org.slf4j.Logger logger = LoggerFactory.getLogger(Codes.class);

    @PostMapping()
    public List<String> createApp(@RequestBody Mdl_SpaceParams mdl_SpaceParams) {
        String appName = mdl_SpaceParams.getAppName();
        long structureId = mdl_SpaceParams.getStructureId();
        Mdl_structure mdl_structure = structureRepository.findById(structureId).orElseThrow(() -> new ResourceNotFoundException("The structure with id " + structureId + " was not found!!"));
        String packageName = mdl_structure.getArtifact();
        List<String> filesPaths = null;

        try {
            super.createBasicDirectoriesBackend(appName, packageName, mdl_structure);
            new MakeFrontEndDirs(mdl_SpaceParams.getAppName(), packageName);

            /*Genererateapps\backEnd */
            //Create a folder based on the app name
            List<Mdl_unit> units = new ArrayList<>();
            unitRepository.findUnitsByStrctureid(mdl_SpaceParams.getStructureId()).forEach(units::add);

            Pub_methods pm = new Pub_methods();
            ModelsContent mc = new ModelsContent();
            var unit_name = "";
            String field_name = "", model_code = "", controller_fields = "", parentMapping = "", childMapping = "";
            String PageCode = "";
            int c = 0;
            //The below are for frontend
            for (int i = 0; i < units.size(); i++) {
                try {
                    //units
                    PageHelper ph = new PageHelper();
                    unit_name = units.get(i).getName();

                    c = 0;
                    //<editor-fold defaultstate="collapsed" desc="-----------BackendEnd ----------------">
                    String valid_field = "", fields = "", params = "";
                    var dto_object = "";
                    controller_fields = "";
                    ResetInitsFrontEnd();//-------------------This is frontEnd
                    PageCode = "";
                    parentMapping = "";
                    childMapping = "";
                    List<DTOParent> parents = new ArrayList<>();
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="---------------------FrontEnd ----------------------------">
                    new WriteOnStaticFiles(appName, packageName, unit_name,
                            "Stock checkout", "The stock will manage your items well",
                            "The stock should be done effeciently", "Manage Finance and assets", "Check your Threshold", "Manage your Expiring items");
                    //</editor-fold>

                    for (int j = 0; j < units.get(i).getO_tuples().size(); j++) { //Tuples
                        //<editor-fold defaultstate="collapsed" desc="--------------------Backend -----------------------">
                        field_name = units.get(i).getO_tuples().get(j).getName();
                        String data_type = units.get(i).getO_tuples().get(j).getData_type();
                        String disp_label = units.get(i).getO_tuples().get(j).getDisplay_caption();
                        valid_field += mc.valid_field(c, field_name, data_type);
                        fields += super.fields(field_name);
                        params += mc.params(c, field_name, data_type);
                        controller_fields += new Controller_content().structure_update(unit_name, field_name);
                        //</editor-fold>

                        //<editor-fold defaultstate="collapsed" desc="---------------------------FrontEnd---------------------------">
                        ph.setDeclare(c, field_name);
                        ph.setFieldObjDeclare(c, field_name);
                        ph.setResetAfterSave(field_name, c);
                        ph.setfrntSetFieldOnUpdate(field_name);
                        ph.setUnitInputRow(unit_name, disp_label);
                        ph.setTableHeaderFields(disp_label);
                        ph.setTableBodyFields(unit_name, field_name);
                        //</editor-fold>
                        c += 1;
                    }
                    //<editor-fold defaultstate="collapsed" desc="-------------Backend ----------------">
                    String controller_code = new Controller_content().Controller(packageName, unit_name, controller_fields, packageName);
                    String repository_code = new Repos().Repos(unit_name, packageName);
                    String dto_code = new Dto_content().Dto_content(packageName, unit_name);

                    //<editor-fold defaultstate="collapsed" desc="-------Temp-------">
//                    long structureId = mdl_SpaceParams.getStructureId();
                    long unitId = units.get(i).getId();

                    List<Mdl_children> children = new ArrayList<>();

                    if (!addJpaMappingParent(mdl_SpaceParams, units, i, mc).equals("")) {
                        parentMapping += addJpaMappingParent(mdl_SpaceParams, units, i, mc);
                    }
//
                    if (!addJpaMappingChild(mdl_SpaceParams, units, i, mc).equals("")) {
                        childMapping += addJpaMappingChild(mdl_SpaceParams, units, i, mc);
                    }
                    model_code = mc.Model_content(unit_name, valid_field, fields, params, dto_object, packageName, parentMapping, childMapping);

                    BackendFilesMaker(appName, packageName, unit_name, pm, model_code, controller_code, repository_code, dto_code);

                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc="-------------------------Frontend--------------------------">
                    PageCode = new Page().Page(unit_name, PageHelper.frntDeclare, PageHelper.frntFieldObjDeclare, PageHelper.frntSetFieldOnUpdate, PageHelper.frntResetAfterSave, PageHelper.frntUnitInputRow, PageHelper.frntTableHeaderFields, PageHelper.frntTableBodyFields);
                    //</editor-fold>

                } //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file //Exception -- a single file
                catch (IOException ex) {
                    Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
                }

                new File(new MakeFrontEndDirs().eachUnitPath(appName, unit_name)).createNewFile();
                pm.get_writer(new MakeFrontEndDirs().eachUnitPath(appName, unit_name), PageCode);
            }
            String exception_cde = new ExceptionFileContent().code(packageName);
            new File(exceptionFolder(appName, packageName) + "/ResourceNotFoundException.java").createNewFile();
            pm.get_writer(exceptionFolder(appName, packageName) + "/ResourceNotFoundException.java", exception_cde);
            //Zip the app folder           
            String app = new MakeFrontEndDirs().apppath(appName);
            new Read_File().callZip(super.appFolder(appName), super.appFolder(appName));
            new Read_File().callZip(app, app);
            filesPaths = new ArrayList<>();
            filesPaths.add(modelsFolder(appName, packageName));
            filesPaths.add(controllerFolder(appName, packageName));
            filesPaths.add(repoFolder(appName, packageName));
            filesPaths.add(dto_pthFolder(appName, packageName));
            filesPaths.add(exceptionFolder(appName, packageName));
            filesPaths.add(mdl_structure.getArtifact());
            filesPaths.add(mdl_structure.getPort());

            logMore_info(appName, packageName);//this isjus to 

        } catch (IOException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filesPaths;
    }

    String addJpaMappingParent(Mdl_SpaceParams mdl_SpaceParams, List<Mdl_unit> units, int i, ModelsContent mc) {
        // add the parents and the children
        String parentMapping = "";
        List<DTOParent> parents = new ArrayList<>();
        long structureId = mdl_SpaceParams.getStructureId();
        long unitId = units.get(i).getId();
        parentRepository.findAllParentsByUnitId(structureId, unitId).forEach(parents::add);
        if (!parents.isEmpty()) {
            for (DTOParent parent : parents) {
                if (unitRepository.findChildNameById(mdl_SpaceParams.getStructureId(), parent.getUnitParentId()) != null) {
                    String parentName = "";
                    parentName = unitRepository.findChildNameById(structureId, parent.getUnitParentId()).getName();
                    parentMapping += mc.MyParentMappingCode(parentName);
                }
            }
        }
        return parentMapping;
    }

    String addJpaMappingChild(Mdl_SpaceParams mdl_SpaceParams, List<Mdl_unit> units, int i, ModelsContent mc) {
        String childMapping = "";
        List<DTOChild> children = new ArrayList<>();
        long structureId = mdl_SpaceParams.getStructureId();
        long unitId = units.get(i).getId();
        childRepository.findAllchildrenByUnitId(structureId, unitId).forEach(children::add);
        if (!children.isEmpty()) {
            for (DTOChild child : children) {
                if (unitRepository.findChildNameById(mdl_SpaceParams.getStructureId(), child.getUnitChildId()) != null) {
                    String childName = "";
                    childName = unitRepository.findChildNameById(structureId, child.getUnitChildId()).getName();
                    String parentname = unitRepository.findChildNameById(structureId, unitId).getName();
                    childMapping += mc.MyChildrenMappingCode(parentname, childName);
                }
            }
        }
        return childMapping;
    }

    private void logMore_info(String appName, String packageName) {

        logger.info("\n--------------------------------------\nGettint the paths for front end under Codes.java ");
        logger.info(modelsFolder(appName, packageName));
        logger.info("super.appnameFolder(appName), absolutePath + appName + \".zip\":  " + super.appnameFolder_src_main_java(appName) + absolutePath + appName + ".zip");
        logger.info(controllerFolder(appName, packageName));
        logger.info(repoFolder(appName, packageName));
        logger.info(dto_pthFolder(appName, packageName));
        logger.info(exceptionFolder(appName, packageName));
    }

    @Operation(summary = "Retrieve all Backend Apps")
    @GetMapping()
    public ResponseEntity<List<String>> listFilesUsingJavaIO() {
        System.out.println("absolute path: " + absolutePath);

        if (true) {//if logged in because anyone can come and download all apps

        }

        String appsFolder = (System.getProperty("os.name").equals("Linux"))
                ? absolutePath + "GeneratedApps/BackEnd"
                : absolutePath + "\\" + super.getGeneratedBackendNoother();
        if (!new File(appsFolder).exists()) {
            new File(absolutePath + "\\" + super.getGeneratedBackendNoother()).mkdir();
        }

        System.out.println("app folder: " + appsFolder);
        FilesMan fm = new FilesMan();
        List<String> files = fm.ListDirs(new File(appsFolder));
        return new ResponseEntity<>(files, HttpStatus.OK);
    }

    @Operation(summary = "Retrieve all FrontEnd Apps")
    @GetMapping("/frontendApps")
    public ResponseEntity<List<String>> FrontEndApps() {
        if (!new File(new MakeFrontEndDirs().frontEndPath()).exists()) {
            new File(new MakeFrontEndDirs().frontEndPath()).mkdir();
        }
        String appsFolder = new MakeFrontEndDirs().frontEndPath();
        FilesMan fm = new FilesMan();
        List<String> files = fm.ListDirs(new File(appsFolder));
        return new ResponseEntity<>(files, HttpStatus.OK);
    }

    @Operation(summary = "Downloading a backend app from the server:  Tutorial from: https://www.tutorialspoint.com/spring_boot/spring_boot_file_handling.htm")
    @GetMapping(value = "/download/{appName}")
    public ResponseEntity<Object> downloadFile(@PathVariable(value = "appName") String appName) throws IOException {
        String appname = super.appFolder(appName);
        System.out.println("--------------------" + appname + "------------------------");
        File file = new File(appname + ".zip");
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(
                file.length()).contentType(MediaType.parseMediaType("application/txt")).body(resource);
        return responseEntity;
    }

    @Operation(summary = "Downloading a Front end from the server:  Tutorial from: https://www.tutorialspoint.com/spring_boot/spring_boot_file_handling.htm")
    @GetMapping(value = "/downloadfront/{appName}")
    public ResponseEntity<Object> downloadFrontFile(@PathVariable(value = "appName") String appName) throws IOException {
        String appname = new MakeFrontEndDirs().apppath(appName);
        System.out.println("--------------------" + appname + "------------------------");
        File file = new File(appname + ".zip");
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(
                file.length()).contentType(MediaType.parseMediaType("application/txt")).body(resource);
        return responseEntity;
    }

    //<editor-fold defaultstate="collapsed" desc="---------------------Helper Methods----------------------------">
    private void BackendFilesMaker(String appName, String packageName, String unit_name, Pub_methods pm, String model_code, String controller_code, String repository_code, String dto_code) throws IOException {

        new File(modelsFolder(appName, packageName) + "/Mdl_" + unit_name + ".java").createNewFile();
        pm.get_writer(modelsFolder(appName, packageName) + "/Mdl_" + unit_name + ".java", model_code);
        //controller
        new File(controllerFolder(appName, packageName) + "/" + pm.get_Capitalized(unit_name) + "Controller.java").createNewFile();
        pm.get_writer(controllerFolder(appName, packageName) + "/" + unit_name + "Controller.java", controller_code);
        //Repository
        new File(repoFolder(appName, packageName) + "/" + pm.get_Capitalized(unit_name) + "Repository.java").createNewFile();
        pm.get_writer(repoFolder(appName, packageName) + "/" + unit_name + "Repository.java", repository_code);
        //Dto
        new File(dto_pthFolder(appName, packageName) + "/Multiple" + pm.get_Capitalized(unit_name) + "s.java").createNewFile();
        pm.get_writer(dto_pthFolder(appName, packageName) + "/Multiple" + pm.get_Capitalized(unit_name) + "s.java", dto_code);
    }

    private void ResetInitsFrontEnd() {
        PageHelper.frntTableHeaderFields = "";
        PageHelper.frntDeclare = "";
        PageHelper.frntFieldObjDeclare = "";
        PageHelper.frntSetFieldOnUpdate = "";
        PageHelper.frntResetAfterSave = "";
        PageHelper.frntUnitInputRow = "";
        PageHelper.frntTableBodyFields = "";
    }

    //</editor-fold>
    class FilesMan extends Read_File {

    }
}
