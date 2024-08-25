/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codeguru_base.controller;

import com.codeguru_base.models.Mdl_contactus;
import com.codeguru_base.repo.ContactusRepository;
import com.codeguru_base.util.SendSmsTermil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CODEGURU LTD, +250784113888
 */
@RestController
@RequestMapping("/guru/api/contactus")
public class ContactUsController {

    @Autowired
    private ContactusRepository contactUsRepo;

    LocalDateTime fullTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String date = fullTime.format(formatter);

    @PostMapping("/")
    public String saveMessage(@Valid @RequestBody Mdl_contactus message) {
        message.setStatus("pending");
        message.setDate(date);
        contactUsRepo.save(message);
        new SendSmsTermil().sendSms("0784113888", "Someone with this email " + message.getSender_email() + " has contacted you");
        return "Your message is well received";
    }

    @GetMapping("/pending")
    public List<Mdl_contactus> getAllPendings() {
        return contactUsRepo.getAllPendings();
    }

    @GetMapping("/byEmail/{email}")
    public List<Mdl_contactus> getContactusByEmail(@PathVariable("email") String email) {
        return contactUsRepo.getContactusByEmail(email);
    }

    @GetMapping("/byDate/{from}/{to}")
    public List<Mdl_contactus> getContactusByDate(@PathVariable("from") String from, @PathVariable("to") String to) {
        return contactUsRepo.findByDate(from, to);
    }

    @GetMapping("/byDate/{subject}")
    public List<Mdl_contactus> getContactusByDate(@PathVariable("subject") String subject) {
        return contactUsRepo.findBySubject(subject);
    }

    @PutMapping("/update/{id}")
    public String updateByStatus(@PathVariable("id") Long id) {
        Mdl_contactus existing = contactUsRepo.findById(id).orElse(null);
        if (existing != null) {
            String existingStatus = existing.getStatus();

            if (existingStatus.equalsIgnoreCase("pending")) {
                existing.setStatus("read");
            } else {
                existing.setStatus("pending");
            }
            contactUsRepo.save(existing);
        }
        return "done";
    }

}
