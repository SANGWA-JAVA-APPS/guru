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
public class Entities extends Utils {

    public String Entities(String unit, String entityParams) {

        return "class Entities {\n"
                + "\n"
                + "    " + super.get_Capitalized(unit) + "(" + entityParams + ") {\n"
                + "        return {\n"
                + "            id: id, name: name\n"
                + "        }\n"
                + "    }\n"
                + "\n"
                + "\n"
                + "\n"
                + "}\n"
                + "export default new Entities()";
    }

    public String entityParams(int c, String tuple) {
        return (c > 0) ? tuple + "," : tuple;
    }
    public String entityReturn(int c, String tuple) {
        return (c > 0) ? tuple+": "+tuple + "," : tuple+":"+tuple;
    }

}
