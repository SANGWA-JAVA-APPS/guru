/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.global;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Glob_TableHead extends Utils {

    public String Glob_TableHead() {
        return "import React from 'react'\n"
                + "\n"
                + "function TableHead(props) {\n"
                + "  return (\n"
                + "    <thead>\n"
                + "    <tr>\n"
                + "       {props.children}\n"
                + "    </tr>\n"
                + "</thead>\n"
                + "  )\n"
                + "}\n"
                + "\n"
                + "export default TableHead";
    }
}
