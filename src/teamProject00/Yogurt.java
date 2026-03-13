package ch06_abstract_interface.teamProject01;

public class Yogurt extends Drink implements BadYogurt{
    private String yogurtOrigin; // 요거트 원산지 (단위 = X)
    private String milkQuality; // 우유 품질 (상, 중, 하) (단위 = X)

    // 서브클래스들에 각자의 특성 + 수퍼클래스의 공통분모를 매개변수로 생성자 생성
    public Yogurt(String name, double price, String yogurtOrigin, String milkQuality) {
        this.yogurtOrigin = yogurtOrigin; // 매개변수를 Yogurt서브클래스의 맴버변수에 재할당
        this.milkQuality = milkQuality; // 매개변수를 Yogurt서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)
    }

    // cafeMain클래스의 for반복문이 정상적으로 돌아가기 위해 Drink수퍼클래스의 toString메소드 오버라이딩
    // Yogurt서브클래스의 맴버변수를 이용한 문자열 입력 후 리턴
    @Override
    public String toString() {
        String menuFeature = super.toString() + ", 요거트 원산지 : " + yogurtOrigin + ", 우유 품질 : " + milkQuality;
        return menuFeature ;
    }

    @Override
    public void lowQuality(String lowOrigin, String lowMilk){
        System.out.println("변동 사항 : 요거트 원산지(" + this.yogurtOrigin + " -> " + lowOrigin +
                "), 우유 품질(" + this.milkQuality + " -> " + lowMilk + ")\n");
        this.yogurtOrigin = lowOrigin;
        this.milkQuality = lowMilk;
    }

}
