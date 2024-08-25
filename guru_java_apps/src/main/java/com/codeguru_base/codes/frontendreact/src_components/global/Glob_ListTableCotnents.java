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
public class Glob_ListTableCotnents extends Utils {

    public String AppCss(String units, String ComponentsToCall) {
        return "import React from 'react'\n"
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
                + " function ListOptioncol(props) {\n"
                + "    return (\n"
                + "        <>\n"
                + "            <td className='delButton optCol' >\n"
                + "                <div className='row d-flex justify-content-center'>\n"
                + "                    <button onClick={props.getEntityById} style={{ width: \"20px\" }} title=\"Update Record\" className='mr-0 p-0 btn round-circle'>\n"
                + "                        <Icon size={16} style={{ color: '#0fd120', marginRight: \"10px\" }} icon={edit} />\n"
                + "                    </button>\n"
                + "                    <button onClick={props.delEntityById} style={{ width: \"20px\", marginLeft: \"20px\" }} title=\"Update Record\" className=' ml-0 p-0 btn'>\n"
                + "                        <Icon size={10} style={{ color: '#ff0000', marginRight: \"10px\" }} icon={remove} />\n"
                + "                    </button>\n"
                + "                </div>\n"
                + "            </td>\n"
                + "        </>\n"
                + "    )\n"
                + "}\n"
                + "export default ListOptioncol\n"
                + "\n"
                + "\n"
                + "export const TableOpen = (props) => {\n"
                + "    return (\n"
                + "        <div className='DataTableBox'>\n"
                + "            <table  className='table  table-responsive table-striped dataTable table-bordered'>\n"
                + "                {props.children}\n"
                + "\n"
                + "            </table>\n"
                + "        </div>\n"
                + "    )\n"
                + "}";
    }
}
