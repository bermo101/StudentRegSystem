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
    private String courseCode;
    List<Module> moduleList;
    private DateTime startDate, endDate;
    
    public Course(String courseName, String courseCode){
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.moduleList = new ArrayList<>();
    }
    
    public void addModule(Module x){
        moduleList.add(x);
    
    }
    public void displayCourse(){
        for(Module x : moduleList) {
            x.displayModule();
            System.out.printf(" %s /n", courseName);
        }
    }
}
