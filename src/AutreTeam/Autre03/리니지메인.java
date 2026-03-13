package AutreTeam.Autre03;

import java.util.Scanner;

public class 리니지메인 {
    static void main(String[] args) throws InterruptedException {
        캐릭터[] 캐릭 = {
                new 총사("남", "총사", 60, 50, 1200, 200),
                new Wizard("여", "마법사", 400, 40, 900, 200),
                new Cleric("남", "나이팅게일", 200, 90, 500, 200),
                new Burglar("남", "도둑놈", 200, 90, 500, 200),
                new Warrior("남", "헬스남", 200, 90, 500, 200),
        };
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 캐릭터를 선택해주세요(1.총사, 2.마법사, 3.힐러, 4.도둑, 5.전사) ====> ");
        int 선택1 = Integer.parseInt(s.nextLine())-1;
        System.out.print("두번째 캐릭터를 선택해주세요(1.총사, 2.마법사, 3.힐러, 4.도둑, 5.전사) ====> ");
        int 선택2 = Integer.parseInt(s.nextLine())-1;

        System.out.println("캐릭터 선택중입니다.");
        캐릭터 선택1캐릭 =  캐릭[선택1];
        캐릭터 선택2캐릭 =  캐릭[선택2];
        timesleep();
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println();
        선택1캐릭.등장멘트출력();
        선택2캐릭.등장멘트출력();


        int result = 0;
        while(true){
            System.out.println("---------------------------------------------");
            result =  선택(선택1캐릭, 선택2캐릭, s);
            if(result == 1) {
                System.out.println("결과 :"+선택1캐릭.get캐릭명()+"이 승리했습니다.");
                break;
            }else if(result == 2) {
                System.out.println("결과 :"+선택2캐릭.get캐릭명()+"이 승리했습니다.");
                break;
            }
            System.out.println("---------------------------------------------");
            result = 선택(선택2캐릭, 선택1캐릭, s);
            if(result == 1) {
                System.out.println("결과 :"+선택1캐릭.get캐릭명()+"이 승리했습니다.");
                break;
            }else if(result == 2) {
                System.out.println("결과 :"+선택2캐릭.get캐릭명()+"이 승리했습니다.");
                break;
            }
            System.out.println("---------------------------------------------");
        }
    }

    public static void timesleep() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static int 선택(캐릭터 캐릭1, 캐릭터 캐릭2, Scanner s) throws InterruptedException {
        System.out.print("동작 선택 1.기본공격, 2.스킬, 3.조롱, 4.도망, 5.포션사용, 6.게임종료 ====> ");
        int 동작 = Integer.parseInt(s.nextLine());
        timesleep();
        switch (동작){
            case 1:
                캐릭1.공격(캐릭2);
                timesleep();
                break;
            case 2:
                System.out.println("스킬이 발동됩니다.");
                스킬사용 스킬 = (스킬사용) 캐릭1;
                스킬.스킬(캐릭2);
                timesleep();
                break;
            case 3:
                조롱하기 조롱 = (조롱하기)캐릭1;
                조롱.조롱(캐릭2);
                timesleep();
                break;
            case 4:
                도망치기 도망 = (도망치기)캐릭1;
                도망.도망();
                timesleep();
                break;
            case 5:
                캐릭1.물약사용();
                timesleep();
                break;
            case 6:
                System.out.println("게임을 종료합니다.");
                System.exit(0);
        }

        if(캐릭1.get체력() < 1 || 캐릭2.get체력() < 1){
            if(캐릭1.get체력() < 1){
                System.out.println(캐릭1.get캐릭명() + "이 사망했습니다. ");
                return 2;
            }else if(캐릭2.get체력() < 1){
                System.out.println(캐릭2.get캐릭명() + "이 사망했습니다. ");
                return 1;
            }
        }
        return -1;
    }
}
