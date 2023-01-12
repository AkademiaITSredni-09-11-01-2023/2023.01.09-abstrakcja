package pl.comarch.it.akademia.abstrakcja;

public class Main {
    public static void main(String[] args) {
        SimpleInterface obiekt1 = new KasaKolegi2();

        obiekt1.a(5);

        System.out.println("jakies rzeczy");

        ////

        obiekt1.cos();

        obiekt1.b();

        obiekt1.zrobCos("Cos");

        System.out.println(Interfejs2.JAKA_MOJA_STALA);

        Abstrakcyjna abstrakcyjna = new KolejnaKlasaNieAbstrakcyjna();
    }
}
