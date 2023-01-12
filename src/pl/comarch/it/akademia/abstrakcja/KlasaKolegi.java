package pl.comarch.it.akademia.abstrakcja;

public class KlasaKolegi implements SimpleInterface {

    @Override
    public void cos() {
        System.out.println("cos");
    }

    @Override
    public String a(int x) {
        System.out.println("a");
        return "a";
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void zrobCos(String s) {
        System.out.println(s);
    }
}
