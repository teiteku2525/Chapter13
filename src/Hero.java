public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public Hero(int hp, String name) {
        setHp(hp);
        setName(name);
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return this.hp;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }

    public void showStatus() {
        System.out.println(this.getName() + "の現在のHP: " + this.getHp());
    }
    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public void seppuku() {
        System.out.println(this.name + "は切腹した！");
        this.die();
    }
    public void sleep() {
        this.setHp(100);
        this.showStatus();
        System.out.println(this.name + "は眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.suffix + "から100ポイントの反撃を受けた");
        setHp(getHp() - 100);
        if (this.getHp()<= 0 ) {
            this.die();
        }
    }
}