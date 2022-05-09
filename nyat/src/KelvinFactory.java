public class KelvinFactory implements ISıcaklikAlgilayiciFactory{

    @Override
    public ISicaklik factoryMethod() throws InterruptedException {
       Kelvin kelvin= new Kelvin();
       kelvin.sicaklikOku();
       return kelvin;
    }
}
