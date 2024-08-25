/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@Entity
@Table(name = "structure")
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mdl_structure implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 1, max = 200, message = " db_name should not be empty, null and or lengt exceed 18")
    @Column(length = 200, unique = true, nullable = false)
    private String db_name;

    @Size(min = 1, max = 18, message = " db_user should not be empty, null and or lengt exceed 18")
    @Column(nullable = true)
    private String db_user;

    @Size(min = 1, max = 18, message = " db_password should not be empty, null and or lengt exceed 18")
    @Column(nullable = true, length = 80)
    private String db_password;

    @Size(min = 1, max = 18, message = " cash_total should not be empty, null and or lengt exceed 18")
    @Column(length = 30, nullable = true)
    private int cash_total;

    @Size(min = 1, max = 18, message = " start_time should not be empty, null and or lengt exceed 18")
    @Column(length = 30, nullable = true)
    private String start_time;

    @Size(min = 1, max = 18, message = " delivery_date should not be empty, null and or lengt exceed 18")
    @Column(length = 30, nullable = true)
    private String delivery_date;

    @Size(min = 1, max = 18, message = " pgm_language should not be empty, null and or lengt exceed 18")
    @Column(length = 30, nullable = true)
    private String pgm_language;

    @Size(min = 1, max = 18, message = " platform should not be empty, null and or lengt exceed 18")
    @Column(length = 30, nullable = true)
    private String platform;

    @Size(min = 1, max = 18, message = " entry_date should not be empty, null and or lengt exceed 18")
    @Column(length = 30, nullable = true)
    private String entry_date;

    @Size(min = 1, max = 18, message = " User should not be empty, null and or lengt exceed 18")
    @Column(length = 80, nullable = true)
    private String User;

    //POM.XML
   
    @Size(min = 1, max = 20, message = " springVersion should not be empty, null and or lengt exceed 18")
    @Column(length = 20, nullable = true)
    private String springVersion;

    @Size(min = 1, max = 80, message = " appgroup should not be empty, null and or lengt exceed 18")
    @Column(length = 80, nullable = true)
    private String appgroup;
    
    @Size(min = 1, max = 80, message = " artifact should not be empty, null and or lengt exceed 18")
    @Column(length = 80, nullable = true)
    private String artifact;
    
    @Size(min = 1, max = 80, message = " appVersion should not be empty, null and or lengt exceed 18")
    @Column(length = 80, nullable = true)
    private String appVersion;
    
    @Size(min = 1, max = 20, message = " description should not be empty, null and or lengt exceed 18")
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Size(min = 1, max = 20, message = " java_version should not be empty, null and or lengt exceed 18")
    @Column(length = 20, nullable = true)
    private String java_version;
    
    @Size(min = 1, max = 10, message = " port should not be empty, null and or lengt exceed 18")
    @Column(length = 10, unique = true, nullable = false)
    //The port will be provided, and the system will help to check if it has in use by another application
    private String port;

    @OneToMany(mappedBy = "mdl_structure", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("mdl_structure")
    private List<Mdl_unit> o_units;

    //-----------------------------------------------------------------------------DEPLOY SETTINGS  ---------------------------------------------
    @Column(unique = true)
    String repo_name;
    String username;
    String token;

    //specify where project will be clonned
    String clone_location_win;
    String clone_location_linux;

    //the final name of the jat, usually this will the same as the one speficfied in the pom
    @Column(unique = true)
    String project_final_name;

    //specify where project will be deployed and coppied to
    String final_deploy_location_linux;
    String final_deploy_location_win;

    //specify where the coppied files will be moved from
    String coppy_from_win;
    String coppy_from_linux;
    //specify if it will copy all_files or copy specific files, specific folders
    String files_to_copy_linux;
    String files_to_copy_win;

    /*  These are the command that the users wants to have the system run, for eg: "mvn clean install" or "npm run build"
        The system will be able to deploy any type of applocation  */
    String commands_linux;
    String commands_win;
    //(open,closed) these are the values on status to show if project is ongoing or closed
    String status;
    //This by defaul will be blank and it will have records when the while loop runs from com.deploy.service the method is  cloneBuildAndCopy
    String date_time_project_start;
    //this by defaul will be blank and it will have records when the while loop runs from com.deploy.service the method is  cloneBuildAndCopy
    String date_time_last_commit;
//    and it will have records when the while loop runs from com.deploy.service the method is  cloneBuildAndCopy
    String date_time_take_war;

    @Column(columnDefinition = "MEDIUMTEXT")
    String deploy_logs;


}
