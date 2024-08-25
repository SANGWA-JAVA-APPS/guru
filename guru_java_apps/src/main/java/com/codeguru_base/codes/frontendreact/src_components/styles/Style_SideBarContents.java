/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.styles;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Style_SideBarContents extends Utils {

    public String Style_SideBarContents() {
        return "*{\n"
                + "    margin:0;\n"
                + "    padding:0;\n"
                + "    text-decoration: none;\n"
                + "}\n"
                + ".menuContainer{\n"
                + "    display:flex;\n"
                + "}\n"
                + "main{\n"
                + "    width: 100%;\n"
                + "    padding: 20px;\n"
                + "    margin-left: 60px;;\n"
                + "}\n"
                + ".sidebar{\n"
                + "    background: rgb(6, 52, 66);\n"
                + "    color: #fff;\n"
                + "    height: 100vh;\n"
                + "    width: 200px;\n"
                + "    transition: all 0.5s;\n"
                + "    position: fixed;\n"
                + "    left: 0px;\n"
                + "}\n"
                + ".top_section{\n"
                + "    display: flex;\n"
                + "    align-items:center;\n"
                + "    padding:20px 15px;\n"
                + "}\n"
                + ".logo{\n"
                + "    font-size: 30px;\n"
                + "}\n"
                + ".bars{\n"
                + "    display: flex;\n"
                + "    font-size: 25px;\n"
                + "    margin-left: 50px;\n"
                + "}\n"
                + ".link{\n"
                + "    display: flex;\n"
                + "    color: #fff;\n"
                + "    padding: 10px 15px;\n"
                + "    gap: 15px;\n"
                + "    transition: all 0.5s;\n"
                + "}\n"
                + ".link:hover{\n"
                + "    background:lightskyblue;\n"
                + "    color: #000;\n"
                + "    transition: all 0.5s;\n"
                + "}\n"
                + ".active{\n"
                + "    background: lightskyblue;\n"
                + "    color: #000;\n"
                + "}\n"
                + ".icon, .link_text{\n"
                + "    font-size: 20px;\n"
                + "}";
    }
}
