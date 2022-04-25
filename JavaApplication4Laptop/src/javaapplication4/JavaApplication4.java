/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Anis Putri
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        zombie zomb = new zombie();
        Sapi sapi = new Sapi();
        Anjing anjg = new Anjing();
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("1. Zombie");
        System.out.println("2. Sapi");
        System.out.println("3. Anjing");
        System.out.print("Silahkan Pilih makhluk yang akan dijelaskan : ");
        int pil = scan.nextInt();
        
        switch(pil){
            case 1:
                System.out.println();
                zomb.attack();
                zomb.jalan();
                zomb.lawan();
                break;
            case 2:
                System.out.println("");
                sapi.attack();
                sapi.jalan();
                sapi.lawan();
                break;
            case 3:
                System.out.println("");
                anjg.attack();
                anjg.jalan();
                anjg.lawan();
                break;
        }
    }
    
}
