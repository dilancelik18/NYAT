public class CelciusFactory implements ISıcaklikAlgilayiciFactory{

    @Override
    public ISicaklik factoryMethod() throws InterruptedException {
       Celcius celcius = new Celcius();
       celcius.sicaklikOku();
       return celcius;
    }
}
