public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;
    public Matango(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
    }
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}