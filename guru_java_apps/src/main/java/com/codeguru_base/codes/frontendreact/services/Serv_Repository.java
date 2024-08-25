/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Serv_Repository extends Utils {

    public String Serv_Repository(String packageName,  String port, String dataGetter) {
        return "import axios from 'axios'\n"
                + "import React, { Component } from 'react'\n"
                + "import Conn from './Conn';\n"
                + "\n"
                + "class Repository {\n"
                + "    static page = (Repository.page < 1 || Repository.page == undefined) ? 1 : Repository.page;\n"
                + "    static size = (Repository.size < 1) ? 50 : Repository.size;\n"
                + "    static server = Conn.wholePath.name;\n"
                + "    // static url = \"http://\" + Repository.server + \":"+port+"/" + packageName + "/api\"\n"
                + "\n"
                + dataGetter
                + "\n"
                + "\n"
                + "}\n"
                + "\n"
                + "export default new Repository()";
    }

    public String dataGetter(String unit) {
        return "    findC" + super.get_Capitalized(unit) + "() {\n"
                + "        return axios.get(Repository.server + \"/" + unit + "/\")\n"
                + "    }\n";
    }
}
