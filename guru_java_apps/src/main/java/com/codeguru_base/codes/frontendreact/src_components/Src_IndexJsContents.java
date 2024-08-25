/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Src_IndexJsContents {

    public String IndexJsContents() {
        return "import React from 'react';\n"
                + "import ReactDOM from 'react-dom/client';\n"
                + "import './index.css';\n"
                + "import App from './App';\n"
                + "import reportWebVitals from './reportWebVitals';\n"
                + "import { BrowserRouter } from 'react-router-dom';\n"
                + "\n"
                + "const root = ReactDOM.createRoot(document.getElementById('root'));\n"
                + "root.render(\n"
                + "  <BrowserRouter>\n"
                + "    <App />\n"
                + "  </BrowserRouter>\n"
                + ");\n"
                + "\n"
                + "// If you want to start measuring performance in your app, pass a function\n"
                + "// to log results (for example: reportWebVitals(console.log))\n"
                + "// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals\n"
                + "reportWebVitals();";
    }

}
