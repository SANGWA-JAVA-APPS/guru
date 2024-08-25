/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

import com.codeguru_base.codes.backend.Pub_methods;
import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class PagesMethods extends Utils {

    Pub_methods pm = new Pub_methods();

    public String declare(int c, String tuple) {
        return (c == 0) ? "const [" + tuple + "_id, set" + pm.get_Capitalized(tuple) + "_id] = useState()\n"
                : "const [" + pm.get_Capitalized(tuple) + ", set" + pm.get_Capitalized(tuple) + "] = useState()\n";
    }

    public String fieldsObjectDeclare(int c, String tuple) {
        return (c > 0) ? ","+ tuple + " : " + tuple 
                : tuple + ":" + tuple ;
    }

    public String setFieldsOnUpdate(String tuple) {
        return "      set" + pm.get_Capitalized(tuple) + "(res.data.id)\n";
    }

    public String resetAfterSave(String tuple, int c) {
        return (c == 0) ? "set" + pm.get_Capitalized(tuple) + "(null)\n"
                : "set" + pm.get_Capitalized(tuple) + "(\"\")\n";
    }

    public String unitInputRow(String unit, String tuple) {
        return "            <InputRow name='" + pm.get_Capitalized(tuple) + "' val={" + tuple + "} handle={(e) => set" + pm.get_Capitalized(tuple) + "(e.target.value)} label='lbl" + tuple + "' />\n";
    }

    public String tableHeaderFields(String tuple) {
        return " <td>" + tuple + "</td>\n";
    }

    public String tablebodyFields(String unit, String tuple) {
        return "                  <td>{" + unit + "." + tuple + "}   </td>\n";
    }
}
