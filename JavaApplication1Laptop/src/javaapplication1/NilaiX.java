/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Anis Putri
 */


class Parents {
    public int x = 5;
}
class Child extends Parents {
    public int x = 5;
    public void info(int x){
    System.out.println("Nilai X sebagai parameter = "+ x);
    System.out.println("Data member x di class Child = " + this.x);
    System.out.println("Data member x di class Parent = " + super.x);
    }
}

public class NilaiX{
    public static void main(String args[]){
        Child tes = new Child();
        tes.info(20);
    }
}


    
    


