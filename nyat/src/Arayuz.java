import java.util.Scanner;

public class Arayuz {

    public void araYuz() throws InterruptedException {
        IMerkeziIslemBirimi akilliCihaz = new MerkeziIslemBirimi();
        IObserver observer = new Observer();
        IObserver subscriber = new Subscriber1();
        IEkran ekran = new Ekran();
        VeritabaniIslem vb = new VeritabaniIslem();

        Scanner scan = new Scanner(System.in);
        int durum = 1;
        int secim = 0;
        System.out.println("Kullanıcı adı ve sifrenizi giriniz");

        Scanner kullaniciadi = new Scanner(System.in);
        String kullaniciad = kullaniciadi.nextLine();

        Scanner sifre = new Scanner(System.in);
        String sifr = sifre.nextLine();
        String cevap = "e";

        if (vb.girisYap(kullaniciad, sifr) == true) {

            ekran.mesajGoruntule("Cihazı Açmak için 1'e basiniz.");
            durum = scan.nextInt();
                if (durum == 1) {
                    ekran.mesajGoruntule("1)Sogutucu aç\n2)Sogutucu Kapat\n3)Sıcaklık Goruntule");
                    secim = scan.nextInt();

                    if (secim == 1) {
                        akilliCihaz.sogutucuAc();
                        akilliCihaz.sogutucuKapat();
                    }
                    if (secim == 2) {
                        akilliCihaz.sogutucuKapat();
                    }
                    if (secim == 3) {
                        System.out.println("Sicaklik hangi cinsten goruntulensin ?(K/C)");
                        Scanner sis = new Scanner(System.in);
                        String sistem = sis.next();
                        ISıcaklikAlgilayiciFactory sicaklik;
                        if (sistem.equalsIgnoreCase("K")) {
                            akilliCihaz.KelvinSicaklik();
                        } else {

                            akilliCihaz.CelciusSicaklik();
                        }
                        //  SicaklikAlgila mesajKutusu=new SicaklikAlgila(sicaklik);


                    }
                } else {
                    observer.sogutucuKapali(" Sogutucu açılmadan başka işlem yapılamaz");
                    subscriber.sogutucuKapali(" Sogutucu açılmadan başka işlem yapılamaz");
                }




        }
    }
}
