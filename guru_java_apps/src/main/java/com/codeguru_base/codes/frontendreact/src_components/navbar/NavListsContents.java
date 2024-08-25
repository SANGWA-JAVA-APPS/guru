/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src.navbar;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class NavListsContents extends Utils {

    public String NavListsContents() {
        return "import React from 'react'\n"
                + "import { Link } from 'react-router-dom'\n"
                + "\n"
                + "function NavLinks(props) {\n"
                + "    let my_class = \"background-color: #1c6156;  \";\n"
                + "    const my_styles = {\n"
                + "        color: \"#fff\",\n"
                + "        textDecoration: \"none\",\n"
                + "    };\n"
                + "    const nav_styles = {\n"
                + "        backgroundColor: \"#2d0733\",\n"
                + "        fontFamily: \"arial\",\n"
                + "        fontWeight: \"bold\"\n"
                + "\n"
                + "    };\n"
                + "    return (\n"
                + "        <li className=\"nav-item\">\n"
                + "            <Link className=\"nav-link\" style={my_styles} to={`/${props.path} `}>\n"
                + "                {props.name}\n"
                + "            </Link>\n"
                + "        </li>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default NavLinks";
    }
}
