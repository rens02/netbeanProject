/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewani;
import java.util.Scanner;
/**
 *
 * @author Anis Putri
 */

public class Hewani {
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
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        zombie zomb = new zombie();
        Sapi sapi = new Sapi();
        Anjing anjg = new Anjing();

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Daftar Makhluk :");
        System.out.println("1. Zombie");
        System.out.println("2. Sapi");
        System.out.println("3. Anjing");
        System.out.println("Silahkan Pilih makhluk yang akan dijelaskan");
        int pil = scan.nextInt();
        
        switch(pil){
            case 1:
                zomb.attack();
                zomb.jalan();
                zomb.lawan();
                break;
            case 2:
                sapi.attack();
                sapi.jalan();
                sapi.lawan();
                break;
            case 3:
                anjg.attack();
                anjg.jalan();
                anjg.lawan();
                break;
        }
    }
    
}

class zombie extends Hewani{
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
class Sapi extends Hewani{
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
class Anjing extends Hewani{
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