/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelasUtama;

/**
 *
 * @author ASUS
 */
public class Asisten {
    String nama;
    int umur;
    
    Asisten(String n, int u){
        nama = n;
        umur = u;
    }
    
    void tampilAsisten(){
        System.out.println("Halo, nama saya "+ nama);
        System.out.println("Umur saya "+ umur);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Asisten a;
        System.out.println("");
        a = new Asisten("Dimas Renaldy Sriwirawan", 19);
        a.tampilAsisten();
        System.out.println("_________________________");
        a = new Asisten("Muhammad Rusyadi", 22);
        a.tampilAsisten();
    }
    
}
