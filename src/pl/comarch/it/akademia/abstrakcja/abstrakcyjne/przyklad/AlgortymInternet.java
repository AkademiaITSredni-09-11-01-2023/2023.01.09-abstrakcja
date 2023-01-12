package pl.comarch.it.akademia.abstrakcja.abstrakcyjne.przyklad;

public class AlgortymInternet extends Algorytm {
    @Override
    public void readData() {
        System.out.println("Downloading data from Internet ...");
    }

    @Override
    public void saveResult() {
        System.out.println("Sending data to Internet ...");
    }
}
