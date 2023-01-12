package pl.comarch.it.akademia.abstrakcja.abstrakcyjne.przyklad;

public class AlgorytmDB extends Algorytm {
    @Override
    public void readData() {
        System.out.println("Reading from DB ...");
    }

    @Override
    public void saveResult() {
        System.out.println("Saving to DB ...");
    }
}
