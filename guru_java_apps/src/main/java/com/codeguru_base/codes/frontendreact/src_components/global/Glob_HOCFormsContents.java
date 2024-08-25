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
public class Glob_HOCFormsContents extends Utils {

    public String AppCss(String units, String ComponentsToCall) {
        return "import React, { useState } from 'react'\n"
                + "\n"
                + "\n"
                + "function UpdatedComponent(OriginalComponent) {\n"
                + "    function NewComponent() {\n"
                + "        const [pubId, setPubId] = useState(2)\n"
                + "\n"
                + "        const handleGetId = () => {\n"
                + "            setPubId(pubId => pubId*2)\n"
                + "        }\n"
                + " \n"
                + "        return <OriginalComponent\n"
                + "            handleGetId={handleGetId}\n"
                + "            pubId={pubId} />\n"
                + "    }\n"
                + "    return NewComponent \n"
                + "}\n"
                + "export default UpdatedComponent";
    }
}
