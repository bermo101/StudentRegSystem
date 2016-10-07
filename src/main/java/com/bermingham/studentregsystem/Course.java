/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bermingham.studentregsystem;

import java.util.*;
import org.joda.time.DateTime;

/**
 *
 * @author Brian
 */
public class Course {
    private String courseName;
    List<Module> moduleList;
    private DateTime startDate, endDate;
    
    private Course(String courseName){
    this.courseName = courseName;
    this.moduleList = new ArrayList<>();
    }
    
    public void addModule(Module x){
        moduleList.add(x);
    
    }
}
