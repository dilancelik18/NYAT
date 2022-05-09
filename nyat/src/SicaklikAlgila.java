public class SicaklikAlgila {
    static ISıcaklikAlgilayiciFactory sicaklikFactory;

    public SicaklikAlgila(ISıcaklikAlgilayiciFactory sicaklikFactory){
        this.sicaklikFactory=sicaklikFactory;
    }
    public static void basla(String msg) throws InterruptedException {
        System.out.println(msg);
        ISicaklik sicaklik = sicaklikFactory.factoryMethod();
    }
}
