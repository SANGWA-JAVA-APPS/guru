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
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    
    private long id;
    //profile
    private String name;
    private String surname;
    private String gender;
    //category
    private Long account_category_id;
    private String catname;

    //account
    private String username;
    private String password;

    public UsersDTO(long id, String name, String surname, String gender, Long account_category_id, String catname, String username, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.account_category_id = account_category_id;
        this.catname = catname;
        this.username = username;
        this.password = password;
    }

    private String devuser;//this is the field that is used while doing registration by a visitor


    
}
