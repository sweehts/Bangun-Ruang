
package main.bangun.ruang;

import java.util.Scanner;

public class MainBangunRuang {

   
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        BangunRuang bangunRuang = new BangunRuang();
       
       Bola bola = new Bola();
        System.out.println("Masukkan jari-jari bola: ");
        bola.r=  scanner.nextFloat();
       
       Kubus kubus = new Kubus();
        System.out.println("Masukkan panjang rusuk : ");
        kubus.sisi =  scanner.nextFloat();
       
       Balok balok = new Balok();
        System.out.println("Masukkan panjang balok : ");
        balok.p = scanner.nextFloat();
        System.out.println("Masukkan lebar balok : ");
        balok.l = scanner.nextFloat();
       
       LimasSegitiga limasSegitiga = new LimasSegitiga();
        System.out.println("Masukkan alas segitga : ");
        limasSegitiga.alas = scanner.nextFloat();
        System.out.println("Masukkan tinggi segitiga : ");
        limasSegitiga.tS = scanner.nextFloat();
        System.out.println("Masukkan tinggi limas : ");
        limasSegitiga.tL = scanner.nextDouble();
        
       bangunRuang.volume();
       bangunRuang.luasPermukaan();
       
       bola.volume();
       bola.luasPermukaan();
       
       kubus.volume();
       kubus.luasPermukaan();
       
       balok.volume();
       balok.luasPermukaan();
       
       limasSegitiga.volume();
       limasSegitiga.luasPermukaan();
  
    }
    
}
