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
public class Glob_Buttons extends Utils {

    public String Glob_Buttons(String units, String ComponentsToCall) {
        return "import React from 'react'\n"
                + "\n"
                + "function Buttons(props) {\n"
                + "    return (\n"
                + "        <div>\n"
                + "            <div className=\"row\">\n"
                + "                <div className='col-6'>\n"
                + "                    <button type='button' className='mt-4 btn btn-danger'>Cancel</button>\n"
                + "                </div>\n"
                + "                <div className='col-6'>\n"
                + "                    <button type=\"submit\" className=\"mt-4 btn btn-info offset-8 col-4 float-right \">{props.caption}</button>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Buttons";
    }
}
