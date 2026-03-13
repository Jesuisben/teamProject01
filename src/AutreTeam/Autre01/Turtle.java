package AutreTeam.Autre01;

public class Turtle extends Animal implements SwimSpeedUp, Huntable {
        double swimSpeed; // 수영 속도
        String food2;

        public Turtle(String name, int age, String gender, String food, double swimSpeed, boolean canHunt) {
            super(name, age, gender, food, canHunt);
            this.swimSpeed = swimSpeed;
        }
        // 오버로딩
        public Turtle(String name, int age, String gender, String food, String food2, double swimSpeed, boolean canHunt) {
            super(name, age, gender, food, canHunt );
            this.swimSpeed = swimSpeed;
            this.food2 = food2;
        }

        public void setFood2(String food2) {
            this.food2 = food2;
        }

        @Override
        public void showInfo() {
            System.out.println("동물 종류 : " + getClass().getSimpleName());
            System.out.println("이름: " + super.getName());
            System.out.println("나이: " + super.getAge());
            System.out.println("성별: " + super.getGender());

            if(food2 != null){
                System.out.println("먹이: " + super.getFood()+", " + food2);
            }else {
                System.out.println("먹이 : " + super.getFood());
            }
        }

        @Override
        public void makeSound() { // ㅜ추상
            System.out.println(super.getName()+"은(는) 거의 울지 않지만, 가끔 쉬익 하고 웁니다");
        }

        @Override
        public void eat() { // 추상
            if (food2 != null) {
                System.out.println(super.getName() + "이(가) " + super.getFood() + "와 " + food2 + "를 냠냠 먹습니다.");
            } else {
                System.out.println(super.getName() + "이(가) " + super.getFood() + "를 냠냠 먹습니다.");
            }
        }

        @Override
        public void swim(double km_h) {
            this.swimSpeed += km_h;
            System.out.println("증가된 수영 속도 : " + km_h + "km/h");
            System.out.println("현재 수영 속도 : " + this.swimSpeed + "km/h");
        }

        @Override
        public void setHunt(boolean canHunt) {
            super.canHunt = canHunt;
            System.out.println("사냥 가능 나이 : 3살 이상");
            System.out.println("사냥 가능 여부 : " + super.canHunt);

            if (super.getAge() >= 3 && super.isCanHunt() == false){
                super.canHunt = true;
                System.out.println(super.getName() + "은(는) " + super.getAge() +"살이 돼서 사냥을 할 수 있어야 하지만.. 불의의 사고로 사냥을 못 합니다...");
            }else if(super.getAge() >=3) {
                System.out.println(super.getName() + "은(는) " + super.getAge() + "살이 돼서 사냥을 할 수 있습니다!");
            }else{
                System.out.println(super.getName() + "은(는) 아쉽게도 아직 사냥을 할 줄 모릅니다...");
            }
        }
    }
