/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src.hocnew;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Hoc_WrapperContents extends Utils {

    public String Hoc_WrapperContents() {
        return "import { Dashboard } from '@mui/icons-material'\n"
                + "import React, { useState } from 'react'\n"
                + "import { Route, Routes } from 'react-router-dom'\n"
                + "import ContainerRow from '../Global/ContainerRow'\n"
                + "import PagesWapper from '../Global/PagesWapper'\n"
                + "import SideBar from '../Navbar/SideBar'\n"
                + "import About from '../pages/About'\n"
                + "\n"
                + "function Wrapper(props) {\n"
                + "\n"
                + "    const [count, setCount] = useState(0)\n"
                + "\n"
                + "    const incCount = () => {\n"
                + "        setCount((count) => count + 1)\n"
                + "    }\n"
                + "\n"
                + "    const [txtval, setTxtVal] = useState()\n"
                + "    const changedText = (e) => {\n"
                + "        setTxtVal(e.target.value)\n"
                + "    }\n"
                + "\n"
                + "    \n"
                + "    return (\n"
                + "        <>\n"
                + "            <PagesWapper>\n"
                + "                <SideBar>\n"
                + "                    <Routes>\n"
                + "                        <Route path=\"/dashboard\" element={<Dashboard />} />\n"
                + "                        <Route path=\"/about\" element={<About />} />\n"
                + "                    </Routes>\n"
                + "                </SideBar>\n"
                + "                <ContainerRow>\n"
                + "                    {props.render(txtval,  changedText)}\n"
                + "                </ContainerRow>\n"
                + "            </PagesWapper>\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Wrapper";
    }
}
