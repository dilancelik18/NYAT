public class SicaklikAlgila {
    static ISÄ±caklikAlgilayiciFactory sicaklikFactory;

    public SicaklikAlgila(ISÄ±caklikAlgilayiciFactory sicaklikFactory){
        this.sicaklikFactory=sicaklikFactory;
    }
    public static void basla(String msg) throws InterruptedException {
        System.out.println(msg);
        ISicaklik sicaklik = sicaklikFactory.factoryMethod();
    }
}
