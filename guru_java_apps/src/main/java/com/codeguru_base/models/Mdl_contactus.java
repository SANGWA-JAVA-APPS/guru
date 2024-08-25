/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author CODEGURU LTD, +250784113888
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "contactus")
public class Mdl_contactus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String date;
    @NotEmpty(message = "empty")
    String sender_email;
    @NotEmpty(message = "empty")
    String subject;
//    @NotEmpty(message = "empty")
    String telephone;
    @NotEmpty(message = "empty")
    String description;
    @NotEmpty(message = "empty")
    String status;
}
