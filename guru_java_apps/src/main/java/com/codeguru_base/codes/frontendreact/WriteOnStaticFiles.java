/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

import com.codeguru_base.codes.backend.Pub_methods;
import com.codeguru_base.codes.frontendreact.page.Page_AboutContents;
import com.codeguru_base.codes.frontendreact.page.Page_DashboardContents;
import com.codeguru_base.codes.frontendreact.root.Root_PackageJsonContents;
import com.codeguru_base.codes.frontendreact.root.Root_PackageLockJsonContents;
import com.codeguru_base.codes.frontendreact.src.hocnew.Hoc_BareInputContent;
import com.codeguru_base.codes.frontendreact.src.hocnew.Hoc_WrapperContents;
import com.codeguru_base.codes.frontendreact.src.home.Home_BannerContents;
import com.codeguru_base.codes.frontendreact.src.navbar.NavListsContents;
import com.codeguru_base.codes.frontendreact.src.navbar.VertNavBarContents;
import com.codeguru_base.codes.frontendreact.src_components.styles.Style_AppCssContents;
import com.codeguru_base.codes.frontendreact.src.styles.Style_CommonsCssConntents;
import com.codeguru_base.codes.frontendreact.src.styles.Style_OtherStylesContents;
import com.codeguru_base.codes.frontendreact.src_components.Src_AppJs;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_Buttons;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_ContainerRowContents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_DataContext;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_Footer;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_HOCFormsContents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_ListTableCotnents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_ListToolBarContents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_LoaderContents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_PageWrapperContents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_PrintComponentContent;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_SearchBox;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_TableHead;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_TitleContents;
import com.codeguru_base.codes.frontendreact.src_components.global.Glob_Utils;
import com.codeguru_base.codes.frontendreact.src_components.hocnew.Hoc_Counter1Cotnents;
import com.codeguru_base.codes.frontendreact.src_components.hocnew.Hoc_Counter2Contents;
import com.codeguru_base.codes.frontendreact.src_components.navbar.SideBarContents;
import com.codeguru_base.codes.frontendreact.src_components.styles.Style_AppCssContents;
import com.codeguru_base.codes.frontendreact.src_components.styles.Style_SideBarContents;
import lombok.NoArgsConstructor;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@NoArgsConstructor
public class WriteOnStaticFiles extends Pub_methods {

    MakeFrontEndDirs Dirs = new MakeFrontEndDirs();//this class gives the paths t different files and directories

