/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.myutil;

/**
 *
 * @author Shadesh
 */

public class Student extends MealCard {
    private int studentID;
    private String department;
    private MealCard mc;
    
    public Student() {
        //
    }
    
    public Student(int studentID, String department, MealCard mc) { 
        this.studentID = studentID;
        this.department = department;
        this.mc = mc;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public MealCard getMc() {
        return mc;
    }

    public void setMc(MealCard mc) {
        this.mc = mc;
    }
}
