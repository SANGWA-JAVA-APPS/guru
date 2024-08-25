/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.publicdir;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class HtAccessContents {

    public String HtAccess() {
        return "    Options -MultiViews\n"
                + "    RewriteEngine On\n"
                + "    RewriteCond %{REQUEST_FILENAME} !-f\n"
                + "    RewriteRule ^ index.html [QSA,L]";
    }

}
