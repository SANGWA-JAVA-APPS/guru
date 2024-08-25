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
public class Serv_DeleteContents extends Utils {

    public String Serv_DeleteContents(String unit, String deleteById) {
        return "import axios from 'axios'\n"
                + "import Conn from './Conn';\n"
                + "\n"
                + "class Delete {\n"
                + "    static server = \"http://\" +  Conn.server.name + Conn.port.val +Conn.basicPath.val;\n"
                + "\n"
                + deleteById
                + "}\n"
                + "export default new Delete()";
    }
    
    public String deleteById(String unit) {
        return "\n"
                + "    delete" + super.get_Capitalized(unit) + "ById(id, callback) {\n"
                + "          axios.delete(Delete.server + \"/" + unit + "/\" + id)\n"
                + "    }\n";
    }

}
