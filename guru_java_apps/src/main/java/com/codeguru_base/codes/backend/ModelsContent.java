/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class ModelsContent {

    public String Model_content(String unit_name, String valid_fields, String fields, String params, String dto_object, String package_name, String parentMapping, String childMapping) {
        return "package com." + package_name + ".models;\n"
                + "\n"
                + "import com.fasterxml.jackson.annotation.JsonInclude;\n"
                + "import lombok.*;\n"
                + "\n"
                + "import javax.persistence.*;\n"
                + "import java.util.Date;\n"
                + "import java.util.ArrayList;\n"
                + "import java.util.List;\n"
                + "import javax.validation.constraints.Email;\n"
                + "import javax.validation.constraints.Size;\n"
                + "import java.io.Serializable;"
                + "import com.fasterxml.jackson.annotation.JsonIgnore;\n"
                + "\n"
                + "@Entity\n"
                + "@Table(name = \"" + unit_name + "\")\n"
                + "@Data\n"
                + "\n"
                + "@JsonInclude(JsonInclude.Include.NON_NULL)\n"
                + "public class Mdl_" + unit_name + " implements Serializable {\n"
                + "\n"
                + "\n\n"
                + valid_fields
                + ""
                + "\n"
                + "    public Mdl_" + unit_name + "() {\n"
                + "    }\n"
                + ""
                + parentMapping
                + ""
                + childMapping
                + "\n}"
                + "";
    }

    public String MyChildrenMappingCode(String unitparent, String unitChild) {
        return "\n\n   @OneToMany(mappedBy = \"mdl_" + unitparent + "\", cascade = CascadeType.ALL, orphanRemoval = true)\n"
                + "    @JsonIgnore\n"
                + "    private List<Mdl_" + unitChild + "> o_" + unitChild + "s;\n";
    }

    public String MyParentMappingCode(String unitChild) {
        return "\n\n   @ManyToOne\n"
                + "    @JoinColumn(name = \"" + unitChild + "_id\", nullable = true)\n"
                + "    Mdl_" + unitChild + " mdl_" + unitChild + ";\n";
    }

    public String params(int c, String tuple, String data_type) {
        String comma = (c > 0) ? "," : "";
        return (c > 0) ? comma + data_type + " " + tuple : "String " + tuple;
    }

    public String valid_field(int c, String tuple, String dataType) {

        String length = (c > 0) ? ",length=80" : "";

        String size = (c > 0) ? "  \n    @Size(min = 1, max = 70, message = \" " + tuple + " should not be empty, null and or length exceed 70\")\n"
                : "    @Id\n     @GeneratedValue(strategy = GenerationType.IDENTITY)\n"
                + "     ";
        return size + "    @Column(name = \"" + tuple + "\"  " + length + " , nullable = false)\n"
                + "    private " + dataType + " " + tuple + ";\n";
    }

}
