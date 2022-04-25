/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nama;
    int umur;
    String kelas;
    
    Mahasiswa (String n, int u, String k){
        nama = n;
        umur = u;
        kelas = k;
    }
    
    void tampilMhs(){
        System.out.println("Halo, namaku " + nama);
        System.out.println("Saya berasal dari kelas " + kelas);
        System.out.println("Umur saya saat ini adalah " + umur);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Mahasiswa a;
        System.out.println(" ");
        a = new Mahasiswa("Muhammad Rusydi", 22, "2IA21");
        a.tampilMhs();
        System.out.println("---------------------------");

    }
    
}
