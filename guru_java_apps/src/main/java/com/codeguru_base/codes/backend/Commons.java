/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.http.HttpServlet;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author SANGWA
 */
@Getter
@Setter
public class Commons extends HttpServlet {

    public String fields(String tuple) {
        return "           this." + tuple + " = " + tuple + ";\n";
    }

    public static String appsFolderName = "GeneratedApps";
    public static String frontEnd = "FrontEnd";
    public static String backEnd = "BackEnd";
    
    public static String src = "src";
    public static String main = "main";
    public static String resources = "resources";
    public static String java = "java";
    public static String pomFil = "pom.xml";
    

    
    public static String src_main_java(String FsBsStr) {
        return "src" + FsBsStr + "main" + FsBsStr + "java";
    }

    public static Double get_percentage(Double tot, Double ref) {
        return ref / tot * 100;
    }

    public void Zip_file(String sourceFile, String destFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(destFile);
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(sourceFile);
        fileToZip.setExecutable(true, false);
        fileToZip.setReadable(true, false);
        fileToZip.setWritable(true, false);
        zipFile(fileToZip, fileToZip.getName(), zipOut);
        zipOut.close();
        fos.close();
    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        fileToZip.setReadable(true, false);
        fileToZip.setWritable(true, false);
        fileToZip.setExecutable(true, false);
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            if (fileName.endsWith("/")) {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } else {
                zipOut.putNextEntry(new ZipEntry(fileName + "/"));
                zipOut.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
            }
            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        fis.close();
    }

}
