
package main.bangun.ruang;


public class LimasSegitiga extends BangunRuang{
    double alas;
    double tS;
    double tL;
   
    
    @Override
    double volume(){
    double volume = (1/2 * alas * tS) * tL * 1/6;
    System.out.println("volume Limas segitiga : " + volume);
    return volume;
}
    double luasPermukaan(double lp){
       double luasPermukaan = 1/3 * (1/2 * alas * tS) * tL;
        System.out.println("luas Limas segitiga : " + lp);
        return luasPermukaan;
    }
}
