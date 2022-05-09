public class Eyleyici implements IEyleyici{
    @Override
    public void sogutucuAc(int sicaklik) throws InterruptedException {
        System.out.println(" Soguucu açiliyor ...");
        sicaklik -=10;
        System.out.println("Sicaklik:"+(sicaklik+10)+"'den "+(sicaklik)+" 'ye düsürüldü.");
    }

    @Override
    public void sogutucuKapat() throws InterruptedException {
        System.out.println("Sogutucu Kapatılıyor...");
        Thread.sleep(1000);
        System.out.println("Sogutucu Kapatıldı...");

    }
}
