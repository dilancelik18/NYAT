public class CelciusFactory implements ISÄ±caklikAlgilayiciFactory{

    @Override
    public ISicaklik factoryMethod() throws InterruptedException {
       Celcius celcius = new Celcius();
       celcius.sicaklikOku();
       return celcius;
    }
}
