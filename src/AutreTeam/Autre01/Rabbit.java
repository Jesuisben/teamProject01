package AutreTeam.Autre01;

public class Rabbit extends Animal implements SpeedUp, Jumpable {
    double jumpHeight; // 점프 가능한 높이
    double speed;

    public Rabbit(String name, int age, String gender, String food, double jumpHeight, double speed, boolean canHunt) {
        super(name, age, gender, food, canHunt);
        this.jumpHeight = jumpHeight;
        this.speed = speed;
    }

    @Override
    public void jump(double cm) {
        this.jumpHeight += cm;
        System.out.println("증가된 점프 높이 : " + cm + "cm");
        System.out.println(super.getName() +"의 점프 높이가 " + this.jumpHeight + "cm가 되었습니다.");
    }

    @Override
    public void makeSound() { // ㅜ추상
        System.out.println(super.getName()+"이(가)는 거의 울지 않지만, 가끔 찍-찍 하고 웁니다");
    }


    @Override
    public void eat() { // 추상
        System.out.println(super.getName()+"이(가) " + super.getFood() + "을(를) 귀엽게 먹습니다.");
    }

    @Override
    public void increaseSpeed(double km_h) {
        this.speed += km_h;
        System.out.println("증가된 달리기 속도 : " + km_h + "km/h");
        System.out.println("현재 수영 속도 : " + this.speed + "km/h");
    }
}
