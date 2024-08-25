/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;



/**
 *
 * @author SANGWA
 */
public class Repos  extends Commons{
    Pub_methods pm = new Pub_methods();
    public String Repos(String unit_name, String package_name) {
        return "package com." + package_name + ".repository;\n"
                + "\n"
                + "import org.springframework.data.jpa.repository.JpaRepository;\n"
                + "import org.springframework.stereotype.Repository;\n"
                + "import com." + package_name + ".models.Mdl_" +unit_name + ";\n"
                + "@Repository\n"
                + "public interface " + pm.get_Capitalized(unit_name) + "Repository extends JpaRepository<Mdl_" +unit_name + ", Long> {\n"
                + "}\n"
                + "";
    }

}