    public WriteOnStaticFiles(String appName, String packageName, String unit_name,
            String wlcm1, String wlcm2, String wlcm3, String wlcm4, String wlcm5, String wlcm6) {
        // ============SRC FOLDER
        super.get_writer(Dirs.packagejson(appName), new Root_PackageLockJsonContents().PackageLockJsonContents(appName));
        super.get_writer(Dirs.packagejson(appName), new Root_PackageJsonContents().PackageJsonContents(appName));
        super.get_writer(Dirs.AppJs(appName), new Src_AppJs().Src_AppJs(unit_name, unit_name));
        super.get_writer(Dirs.IndexCss(appName), new Src_IndexCss().IndexCss());
        super.get_writer(Dirs.IndexJs(appName), new Src_IndexJsContents().IndexJsContents());
        super.get_writer(Dirs.reportWebVitals(appName), new Src_ReportWebVitalsContents().ReportWebVitalsContents());
        super.get_writer(Dirs.setupTest(appName), new Src_SetUpTestContents().SetUpTestContents());
        //==============SERVICES FOLDER
        super.get_writer(Dirs.CommonsJs(appName), new Serv_CommonsContents().ServCommonsContents(unit_name));
        //Skipping Delete, Entities, Repository as they are dyunamic.
        super.get_writer(Dirs.ConnJs(appName), new Serv_Conn().Serv_Conn());
        super.get_writer(Dirs.NewClientJs(appName), new Serv_ClientContents().Serv_ClientContents());
        super.get_writer(Dirs.SessionTimejs(appName), new Serv_Session().Serv_Session());

        //===========COMPONENTS FOLDER/Global
        super.get_writer(Dirs.ButtonsJs(appName), new Glob_Buttons().Glob_Buttons(unit_name, unit_name));
        super.get_writer(Dirs.ContainerRowJs(appName), new Glob_ContainerRowContents().Glob_ContainerRowContents(unit_name, unit_name));
        super.get_writer(Dirs.DataContextJs(appName), new Glob_DataContext().AppCss(unit_name, unit_name));
        super.get_writer(Dirs.FooterJs(appName), new Glob_Footer().AppCss(unit_name, unit_name));
        super.get_writer(Dirs.HOCFormJs(appName), new Glob_HOCFormsContents().AppCss(unit_name, unit_name));
        super.get_writer(Dirs.ListTableJs(appName), new Glob_ListTableCotnents().AppCss(unit_name, unit_name));
        super.get_writer(Dirs.ListToolBarJs(appName), new Glob_ListToolBarContents().Glob_ListToolBarContents());
        super.get_writer(Dirs.LoaderJs(appName), new Glob_LoaderContents().Glob_LoaderContents(unit_name, unit_name));
        super.get_writer(Dirs.PagesWapperJs(appName), new Glob_PageWrapperContents().Glob_PageWrapperContents());
        super.get_writer(Dirs.PrintCompanyInfoJs(appName), new Glob_PrintComponentContent().Glob_PrintComponentContent());
        super.get_writer(Dirs.SearchBox(appName), new Glob_SearchBox().Glob_searchBox());
        super.get_writer(Dirs.TableHeadJs(appName), new Glob_TableHead().Glob_TableHead());
        super.get_writer(Dirs.TitleJs(appName), new Glob_TitleContents().Glob_TitleContents());
        super.get_writer(Dirs.UtilsJs(appName), new Glob_Utils().Glob_Utils());
        //===========COMPONENTS FOLDER/HOCNew
        super.get_writer(Dirs.HOCNew_BareInput(appName), new Hoc_BareInputContent().Hoc_BareInputContent());
        super.get_writer(Dirs.HOCNew_Counter1(appName), new Hoc_Counter1Cotnents().Hoc_Counter1Cotnents());
        super.get_writer(Dirs.HOCNew_Counter2(appName), new Hoc_Counter2Contents().Hoc_Counter2Contents());
        super.get_writer(Dirs.HOCNew_Wrapper(appName), new Hoc_WrapperContents().Hoc_WrapperContents());
        //===========COMPONENTS FOLDER/HOME
        super.get_writer(Dirs.BannerJs(appName), new Home_BannerContents().AppCss(wlcm1, wlcm2, wlcm3, wlcm4, wlcm5, wlcm6));
        super.get_writer(Dirs.SolutionsJs(appName), new Home_BannerContents().AppCss(appName, appName, appName, appName, appName, appName));
        //skipping Navbar as it contains the menu based on the units we have in the app
        super.get_writer(Dirs.NavLinksJs(appName), new NavListsContents().NavListsContents());
        super.get_writer(Dirs.SideBarJs(appName), new SideBarContents().SideBarContents() );
        super.get_writer(Dirs.VertNavBarJs(appName), new VertNavBarContents().VertNavBarContents() );
        super.get_writer(Dirs.AboutJs(appName), new Page_AboutContents().Page_AboutContents() );
        super.get_writer(Dirs.DashboardJs(appName), new Page_DashboardContents().Page_DashboardContents() );
        super.get_writer(Dirs.Styles(appName), new Style_AppCssContents().AppCssContents());
        super.get_writer(Dirs.CommnsCss(appName), new Style_CommonsCssConntents().Style_CommonsCssConntents() );
        super.get_writer(Dirs.OtherStylesJs(appName), new Style_OtherStylesContents().Style_OtherStylesContents());
        super.get_writer(Dirs.SideBarCss(appName), new Style_SideBarContents().Style_SideBarContents());
        super.get_writer(Dirs.HomeJs(appName), new HomeJsContents().HomeJsContents());
        super.get_writer(Dirs.LoginJs(appName), new LoginJsContents().LoginJsContents());
        
        
    }

}
