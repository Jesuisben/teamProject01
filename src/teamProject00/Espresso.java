package teamProject00;

public class Espresso extends Drink implements BadEspresso{
    private int shotCount; // 샷 개수 (단위 = 샷)
    private String coffeeOrigin; // 원두 원산지 (단위 = X)

    // 서브클래스들에 각자의 특성 + 수퍼클래스의 공통분모를 매개변수로 생성자 생성
    public Espresso(String name, double price, int shotCount, String coffeeOrigin) {
        this.shotCount = shotCount; // 매개변수를 Espresso서브클래스의 맴버변수에 재할당
        this.coffeeOrigin = coffeeOrigin; // 매개변수를 Espresso서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)
    }

    // cafeMain클래스의 for반복문이 정상적으로 돌아가기 위해 Drink수퍼클래스의 toString메소드 오버라이딩
    // Espresso서브클래스의 맴버변수를 이용한 문자열 입력 후 리턴
    @Override
    public String toString() {
        String menuFeature = super.toString() + ", 샷 개수 : " + shotCount + "샷, 원두 원산지 : " + coffeeOrigin;
        return menuFeature ;
    }

    // 원재료의 품질 및 양 낮추기 위한 BadAmericano 인터페이스의 추상 메소드의 오버라이드 생성
    @Override
    public void lowQuality(int lowShot, String lowOrigin){
        System.out.println("변동 사항 : 샷(" + this.shotCount + " -> " + lowShot +
                "), 원두 원산지(" + this.coffeeOrigin + " -> " + lowOrigin + ")\n");
        this.shotCount = lowShot;
        this.coffeeOrigin = lowOrigin;
    }

}
