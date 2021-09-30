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


public class Level2_Problem15 {
    public static void main(String[] args) {
        Student student = new Student();
        student.buyFood();
        student.purchasePoints(200);
        student.buyFood();
        student.buyFood();
        student.buyFood();
        student.purchasePoints(100);
        student.buyFood();
    }
}

