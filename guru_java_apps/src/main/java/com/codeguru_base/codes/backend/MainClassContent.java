/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class MainClassContent {

    Pub_methods pm = new Pub_methods();

    String Code(String packageName, String artifact) {
        return "package com."+packageName+";\n"
                + "\n"
                + "import com." + packageName + ".models.Mdl_account;\n"
                + "import com." + packageName + ".models.Mdl_account_category;\n"
                + "import com." + packageName + ".models.Mdl_profile;\n"
                + "import com." + packageName + ".repository.AccountRepository;\n"
                + "import com." + packageName + ".repository.Account_categoryRepository;\n"
                + "import com." + packageName + ".repository.ProfileRepository;\n"
                + "import org.springframework.beans.factory.annotation.Autowired;\n"
                + "import org.springframework.boot.CommandLineRunner;\n"
                + "import org.springframework.boot.SpringApplication;\n"
                + "import org.springframework.boot.autoconfigure.SpringBootApplication;\n"
                + "import org.springframework.cache.annotation.EnableCaching;\n"
                + "\n"
                + "@SpringBootApplication\n"
                + "@EnableCaching\n"
                + "\n// ==========================>GIGAFLEX Generated\n"
                + "public class " + pm.get_Capitalized(artifact) + "Application   {\n"
                + "\n"
                + "    @Autowired\n"
                + "    AccountRepository accountRepository;\n"
                + "\n"
                + "    @Autowired\n"
                + "    ProfileRepository profileRepository;\n"
                + "    @Autowired\n"
                + "    Account_categoryRepository account_categoryRepository;\n"
                + "\n"
                + "    public static void main(String[] args) {\n"
                + "        SpringApplication.run("+ pm.get_Capitalized(artifact)+"Application.class, args);\n"
                + "    }\n"
                + ""
                + ""
                + ""
                + ""
                + "}";
    }
}
