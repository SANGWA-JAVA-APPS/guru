/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeguru_base.codes.frontendreact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageHelper {

    public static String frntDeclare;
    public static String frntFieldObjDeclare;
    public static String frntSetFieldOnUpdate;
    public static String frntResetAfterSave;
    public static String frntUnitInputRow;
    public static String frntTableHeaderFields;
    public static String frntTableBodyFields;

    PagesMethods pm = new PagesMethods();

    public void setDeclare(int c, String field_name) {
        frntDeclare += pm.declare(c, field_name);
    }

    public void setFieldObjDeclare(int c, String field_name) {
        frntFieldObjDeclare += pm.fieldsObjectDeclare(c, field_name);
    }

    public void setResetAfterSave(String field_name, int c) {
        frntResetAfterSave += pm.resetAfterSave(field_name, c);
    }

    public void setUnitInputRow(String unit, String field_name) {
        frntUnitInputRow += pm.unitInputRow(unit, field_name);
    }

    public void setTableHeaderFields(String field_name) {
        frntTableHeaderFields += pm.tableHeaderFields(field_name);
    }

    public void setTableBodyFields(String unit_name,String field_name) {
        frntTableBodyFields += pm.tablebodyFields(unit_name, field_name);
    }

    public void setfrntSetFieldOnUpdate(String field_name) {
        frntSetFieldOnUpdate += pm.setFieldsOnUpdate(field_name);
    }

}
