package pl.comarch.it.akademia.abstrakcja.abstrakcyjne.przyklad;

public class Main {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmDB();
        algorytm.calculate();

        Algorytm algorytm2 = new AlgortymInternet();
        algorytm2.calculate();
    }
}
