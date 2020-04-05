public class Main {
    public static void main(String[] args) {
        Pies[] pieski = new Pies[3];
        Pies pies1 = new Pies();
        Pies pies2 = new Pies();
        Pies pies3 = new Pies();
        pieski[0] = pies1;
        pieski[1] = pies2;
        pieski[2] = pies3;
        pies1.wielkosc = 10;
        pies2.wielkosc = 100;
        pies3.wielkosc = 30;
        for (int i = 0; i < pieski.length; i++) {
            pieski[i].szczekaj(2);
        }
    }
}
