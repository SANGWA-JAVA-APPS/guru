/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components;

import com.codeguru_base.codes.backend.Pub_methods;
import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Src_AppJs extends Utils {

    public String Src_AppJs(String units, String ComponentsToCall) {

        return "import { Route, Routes } from \"react-router-dom\";\n"
                + "import Home from \"./components/Home\";\n"
                + "import Navbar from \"./components/Navbar/Navbar\";\n"
                + "import \"./components/Styles/App.css\"\n"
                + "import \"./components/Styles/commons.css\"\n"
                + "import \"bootstrap/dist/css/bootstrap.min.css\";\n"
                + "import Login from \"./components/Login\";\n"
                + "import Icon from 'react-icons-kit'\n"
                + "import { heart as wedding } from 'react-icons-kit/icomoon/heart'\n"
                + "\n"
                + "import { ic_view_week_outline as struc } from 'react-icons-kit/md/ic_view_week_outline'\n"
                + "import MainStructure from \"./components/pages/MainStructure\";\n"
                + "import Unit from \"./components/pages/Unit\";\n"
                + "import Tuple from \"./components/pages/Tuple\";\n"
                + "import SideBar from \"./components/Navbar/SideBar\";\n"
                + "import SideBarPage from \"./components/pages/SideBarPage\";\n"
                + "import Dashboard from \"./components/pages/Dashboard\";\n"
                + "import \"./components/Styles/SideBar.css\"\n"
                + "import About from \"./components/pages/About\";\n"
                + "import { useMemo, useState } from \"react\";\n"
                + "import { CatNameContext } from \"./components/Global/DataContext\";\n"
                + "import NameField from \"./components/Global/Forms/Inputs\";\n"
                + "import Wrapper from \"./components/HOCNew/Wrapper\";\n"
                + "import Counter1 from \"./components/HOCNew/Counter1\";\n"
                + "import Counter2 from \"./components/HOCNew/Counter2\";\n"
                + "import Deploy from \"./components/pages/Deploy\";\n"
                + "import Layout from \"./components/pages/Layout\";\n"
                + "\n"
                + "function App() {\n"
                + "  // const [category, setCategory] = useState(null)\n"
                + "  // const categoryDetails = useMemo(() => ({ category, setCategory }), [category, setCategory])\n"
                + "\n"
                + "\n"
                + "\n"
                + "  return (\n"
                + "    <div className=\"App\">\n"
                + "\n"
                + "      <Navbar />\n"
                + "      <Routes>\n"
                
                + "\n"
                +ComponentsToCall
               
                + "\n"
                + "\n"
                + "\n"
                + "      </Routes>\n"
                + "      {/* SideBar */}\n"
                + "      <SideBar>\n"
                + "        <Routes>\n"
                + "          <Route path=\"/dashboard\" element={<Dashboard />} />\n"
                + "          <Route path=\"/about\" element={<About />} />\n"
                + "        </Routes>\n"
                + "      </SideBar>\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "    </div >\n"
                + "  );\n"
                + "}\n"
                + "\n"
                + "export default App;";
    }

    
    public String ComponentsToCall(String unit_name){
         return "        <Route path=\"/"+unit_name+"\" element={<"+new Pub_methods().get_Capitalized(unit_name) +" />} />\n";
    }
    
}
