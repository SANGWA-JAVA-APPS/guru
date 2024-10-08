/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.controller;

import com.codeguru_base.repo.AccountRepository;
import com.codeguru_base.repo.ProfileRepository;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@RestController
@RequestMapping("/guru/api")
@Slf4j
public class HomeController {

    @Autowired
    AccountRepository AccountRepository;

    @Autowired
    ProfileRepository profileRepository;

    @Operation(summary = "Getting all comments by a tutorial")
    @GetMapping("/")
    public String home() {
//        String url = "http://localhost:8089/backend/";
//        RestTemplate temlate = new RestTemplate();
//        String Result = temlate.getForObject(url, String.class);
//
//        Iterable<Mdl_structure> getstructures = temlate.getForObject(url, Iterable.class);
//        String names = "";
//
//        for (Mdl_structure structure : getstructures) {
//            names += structure.getDb_name()+"\n";
//        }
//        return "welcome to CODEGURU app base "+names;
        return "Welcome to CODEGURU app base";

    }

}
