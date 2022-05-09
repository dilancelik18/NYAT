import java.util.Random;

public class Celcius implements ISicaklik{

    public int sicaklik(){
        Random rand = new Random();
        int sicaklik = rand.nextInt(10,50);
        return sicaklik;
    }
    @Override
    public int sicaklikOku() throws InterruptedException {
        Random rand = new Random();
        int sicaklik = rand.nextInt(10,50);
        System.out.println("Sıcaklık Okunuyor...");
        Thread.sleep(1000);
        System.out.println("Sıcaklık:"+sicaklik+" 'C");
        return sicaklik;
    }
}
