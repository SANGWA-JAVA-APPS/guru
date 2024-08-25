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
public class Glob_LoaderContents extends Utils {

    public String Glob_LoaderContents(String units, String ComponentsToCall) {
        return "import React from 'react'\n"
                + "\n"
                + "export function DataListLoading() {\n"
                + "   return(\n"
                + "      <div className='container pt-0 mt-0 '>\n"
                + "        <div className='row pt-0 mt-0' style={{ fontWeight: \"bolder\", color: \"#000\" }}>\n"
                + "          <div className='col-12 d-flex justify-content-center  dataLoader' style={{ fontSize: \"60PX\", color: \"#cfcfcfda\" }}>\n"
                + "            \n"
                + "          </div>\n"
                + "        </div>\n"
                + "      </div>\n"
                + "    \n"
                + "   )\n"
                + "}\n"
                + "\n"
                + "\n"
                + "\n"
                + "function Loader() {\n"
                + "  return (\n"
                + "    <div className='row d-flex justify-content-center'>\n"
                + "      <div className='col-5 loader'>    </div>\n"
                + "    </div>\n"
                + "\n"
                + "  )\n"
                + "}\n"
                + "\n"
                + "export default Loader";
    }
}
