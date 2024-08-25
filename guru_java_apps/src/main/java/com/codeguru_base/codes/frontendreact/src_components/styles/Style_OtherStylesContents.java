/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src.styles;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Style_OtherStylesContents extends Utils {

    public String Style_OtherStylesContents() {
        return "import React from \"react\"\n"
                + "import GifLoader from 'react-gif-loader';\n"
                + "class CustomStyles {\n"
                + "\n"
                + "    LogoOnPrint() {\n"
                + "        return {\n"
                + "            height: \"70px\",\n"
                + "            backgroundSize: \"100%\"\n"
                + "        }\n"
                + "    }\n"
                + "    txt() {\n"
                + "        return {\n"
                + "            border: \"1px solid #8fa6d3da\",\n"
                + "            borderRadius: \"3px\",\n"
                + "            fontWeight: \"bolder\",\n"
                + "            color: \"#000\",\n"
                + "            margin: \"0px auto\",\n"
                + "            padding: \"0px auto\",\n"
                + "            height: \"32px\",\n"
                + "            fontSize: \"14px\"\n"
                + "        }\n"
                + "    }\n"
                + "    DateOnPrint() {\n"
                + "        return <>\n"
                + "            <div className=\"row d-flex justify-content-start\">\n"
                + "                <div className=\"col\" style={{ fontWeight: \"bolder\" }}>\n"
                + "                    Date:\n"
                + "                </div>\n"
                + "                <div className=\"col\">\n"
                + "                    {new Date().getFullYear()\n"
                + "                        + \"-\" + (new Date().getMonth() + 1)\n"
                + "                        + \"-\" + new Date().getDate() + \" \" +\n"
                + "                        new Date().getHours() + \":\" + new Date().getMinutes() + \":\" + new Date().getSeconds()}\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </>\n"
                + "    }\n"
                + "}\n"
                + "export default new CustomStyles()\n"
                + "\n"
                + "export const LoadingGif = () => {\n"
                + "\n"
                + "    const imageStyle={\n"
                + "        height: '40px',\n"
                + "        width: '100px',\n"
                + "        backgroundImage: '100%',\n"
                + "        position: 'absolute',\n"
                + "        left:'-30px'\n"
                + "    }\n"
                + "    return (\n"
                + "        <GifLoader\n"
                + "            loading={true}\n"
                + "            imageSrc=\"https://media.giphy.com/media/l378zKVk7Eh3yHoJi/source.gif\"\n"
                + "            imageStyle={imageStyle}\n"
                + "            overlayBackground=\"#fff\"\n"
                + "        />\n"
                + "    );\n"
                + "}";
    }
}
