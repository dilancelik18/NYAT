public class Observer implements IObserver{




    @Override
    public void sogutucuKapali(String mesaj) {
        System.out.println(" Sogutucu açılmadan başka işlem yapılamaz");

  }

    @Override
    public void sogutucuAcik(String mesaj) {
        System.out.println(" Sogutucu açık açma işlemi yapılamaz");
    }
}
