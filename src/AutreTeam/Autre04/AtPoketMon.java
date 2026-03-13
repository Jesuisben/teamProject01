package Project;

public class AtPoketMon extends PoketMon {
    double atk; // 공격력 수치
    String skillname1; // 이거는 포켓몬 스킬 1번
    String skillname2; // 이거는 포켓몬 스킬 2번
    int level=1;

    double exp = 0;
    public void setExp (double exppoint) {
        System.out.println("원래 경험치 : "+this.exp+", +EXP"+exppoint);

        this.exp += exppoint;
        if (this.exp >= 100) {

            this.level++;
            System.out.println("레벨업하셨습니다. 현재Lv: "+this.level);
            this.exp=0;
            this.atk += 10;
        }
    }

    public AtPoketMon(String name, String type, String skillname1, String skillname2, double atk) {
        super(name, type);
        this.atk = atk;  //이거는 공격력을 반환해줘야되니까.
        this.skillname1 = skillname1; // 스킬 이름 1 반환해주기
        this.skillname2 = skillname2; // 스킬 이름 2 반환해주기
    }

    public double getAtk() {
        return atk;
    }

    public String getSkillname1() {
        return skillname1;
    }

    public String getSkillname2() {
        return skillname2;
    }

    public double Atk1() { // 기술 1 사용 메서드
        System.out.println(super.getName()+ " " + skillname1+"!!!!");
        return this.atk;
    }

    public double Atk2() { // 기술 2 사용 메서드
        System.out.println(super.getName()+" "+skillname1+"!!!!");
        return this.atk*2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n보유중인 기술 : "+ skillname1 + skillname2;
    }
}
