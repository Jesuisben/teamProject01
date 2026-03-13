package teamProject00;

public class MintChoco extends Drink implements BadMintChoco{
    private int chocoAmount; // 초코칩 양 (단위 = 스푼)
    private int mintAmount; // 민트 에센스 양 (단위 = 방울)

    // 서브클래스들에 각자의 특성 + 수퍼클래스의 공통분모를 매개변수로 생성자 생성
    public MintChoco(String name, double price, int chocoAmount, int mintAmount) {
        this.chocoAmount = chocoAmount; // 매개변수를 MintChoco서브클래스의 맴버변수에 재할당
        this.mintAmount = mintAmount; // 매개변수를 MintChoco서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)
    }

    // cafeMain클래스의 for반복문이 정상적으로 돌아가기 위해 Drink수퍼클래스의 toString메소드 오버라이딩
    // MintChoco서브클래스의 맴버변수를 이용한 문자열 입력 후 리턴
    @Override
    public String toString() {
        String menuFeature = super.toString() + ", 초코칩 양 : " + chocoAmount + "스푼, 민트 에센스 양 : " + mintAmount +"방울";
        return menuFeature ;
    }

    // 원재료의 품질 및 양 낮추기 위한 BadAmericano 인터페이스의 추상 메소드의 오버라이드 생성
    @Override
    public void lowQuality(int lowChoco, int lowMint){
        System.out.println("변동 사항 : 초코칩 양(" + this.chocoAmount + " -> " + lowChoco +
                "), 민트 에센스 양(" + this.mintAmount + " -> " + lowMint + ")\n");
        this.chocoAmount = lowChoco;
        this.mintAmount = lowMint;
    }

}
