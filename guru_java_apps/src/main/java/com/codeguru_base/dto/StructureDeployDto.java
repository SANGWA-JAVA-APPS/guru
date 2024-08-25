/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author CODEGURU LTD, +250784113888
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StructureDeployDto {

    private long id;
    private String db_name;
    private String db_user;
    private String db_password;
    private int cash_total;
    private String start_time;
    private String delivery_date;
    private String pgm_language;
    private String platform;
    private String entry_date;
    private String User;
    //POM.XML
    private String springVersion;
    private String appgroup;
    private String artifact;
    private String appVersion;
    private String description;
    private String java_version;
    //The port will be provided, and the system will help to check if
    //it has in use by another application
    private String port;
    //-----------------------------------------------------------------------------DEPLOY SETTINGS  ---------------------------------------------
    private String repo_name;
    private String username;
    private String token;
    private String clone_location_win;
    private String clone_location_linux;
    private String project_final_name;
    private String final_deploy_location_linux;
    private String final_deploy_location_win;
    private String coppy_from_win;
    private String coppy_from_linux;
    private String files_to_copy_linux;
    private String files_to_copy_win;
    private String commands_linux;
    private String commands_win;
    private String status;
    private String date_time_project_start;
    private String date_time_last_commit;
    private String date_time_take_war;
    private String deploy_logs;

    public StructureDeployDto(long id, String db_name, String db_user, String db_password, int cash_total, String start_time,
            String delivery_date, String pgm_language, String platform, String entry_date, String User, String springVersion,
            String appgroup, String artifact, String appVersion, String description, String java_version, String port,
            String repo_name, String username, String token, String clone_location_win, String clone_location_linux,
            String project_final_name, String final_deploy_location_linux, String final_deploy_location_win, String coppy_from_win,
            String coppy_from_linux, String files_to_copy_linux, String files_to_copy_win, String commands_linux,
            String commands_win, String date_time_project_start) {
        this.id = id;
        this.db_name = db_name;
        this.db_user = db_user;
        this.db_password = db_password;
        this.cash_total = cash_total;
        this.start_time = start_time;
        this.delivery_date = delivery_date;
        this.pgm_language = pgm_language;
        this.platform = platform;
        this.entry_date = entry_date;
        this.User = User;
        this.springVersion = springVersion;
        this.appgroup = appgroup;
        this.artifact = artifact;
        this.appVersion = appVersion;
        this.description = description;
        this.java_version = java_version;
        this.port = port;
        this.repo_name = repo_name;
        this.username = username;
        this.token = token;
        this.clone_location_win = clone_location_win;
        this.clone_location_linux = clone_location_linux;
        this.project_final_name = project_final_name;
        this.final_deploy_location_linux = final_deploy_location_linux;
        this.final_deploy_location_win = final_deploy_location_win;
        this.coppy_from_win = coppy_from_win;
        this.coppy_from_linux = coppy_from_linux;
        this.files_to_copy_linux = files_to_copy_linux;
        this.files_to_copy_win = files_to_copy_win;
        this.commands_linux = commands_linux;
        this.commands_win = commands_win;
        this.date_time_project_start = date_time_project_start;
    }

}
