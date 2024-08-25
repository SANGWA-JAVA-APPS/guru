/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.global.forms;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Forms_InputsContents extends Utils {

    public String Forms_InputsContents() {
        return "import React, { createContext, useContext, useState } from 'react'\n"
                + "import Unit from '../../pages/Unit'\n"
                + "import OtherStyles from '../../Styles/OtherStyles'\n"
                + "import ContainerRow, { ContainerForm } from '../ContainerRow'\n"
                + "import { CatNameContext, surNameContext } from '../DataContext'\n"
                + "import InputRow from './InputRow'\n"
                + "\n"
                + "const CategoryDetails = () => {\n"
                + "\n"
                + "  const [id, setId] = useState()\n"
                + "  const [name, setName] = useState()\n"
                + "\n"
                + "\n"
                + "\n"
                + "  const handleSubmit = (e) => {\n"
                + "    e.preventDefault()\n"
                + "\n"
                + "  }\n"
                + "\n"
                + "  return (\n"
                + "    <>\n"
                + "      <ContainerForm>\n"
                + "        <form onSubmit={handleSubmit} id=\"Form\">\n"
                + "          <InputRow name='Id'>\n"
                + "            <input type=\"text\" autoComplete='false' required style={OtherStyles.txt()} value={id} className=\"form-control\" id=\"inputPassword\"\n"
                + "              onChange={(e) => setId(e.target.value)} />\n"
                + "          </InputRow>\n"
                + "          <InputRow name='Name'>\n"
                + "            <input type=\"text\" autoComplete='false' required style={OtherStyles.txt()} value={name} className=\"form-control\" id=\"inputPassword\"\n"
                + "              onChange={(e) => setName(e.target.value)} />\n"
                + "          </InputRow>\n"
                + "          <ContainerRow>\n"
                + "            <div className='col-6 d-flex justify-content-end offset-6'>\n"
                + "              <button type='submit' className='mt-4 btn btn-success float-end'>Save</button>\n"
                + "            </div>\n"
                + "          </ContainerRow>\n"
                + "\n"
                + "        </form>\n"
                + "      </ContainerForm>\n"
                + "    </>\n"
                + "  )\n"
                + "}\n"
                + "\n"
                + "\n"
                + "export default CategoryDetails\n"
                + "\n"
                + "\n"
                + " ";
    }
}
