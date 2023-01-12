package pl.comarch.it.akademia.abstrakcja;

public interface Interfejs2 {
    int JAKA_MOJA_STALA = 0;

    void a();

    default void metoda() {
        mniejszaMetoda1();
        mniejszaMetoda2();
        mniejszaMetoda3();
        mniejszaMetoda4();
        mniejszaMetoda5();
    }

    private void mniejszaMetoda1() {

    }

    private void mniejszaMetoda2() {

    }

    private void mniejszaMetoda3() {

    }

    private void mniejszaMetoda4() {

    }

    private void mniejszaMetoda5() {

    }
}
