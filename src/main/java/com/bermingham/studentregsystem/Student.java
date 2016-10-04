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
public class Student {
    private String studentName;
    private String studentID;
    private int age;
    private String username;
    private Date birthDate;
    
    public Student(String studentName, String studentID, int age, Date birthDate){
           
        this.studentName = studentName;
        this.age = age;
        this.studentID = studentID;
        this.username = "";
        this.birthDate = birthDate;           
            
            }
    
    public void getUsername(){
        username = studentName + age;
    }
}
