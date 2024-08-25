/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

import static com.codeguru_base.codes.backend.Commons.appsFolderName;
import com.codeguru_base.codes.backend.Mdl_AppParams;
import com.codeguru_base.util.Utils;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@Getter
@Setter
@NoArgsConstructor
@Slf4j
public class MakeFrontEndDirs extends Mdl_AppParams {

    private boolean isFSBS = super.isFSBS();
    private String FsBsStr = super.getFsBsStr(); //Forward slash or backslash


    public String apppath(String appName) {
        return absolutePath + FsBsStr + appsFolderName + FsBsStr + "FrontEnd" + FsBsStr + appName;
    }
    public String frontEndPath() {
        return absolutePath + FsBsStr + appsFolderName + FsBsStr + "FrontEnd" + FsBsStr + "";
    }

    public String eachUnitPath(String appName, String unit_name) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "pages" + FsBsStr + new Utils().get_Capitalized(unit_name) + ".js";
    }

    public String GlobalMidPath(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "Global";
    }

    public String componentFolder(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components";
    }

    public String serviceFolder(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "services";
    }

//    The below is inside components
    public String GlobalFolder(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "Global";
    }

    public String HOCnew(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "HOCNew";
    }

    public String home(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "home";
    }

    public String imgz(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "imgz";
    }

    public String Navbar(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "Navbar";
    }

    public String Pages(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "pages";
    }
    public String Styles(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "Styles";
    }

    public String packagejson(String appName) {
        return apppath(appName) + FsBsStr + "package.json";
    }

    public String packagejsonLock(String appName) {
        return apppath(appName) + FsBsStr + "package-lock.json";
    }

    //<editor-fold defaultstate="collapsed" desc="------------Files inside the public folder ---------------">
    public String HtAccess(String appName) {
        return apppath(appName) + FsBsStr + "public" + FsBsStr + ".htaccess";
    }

    public String IndexHtml(String appName) {
        return apppath(appName) + FsBsStr + "public" + FsBsStr + "index.html";
    }

    public String robotsTxt(String appName) {
        return apppath(appName) + FsBsStr + "public" + FsBsStr + "robots.txt";
    }

    public String manifestJson(String appName) {
        return apppath(appName) + FsBsStr + "public" + FsBsStr + "manifest.json";
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="-----------------------The files starting from the root dir---------------------">
    public String AppCssoutOfComponent(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "App.css";
    }

    public String AppJs(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "App.js";
    }

    public String IndexCss(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "index.css";
    }

    public String IndexJs(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "index.js";
    }

    public String reportWebVitals(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "reportWebVitals.js";
    }

    public String setupTest(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "setupTest.js";
    }

    public String HomeJs(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "Home.js";
    }

    public String LoginJs(String appName) {
        return apppath(appName) + FsBsStr + "src" + FsBsStr + "components" + FsBsStr + "Login.js";
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="----------------------------Inside Global & Forms------------------------------">
    public String Global(String appName) {
        return GlobalMidPath(appName);
    }

    public String Lists(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "Lists";
    }

    public String ButtonsJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "Buttons.js";
    }

    public String ContainerRowJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "ContainerRow.js";
    }

    public String DataContextJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "DataContext.js";
    }

    public String FooterJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "Footer.js";
    }

    public String HOCFormJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "HOCForm.js";
    }

    public String ListTableJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "ListTable.js";
    }

    public String ListToolBarJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "ListToolBar.js";
    }

    public String LoaderJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "Loader.js";
    }

    public String PagesWapperJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "PagesWapper.js";
    }

    public String PrintCompanyInfoJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "PrintCompanyInfo.js";
    }

    public String SearchBox(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "SearchBox.js";
    }

    public String TableHeadJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "TableHead.js";
    }

    public String TitleJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "Title.js";
    }

    public String UtilsJs(String appName) {
        return GlobalMidPath(appName) + FsBsStr + "Utils.js";
    }

    public String FormsDir(String appName) {
        return Global(appName) + FsBsStr + "Forms";
    }

    public String ListsDir(String appName) {
        return Global(appName) + FsBsStr + "Lists.js";
    }

    //<editor-fold defaultstate="collapsed" desc="-------------------Forms -----------------------------">
    public String InputRowJs(String appName) {
        return Global(appName) + FsBsStr + "Forms" + FsBsStr + "InputRow.js";
    }

    public String InputsJs(String appName) {
        return Global(appName) + FsBsStr + "Forms" + FsBsStr + "Inputs.js";
    }

    public String PubFnxJs(String appName) {
        return Global(appName) + FsBsStr + "Forms" + FsBsStr + "PubFnx.js";
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="----------Lists----------------">
    public String Listsjs(String appName) {
        return Global(appName) + FsBsStr + "StructureList.js";
    }

    //</editor-fold>
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="-----------Other Components  Files">
    public String HOCNew_BareInput(String appName) {
        return HOCnew(appName) + FsBsStr + "BareInput.js";
    }

    public String HOCNew_Counter1(String appName) {
        return HOCnew(appName) + FsBsStr + "Counter1.js";
    }

    public String HOCNew_Counter2(String appName) {
        return HOCnew(appName) + FsBsStr + "Counter2.js";
    }

    public String HOCNew_Wrapper(String appName) {
        return HOCnew(appName) + FsBsStr + "Wrapper.js";
    }

    public String BannerJs(String appName) {
        return home(appName) + FsBsStr + "Banner.js";
    }

    public String SolutionsJs(String appName) {
        return home(appName) + FsBsStr + "Solutions.js";
    }

    //-----------Nvbar
    public String NavbarJs(String appName) {
        return Navbar(appName) + FsBsStr + "Navbar.js";
    }

    public String NavLinksJs(String appName) {
        return Navbar(appName) + FsBsStr + "NavLinks.js";
    }

    public String SideBarJs(String appName) {
        return Navbar(appName) + FsBsStr + "SideBar.js";
    }

    public String VertNavBarJs(String appName) {
        return Navbar(appName) + FsBsStr + "VertNavBar.js";
    }

    //--------pages
    public String AboutJs(String appName) {
        return Pages(appName) + FsBsStr + "About.js";
    }

    public String DashboardJs(String appName) {
        return Pages(appName) + FsBsStr + "Dashboard.js";
    }

    public String TestHocJs(String appName) {
        return Pages(appName) + FsBsStr + "TestHoc.js";
    }

    //-------styles
    public String AppCss(String appName) {
        return Styles(appName) + FsBsStr + "App.css";
    }

    public String CommnsCss(String appName) {
        return Styles(appName) + FsBsStr + "commons.css";
    }

    public String OtherStylesJs(String appName) {
        return Styles(appName) + FsBsStr + "OtherStyles.js";
    }

    public String SideBarCss(String appName) {
        return Styles(appName) + FsBsStr + "SideBar.css";
    }

    //--------------------------------Services
    public String CommonsJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "Commons.js";
    }

    public String ConnJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "Conn.js";
    }

    public String DeleteJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "Delete.js";
    }

    public String EntitiesJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "Entities.js";
    }

    public String NewClientJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "NewClient.js";
    }

    public String RepositoryJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "Repository.js";
    }

    public String SessionTimejs(String appName) {
        return serviceFolder(appName) + FsBsStr + "SessionTime.js";
    }

    public String UrlsJs(String appName) {
        return serviceFolder(appName) + FsBsStr + "Urls.js";
    }

    //</editor-fold>
    public MakeFrontEndDirs(String appName, String packagename) {
        try {
            //<editor-fold defaultstate="collapsed" desc="------------------------------------------RootDirectories -------------------------------">

            new File(apppath(appName)).mkdir();
            new File(apppath(appName) + FsBsStr + "public").mkdir();
            new File(apppath(appName) + FsBsStr + "src").mkdir();
            new File(componentFolder(appName)).mkdir();
            new File(serviceFolder(appName)).mkdir();
            new File(GlobalFolder(appName)).mkdir();
            new File(HOCnew(appName)).mkdir();
            new File(home(appName)).mkdir();
            new File(imgz(appName)).mkdir();
            new File(Navbar(appName)).mkdir();
            new File(Pages(appName)).mkdir();
            new File(Styles(appName)).mkdir();
            
            
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="----------------------Inside Public folder ----------------------">
            new File(HtAccess(appName)).createNewFile();
            new File(IndexHtml(appName)).createNewFile();
            new File(robotsTxt(appName)).createNewFile();
            new File(manifestJson(appName)).createNewFile();
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="------------------------The files starting from the root dir ------------------------">
            new File(packagejson(appName)).createNewFile();
            new File(packagejsonLock(appName)).createNewFile();
            new File(AppCssoutOfComponent(appName)).createNewFile();
            new File(AppJs(appName)).createNewFile();
            new File(IndexCss(appName)).createNewFile();
            new File(IndexJs(appName)).createNewFile();
            new File(reportWebVitals(appName)).createNewFile();
            new File(setupTest(appName)).createNewFile();
            new File(HomeJs(appName)).createNewFile();
            new File(LoginJs(appName)).createNewFile();
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="---------------Inside Global & forms---------------------">
            new File(Global(appName)).mkdir();//this is a directory though!
            new File(FormsDir(appName)).mkdir();//this is a directory though!
            new File(ListsDir(appName)).mkdir();//this is a directory though!
            new File(ButtonsJs(appName)).createNewFile();
            new File(ContainerRowJs(appName)).createNewFile();
            new File(DataContextJs(appName)).createNewFile();
            new File(FooterJs(appName)).createNewFile();
            new File(HOCFormJs(appName)).createNewFile();
            new File(ListTableJs(appName)).createNewFile();
            new File(ListToolBarJs(appName)).createNewFile();
            new File(LoaderJs(appName)).createNewFile();
            new File(PagesWapperJs(appName)).createNewFile();
            new File(PrintCompanyInfoJs(appName)).createNewFile();
            new File(SearchBox(appName)).createNewFile();
            new File(TableHeadJs(appName)).createNewFile();
            new File(TitleJs(appName)).createNewFile();
            new File(UtilsJs(appName)).createNewFile();

            //<editor-fold defaultstate="collapsed" desc="----------Forms -------------">
            new File(InputRowJs(appName)).createNewFile();
            new File(InputsJs(appName)).createNewFile();
            new File(PubFnxJs(appName)).createNewFile();

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="----------Inside Lsits">
            new File(Listsjs(appName)).createNewFile();
            //</editor-fold>

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="-------------------Other Components's  files------------------------">
            new File(HOCNew_BareInput(appName)).createNewFile();
            new File(HOCNew_Counter1(appName)).createNewFile();
            new File(HOCNew_Counter2(appName)).createNewFile();
            new File(HOCNew_Wrapper(appName)).createNewFile();

            new File(BannerJs(appName)).createNewFile();
            new File(SolutionsJs(appName)).createNewFile();
            //---------------------Navbar 
            new File(NavbarJs(appName)).createNewFile();
            new File(NavLinksJs(appName)).createNewFile();
            new File(SideBarJs(appName)).createNewFile();
            new File(VertNavBarJs(appName)).createNewFile();

            new File(AboutJs(appName)).createNewFile();
            new File(DashboardJs(appName)).createNewFile();
            new File(TestHocJs(appName)).createNewFile();

            //------------------------------Styles 
            new File(AppCss(appName)).createNewFile();
            new File(CommnsCss(appName)).createNewFile();
            new File(OtherStylesJs(appName)).createNewFile();
            new File(SideBarCss(appName)).createNewFile();

            //--------------------------------Services
            new File(CommonsJs(appName)).createNewFile();
            new File(ConnJs(appName)).createNewFile();
            new File(DeleteJs(appName)).createNewFile();
            new File(EntitiesJs(appName)).createNewFile();
            new File(NewClientJs(appName)).createNewFile();
            new File(RepositoryJs(appName)).createNewFile();
            new File(SessionTimejs(appName)).createNewFile();
            new File(UrlsJs(appName)).createNewFile();

            //</editor-fold>
        } catch (IOException ex) {
            Logger.getLogger(MakeFrontEndDirs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
