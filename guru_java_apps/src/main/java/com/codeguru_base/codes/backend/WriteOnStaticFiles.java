/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

import com.codeguru_base.exception.ResourceNotFoundException;
import com.codeguru_base.models.Mdl_structure;
import com.codeguru_base.repo.StructureRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class WriteOnStaticFiles extends Pub_methods {

    Mdl_AppParams paths = new Mdl_AppParams();

    public void Code(String appNsme, Mdl_structure mdlStructure) {

        String springVersion = mdlStructure.getSpringVersion(),
                group = mdlStructure.getAppgroup(),
                artifact = mdlStructure.getArtifact(),
                appVersion = mdlStructure.getAppVersion(),
                description = mdlStructure.getDescription(),
                java_version = mdlStructure.getJava_version(),
                db_user = mdlStructure.getDb_user(), 
                db_password = mdlStructure.getDb_password(), 
                port = mdlStructure.getPort();

        super.get_writer(paths.pomFilePath(appNsme), new PomContents().Code(springVersion, group, artifact, appVersion, description, java_version));
        super.get_writer(paths.appProperties(appNsme), new AppProperties().code(db_user, db_password, artifact, port));
        super.get_writer(paths.mainClassPath(appNsme, artifact), new MainClassContent().Code(mdlStructure.getArtifact(), artifact));
    }

}
