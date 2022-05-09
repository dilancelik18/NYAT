public class Subscriber1 implements IObserver{

    @Override
    public void sogutucuKapali(String mesaj) {
        System.out.println("Subscriber 1 e gelen mesaj ::"+mesaj);

    }

    @Override
    public void sogutucuAcik(String mesaj) {
        System.out.println("Subscriber 1 e gelen mesaj ::"+mesaj);

    }
}
