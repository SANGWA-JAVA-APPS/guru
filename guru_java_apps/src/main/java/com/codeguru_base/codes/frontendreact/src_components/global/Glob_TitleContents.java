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
 
public class Glob_TitleContents extends Utils {

    public String Glob_TitleContents() {
        return "import React from 'react'\n"
                + "\n"
                + "export function EditTitle(props){\n"
                + "  const space={\n"
                + "    marginBottom: \"15px\"\n"
                + "\n"
                + "  }\n"
                + "  return (\n"
                + "    <h4 class=\"boldTitle\" style={space}>Edit  {props.name}</h4>\n"
                + "  )\n"
                + "}\n"
                + "\n"
                + "function Title(props) {\n"
                + "  const space={\n"
                + "    marginBottom: \"15px\"\n"
                + "\n"
                + "  }\n"
                + "  return (\n"
                + "    <h4 class=\"boldTitle\" style={space} >Add new {props.name}</h4>\n"
                + "  )\n"
                + "}\n"
                + "\n"
                + "export default Title";
    }
}
