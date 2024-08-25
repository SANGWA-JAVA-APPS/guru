/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codeguru_base.repo;

import com.codeguru_base.models.Mdl_contactus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author CODEGURU LTD, +250784113888
 */
public interface ContactusRepository extends JpaRepository<Mdl_contactus, Object> {

    @Query(value = "select * from contactus c where c.status = 'pending'", nativeQuery = true)
    List<Mdl_contactus> getAllPendings();

    @Query(value = "select * from contactus c where c.status = 'pending' and c.sender_email = :email ", nativeQuery = true)
    List<Mdl_contactus> getContactusByEmail(@Param("email") String email);

    @Query(value = "select * from contactus c where c.date between :from and :to ", nativeQuery = true)
    List<Mdl_contactus> findByDate(@Param("from") String from, @Param("to") String to);

    @Query(value = "select * from contactus c where c.subject = :subject ", nativeQuery = true)
    List<Mdl_contactus> findBySubject(@Param("subject") String subject);

}
