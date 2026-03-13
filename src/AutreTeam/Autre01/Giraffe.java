package AutreTeam.Autre01;

public class Giraffe extends Animal implements Huntable {
    double neckLength; // 목의 길이

    public Giraffe(String name, int age, String gender, String food, double neckLength, boolean canHunt) {
        super(name, age, gender, food, canHunt);
        this.neckLength = neckLength;
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + "은(는) 거의 울지 않지만, 음~ 음~ 소리를 냅니다!");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "은(는) " + super.getFood() + "을(를) 먹습니다!");
    }

    @Override
    public void setHunt(boolean canHunt) {
        super.canHunt = canHunt;
        System.out.println("사냥 가능 여부 : " + super.canHunt);

        if (super.getAge() >= 4){
            System.out.println(super.getName() + "은(는) 사냥은 못 하지만 " + super.getAge() +"살이 되어 강력한 발차기 기술을 터득하게 되었습니다!");
        }else{
            System.out.println(super.getName() + "은(는) 아쉽게도 사냥을 할 줄 모릅니다...");
        }
    }

    public void growNeck(double neckLength) {
        this.neckLength += neckLength;
        System.out.println("목이 "+ neckLength + "cm 자라서 " + this.neckLength + "cm가 되었습니다.");
    }
}