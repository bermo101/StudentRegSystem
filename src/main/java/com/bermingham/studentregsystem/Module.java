/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bermingham.studentregsystem;

import java.util.*;

/**
 *
 * @author Brian
 */
public class Module {
    private final String moduleName;
    private final String moduleID;
    List<Student> studentList;
    
    public Module(String mdlName, String mdlID){
        this.moduleName = mdlName;
        this.moduleID = mdlID;
        this.studentList = new ArrayList<>();
        }
    
    public void addstudent(Student x){
        studentList.add(x);
    
    }
    
}
//= new ArrayList<Student>()