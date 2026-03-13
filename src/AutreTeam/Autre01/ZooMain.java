package AutreTeam.Autre01;

public class ZooMain {

    public static void main(String[] args) {

        System.out.println(Animal.zoo);
        // 동물 배열
        Animal[] animals = {
                new Turtle("꼬부기", 2, "수컷", "해초", 30.0, true),
                new Turtle("거북왕", 3, "수컷", "해초","해파리", 60.0, true),
                new Giraffe("키링키", 4, "암컷", "풀", 165.0, false),
                new Rabbit("이브이", 3, "수컷", "당근",40.0,60.0,false),
        };
        // 확장 for문을 이용한 출력
        for (Animal item : animals){
            System.out.println("----------------------");
            item.showInfo();
            System.out.println("");

            if(item instanceof Turtle){
                ((Turtle)item).swim(20);
                ((Turtle)item).setHunt(false);
            }else if(item instanceof Giraffe){
                ((Giraffe)item).growNeck(20);
            }else if(item instanceof Rabbit){
                ((Rabbit)item).jump(30.0);
                System.out.println();
                ((Rabbit)item).increaseSpeed(15.0);
            }

            item.makeSound();
            item.eat();
            System.out.println();

        }

        System.out.println("총 동물 수: " + Animal.animalCount);
    }
}