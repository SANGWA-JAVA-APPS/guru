/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src.hocnew;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Hoc_BareInputContent extends Utils {

    public String Hoc_BareInputContent() {
        return "import React, { createContext } from 'react'\n"
                + "\n"
                + "function BareInput(props) {\n"
                + "\n"
                + "   \n"
                + "    return (\n"
                + "        <>\n"
                + "            <input type='text' getName={props.changedText} copied={props.copied} value={props.txtval} onChange={props.changedText} />\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default BareInput";
    }
}
