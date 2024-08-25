/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class ExceptionFileContent  {

    public String code(String package_name) {
        return "package com." + package_name + ".exception;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]\n"
                + " */\n"
                + "public class ResourceNotFoundException extends RuntimeException {\n"
                + "     private static final long serialVersionUID = 1L;\n"
                + "\n"
                + "             public ResourceNotFoundException(String msg) {\n"
                + "        super(msg);\n"
                + "    }\n"
                + "}";
    }

}
