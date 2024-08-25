/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src.home;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Home_SolutionContents extends Utils {

    public String Home_SolutionContents() {
        return "import React from 'react'\n"
                + "import Icon from 'react-icons-kit'\n"
                + "\n"
                + "import { printer } from 'react-icons-kit/icomoon/printer'\n"
                + "import { floppyDisk as save } from 'react-icons-kit/icomoon/floppyDisk'\n"
                + "import { cancelCircle as cancel } from 'react-icons-kit/icomoon/cancelCircle'\n"
                + "import { plus as add } from 'react-icons-kit/icomoon/plus'\n"
                + "import { search } from 'react-icons-kit/icomoon/search'\n"
                + "import { pencil as edit } from 'react-icons-kit/icomoon/pencil'\n"
                + "import { cross as remove } from 'react-icons-kit/icomoon/cross'\n"
                + "import { forward as point } from 'react-icons-kit/icomoon/forward'\n"
                + "import { statsBars as stock } from 'react-icons-kit/icomoon/statsBars'\n"
                + "import { manWoman as clients } from 'react-icons-kit/icomoon/manWoman'\n"
                + "import { heart as wedding } from 'react-icons-kit/icomoon/heart'\n"
                + "\n"
                + "\n"
                + "\n"
                + "function Solutions() {/*Icon styles*/\n"
                + "    const ic_s = {\n"
                + "        color: \"#2ccdf5\", display: \"block\", textAlign: \"center\", marginBottom: \"30px\"\n"
                + "    }\n"
                + "    return (\n"
                + "        <>\n"
                + "            <div className='container component compSolutions'>\n"
                + "                <div className='row'>\n"
                + "                    <div className='col-12'>\n"
                + "                        <h2 className='title sm_txt_20'>  Find your desired solution  </h2>\n"
                + "                    </div>\n"
                + "                    <div className='col-12 mt-3 cards  '>\n"
                + "                        <div className='row d-flex justify-content-between'>\n"
                + "                            <div className='col-md-3 shadow-sm  IconTitle'>\n"
                + "                                <Icon size={62} style={ic_s} icon={stock} />  \n"
                + "                                <span>Stock Management system </span>\n"
                + "                                <p>Find a solution for your assets and equipments</p>\n"
                + "                            </div>\n"
                + "                            <div className='col-md-3 shadow-sm  IconTitle'>\n"
                + "                                <Icon size={62} style={ic_s} icon={clients} /> \n"
                + "                                <span>Client Booster </span>\n"
                + "                                <p>Boost your cientele just in a minute</p>\n"
                + "                            </div>\n"
                + "                            <div className='col-md-3 shadow-sm  IconTitle'>\n"
                + "                                <Icon size={62} style={ic_s} icon={wedding} /> <span> \n"
                + "                                    Wedding planner </span>   \n"
                + "                                    <p>Do you need to budget, find wedding gears and more? find a nice solution</p>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "\n"
                + "\n"
                + "            </div >\n"
                + "            <div className='container component comp_works'>\n"
                + "                <div className='row'>\n"
                + "                    <div className='col-12'>\n"
                + "                        <h2 className='title sm_txt_20'> Solutions </h2>\n"
                + "                    </div>\n"
                + "                    <div className='col-12 mt-3 cards  '>\n"
                + "                        <div className='row d-flex justify-content-between'>\n"
                + "                            <div className='col-md-3   shadow-sm'>\n"
                + "                                Solution 1\n"
                + "                            </div>\n"
                + "                            <div className='col-md-3 shadow-sm'>\n"
                + "                                Solution 2\n"
                + "                            </div>\n"
                + "                            <div className='col-md-3 shadow-sm'>\n"
                + "                                Solution 3\n"
                + "                            </div>\n"
                + "\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default Solutions";
    }
}
