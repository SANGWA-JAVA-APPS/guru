/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.controller;

import com.codeguru_base.dto.DeployParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/guru/api/deploy")
public class DeploymentController {


    @Value("${external.port: default 8085}")
    String deployPort;

    @PostMapping("/")
    public void doDeploymentSave(@RequestBody DeployParams deployParams) {
//        DeployParams deployParams= new DeployParams();
        System.out.println("Post from Guru");
        System.out.println(deployParams.toString());
//        String getForStart = restTemplate.postForObject("http://localhost:" + deployPort + "/deployParams", deployParams, String.class);
    }
}
