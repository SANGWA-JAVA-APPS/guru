/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact.src_components.styles;

import com.codeguru_base.util.Utils;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
public class Style_AppCssContents extends Utils {

    public String AppCssContents() {
        return "* {\n"
                + "    font-family: century gothic;\n"
                + "}\n"
                + "\n"
                + "video {\n"
                + "    width: 100%;\n"
                + "    height: 100vh;\n"
                + "    top: 0px;\n"
                + "    left: 0px;\n"
                + "    position: absolute;\n"
                + "    z-index: -1;\n"
                + "}\n"
                + "\n"
                + "body {\n"
                + "    overflow: hidden;\n"
                + "}\n"
                + "\n"
                + ".component {\n"
                + "    padding: 30px 5px;\n"
                + "    margin-top: 70px;\n"
                + "    min-height: 250px;\n"
                + "}\n"
                + "\n"
                + ".title {\n"
                + "    font-weight: bolder;\n"
                + "    font-size: 50px;\n"
                + "    color: #222222;\n"
                + "    text-align: center;\n"
                + "}\n"
                + "\n"
                + ".component .cards div div {\n"
                + "    min-height: 100px;\n"
                + "    border: 1px solid #e9e9e9;\n"
                + "}\n"
                + "\n"
                + "\n"
                + "/* Fonts */\n"
                + ".btn {\n"
                + "    padding: 5px;\n"
                + "    font-size: 10px;\n"
                + "    font-weight: bolder;\n"
                + "    border-bottom: 1px solid #9e62e2;\n"
                + "}\n"
                + "\n"
                + "body {\n"
                + "    overflow-x: hidden;\n"
                + "}\n"
                + "\n"
                + "/* The below is for the form saving */\n"
                + ".loader {\n"
                + "    height: 200px;\n"
                + "    background-image: url(../imgz/loading.gif);\n"
                + "    background-size: 100%;\n"
                + "    background-repeat: no-repeat;\n"
                + "    background-position: center;\n"
                + "    width: 100px;\n"
                + "\n"
                + "}\n"
                + "\n"
                + "/* The below is the progress preview on the data list load */\n"
                + ".dataLoader {\n"
                + "    background-image: url('../imgz/DataListLoading.gif');\n"
                + "    background-size: 10%;\n"
                + "    background-repeat: no-repeat;\n"
                + "    border-radius: 20px;\n"
                + "    height: 150px;\n"
                + "    background-position-x: center;\n"
                + "\n"
                + "}\n"
                + "\n"
                + "/* Loading the units on the dropdwon */\n"
                + ".unitsLoading {\n"
                + "    background-image: url('../imgz/loading.gif');\n"
                + "    background-size: 14%;\n"
                + "    margin-left: 40px;\n"
                + "}\n"
                + "\n"
                + ".printHeaderBoxParent {\n"
                + "    display: none;\n"
                + "}\n"
                + "\n"
                + "/* Printings Styles */\n"
                + "@media print {\n"
                + "\n"
                + "    *,\n"
                + "    body,\n"
                + "    .dataTable,\n"
                + "    .dataTable .dataTable tr td {\n"
                + "        font-size: 12px;\n"
                + "    }\n"
                + "\n"
                + "    .dataTable {\n"
                + "\n"
                + "        margin-left: \"60px\";\n"
                + "    }\n"
                + "\n"
                + "    .DataTableBox,\n"
                + "    .dataTable {\n"
                + "        padding-left: 20px;\n"
                + "        padding-right: 50px;\n"
                + "        margin-top: 0px;\n"
                + "    }\n"
                + "\n"
                + "    .printHeaderBoxParent,\n"
                + "    .printHeaderBoxParent * {\n"
                + "        display: block;\n"
                + "\n"
                + "    }\n"
                + "\n"
                + "    .dataTable .delButton {\n"
                + "        display: none;\n"
                + "    }\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".printHeaderBox {\n"
                + "    /* margin: \"10px\";\n"
                + "    padding: 5px; */\n"
                + "}\n"
                + "\n"
                + ".LogoOnPrint {\n"
                + "    background-image: url('../imgz/Logo.jpeg');\n"
                + "    background-repeat: no-repeat;\n"
                + "    content: \" \";\n"
                + "}\n"
                + "\n"
                + "/* End printings */\n"
                + "\n"
                + "\n"
                + "\n"
                + "/* Tables */\n"
                + ".table thead {\n"
                + "    background-color: #08446f;\n"
                + "    color: #ffffff;\n"
                + "    text-transform: uppercase;\n"
                + "    font-size: 12px;\n"
                + "}\n"
                + "\n"
                + ".table thead td {\n"
                + "    padding-left: 30px;\n"
                + "    font-size: 11px;\n"
                + "}\n"
                + "\n"
                + ".table td {\n"
                + "    padding: 0px;\n"
                + "    font-size: 12px;\n"
                + "    font-weight: bolder;\n"
                + "    border-bottom: 1px solid #9e62e2;\n"
                + "}\n"
                + "\n"
                + "\n"
                + ".delIcon {\n"
                + "    width: 20px;\n"
                + "    height: 20px;\n"
                + "    background-image: url(../imgz/delete.png);\n"
                + "    background-repeat: no-repeat;\n"
                + "    background-size: 70%;\n"
                + "}\n"
                + "\n"
                + ".delIcon:hover {\n"
                + "    cursor: pointer;\n"
                + "}\n"
                + "\n"
                + "\n"
                + "\n"
                + ".formBox,\n"
                + ".formPane {\n"
                + "    box-shadow: 0px 0px 2px #000;\n"
                + "    border-radius: 2px;\n"
                + "    border: 1px solid #b5e1f6;\n"
                + "}\n"
                + "\n"
                + ".DataTableBox,\n"
                + ".dataTable {\n"
                + "    padding-left: 0px;\n"
                + "    padding-right: 0px;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".dataTable .table {\n"
                + "    margin: 0px;\n"
                + "    width: 100%;\n"
                + "}\n"
                + "\n"
                + ".dataTableBox,\n"
                + ".CountTotals,\n"
                + ".totalBox {\n"
                + "    box-shadow: 0px 0px 2px #000;\n"
                + "    border-radius: 2px;\n"
                + "    border: 1px solid #b5e1f6;\n"
                + "}\n"
                + "\n"
                + ".optCol {\n"
                + "    max-width: 50px;\n"
                + "}\n"
                + "\n"
                + ".boldTitle {\n"
                + "    font-weight: bolder;\n"
                + "    font-size: 14px;\n"
                + "    margin: 13px auto;\n"
                + "    font-family: arial;\n"
                + "    color: #000;\n"
                + "}\n"
                + "\n"
                + ".totalBox,\n"
                + ".CountTotals {\n"
                + "    background-image: url('../imgz/cargo.jpg');\n"
                + "    background-size: 100%;\n"
                + "}\n"
                + "\n"
                + ".dataTableBox h3,\n"
                + "#Form h3,\n"
                + ".listTitle h3,\n"
                + ".formPane h3 {\n"
                + "    font-weight: bolder;\n"
                + "}\n"
                + "\n"
                + "\n"
                + ".CountTotals,\n"
                + ".totalBox {\n"
                + "    font-weight: bolder;\n"
                + "    border: 1px solid #fff;\n"
                + "    color: #fff;\n"
                + "}\n"
                + "\n"
                + ".totalBoxList h6 {\n"
                + "    font-weight: bolder;\n"
                + "}\n"
                + "\n"
                + ".totalBoxList {\n"
                + "    font-size: 12px;\n"
                + "    line-height: 4px;\n"
                + "}\n"
                + "\n"
                + ".totalBox li {\n"
                + "    font-weight: bolder;\n"
                + "}\n"
                + "\n"
                + ".totalBoxList p {\n"
                + "    font-size: 12px;\n"
                + "    ;\n"
                + "}\n"
                + "\n"
                + ".bottomspace {\n"
                + "    margin-bottom: 30px;\n"
                + "}\n"
                + "\n"
                + ".g {\n"
                + "    color: #b5a409f8;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".deptext {\n"
                + "    -webkit-text-stroke-width: 2px;\n"
                + "    /* -webkit-text-fill-color: #d86812; */\n"
                + "    -webkit-text-stroke-color: rgb(24, 154, 235);\n"
                + "    text-shadow: 0px 0px 5px #01080b;\n"
                + "    font-size: 30px;\n"
                + "    font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;\n"
                + "}\n"
                + "\n"
                + "/* Form */\n"
                + "\n"
                + "\n"
                + "\n"
                + ".form-control:focus {\n"
                + "    box-shadow: none;\n"
                + "}\n"
                + "\n"
                + ".loginBg {\n"
                + "    background-image: url('../imgz/Warehouse.jpg');\n"
                + "    background-size: 100%;\n"
                + "    background-repeat: no-repeat;\n"
                + "}\n"
                + "\n"
                + ".homepageBg {\n"
                + "    background-image: url('../imgz/homeWarehouse.jpg');\n"
                + "    background-size: 100%;\n"
                + "    background-repeat: no-repeat;\n"
                + "}\n"
                + "\n"
                + ".loginBg .formPane {\n"
                + "    background-color: #fff;\n"
                + "    /* color: #0694e6; */\n"
                + "}\n"
                + "\n"
                + ".logoutBtn {}\n"
                + "\n"
                + "\n"
                + ".navbar-nav>li {\n"
                + "    padding-left: 20px;\n"
                + "    padding-right: 30px;\n"
                + "}\n"
                + "\n"
                + ".gBanner {\n"
                + "    height: calc(100vh - 60px);\n"
                + "    background-image: url('../imgz/9.jpg');\n"
                + "    background-size: 90%;\n"
                + "    background-position-y: -190px;\n"
                + "    position: relative;\n"
                + "}\n"
                + "\n"
                + ".gBanner .overlay {\n"
                + "    height: 35vh;\n"
                + "    background-color: #000;\n"
                + "    opacity: 0.1;\n"
                + "    content: \" \";\n"
                + "    width: 100%;\n"
                + "    top: 35%;\n"
                + "    position: absolute;\n"
                + "    left: 0px;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".gBanner .bannerTitle,\n"
                + ".gBanner .bannerMore {\n"
                + "    color: #fff;\n"
                + "    text-align: center;\n"
                + "    position: absolute;\n"
                + "    left: auto;\n"
                + "    text-shadow: 0px 0px 7px #000;\n"
                + "}\n"
                + "\n"
                + ".gBanner .bannerTitle {\n"
                + "    /* font-size: 50px; */\n"
                + "    font-weight: bolder;\n"
                + "    text-transform: capitalize;\n"
                + "    top: 38%;\n"
                + "\n"
                + "    width: 100%;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".gBanner .bannerMore {\n"
                + "    top: 55%;\n"
                + "    width: 20%;\n"
                + "    left: 42.25%;\n"
                + "    border: 1px solid #fff;\n"
                + "    font-weight: bold;\n"
                + "}\n"
                + "\n"
                + ".gBanner .bannerMore:hover {\n"
                + "    border: 1px solid #fff;\n"
                + "    color: #00aeff;\n"
                + "    /* border: 2px solid #fff; */\n"
                + "    border: solid 2px #ffffff;\n"
                + "    transition: border-width .3s linear;\n"
                + "\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".gBanner .slide1 {}\n"
                + "\n"
                + "\n"
                + "\n"
                + "/* Solution component */\n"
                + "\n"
                + ".compSolutions {}\n"
                + "\n"
                + ".IconTitle {\n"
                + "    font-size: 16px;\n"
                + "    font-weight: bold;\n"
                + "    color: #415f66;\n"
                + "    padding: 10px 20px;\n"
                + "}\n"
                + "\n"
                + ".compSolutions .IconTitle span {\n"
                + "    text-align: center;\n"
                + "    display: block;\n"
                + "}\n"
                + "\n"
                + ".compSolutions .IconTitle p {\n"
                + "    text-align: center;\n"
                + "    display: block;\n"
                + "    font-weight: normal;\n"
                + "    font-size: 14px;\n"
                + "}\n"
                + "\n"
                + "\n"
                + "\n"
                + "/*Footer*/\n"
                + ".footer a {\n"
                + "    font-weight: bolder;\n"
                + "    color: #2ccdf5;\n"
                + "}\n"
                + "\n"
                + ".footerLogo {\n"
                + "    height: 150px;\n"
                + "    width: 150px;\n"
                + "    background-image: url('../imgz/Logo.jpg');\n"
                + "    border-radius: 100%;\n"
                + "    border: 1px solid #2ccdf5;\n"
                + "    box-shadow: 0px 0px 5px #000;\n"
                + "    background-position-x: 10px;\n"
                + "    background-position-y: 10px;\n"
                + "    background-repeat: no-repeat;\n"
                + "    background-color: #fff;\n"
                + "    background-size: 90%;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".footerAddress {\n"
                + "    font-size: 12px;\n"
                + "    text-align: left;\n"
                + "}\n"
                + "\n"
                + ".pageWrapper {\n"
                + "    /* background-image: url('../imgz/bgdev.jpg'); */\n"
                + "    background-repeat: no-repeat;\n"
                + "    background-size: cover;\n"
                + "    background-position: fixed;\n"
                + "    height: calc(100vh - 60px);\n"
                + "\n"
                + "    overflow-y: scroll;\n"
                + "\n"
                + "\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".pageWrapper::-webkit-scrollbar {\n"
                + "    width: 7px;\n"
                + "    border-top: 5px;\n"
                + "    border-bottom: 5px;\n"
                + "}\n"
                + "\n"
                + ".pageWrapper ::-webkit-scrollbar-track {\n"
                + "    background: #f1f1f1;\n"
                + "}\n"
                + "\n"
                + ".pageWrapper::-webkit-scrollbar-thumb {\n"
                + "    background: #888;\n"
                + "    background-color: #045ee6;\n"
                + "    border-top: 5px;\n"
                + "    border-bottom: 5px;\n"
                + "}\n"
                + "\n"
                + ".pageWrapper::-webkit-scrollbar-thumb:hover {\n"
                + "    background: #555;\n"
                + "    background-color: #045ee6;\n"
                + "}\n"
                + "\n"
                + "/* Vertical Menu Bar */\n"
                + "\n"
                + "\n"
                + ".verNavBar {\n"
                + "    background-color: #05a6fd;\n"
                + "    border-radius: 6px;\n"
                + "    border: 2px solid #fff;\n"
                + "    box-shadow: 0px 0px 10px #000;\n"
                + "    /* height: 80%; */\n"
                + "}\n"
                + "\n"
                + ".verNavBar a {\n"
                + "    font-size: 13px;\n"
                + "    ;\n"
                + "}\n"
                + "\n"
                + ".navContainer a,\n"
                + ".navContainer i {\n"
                + "    color: #f6f7f8;\n"
                + "}\n"
                + "\n"
                + ".verNavBar a,\n"
                + ".verNavBar i {\n"
                + "    font-size: 14px;\n"
                + "    color: #f6f7f8;\n"
                + "    font-weight: bolder;\n"
                + "    font-family: arial black;\n"
                + "}\n"
                + "\n"
                + ".verNavBar a:hover {\n"
                + "    color: #000;\n"
                + "}\n"
                + "\n"
                + ".verNavBar a:visited {\n"
                + "    color: #000;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".form-control {\n"
                + "    border: 1px solid #ff0000;\n"
                + "    background-color: #02020f;\n"
                + "}\n"
                + "\n"
                + "\n"
                + "/* =================== Deploy ======================== */\n"
                + ".deployParentFixed {\n"
                + "    position: sticky\n"
                + "}\n"
                + "\n"
                + ".deployBox {\n"
                + "    font-size: 12px;\n"
                + "    font-weight: bolder;\n"
                + "}\n"
                + "\n"
                + ".structureItem:hover {\n"
                + "     cursor: pointer\n"
                + "}\n"
                + "\n"
                + ".structureItem {\n"
                + "    font-size: 14px;\n"
                + "    padding: 9px;\n"
                + "    background-color: #470343;\n"
                + "}\n"
                + ".structureItem:hover{\n"
                + "    background-color: #7e1678;\n"
                + "}\n"
                + ".unitItem {\n"
                + "    font-size: 13px;\n"
                + "    padding: 3px;\n"
                + "    background-color: #418affda;\n"
                + "}\n"
                + ".unitItem:hover{\n"
                + "    cursor: pointer;\n"
                + "    box-shadow: 0px 0px 3px #110a03;\n"
                + "    background-color: #3473dada;\n"
                + "}\n"
                + "\n"
                + "\n"
                + ".structureItem,\n"
                + ".unitItem {\n"
                + "    color: #fff;\n"
                + "    float: left;\n"
                + "    display: inline;\n"
                + "    box-shadow: 0px 0px 3px #ff8800;\n"
                + "    border: 1px solid #fff;\n"
                + "\n"
                + "}\n"
                + "\n"
                + ".unitItem .header {\n"
                + "    font-size: 14px;\n"
                + "    padding: 5px;\n"
                + "    border-bottom: 1px solid #fff;\n"
                + "    margin-bottom: 7px;\n"
                + "}\n"
                + ".unitItem .fields{\n"
                + "    margin-top: 10px;\n"
                + "    border-top: 1px solid #fff;\n"
                + "    padding-top: 5px;\n"
                + "}\n"
                + "\n"
                + ".coloredTitles {\n"
                + "    color: #ff8800;\n"
                + "}";
    }
}
