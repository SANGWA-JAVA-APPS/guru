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
public class Glob_PrintComponentContent extends Utils {

    public String Glob_PrintComponentContent() {
        return "import React from 'react'\n"
                + "import CustomStyles from \"../Styles/OtherStyles\"\n"
                + "\n"
                + "function PrintCompanyInfo() {\n"
                + "    return (\n"
                + "        <div className='printHeader'>\n"
                + "            <div className='container printHeaderBoxParent' >\n"
                + "                <div className='row printHeaderBox d-flex justify-content-between' style={{height:\"70px\"}}>\n"
                + "                    <div className=\"col-3 LogoOnPrintBox   logo\">\n"
                + "                        <div className='LogoOnPrint' style={CustomStyles.LogoOnPrint()}>  </div>\n"
                + "                    </div>\n"
                + "                    <div className='col-4   Date'>\n"
                + "                        {CustomStyles.DateOnPrint()}\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div >\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default PrintCompanyInfo";
    }
}
