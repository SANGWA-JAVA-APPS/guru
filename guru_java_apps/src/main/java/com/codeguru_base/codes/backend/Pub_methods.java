/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeguru_base.codes.backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

/**
 *
 * @author SANGWA
 */
public class Pub_methods {

    public static String app_folder = "";//this gets initialized on the startup of the application

    public static boolean is_servlet = false;

    public void get_writer(String path_file, String content) {
        PrintWriter prnt;
        try {
            prnt = new PrintWriter(new BufferedWriter(new FileWriter(path_file)));
            prnt.println(content);
            prnt.close();
        } catch (IOException ex) {
            
        }
    }

    public String get_Capitalized(String field) {
        return field.substring(0, 1).toUpperCase() + field.substring(1);
    }
    public String get_Lowecase(String field) {
        return field.substring(0, 1).toLowerCase() + field.substring(1);
    }

    public static String get_uppercase(String field) {
        return field.toUpperCase();
    }

    public String get_short_int(String field) {
        return ("Integer".equals(field) | "int".equals(field)) ? "int" : "String";
    }

    public String get_pk(String field) {
        return ("pk".equals(field)) ? field + "_id" : field;
    }

    public String path(String path) {
        return "";
    }

    public static void copy_file(File source, File dest) {
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }

    public static void copy_directory(File source_dir, File dest_dir) {
        try {
            FileUtils.copyDirectory(source_dir, dest_dir, DirectoryFileFilter.DIRECTORY, false);
        } catch (IOException ex) {
            Logger.getLogger(Pub_methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String TodayDate() {
        Date date = new Date();
        Format formatter = new SimpleDateFormat("yyyy-MM-dd ");
        String d = formatter.format(date);
        return d;
    }
}
