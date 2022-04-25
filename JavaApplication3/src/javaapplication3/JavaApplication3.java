/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Administrator
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] mahasiswa = {"Dimas", "Aditya", "Andrea", "Anis", "Naufal", "Annas", "Jefri", "Nurul", "Gian", "Andriansyah"};
        String[] npm = {"50420384", "50438474", "50318478", "50449985", "51430254", "50332875", "50231178", "55427468", "50449851", "50314578"};
        String[] ttl = {"10-06-03","12-10-2001","11-07-2002","31-07-2001","30-06-2003","12-04-2002","02-11-2001","08-01-2000","14-02-2001","01-01-1999",};
        
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nama Mahasiswa: "+mahasiswa[i]);
            System.out.println("NPM Mahasiswa: "+npm[i]);
            System.out.println("Tempat Tanggal Lahir: "+ttl[i]);
            System.out.println();
        }
    }
}
    
    
    
    
    
    
    
    /** percobaan gagal haha
     * 
    class coba{
        public static void main(String[] args) {
            String[][] mhs = {
            {"Dimas","50420384"},
            {"Aditya","50438474"},
            {"Andrea","50318478"},
            {"Anis", "50449985"},
            {"Naufal","51430254"},
            {"Annas","50332875"},
            {"Jefri","50231178"},
            {"Nurul","55427468"},
            {"Gian","50449851"},
            {"Andriansyah","50314578"}
            };
            for (int i = 0; i < mhs.length; i++){
                for(int j = 0;j<mhs[i].length; i++){
                    System.out.println(mhs[i][j]);
                }
            }
            */
