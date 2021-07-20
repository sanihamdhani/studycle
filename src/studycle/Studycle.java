/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studycle;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sani Hamdhani
 */
public class Studycle {
  int jmlAngka;
  Scanner input = new Scanner(System.in);
  
  public void urut(){
  
  System.out.println("\n Nilai Urut");
                 System.out.print("Input Jumlah Bilangan :");
        jmlAngka = input.nextInt();
        int[]arr = new int[jmlAngka];
        System.out.println("Input Semua Bilangan :");
 
        for(int i=0;i <jmlAngka;i++){
          System.out.print("Input Bilangan Ke "+(i+1)+" : ");
         arr[i] =input.nextInt();
        }
    System.out.println("========================");
    System.out.println("Bilangan Urut");
    Arrays.sort(arr);
    for(int index:arr){
    System.out.println("Hasil pengurutan :"+index);
    }
  }
  
  public void rata(){
  System.out.println("\nNilai Rata Rata");
        float rata, pengkalian, total=0, kali=1, median=0.0f;
        System.out.print("Input Jumlah Bilangan :");
        int jmlAngka = input.nextInt();
        int[]arr = new int[jmlAngka];
        System.out.println("Input Semua Bilangan :");
 
        for(int i=0;i <jmlAngka;i++){
          System.out.print("Input Bilangan Ke "+(i+1)+" : ");
         arr[i] =input.nextInt();
         total +=arr[i];
        }
         
    System.out.println("========================");
    System.out.println("Bilangan Rata-rata");
    rata = total/jmlAngka;
    System.out.println("Hasil nilai total adalah : " + total);
    System.out.println("Hasil rata-rata adalah : " + rata);
       
  
  }
 
  
  public void kali(){
  System.out.println("\nNilai Rata Rata");
        float pengkalian,kali=1;
        System.out.print("Input Jumlah Bilangan :");
        int jmlAngka = input.nextInt();
        int[]arr = new int[jmlAngka];
        System.out.println("Input Semua Bilangan :");
 
        for(int i=0;i <jmlAngka;i++){
          System.out.print("Input Bilangan Ke "+(i+1)+" : ");
         arr[i] =input.nextInt();
         kali *= arr[i];
        }
  System.out.println("========================");
    System.out.println("Bilangan Perkalian");
    System.out.println("Hasil Penjumlahannya adalah     : "+kali);
  
  }
  
  
  public void media(){
 
        System.out.print("Input Jumlah Bilangan :");
        int jmlAngka = input.nextInt();
        
        int[]arr = new int[jmlAngka];
        System.out.println("Input Semua Bilangan :");
        System.out.println("========================");
        System.out.println("Bilangan Tengah");
                for(int i=0;i<arr.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                arr[i]=input.nextInt();
                }
              
                float median=0.0f;
                int bil=arr.length%2;
                if(bil==0){
                    int posisi=jmlAngka/2;
                    System.out.println("Bilangan Genap");
                    median=(arr[posisi-2]+arr[posisi])/2;
                    System.out.printf("nilai median adalah %.2f",median);
                    }else{
                    int posisi=jmlAngka/2;
                    System.out.println("Bilangan Ganjil");
                    median=arr[posisi];
                    System.out.print("Bilangan Tengah adalah "+median);
                    
                }
                }
  
  
  
  
    public static void main(String[] args) {
        // TODO code application logic here
        
       Studycle obj = new Studycle();         
     
       int pilihan;
     
       System.out.print("Pilihan : \n 1. Nilai Urut \n 2. "
               + "Nilai Rata Rata \n 3. Nilai Perkalian"+ "\n 4. Tengah "+"\n\n Masukan pilihan :");
       
       pilihan = obj.input.nextInt();
        switch (pilihan){
            case 1:
                obj.urut();
     
              break;
            case 2:
                obj.rata();       
                break;
            case 3:
                obj.kali();
                break;
            case 4:
                obj.media();
                break;
        }
    
    }
}
    


        
   
    
        
    
    
    
