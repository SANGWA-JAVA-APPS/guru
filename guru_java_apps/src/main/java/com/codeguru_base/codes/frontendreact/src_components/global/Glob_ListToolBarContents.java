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
public class Glob_ListToolBarContents extends Utils {

    public String Glob_ListToolBarContents() {
        return "import React from 'react'\n"
                + "\n"
                + "\n"
                + "// Icons\n"
                + "import { Icon } from 'react-icons-kit'\n"
                + "import { printer } from 'react-icons-kit/icomoon/printer'\n"
                + "import { floppyDisk as save } from 'react-icons-kit/icomoon/floppyDisk'\n"
                + "import { cancelCircle as cancel } from 'react-icons-kit/icomoon/cancelCircle'\n"
                + "import { plus as add } from 'react-icons-kit/icomoon/plus'\n"
                + "import { search } from 'react-icons-kit/icomoon/search'\n"
                + "import { pencil as edit } from 'react-icons-kit/icomoon/pencil'\n"
                + "import { cross as remove } from 'react-icons-kit/icomoon/cross'\n"
                + "import { forward as point } from 'react-icons-kit/icomoon/forward'\n"
                + "import { arrowRight as Mainpoint } from 'react-icons-kit/icomoon/arrowRight'\n"
                + "\n"
                + "import { calendar } from 'react-icons-kit/icomoon/calendar'\n"
                + "import { Link } from 'react-router-dom'\n"
                + "import AnimateHeight from 'react-animate-height'\n"
                + "\n"
                + "\n"
                + "function ListToolBar(props) {\n"
                + "    return (\n"
                + "        <>\n"
                + "            <div className='col-12 '><h3 className='boldTitle'> {props.listTitle}  </h3></div>\n"
                + "            <div className='col-12'>\n"
                + "                <div className='row'>\n"
                + "                    <div className='col-6'>\n"
                + "                        <button id='addREc' className='btn'\n"
                + "                            aria-expanded={props.height !== 0} aria-controls=\"animForm\" onClick={props.changeFormHeightClick}\n"
                + "                            style={{ marginRight: \"15px\", backgroundColor: \"#470343\", fontSize: \"12px\", color: '#fff', fontWeight: \"bold\" }}>\n"
                + "                            <Icon size={11} style={{ marginRight: \"8px\", color: '#fff' }} icon={add} />\n"
                + "                            Add {props.entity} </button>\n"
                + "                        <button onClick={props.handlePrint} style={{ marginRight: \"10px\", fontSize: \"12px\" }} className='btn btn-dark ms-1'>\n"
                + "                            <Icon style={{ marginRight: \"8px\", color: '#fff' }} icon={printer} />\n"
                + "                            Print\n"
                + "                        </button>\n"
                + "                        <button className='btn btn-outline-success ms-1'\n"
                + "                            aria-expanded={props.searchHeight !== 0} aria-controls=\"animSearchBox\" onClick={props.changeSearchheight}>\n"
                + "                            <Icon style={{ color: 'black' }} icon={search} />   </button>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export const SearchformAnimation = (props) => {\n"
                + "    return (\n"
                + "        <div className='row '>\n"
                + "            <div className='col-12'>\n"
                + "                <AnimateHeight id=\"animSearchBox\" // animating the search box\n"
                + "                    duration={250} animateOpacity={true}\n"
                + "                    height={props.searchHeight} >\n"
                + "                        \n"
                + "                            {props.children}\n"
                + "                </AnimateHeight>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default ListToolBar";
    }
}
