import java.util.Random;

public class Kelvin implements ISicaklik{


    @Override
    public int sicaklikOku() throws InterruptedException {
        Random rand = new Random();
        int sicaklik = rand.nextInt(270,540);
        System.out.println("Sıcaklık Okunuyor...");
        Thread.sleep(1000);
        System.out.println("Sıcaklık:"+sicaklik+" 'K");
        return sicaklik;
    }
}
