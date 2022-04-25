/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Anis Putri
 */
public class hewan {
    String name;
    int hp;
    int attackPoin;
    

    void attack(){
        System.out.println("Serang");
    }
    void jalan(){
        System.out.println("Jalan");  
    }
    void lawan(){
        System.out.println("Lawan");
    }
    
}

class zombie extends hewan{
    @Override
    void attack(){
        System.out.println("Zombie berlari dan menyerang kamu");
    }
    @Override
    void jalan(){
        System.out.println("Zombie berlari, bukan berjalan");  
    }
    @Override
    void lawan(){
        System.out.println("Lawan zombie adalah manusia dengan senjata !!!");
    }
}
class Sapi extends hewan{
    @Override
    void attack(){
        System.out.println("Sapi adalah hewan baik, tidak menyerang");
    }
    @Override
    void jalan(){
        System.out.println("Sapi berjala menggunakan 4 kaki yang imut");  
    }
    @Override
    void lawan(){
        System.out.println("Lawan sapi adalah penyakit yang menular hewan pada umumnya");
    }
}
class Anjing extends hewan{
    @Override
    void attack(){
        System.out.println("Anjing dapat menyerang dengan gigi nya ");
    }
    @Override
    void jalan(){
        System.out.println("Anjing dapat berlari dan berjalan");  
    }
    @Override
    void lawan(){
        System.out.println("Lawan Anjing adalah kucing ");
    }
}
