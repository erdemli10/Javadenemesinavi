
import java.util.Scanner;

public class Javadenemesinavi {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dogru sayisi");
        
        int ds = sc.nextInt();
        
        System.out.println("yanlis sayisi");
        
        int ys = sc.nextInt();
        
        int toplam = ds + ys;
       
        int bos = 20 - toplam;
      
                double net = ds - (ys / 4.0);
        
        if (ys > 20 || 0 > ys || ds > 20 || 0 > ds || toplam > 20 || 0 > toplam) { 
        
        System.out.println("girdiginiz sayilardan bir tanesi yanlis");
        
         } else if (net > -5 && 5 > net) { 
 System.out.println("Toplam soru sayısı: 20,doğru sayısı:" + ds + ",yanlis sayisi:" + ys + ",bos sayisi:" + bos + ",net sayisi:" + net + ",durum:geliştirilmeli");
       
     } else if (net > 5 && 10 >= net) {
      System.out.println("Toplam soru sayısı: 20,doğru sayısı:" + ds + ",yanlis sayisi:" + ys + ",bos sayisi:" + bos + ",net sayisi:" + net  +",durum:orta.");
                    
                 
           } else if (net > 10 && 15 >= net) {
                   
                 System.out.println("Toplam soru sayısı: 20,doğru sayısı:" + ds + ",yanlis sayisi:" + ys + ",bos sayisi:" + bos + ",net sayisi:" + net + ",durum:iyi.");
                } else {
                System.out.println("Toplam soru sayısı: 20,doğru sayısı:" + ds + ",yanlis sayisi:" + ys + ",bos sayisi:" + bos + ",net sayisi:" + net + ",durum:cok iyi.");    
                 
                }
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

