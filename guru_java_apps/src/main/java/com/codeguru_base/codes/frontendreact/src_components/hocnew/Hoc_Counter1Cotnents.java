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
public class Hoc_Counter1Cotnents extends Utils {

    public String Hoc_Counter1Cotnents() {
        return "import React from 'react'\n"
                + "\n"
                + "function Counter1(props) {\n"
                + "    return (\n"
                + "        <>\n"
                + "            <button onClick={props.incCount}>\n"
                + "                {props.count}\n"
                + "            </button>\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Counter1";
    }
}
