/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Serv_Conn {

    public String Serv_Conn() {
        return "export default class Conn {\n"
                + "    static server = {\n"
                + "        name: 'http://localhost:'\n"
                + "    };\n"
                + "\n"
                + "    static port = {\n"
                + "        val: '8089/'\n"
                + "    }\n"
                + "    static basicPath = {\n"
                + "        val: 'guru/api'\n"
                + "    }\n"
                + "    static wholePath={\n"
                + "        name: Conn.server.name+Conn.port.val+ Conn.basicPath.val  /*  http://localhost:8089/guru/api  */\n"
                + "    }\n"
                + "\n"
                + "}";
    }

}
