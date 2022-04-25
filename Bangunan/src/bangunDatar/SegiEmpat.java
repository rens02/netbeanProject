/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Anis Putri
 */
public class SegiEmpat extends BangunDatar{
    //deklarasi variabwl
    double sisi;
    
    //deklarasi method konstruktor tanpa parameter
    public SegiEmpat(){
        
    }
    //deklarasi method konstruktor dengan parameter
    public SegiEmpat (double inputsisi){
        this.sisi = inputsisi;
        // menentukan nilai dari variabel sisi
    }
    //deklarasi method untuk menentukan nilai dari 
    public void setSisi (double inputsisi){
        this.sisi = inputsisi;
    }
    //deklarasi method untuk
    //dari superclass nya 
    
    @Override
    public void hitungLuas(){
        double luas; //deklarasi variabel lokal
        luas = this.sisi * this.sisi;
        //mencetak  luas
        System.out.println("Luas segi empat dengan sisi"+sisi+"cm adalah"+luas+"cm kuadrat");
      
    }
    public void hitungKeliling(){
        double keliling;
        keliling = this.sisi * 4;
        //mencetak luas
        System.out.println("keliling segi empat dengan sisi"+sisi+"cm adalah"+keliling+"cm");
    }
    
}