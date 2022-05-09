public class MerkeziIslemBirimi implements IMerkeziIslemBirimi{

    private final IEkran ekran;
    private final IEyleyici eyleyici;

    private ISıcaklikAlgilayiciFactory sıcaklikAlgilayiciFactory;

    Celcius celcius = new Celcius();

    int sonsicaklik = celcius.sicaklik();

    public MerkeziIslemBirimi(){

        this.ekran=new Ekran();
        this.eyleyici= new Eyleyici();

    }

    @Override
    public void sogutucuAc() throws InterruptedException {
       this.eyleyici.sogutucuAc(this.sonsicaklik);
    }

    @Override
    public void sogutucuKapat() throws InterruptedException {
        this.eyleyici.sogutucuKapat();
    }

    @Override
    public void KelvinSicaklik() throws InterruptedException {
       sıcaklikAlgilayiciFactory = new KelvinFactory();
       SicaklikAlgila sicaklik = new SicaklikAlgila(sıcaklikAlgilayiciFactory);
       SicaklikAlgila.basla("Kelvin::");
    }

    @Override
    public void CelciusSicaklik() throws InterruptedException {
        sıcaklikAlgilayiciFactory = new CelciusFactory();
        SicaklikAlgila sicaklik = new SicaklikAlgila(sıcaklikAlgilayiciFactory);
        SicaklikAlgila.basla("Celcius::");
    }


}
