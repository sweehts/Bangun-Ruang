
package main.bangun.ruang;


public class Kubus extends BangunRuang {
    double sisi;
    
    @Override
      double volume(){
    double volume = sisi * sisi * sisi;
         System.out.println("volume kubus : " + volume);
          return volume;
}
    double luasPermukaan(double lp){
       double luasPermukaan = 6 * sisi * sisi;
        System.out.println("luas permukaan kubus : " + lp);
        return luasPermukaan;
    }
}
