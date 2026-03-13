package Project;

public class DfPoketMon extends PoketMon {
    double health; // 수비 포켓몬의 체력.
    boolean isAlive= true; // 수비 포켓몬 생존여부.
    double exp =0;
    public DfPoketMon(String name, String type,double health, double exp) {
        super(name, type);
        this.health = health;
        this.exp = exp;

    }

    public double getExp() {
        return exp;
    }

    public double getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public String toString() {
        return super.toString() + "\n포켓몬의 체력 : "+ health;
    }
    public void Damage(double hit) {
        health -= hit;
        if (health > 0) {
            System.out.println(super.getName()+"의 남은 HP는 "+this.health+"입니다.");
        } else {
            System.out.println(super.getName()+"이 쓰러졌습니다.");
            System.out.println("------------------------------------------------------");
            isAlive = false;
        }

    }




}
