/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/* This class has the fields that help to send the request outside of guru using restTemplate*/
@Getter
@Setter
@ToString
@NoArgsConstructor
public class DeployParams {
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
    private String files_to_coppy;
    private String commands_linux;
    private String commands_win;
    private String status;
    private String language;
}
