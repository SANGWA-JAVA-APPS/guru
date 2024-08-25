/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.controller;

import com.codeguru_base.dto.CustomErrorMessage;
import com.codeguru_base.dto.StructureDeployDto;
import com.codeguru_base.exception.ResourceNotFoundException;
import com.codeguru_base.models.Mdl_structure;
import com.codeguru_base.models.Mdl_tuple;
import com.codeguru_base.models.Mdl_unit;
import com.codeguru_base.repo.AccountRepository;
import com.codeguru_base.repo.Account_categoryRepository;
import com.codeguru_base.repo.ProfileRepository;
import com.codeguru_base.repo.StructureRepository;
import com.codeguru_base.repo.TupleRepository;
import com.codeguru_base.repo.UnitRepository;
import com.codeguru_base.util.Utils;
import io.swagger.v3.oas.annotations.Operation;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@RestController
@RequestMapping("/guru/api/structure")
@Slf4j
public class StructureController {

    @Autowired
    TupleRepository tupleRepository;
    @Autowired
    StructureRepository structureRepository;

    @Autowired
    UnitRepository unitRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ProfileRepository profileRepository;
    @Autowired
    Account_categoryRepository account_categoryRepository;

    @Operation(summary = "Getting all the structures Lazily")
    @GetMapping("/mappedDTO")
    public List<Mdl_structure> getAllLazy() {
        List<Mdl_structure> struc = new ArrayList<>();
        structureRepository.findAll().forEach(struc::add);
        return struc;
    }

    @Operation(summary = "Getting all the structures only")
    @RequestMapping(value = "/")
    public ResponseEntity<List<Mdl_structure>> getAll() {
        List<Mdl_structure> struc = new ArrayList<>();
        structureRepository.findAll().forEach(struc::add);
        return new ResponseEntity<>(struc, HttpStatus.OK);
    }

    @Operation(summary = "Getting a structure by id")
    @GetMapping("/{id}")
    public ResponseEntity<Mdl_structure> getStructureById(@PathVariable("id") long id) {
        Mdl_structure mdlmdl_structure = structureRepository.findById(id).orElseThrow(() -> new ResourceAccessException("The structure with id : " + id + " was not found "));
        return new ResponseEntity<>(mdlmdl_structure, HttpStatus.OK);
    }

