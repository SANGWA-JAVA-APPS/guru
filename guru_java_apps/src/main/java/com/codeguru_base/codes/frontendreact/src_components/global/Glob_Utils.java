/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.global;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Glob_Utils extends Utils {

    public String Glob_Utils() {
        return "import { confirmAlert } from 'react-confirm-alert'; // Import\n"
                + "import 'react-confirm-alert/src/react-confirm-alert.css'; // Import css\n"
                + "class Utils {\n"
                + "\n"
                + "\n"
                + "    static Options() {\n"
                + "        return {\n"
                + "            title: 'Title',\n"
                + "            message: 'Message',\n"
                + "            buttons: [\n"
                + "                {\n"
                + "                    label: 'Yes',\n"
                + "                    onClick: () => alert('Click Yes')\n"
                + "                },\n"
                + "                {\n"
                + "                    label: 'No',\n"
                + "                    onClick: () => alert('Click No')\n"
                + "                }\n"
                + "            ],\n"
                + "            closeOnEscape: true,\n"
                + "            closeOnClickOutside: true,\n"
                + "            keyCodeForClose: [8, 32],\n"
                + "            willUnmount: () => { },\n"
                + "            afterClose: () => { },\n"
                + "            onClickOutside: () => { },\n"
                + "            onKeypress: () => { },\n"
                + "            onKeypressEscape: () => { },\n"
                + "            overlayClassName: \"overlay-custom-class-name\"\n"
                + "        };\n"
                + "    }\n"
                + "\n"
                + "    static Submit = (ClickedYes, ClickedNo) => {\n"
                + "        confirmAlert({\n"
                + "          title: 'Confirm to submit',\n"
                + "          message: 'Are you sure to do this?',\n"
                + "          buttons: [\n"
                + "            {\n"
                + "              label: 'Yes',\n"
                + "              onClick:   ClickedYes\n"
                + "            },\n"
                + "            {\n"
                + "              label: 'No',\n"
                + "              onClick:  ClickedNo\n"
                + "            }\n"
                + "          ]\n"
                + "        });\n"
                + "      };\n"
                + "}\n"
                + "export default Utils";
    }
}
