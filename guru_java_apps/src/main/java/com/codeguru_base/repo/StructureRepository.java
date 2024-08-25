/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.repo;

import com.codeguru_base.models.Mdl_structure;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public interface StructureRepository extends PagingAndSortingRepository<Mdl_structure, Long> {

    long countByPort(String port);

    @Query(value = "select count(db_name)  db_name from  structure where db_name=? ", nativeQuery = true)
    long countByDb_name(String db_name);

    @Query(value = "select count(project_final_name)  proj from  structure where project_final_name=? ", nativeQuery = true)
    long countByProjectFinalName(String final_name);

    @Query(value = "select count(repo_name)  repo_name from  structure where repo_name=? ", nativeQuery = true)
    long countByRepoName(String final_name);
}
