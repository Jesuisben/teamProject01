package AutreTeam.Autre01;

public abstract class Animal {
    private String name; // 동물 이름
    private int age; // 동물 나이
    private String gender; // 동물 성별
    private String food; // 동물이 먹는 음식
    protected boolean canHunt;

    // static
    static int animalCount = 0;
    // 주제
    public static final String zoo = "설진욱 선생님과 반장 현준이의 사파리파크";
    // 생성자
    public Animal(String name, int age, String gender, String food, boolean canHunt) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.food = food;
        this.canHunt = canHunt;
        animalCount++;
    }

    // 추상 메소드
    public abstract void makeSound();
    public abstract void eat();

    // getter/setter
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getFood() {
        return food;
    }
    public int getAge() {
        return age;
    }

    // 사냥 가능 여부
    public boolean isCanHunt() {
        return canHunt;
    }

    public void showInfo() {
        System.out.println("동물 종류 : " + this.getClass().getSimpleName());
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("먹이: " + food);
    }
}