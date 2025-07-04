public class Main {
    public static void main(String[] args) {
        Hero h = new Hero(40,"ミナト");
        King k = new King();
        Inn i = new Inn();

        h.showStatus();
        k.talk(h);
        h.bye();
        i.checkIn(h);

        Matango m = new Matango(50,'A');
        h.attack(m);

    }
}