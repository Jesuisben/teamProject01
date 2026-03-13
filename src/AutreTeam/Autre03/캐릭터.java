package AutreTeam.Autre03;

public abstract class 캐릭터{
    private String 성별;
    private String 캐릭명;
    private double 공격력;
    private double 방어력;
    private double 체력;
    private double 마나양;
    private int 물약수 = 3;


    public 캐릭터(String 성별, String 캐릭명, double 공격력, double 방어력, double 체력, double 마나양) {
        this.성별 = 성별;
        this.캐릭명 = 캐릭명;
        this.공격력 = 공격력;
        this.방어력 = 방어력;
        this.체력 = 체력;
        this.마나양 = 마나양;
    }

    public double get공격력() {
        return 공격력;
    }

    public void set공격력(double 공격력) {
        this.공격력 = 공격력;
    }

    public double get마나양() {
        return 마나양;
    }

    public void set마나양(double 마나양) {
        this.마나양 = 마나양;
    }

    public int get물약수() {
        return 물약수;
    }

    public void set물약수(int 물약수) {
        this.물약수 = 물약수;
    }

    public double get방어력() {
        return 방어력;
    }

    public void set방어력(double 방어력) {
        this.방어력 = 방어력;
    }

    public String get성별() {
        return 성별;
    }

    public void set성별(String 성별) {
        this.성별 = 성별;
    }


    public double get체력() {
        return 체력;
    }

    public void set체력(double 체력) {
        this.체력 = 체력;
    }

    public String get캐릭명() {
        return 캐릭명;
    }

    public void set캐릭명(String 캐릭명) {
        this.캐릭명 = 캐릭명;
    }

    public abstract void 등장멘트출력();
    public abstract void 물약사용();

    public abstract void 공격(캐릭터 o);
}
