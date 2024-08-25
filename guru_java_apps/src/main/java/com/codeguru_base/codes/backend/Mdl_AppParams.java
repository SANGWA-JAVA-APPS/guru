/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

import static com.codeguru_base.codes.backend.Commons.appsFolderName;
import com.codeguru_base.models.Mdl_structure;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Slf4j
public class Mdl_AppParams extends Commons {

    private boolean isFSBS = (System.getProperty("os.name").equals("Linux"));
    public String FsBsStr = isFSBS ? "/" : "\\"; //Forward slash or backslash, forward is for Linux
    private String controller_path = "controller";
    private String repo_pth = "repository";
    private String dto_path = "dto";
    private String model_path = "models";
    private String exceptionPath = "exception";
    private String com = "com";
    private String generatedBackend = "GeneratedApps" + FsBsStr + "BackEnd" + FsBsStr;
    private String generatedBackendNoother = "GeneratedApps" + FsBsStr + "BackEnd";
    private static String frontEnd = "FrontEnd";
    private static String backEnd = "BackEnd";

    public static Path currentWorkingDir = Paths.get("").toAbsolutePath();

    public String absolutePath = isFSBS ? "/opt/guru/" : currentWorkingDir.toAbsolutePath().toString() + FsBsStr;
    static final Logger logger = LoggerFactory.getLogger(Mdl_AppParams.class);
    String smj = super.src_main_java(FsBsStr);

    public String appFolder(String appName) {
        return absolutePath + generatedBackend + appName;
    }

    public String appnameFolder_src_main_java(String appName) {
        //GeneratedApps/appName/src/main/java
        return absolutePath + generatedBackend + appName + FsBsStr + smj;
    }

    public String comFolderstr(String appName) {
        return appnameFolder_src_main_java(appName) + FsBsStr + com;
    }

    public String packageName(String appName, String packagename) {
        return comFolderstr(appName) + FsBsStr + packagename;
    }

    public String controllerFolder(String appName, String packagename) {
        return packageName(appName, packagename) + FsBsStr + controller_path;
    }

    public String modelsFolder(String appName, String packagename) {
        return packageName(appName, packagename) + FsBsStr + model_path;
    }

    public String repoFolder(String appName, String packagename) {
        return packageName(appName, packagename) + FsBsStr + repo_pth;
    }

    public String exceptionFolder(String appName, String packagename) {
        return packageName(appName, packagename) + FsBsStr + exceptionPath;
    }

    public String dto_pthFolder(String appName, String packagename) {
        return packageName(appName, packagename) + FsBsStr + dto_path;
    }

    public String pomFilePath(String appName) {
        return appFolder(appName) + FsBsStr + "pom.xml";
    }

    public String appProperties(String appName) {
        return absolutePath + generatedBackend + appName + FsBsStr + src + FsBsStr + main + FsBsStr + FsBsStr + resources + FsBsStr + "application.properties";
    }

    public String mainClassPath(String appName, String packagename) {
        return packageName(appName, packagename) + FsBsStr +new Pub_methods().get_Capitalized( packagename) + "Application.java";
    }

    public void createBasicDirectoriesBackend(String appName, String packagename, Mdl_structure mdl_structure) throws IOException {

        String srcFolder = absolutePath + generatedBackend + appName + FsBsStr + src;
        String mainFolder = absolutePath + generatedBackend + appName + FsBsStr + src + FsBsStr + main;
        String resourcesFolder = absolutePath + generatedBackend + appName + FsBsStr + src + FsBsStr + main + FsBsStr + resources;
        String javaFolder = absolutePath + generatedBackend + appName + FsBsStr + src + FsBsStr + main + FsBsStr + java;
        String appnameFolder = absolutePath + generatedBackend + appName;

        String comFolder = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com;
        String packageName = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com + FsBsStr + packagename;
        String controllerFolder = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com + FsBsStr + packagename + FsBsStr + controller_path;
        String modelsFolder = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com + FsBsStr + packagename + FsBsStr + model_path;
        String repoFolder = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com + FsBsStr + packagename + FsBsStr + repo_pth;
        String exceptionFolder = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com + FsBsStr + packagename + FsBsStr + exceptionPath;
        String dto_pthFolder = absolutePath + generatedBackend + appName + FsBsStr + smj + FsBsStr + com + FsBsStr + packagename + FsBsStr + dto_path;

//        String src
        String scrFolder = "";

        //<editor-fold defaultstate="collapsed" desc="---------------Log for More Info on paths--------------------------">
        logger.info("\n----------\nUnder the method of \"createBasicDirectoriesBackend\" While deploying the structure\n-----------");
        logger.info("FsBsStr: " + FsBsStr);
        logger.info("absolutePath: " + absolutePath);
        logger.info("appnameFolder: " + appnameFolder);
        logger.info("generatedBackend: " + generatedBackend);
        logger.info("comFolder: " + comFolder);
        logger.info("packageName: " + packageName);
        logger.info("controllerFolder: " + controllerFolder);
        logger.info("modelsFolder: " + modelsFolder);
        logger.info("repoFolder: " + repoFolder);
        logger.info("exceptionFolder: " + exceptionFolder);
        logger.info("dto_pthFolder: " + dto_pthFolder);

        logger.info("\n--------\n The end of creating the Backend directoriess under the  createBasicDirectoriesBackend ");
        //</editor-fold>

        /* Genererateapps*/
        new File(absolutePath + appsFolderName).mkdir();
        /* Genererateapps\frontEnd     */
        new File(absolutePath + appsFolderName + FsBsStr + frontEnd).mkdir();
        /* Genererateapps\backEnd     */
        new File(absolutePath + appsFolderName + FsBsStr + backEnd).mkdir();
        /* Genererateapps\backEnd\appName                              */
        new File(appnameFolder).mkdir();
        /* Genererateapps\backEnd\appName\src */

        new File(srcFolder).mkdir();
        /* Genererateapps\backEnd\appName\src\main */
        new File(mainFolder).mkdir();
        /* Genererateapps\backEnd\appName\src\main\java */
        new File(javaFolder).mkdir();
        new File(resourcesFolder).mkdir();
        /* Genererateapps\backEnd\appName\com                          */
        new File(comFolder).mkdir();
        /* Genererateapps\backEnd\appName\com\codeguru                 */
        new File(packageName).mkdir();
        /* Genererateapps\backEnd\appName\com\codeguru\controller      */
        new File(controllerFolder).mkdir();
        /* Genererateapps\backEnd\appName\com\codeguru\models          */
        new File(modelsFolder).mkdir();
        /* Genererateapps\backEnd\appName\com\codeguru\exception       */
        new File(exceptionFolder).mkdir();
        /* Genererateapps\backEnd\appName\com\codeguru\repository      */
        new File(repoFolder).mkdir();
        /* Genererateapps\backEnd\appName\com\codeguru\dto             */
        new File(dto_pthFolder).mkdir();

        //Front End Dirs
        //<editor-fold defaultstate="collapsed" desc="--------------Write on Static Files">
        //Pom.xml
        new File(pomFilePath(appName)).createNewFile();
        new File(appProperties(appName)).createNewFile();
        new File(mainClassPath(appName, packagename )).createNewFile();
        
        new WriteOnStaticFiles().Code(appName, mdl_structure);
        //</editor-fold>
    }

}
