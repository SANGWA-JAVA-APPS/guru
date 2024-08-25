/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Serv_Session {

    public String Serv_Session() {
        return "class SessionTime {\n"
                + "\n"
                + "    getCurrentTime() {\n"
                + "        var d = new Date();\n"
                + "        var n = d.toLocaleTimeString();\n"
                + "        return n\n"
                + "    }\n"
                + "\n"
                + "    compareTwoTimes(session) {\n"
                + "        var d = new Date();\n"
                + "        var n = d.toLocaleTimeString();\n"
                + "\n"
                + "        var expiry = localStorage.getItem('ExpireTime');\n"
                + "        if (expiry < n) {\n"
                + "            localStorage.removeItem('userId')\n"
                + "            console.log('----------------Removed Session ------------------------')\n"
                + "            console.log('LoginTime ' + localStorage.getItem('LoginTime'))\n"
                + "            console.log('the min at the login time was ' + localStorage.getItem('min'))\n"
                + "            console.log('Expirty was ' + localStorage.getItem('ExpireTime'))\n"
                + "            console.log('Time now is '\n"
                + "                +    new Date().getHours() + \"-\" + new Date().getMinutes() + \"-\" + new Date().getSeconds())\n"
                + "        } else {\n"
                + "\n"
                + "        }\n"
                + "        // alert(\"Time 2 is later than time 1=>>\" + str1 + \" - \" + str2);\n"
                + "    }\n"
                + "\n"
                + "    getMinutes(timeString){\n"
                + "       return timeString.split(\":\")[1]\n"
                + "        \n"
                + "    }\n"
                + "\n"
                + "\n"
                + "\n"
                + "}\n"
                + "\n"
                + "export default new SessionTime()";
    }

}
