/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.repo;

import com.codeguru_base.jwtsecurity.User;
import com.codeguru_base.models.UserDetailsResponse;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public interface AccountRepository extends JpaRepository<User, Long> {

    @Query(value = "select id,username, password, profile, acc_category, profile_id "
            + " from account"
            + "  where username=? and password=? ", nativeQuery = true)
    User findAccountByUsernamePassword(String username, String password);

    public User findByUsername(String username);

    @Query(" SELECT new com.codeguru_base.models.UserDetailsResponse ( a.id, a.username, a.password, ac.name as catname, p.name, p.surname, a.status ) "
            + " from User  a"
            + " join a.mdl_profile  p "
            + " join a.mdl_account_category  ac "
            + " where a.username = ?1 and status= ?2 ")
    public UserDetailsResponse findUserAndProfile(String username, String status);

    @Query(" SELECT new com.codeguru_base.models.UserDetailsResponse ( a.id, a.username, a.password, ac.name as catname, p.name, p.surname, a.status ) "
            + "   from User  a"
            + " join a.mdl_profile  p "
            + " join a.mdl_account_category  ac"
            + " where status= ?1 ")
    public List<UserDetailsResponse> findUserAndProfileByStatus(String status);

    public long countByUsername(String username);
}
