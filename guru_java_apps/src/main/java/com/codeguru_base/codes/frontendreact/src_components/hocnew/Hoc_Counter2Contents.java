/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.hocnew;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Hoc_Counter2Contents extends Utils {

    public String Hoc_Counter2Contents() {
        return "import React from 'react'\n"
                + "\n"
                + "function Counter2(props) {\n"
                + "    return (\n"
                + "        <>\n"
                + "            <button style={{color:\"red\"}} onClick={props.incCount}>\n"
                + "                {props.count}\n"
                + "            </button>\n"
                + "\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Counter2";
    }
}
