package pl.comarch.it.akademia.abstrakcja.abstrakcyjne.przyklad;

public abstract class Algorytm {
    public void calculate() {
        readData();
        step1();
        step2();
        step3();
        saveResult();
    }
    private void step1() {
        System.out.println("Step 1");
    }
    private void step2() {
        System.out.println("Step 2");
    }
    private void step3() {
        System.out.println("Step 3");
    }
    public abstract void readData();
    public abstract void saveResult();
}
