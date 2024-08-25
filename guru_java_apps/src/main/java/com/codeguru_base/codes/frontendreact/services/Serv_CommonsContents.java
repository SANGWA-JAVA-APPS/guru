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
public class Serv_CommonsContents extends Utils {

    public String ServCommonsContents(String unitsActions) {
        return "import React, { Component } from 'react'\n"
                + "import axios from \"axios\"\n"
                + "import Conn from './Conn'\n"
                + "class Commons {\n"
                + "    static server = Conn.server.name + Conn.port.val\n"
                + "    static apiPath = Conn.basicPath.val\n"
                + "\n"
                + "\n"
                + unitsActions
                + "}\n"
                + "\n"
                + "export default new Commons()";
    }

    public String unitsActions(String unit) {
        return "        save" + super.get_Capitalized(unit) + "(" + unit + ") {\n"
                + "        return axios.post(Conn.wholePath.name + \"/" + unit + "/\", " + unit + ")\n"
                + "    }"
                + "    updateTuple(" + unit + ", id) {\n"
                + "        return axios.put(Conn.wholePath.name + \"/" + unit + "/\" + id, " + unit + ")\n"
                + "    }\n";
    }

}
