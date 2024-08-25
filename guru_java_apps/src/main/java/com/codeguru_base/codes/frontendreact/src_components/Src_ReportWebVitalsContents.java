/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Src_ReportWebVitalsContents {

    public String ReportWebVitalsContents() {
        return "const reportWebVitals = onPerfEntry => {\n"
                + "  if (onPerfEntry && onPerfEntry instanceof Function) {\n"
                + "    import('web-vitals').then(({ getCLS, getFID, getFCP, getLCP, getTTFB }) => {\n"
                + "      getCLS(onPerfEntry);\n"
                + "      getFID(onPerfEntry);\n"
                + "      getFCP(onPerfEntry);\n"
                + "      getLCP(onPerfEntry);\n"
                + "      getTTFB(onPerfEntry);\n"
                + "    });\n"
                + "  }\n"
                + "};\n"
                + "\n"
                + "export default reportWebVitals;";
    }

}
