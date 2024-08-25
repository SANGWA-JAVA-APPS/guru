/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeguru_base.files;

import com.codeguru_base.codes.backend.Commons;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author SANGWA
 */
public class Read_File extends Read_file_commons {

    protected static String user_name = System.getProperty("user.name");

    protected static List<String> bufferReaderToArrayList(File path) {
        return bufferReaderToList(path, new ArrayList<>());
    }

    public void list_files_in_folder(File path) throws IOException {
        this.listAllFiles(path);
    }

    public void readContent(File file) throws IOException {
        System.out.println("read file " + file.getCanonicalPath());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String strLine;
            // Read lines from the file, returns null when end of stream 
            // is reached
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        }
    }

    public static void get_copy_file(File source, File dest) {
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public long get_file_size(String path) {
        long bytes = 0;
        File fl = new File(path);

        long file_length = fl.length();
        return file_length;

    }

    public int get_file_lines_count(File path) {
        List<String> list = bufferReaderToArrayList(path);
        return list.size();
    }

    public List<String> get_line_to_array(String str) {
        String[] str_arrays = str.split(" ");
        return new ArrayList<>(Arrays.asList(str_arrays));
    }

    void do_upload(String server, String user, String pass, String local_file, String remote_file) {
        int port = 21;
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();

            // APPROACH #2: uploads second file using an OutputStream
            File secondLocalFile = new File(local_file);
            String secondRemoteFile = remote_file;
            InputStream inputStream = new FileInputStream(secondLocalFile);
            OutputStream outputStream = ftpClient.storeFileStream(secondRemoteFile);
            byte[] bytesIn = new byte[4096];
            int read = 0;
            int c = 0;
            long tot_bytes = secondLocalFile.length();
            int ref_bytes = 0;
            System.out.println("File size; " + secondLocalFile.length());
            while ((read = inputStream.read(bytesIn)) != -1) {
                outputStream.write(bytesIn, 0, read);

                ref_bytes += read;
                c += 1;
                Double perc = Commons.get_percentage(Double.valueOf(tot_bytes), Double.valueOf(ref_bytes));
                String trimmed = String.format("%.1f", perc);
                System.out.println("Count: " + c + " Written bytes: " + trimmed);
            }
            inputStream.close();
            outputStream.close();

            boolean completed = ftpClient.completePendingCommand();
            if (completed) {
                System.out.println("The second file is uploaded successfully.");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    void do_download(String server, String user, String pass, String local_file, String remote_file) {
        int port = 21;
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(local_file));
            boolean success = ftpClient.retrieveFile(remote_file, outputStream1);
            File downloadFile2 = new File(local_file);
            OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream(downloadFile2));
            InputStream inputStream = ftpClient.retrieveFileStream(remote_file);
            byte[] bytesArray = new byte[4096];
            int bytesRead = -1;

            int c = 0;
            long tot_bytes = downloadFile2.length();
            int ref_bytes = 0;
            System.out.println("File size; " + downloadFile2.length());
            while ((bytesRead = inputStream.read(bytesArray)) != -1) {
                outputStream2.write(bytesArray, 0, bytesRead);

                ref_bytes += bytesRead;
                c += 1;
                Double perc = Commons.get_percentage(Double.valueOf(tot_bytes), Double.valueOf(ref_bytes));
                String trimmed = String.format("%.1f", perc);
                System.out.println("Count: " + c + " Written bytes: " + trimmed);
            }
            success = ftpClient.completePendingCommand();
            if (success) {
                System.out.println("File #2 has been downloaded successfully.");
            }
            outputStream2.close();
            inputStream.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean get_search_a_file(File path, String file_name) {
        super.setFile(path);
        String str = this.file_manip(path, "search", file_name);
        return ("found".equals(str));
    }

    public void char_pos(String str) {
        char[] my_store = str.toCharArray();
        System.out.println("Thhe size fo the arrya: " + my_store.length);
        for (int i = 0; i < my_store.length; i++) {
            System.out.println("The char positions: " + my_store[i] + " is at: " + i);
        }
    }

    public String get_equiv_length(String str1, String str2) {
        int len1 = str1.length();
        return str2.substring(0, len1);
    }

    public String get_resemblance_one_word(String str1, String str2) {
        String str_temp = "", remaining = "", new_str;
        List<String> resemblances = new ArrayList<>();
        if (str1.length() > str2.length()) {
            new_str = str2.substring(0, str1.length());
        } else if (str2.length() > str1.length()) {
            new_str = str1.substring(0, str2.length());
        }
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    try {
                        str_temp += String.valueOf(str2.charAt(j));//have a new string
                        i += 1;

                    } catch (Exception e) {
                        break;
                    }
                } else {
                    return str_temp;
                }

            }
        }

        return str_temp;

    }

    public void line_diff(String line) {
        line = "the line is adjusted to match the criteria+someotherthings appended+";
        String line2 = "The line is adjusted to march the likeliness+other thins are added as well+";

        List<String> words_a = new ArrayList<>();
        List<String> words_b = new ArrayList<>();
        words_a.addAll(this.get_line_to_array(line));
        words_b.addAll(this.get_line_to_array(line2));
        words_a.forEach(n -> System.out.println(n));

        System.out.println("\n-----\n");
        words_b.forEach(str -> System.out.println(str));
    }

    public Read_File() {
//        String list = this.get_resemblance_one_word("sangwa", "sangnzabanita");
//        System.out.println(list);
//        this.char_pos("SANGWA");

//        this.line_diff("done");
    }

    public void callZip(String folderLocation, String DestinationDirName) throws IOException {
        String sourceFile = folderLocation;
        FileOutputStream fos = new FileOutputStream(DestinationDirName+".zip" );
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(sourceFile);
        zipFile(fileToZip, fileToZip.getName(), zipOut);
        zipOut.close();
        fos.close();
    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {

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

    @Override
    String file_manip(File file, String flag, String file_name) {//This is the file is whithin loop
        switch (flag) {
            case "search":
                if (file.getName().equals(file_name)) {
                    System.out.println("The file is found");
                    return "found";
                }
        }
        return "";
    }

}
