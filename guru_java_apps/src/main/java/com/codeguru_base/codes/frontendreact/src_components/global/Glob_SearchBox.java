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
public class Glob_SearchBox extends Utils {

    public String Glob_searchBox() {
        return "import React from 'react'\n"
                + "import { useState } from 'react'\n"
                + "import { Icon } from 'react-icons-kit'\n"
                + "import { search } from 'react-icons-kit/icomoon/search'\n"
                + "import DatePicker from \"react-datepicker\";\n"
                + "import 'react-datepicker/dist/react-datepicker.css'\n"
                + "function SearchBox() {\n"
                + "    const [startDate, setStartDate] = useState(new Date());\n"
                + "    const [endtDate, setEndDate] = useState(new Date());\n"
                + "    const bg = {\n"
                + "        backgroundColor: \"#fff\"\n"
                + "    }\n"
                + "    return (\n"
                + "        <div className='container'>\n"
                + "            <div className='row pb-2  '>\n"
                + "                <div className='col-12 p-2 m-1 mt-2 d-flex justify-content-around' style={{ borderRadius: \"5px\", border: \"1px solid #fff\", boxShadow: \"0px 0px 3px #000\", height: \"auto\", backgroundColor: \"#e4e8eb\" }}>\n"
                + "                    <form onSubmit={(e)=>{e.preventDefault()}} className=\"row d-flex justify-content-end p-0 m-0\">\n"
                + "                        <div className=\"col-auto \">\n"
                + "                            <select class=\"form-select form-select-md\" title=\"Criteria\" aria-label=\".form-select-lg example\">\n"
                + "                                <option>Select Option</option>\n"
                + "                                <option value=\"1\">name</option>\n"
                + "                            </select>\n"
                + "                        </div>\n"
                + "                        <div className='col-auto '>\n"
                + "                            <input type=\"text\" \n"
                + "                            title=\"Enter the name tof the criteria\" className=\"form-control\" style={bg} id=\"staticEmail2\" placeholder='Name' />\n"
                + "                        </div>\n"
                + "                        <div className=\"col-auto \">\n"
                + "                            <DatePicker selected={startDate} title=\"Pick the Start date\" required\n"
                + "                                onChange={(date) => setStartDate(date)}\n"
                + "                                monthsShown={4}\n"
                + "                                showYearDropdown />\n"
                + "                            {/* <input type=\"text\" className=\"form-control\" style={bg}  id=\"staticEmail2\" placeholder='Start date' /> */}\n"
                + "                        </div>\n"
                + "                        <div className=\"col-auto \">\n"
                + "                        <DatePicker selected={endtDate} title=\"Pick the End date\"\n"
                + "                                onChange={(date) => setEndDate(date)}\n"
                + "                                monthsShown={4}\n"
                + "                                showYearDropdown />\n"
                + "                        </div>\n"
                + "                        <div className=\"col-auto \">\n"
                + "                            <button type=\"submit\" className=\"btn btn-success\">  <Icon style={{ color: '#fff', marginRight: \"10px\" }} icon={search} />\n"
                + "                                Enter\n"
                + "                            </button>\n"
                + "                        </div>\n"
                + "                    </form>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    )\n"
                + "}\n"
                + "\n"
                + "export default SearchBox";
    }
}
