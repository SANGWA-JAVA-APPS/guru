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
public class Glob_PageWrapperContents extends Utils {

    public String Glob_PageWrapperContents() {
        return "import React from 'react'\n"
                + "function PagesWapper(props) {\n"
                + "    return (<>\n"
                + "        <div className='container-fluid  pageWrapper' >\n"
                + "            {props.children}\n"
                + "        </div>\n"
                + "    </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default PagesWapper";
    }
}
