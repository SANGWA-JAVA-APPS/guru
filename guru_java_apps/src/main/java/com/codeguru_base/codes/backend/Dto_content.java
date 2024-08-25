/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

 

/**
 *
 * @author SANGWA
 */
public class Dto_content {

    Pub_methods pm = new Pub_methods();

    public String Dto_content(String package_name, String unit_name) {

        return " \n"
                + "\n"
                + "package com." + package_name + ".DTO;\n"
                + "\n"
                + "import com." + package_name + ".models.Mdl_"+unit_name+";\n"
                
                + "import java.util.List;\n"
                + "import lombok.Data;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]\n"
                + " */\n"
                + "@Data\n"
                + "public class Multiple" + pm.get_Capitalized(unit_name) + "s {\n"
                + "\n"
                + "    List<Mdl_" + unit_name + "> multi" + pm.get_Capitalized(unit_name) + "s;\n"
                + "}\n"
                + "";
    }
}
