package teamProject00;

public class Drink {
    // 가게 이름
    // 어디서든 쓰이게 = public
    // 객체 생성 불필요 = static
    // 편집 가능성 X = final
    public static final String CafeName = "Bonjour";

    // 맴버 변수 생성
    private String name;
    private double price;

    // 서브클래스의 공통분모 생성자
    public Drink(String name, double price){
        this.name = name; // 매개변수를 Drink수퍼클래스의 맴버변수에 재할당
        this.price = price; // 매개변수를 Drink수퍼클래스의 맴버변수에 재할당
    }

    // cafeMain클래스의 for반복문이 정상적으로 돌아가기 위해 오브젝트의 toString메소드 오버라이딩
    // Drink수퍼클래스의 맴버변수를 이용한 문자열 입력 후 리턴
    @Override
    public String toString() {
        String menuFeature = "이름 : " + name + " , 가격 : " + price + "원";
        return menuFeature;
    }
}
