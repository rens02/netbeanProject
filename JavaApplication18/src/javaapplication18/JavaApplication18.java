/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication18 {
    void build(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        applia apl = new applia();
        samsuing sam = new samsuing();
        
        System.out.println("1. Search Smartphone");
        System.out.println("2. View All Smartphone");
        System.out.println("3. Buy Smartphone");
        System.out.println("4. Exit");
        System.out.println("Choose menu[1..4]");
        int menu = scan.nextInt();
        if (menu == 1){
            
            System.out.println("Search Smartphone");
            System.out.println("1. Applia");
            System.out.println("2. Samsuing");
            System.out.println(" [1..2]: ");
            int type = scan.nextInt();
            switch(type){
                case 1:
                    apl.build();
                    break;
                case 2:
                    sam.build();
                    break;
                case 3:
                    break;
            }
        }
        if (menu == 2){
            display();
        } 
        else{
            System.exit(0);
        }
    }

}

class applia extends JavaApplication18{
    @Override
    void build(){
        System.out.println("Do you want to include your applia with charging cord? [Yes | No](Case insensitive)");
        System.out.println("Type of applia phone you want to buy? [Original | Pro | Promax]");
        System.out.println("Input your house address[Must be alphanumeric]");
    
}
}
class samsuing extends JavaApplication18{
    @Override
    void build(){
        System.out.println("Do you want to include your samsuing with charging cord? [Yes | No](Case insensitive)");
        System.out.println("Type of samsuing phone you want to buy? [Original | Pro | Promax]");
        System.out.println("Input your house address[Must be alphanumeric]");
        
    }
}
