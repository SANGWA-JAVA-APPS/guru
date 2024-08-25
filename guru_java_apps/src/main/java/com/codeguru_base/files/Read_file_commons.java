/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeguru_base.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author SANGWA
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class Read_file_commons {

    private String file_name;
    private File file;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public static List<String> bufferReaderToList(File file, List<String> list) {

        if (file.isDirectory()) {
            File[] fileNames = file.listFiles();
            for (File my_file : fileNames) {//read each file
                bufferReaderToList(my_file, list);
            }
        } else {
            try {
                final BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                String line;
                while ((line = in.readLine()) != null) {
                    list.add(line);
                }
                in.close();

            } catch (final IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public void listAllFiles(File folder) {
        File[] fileNames = folder.listFiles();
        for (File file : fileNames) {
            // if directory call the same method again
            System.out.println("File: " + file.getName());
            if (file.isDirectory()) {
                listAllFiles(file);
            }
        }
    }

    public List<String> ListDirs(File folder) {
        File[] fileNames = folder.listFiles();
        List<String> files = new ArrayList<>();
        if (fileNames.length > 0) {
            for (File file : fileNames) {
                if (file.isDirectory()) {
                    files.add(file.getName());
                }
            }
        }
        return files;
    }

//    SSHClient setupSshj() throws IOException {
//
//        String remoteHost = "162.253.124.32";
//        String username = "files_user1@codeguru-pro.com";
//        String password = "ryv(_$p$KR$F";
//
//        SSHClient client = new SSHClient();
//
//        client.addHostKeyVerifier(
//                new PromiscuousVerifier());
//        client.connect(remoteHost);
//
//        client.authPassword(username, password);
//        return client;
//    }
    public void get_file_manip(File folder, String flag) {
        File[] fileNames = folder.listFiles();
        if (fileNames.length > 0) {
            for (File file : fileNames) {
                if (file.isDirectory()) {
                    get_file_manip(file, flag);
                } else {
                    file_manip(file, flag, file_name);
                }
            }
        }

    }

    abstract String file_manip(File file, String flag, String file_name);

}
