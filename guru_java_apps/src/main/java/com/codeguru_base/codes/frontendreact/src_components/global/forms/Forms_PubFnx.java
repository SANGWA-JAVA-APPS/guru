/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.global.forms;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Forms_PubFnx extends Utils {

    public String Forms_PubFnx() {
        return "export default class FormTools{\n"
                + "\n"
                + "    static BtnTxt (clearBtn){\n"
                + "        return clearBtn ? \"Save changes\" : \"Save\"\n"
                + "    }\n"
                + "}";
    }
}
