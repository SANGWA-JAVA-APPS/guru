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
public class HomeJsContents extends Utils {

    public String HomeJsContents() {
        return "import React from 'react'\n"
                + "import Footer from './Global/Footer'\n"
                + "import Banner from './home/Banner'\n"
                + "import Solutions from './home/Solutions'\n"
                + "\n"
                + "function Home() {\n"
                + "    return (\n"
                + "        <>\n"
                + "            <Banner />\n"
                + "            <Solutions />\n"
                + "\n"
                + "            <Footer />\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Home";
    }
}
