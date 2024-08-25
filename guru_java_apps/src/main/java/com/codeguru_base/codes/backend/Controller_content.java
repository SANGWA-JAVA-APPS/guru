/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.backend;
/**
 *
 * @author SANGWA
 */
public class Controller_content  {

    Pub_methods pm = new Pub_methods();

    public String Controller(String package_name, String unit_name, String fields, String appName) {
        return " \n"
                + "package com." + package_name + ".controller;\n"
                + "\n"
                + "import com." + package_name + ".exception.ResourceNotFoundException;\n"
                + "import com." + package_name + ".models.Mdl_" + unit_name + ";\n"
                + "import com."+package_name+".DTO.Multiple" + pm.get_Capitalized(unit_name) + "s;\n"
                + "import com."+package_name+".repository." + pm.get_Capitalized(unit_name) + "Repository;"
                + "import io.swagger.annotations.ApiOperation;\n"
                + "import java.util.ArrayList;\n"
                + "import java.util.List;\n"
                + "import javax.validation.Valid;\n"
                + "import org.springframework.beans.factory.annotation.Autowired;\n"
                + "import org.springframework.http.HttpStatus;\n"
                + "import org.springframework.http.ResponseEntity;\n"
                + "import org.springframework.web.bind.annotation.DeleteMapping;\n"
                + "import org.springframework.web.bind.annotation.GetMapping;\n"
                + "import org.springframework.web.bind.annotation.PathVariable;\n"
                + "import org.springframework.web.bind.annotation.PostMapping;\n"
                + "import org.springframework.web.bind.annotation.PutMapping;\n"
                + "import org.springframework.web.bind.annotation.RequestBody;\n"
                + "import org.springframework.web.bind.annotation.RequestMapping;\n"
                + "import org.springframework.web.bind.annotation.RestController;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]\n"
                + " */\n"
                + "@RestController\n"
                + "@RequestMapping(\"/" + appName + "/api/" + unit_name + "\")\n"
                + "public class " + pm.get_Capitalized(unit_name) + "Controller {\n"
                + "\n"
                + "    @Autowired\n"
                + "    " + pm.get_Capitalized(unit_name) + "Repository " + unit_name + "Repository;\n"
                + "\n"
                + "    @ApiOperation(\"Getting all the " + pm.get_Capitalized(unit_name) + " only\")\n"
                + "    @GetMapping(\"/\")\n"
                + "    public  ResponseEntity<List<Mdl_" + unit_name + ">> getAll() {\n"
                + "        List<Mdl_" + unit_name + "> struc = new ArrayList<>();\n"
                + "        " + unit_name + "Repository.findAll().forEach(struc::add);\n"
                + "        if (struc.isEmpty()) {\n"
                + "            return new ResponseEntity<>(HttpStatus.NO_CONTENT);\n"
                + "        }\n"
                + "        return new ResponseEntity<>(struc, HttpStatus.OK);\n"
                + "    }\n\n"
                + "     @ApiOperation(\"Total " + unit_name + "\")\n"
                + "    public long countAll() {\n"
                + "        return " + unit_name + "Repository.count();\n"
                + "    }\n\n"
                + ""
                + "    @ApiOperation(\"Creating a "+unit_name+"\")\n"
                + "    @PostMapping(\"/\")\n"
                + "    public ResponseEntity<Mdl_" + unit_name + "> createStructure(@RequestBody @Valid Mdl_" + unit_name + " mdl_" + unit_name + ") {\n"
                + "        return new ResponseEntity<>(" + unit_name + "Repository.save(mdl_" + unit_name + "), HttpStatus.CREATED);\n"
                + "    }\n"
                + "\n"
                + "\n"
                + "    @PutMapping(\"/{id}\")\n"
                + "    @ApiOperation(value = \"Updating  a single "+unit_name+ "\")\n"
                + "    public ResponseEntity<Mdl_" + unit_name + "> updateStructure(@PathVariable(value = \"id\") long id, @RequestBody Mdl_" + unit_name + " mdl_" + unit_name + ") {\n"
                + "        Mdl_" + unit_name + " mdl_" + unit_name + "1 = " + unit_name + "Repository.findById(id)\n"
                + "                .orElseThrow(() -> new ResourceNotFoundException(\"Structure not found\"));\n"
                + fields
                + "        return new ResponseEntity<>(" + unit_name + "Repository.save(mdl_" + unit_name + "), HttpStatus.OK);\n"
                + "\n"
                + "    }\n"
                + "\n"
                + "    @ApiOperation(value = \"Deleting  a single "+unit_name+ "\")\n"
                + "    @DeleteMapping(\"/{id}\")\n"
                + "    public ResponseEntity<HttpStatus> delete" + pm.get_Capitalized(unit_name) + "(@PathVariable(\"id\") long id) {\n"
                + "        " + unit_name + "Repository.deleteById(id);\n"
                + "        return new ResponseEntity<>(HttpStatus.NO_CONTENT);\n"
                + "    }\n"
                + "\n"
                + ""
                + "//    Adding more "+unit_name+"s at the same time\n"
                + "    @PostMapping(\"/multi" + unit_name + "\")\n"
                + "    public ResponseEntity<String> multiple" + unit_name + "s(@RequestBody Multiple" + pm.get_Capitalized(unit_name) + "s multiple" + pm.get_Capitalized(unit_name) + "s) {\n"
                + "        List<Mdl_" + unit_name + "> " + unit_name + "sList = multiple" + pm.get_Capitalized(unit_name) + "s.getMulti" + pm.get_Capitalized(unit_name) + "s();\n"
                + "        try {\n"
                + "            for (Mdl_" + unit_name + " mdl_" + unit_name + " : " + unit_name + "sList) {\n"
                + "                " + unit_name + "Repository.save(mdl_" + unit_name + ");\n"
                + "            }\n"
                + "            ResponseEntity<String> responseEntity = new ResponseEntity<>(\"Saved\", HttpStatus.OK);\n"
                + "            return responseEntity;\n"
                + "        } catch (Exception e) {\n"
                + "            System.out.println(\"Error \"  + e.toString());\n"
                + "            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);\n"
                + "        }\n"
                + "    }\n\n}";
    }

    public String structure_update(String unit_name, String tuple) {
        return "        mdl_" + unit_name + "1.set" + pm.get_Capitalized(tuple) + "(mdl_" + unit_name + ".get" + pm.get_Capitalized(tuple) + "());\n";
    }

}
