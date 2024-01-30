
package main.bangun.ruang;


public class Balok extends BangunRuang{
    double p;
    double l;
    double t;
    
    double volume(){
    double volume = p * l * t;
    System.out.println("volume balok : " + volume);
    return volume;
}
    double luasPermukaan(double lp){
       double luasPermukaan = 2 * p + l * 2 * l + t * 2 * p + t;
        System.out.println("luas permukaan balok : " + lp);
        return luasPermukaan;
    }
}
