
package main.bangun.ruang;


public class Bola extends BangunRuang {
    double r;
    
    @Override
    double volume(){
       double volume =(double) (Math.PI * r * r * r * 4/3);
       System.out.println("volume bola: "+ volume);
       return volume;
   }
  
   double luasPermukaan(){
       double luasPermukaan = (double) (4 * Math.PI * r * r );
       System.out.println("luas permukaan bola : "+ luasPermukaan);
       return luasPermukaan;
   }
    
}
