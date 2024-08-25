/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.page;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Page_DashboardContents extends Utils {

    public String Page_DashboardContents() {
        return "import React from 'react'\n"
                + "\n"
                + "function Dashboard() {\n"
                + "\n"
                + "    const names = ['SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel'\n"
                + "        , 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel'\n"
                + "        , 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel', 'SANGWA', 'Emmanuel']\n"
                + "    return (\n"
                + "        <div style={{marginLeft:\"50px\"}}>\n"
                + "            <ul>\n"
                + "                {names.map(name => (\n"
                + "                    <li>{name}</li>\n"
                + "                ))\n"
                + "\n"
                + "                }\n"
                + "            </ul>\n"
                + "\n"
                + "\n"
                + "        </div>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Dashboard";
    }
}
