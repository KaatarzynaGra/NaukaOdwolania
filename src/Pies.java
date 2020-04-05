public class Pies {
    public Pies() {
    }

    String imie = "";
    int wielkosc = 0;

    public void szczekaj(int liczbaPowtorzen) {
        while (liczbaPowtorzen > 0) {
            if (wielkosc > 50) {
                System.out.println("HAU HAU");
            } else if (wielkosc > 20) {
                System.out.println("Hau Hau");
            } else {
                System.out.println("hau hau");
            }
            liczbaPowtorzen--;
        }
    }
}