    @Operation(summary = "Creating a structure")
    @PostMapping("/")
    public ResponseEntity<?> createStructure(@RequestBody @Valid StructureDeployDto mdl_structure) {
        Mdl_unit mdl_unit = null;

        Mdl_structure mdl_structure1 = new Mdl_structure();
        //<editor-fold defaultstate="collapsed" desc="-------------set values ----------------------">

        mdl_structure1.setDb_name(mdl_structure.getDb_name());
        mdl_structure1.setDb_user(mdl_structure.getDb_user());
        mdl_structure1.setDb_password(mdl_structure.getDb_password());
        mdl_structure1.setCash_total(mdl_structure.getCash_total());
        mdl_structure1.setStart_time(mdl_structure.getStart_time());
        mdl_structure1.setDelivery_date(mdl_structure.getDelivery_date());
        mdl_structure1.setPgm_language(mdl_structure.getPgm_language());
        mdl_structure1.setPlatform(mdl_structure.getPlatform());
        mdl_structure1.setEntry_date(mdl_structure.getEntry_date());
        mdl_structure1.setUser(mdl_structure.getUser());
        mdl_structure1.setAppgroup(mdl_structure.getAppgroup());
        mdl_structure1.setArtifact(mdl_structure.getArtifact());
        mdl_structure1.setAppVersion(mdl_structure.getAppVersion());
        mdl_structure1.setDescription(mdl_structure.getDescription());
        mdl_structure1.setJava_version(mdl_structure.getJava_version());
        mdl_structure1.setPort(mdl_structure.getPort());
        mdl_structure1.setRepo_name(mdl_structure.getRepo_name());
        mdl_structure1.setUsername(mdl_structure.getUsername());
        mdl_structure1.setToken(mdl_structure.getToken());
        mdl_structure1.setClone_location_win(mdl_structure.getClone_location_win());
        mdl_structure1.setClone_location_win(mdl_structure.getClone_location_win());
        mdl_structure1.setClone_location_linux(mdl_structure.getClone_location_linux());
        mdl_structure1.setProject_final_name(mdl_structure.getProject_final_name());
        mdl_structure1.setFinal_deploy_location_linux(mdl_structure.getFinal_deploy_location_linux());
        mdl_structure1.setFinal_deploy_location_win(mdl_structure.getFinal_deploy_location_win());
        mdl_structure1.setCoppy_from_linux(mdl_structure.getCoppy_from_linux());
        mdl_structure1.setCoppy_from_win(mdl_structure.getCoppy_from_win());
        mdl_structure1.setCommands_linux(mdl_structure.getCommands_linux());
        mdl_structure1.setCommands_win(mdl_structure.getCommands_win());
        mdl_structure1.setFiles_to_copy_linux(mdl_structure.getFiles_to_copy_linux());
        mdl_structure1.setFiles_to_copy_win(mdl_structure.getFiles_to_copy_win());
        mdl_structure1.setDate_time_project_start(new Utils().getCurrentDateTime());

//</editor-fold>
        if (structureRepository.countByDb_name(mdl_structure.getDb_name()) > 0) {
            return new ResponseEntity<>(new CustomErrorMessage("The Project Name (App Name) should be unique.  \"" + mdl_structure.getDb_name() + "\" is already in use"), HttpStatus.FOUND);
        } else if (structureRepository.countByPort(mdl_structure.getPort()) > 0) {
            return new ResponseEntity<>(new CustomErrorMessage("The port is already in use. The port; " + mdl_structure.getPort() + " is already in use"), HttpStatus.FOUND);
        } else if (structureRepository.countByRepoName(mdl_structure.getRepo_name()) > 0) {
            return new ResponseEntity<>(new CustomErrorMessage("The Project   repo name  should be unique.   " + mdl_structure.getRepo_name() + " already exists"), HttpStatus.FOUND);
        } else if (structureRepository.countByProjectFinalName(mdl_structure.getProject_final_name()) > 0) {
            return new ResponseEntity<>(new CustomErrorMessage("The Project final name  should be unique. \"" + mdl_structure.getProject_final_name() + "\" already exists"), HttpStatus.FOUND);
        } else {
            mdl_structure1.setStatus("open");
            structureRepository.save(mdl_structure1);
            //Create the unit called account
            unitRepository.saveAndFlush(new Mdl_unit("account", 0, 0, mdl_structure1));
            mdl_unit = unitRepository.findLastUnit();
            tupleRepository.saveAndFlush(new Mdl_tuple("id", "Integer", "Normal", "ID", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("username", "String", "Normal", "Username", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("password", "String", "Normal", "Username", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("account_category", "Integer", "Normal", "Account Category", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("profile", "Integer", "Normal", "Profile", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            //Create the unit called category
            unitRepository.saveAndFlush(new Mdl_unit("account_category", 0, 0, mdl_structure1));
            mdl_unit = unitRepository.findLastUnit();
            tupleRepository.saveAndFlush(new Mdl_tuple("id", "Integer", "Normal", "ID", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("name", "String", "Normal", "Name", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));

            //Create the unit called Profile
            unitRepository.saveAndFlush(new Mdl_unit("profile", 0, 0, mdl_structure1));
            mdl_unit = unitRepository.findLastUnit();
            tupleRepository.saveAndFlush(new Mdl_tuple("id", "Integer", "Normal", "ID", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("name", "String", "Normal", "Name", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("surname", "String", "Normal", "Name", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));
            tupleRepository.saveAndFlush(new Mdl_tuple("gender", "String", "Normal", "Gender", new Utils().getCurrentDate(), new Utils().getCurrentDate(), mdl_unit));

            //Create the unit called category
            //Create the unit called profile
            return new ResponseEntity<>(mdl_structure, HttpStatus.CREATED);
        }
    }

    @Operation(summary = "Units, Tuples By structure")
    @GetMapping("/unitsByStructure/{structure_id}")
    public ResponseEntity<List<Mdl_tuple>> getUnitByStructure(@PathVariable("structure_id") int structure_id) {
        List<Mdl_tuple> mdl_tuple = tupleRepository.findUnitByStructure(structure_id);
        return new ResponseEntity<>(mdl_tuple, HttpStatus.OK);
    }

    @Operation(summary = "Updating  a single Structure")
    @PutMapping("/{id}")
    public ResponseEntity<Mdl_structure> updateStructure(@PathVariable(value = "id") long id, @RequestBody Mdl_structure mdl_structure) {
        Mdl_structure mdl_structure1 = structureRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Structure not found"));
        mdl_structure1.setDb_name(mdl_structure.getDb_name());
        mdl_structure1.setDb_password(mdl_structure.getDb_password());
        mdl_structure1.setDb_user(mdl_structure.getDb_user());
        mdl_structure1.setDelivery_date(mdl_structure.getDelivery_date());
        mdl_structure1.setEntry_date(mdl_structure.getEntry_date());
        mdl_structure1.setPgm_language(mdl_structure.getPgm_language());
        mdl_structure1.setPlatform(mdl_structure.getPlatform());
        mdl_structure1.setStart_time(mdl_structure.getStart_time());

        mdl_structure1.setStart_time(mdl_structure.getStart_time());
        mdl_structure1.setStart_time(mdl_structure.getStart_time());
        mdl_structure1.setStart_time(mdl_structure.getStart_time());
        mdl_structure1.setUser(mdl_structure.getUser());
        //POM.XML
        mdl_structure.setSpringVersion(mdl_structure.getSpringVersion());
        mdl_structure.setAppgroup(mdl_structure.getAppgroup());
        mdl_structure.setArtifact(mdl_structure.getArtifact());
        mdl_structure.setArtifact(mdl_structure.getArtifact());
        mdl_structure.setAppVersion(mdl_structure.getAppVersion());
        mdl_structure.setDescription(mdl_structure.getDescription());
        mdl_structure.setJava_version(mdl_structure.getJava_version());
        mdl_structure.setPort(mdl_structure.getPort());

        return new ResponseEntity<>(structureRepository.save(mdl_structure), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTag(@PathVariable("id") long id) {
        structureRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
