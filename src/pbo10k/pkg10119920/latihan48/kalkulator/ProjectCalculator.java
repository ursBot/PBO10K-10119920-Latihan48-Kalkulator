/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Kalkulator {
    
    private double value1;
    private double value2;
    
    public double getValue1() {
        return value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }
    
    public double getValue2() {
        return value2;
    }
    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject() {
        System.out.println("Project Calculator");
    }
    public void setNoteProject(String note) {
        System.out.println(note);
    }
    
    public double add(double val1, double val2) {
        return val1 + val2;
    }
    public double minus(double val1, double val2) {
        return val1 - val2;
    }
    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }
    public double division(double val1, double val2) {
        return val1 / val2;
    }
    
}

public class ProjectCalculator {
    
    public static void main(String[] args) {
        
        Kalkulator k = new Kalkulator();
        double value1, value2;
        
        k.setValue1(7);
        value1 = k.getValue1();
        k.setValue2(5);
        value2 = k.getValue2();
        
        System.out.println("VALUE 1 = " + value1);
        System.out.println("VALUE 2 = " + value2);
        k.setNameProject();
        k.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + k.add(value1, value2));
        System.out.println("Result Minus is = " + k.minus(value1, value2));
        System.out.println("Result Multiple is = " + k.multiplication(value1, value2));
        System.out.println("Result Division is = " + k.division(value1, value2));
    }
    
}