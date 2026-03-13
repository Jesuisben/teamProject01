package Project;

import java.util.Scanner;

public class PoketMonMain {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        int dselect;
        int skill;
        double damage;


        PoketMon poketMon1 = new AtPoketMon("파이리","불", "불꽃세례","화염방사",10);
        PoketMon poketMon2 = new AtPoketMon("피카츄","전기", "백만볼트","전기쇼크",10);
        PoketMon poketMon3 = new AtPoketMon("꼬부기","물","물대포","로켓박치기",20);
        PoketMon poketMon4 = new DfPoketMon("잠만보","노말", 100,100);
        PoketMon poketMon5 = new DfPoketMon("메타몽","노말", 100,100);
        PoketMon poketMon6 = new DfPoketMon("마자용","에스퍼", 100,100);
        AtPoketMon myAtk;
        DfPoketMon myDfs;
        System.out.println("-----------------------------------------");
        System.out.println("<사용할 포켓몬을 선택하세요.>");
        System.out.println("1) 파이리 2) 피카츄 3) 꼬부기");
        System.out.print(">>");
        select = scan.nextInt();



        if (select == 1) {
            myAtk = (AtPoketMon) poketMon1;

        }
            else if (select == 2) {
             myAtk = (AtPoketMon) poketMon2;

            }
        else if (select == 3) {
            myAtk = (AtPoketMon) poketMon3;

        }
            else {
            System.out.println("잘못된 입력입니다. 1번 2번 3번 중 골라주세요.");
            myAtk = null;
        }

        System.out.println("<선택한 포켓몬 정보>");
        System.out.println("이름 : " + myAtk.getName());
        System.out.println("타입 : "+ myAtk.getType()+"타입");
        System.out.println("보유중인 기술: "+" 첫번째 스킬 : "+ myAtk.getSkillname1()+" ,두번째 스킬 : "+myAtk.getSkillname2());
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("<상대 포켓몬을 선택하세요. >");
        System.out.println("1) 잠만보 2) 메타몽 3) 마자용");
        System.out.print(">>");

        try {

            dselect = scan.nextInt();
            if (dselect == 1) {
                myDfs = (DfPoketMon) poketMon4;

            }
            else if (dselect == 2) {
                myDfs = (DfPoketMon) poketMon5;

            }
            else if (dselect == 3) {
                myDfs = (DfPoketMon) poketMon6;

            }
            else {
                System.out.println("잘못된 입력입니다. 1번 2번 3번 중 골라주세요.");
                myDfs = null;
            }
            System.out.println("-------------------------------------------------" );


//-----------------------상대 포켓몬----------------------------------//

        System.out.println("<선택한 상대 포켓몬 정보>");
        System.out.println("이름 : "+myDfs.getName());
        System.out.println("타입: "+ myDfs.getType()+"타입");
        System.out.println("HP : "+ myDfs.health);
        System.out.println("-----------------------------------------");
//------------------------------------------------------//
        System.out.println("앗, 야생의"+myDfs.getName()+"가 나타났다!!");
        System.out.println("가랏, "+myAtk.getName()+"!!!!!");

//=========================================================================
        while (myDfs.isAlive()) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("상대 "+myDfs.getName()+"의 체력 : "+myDfs.getHealth());
            System.out.println("어떤 기술을 사용할까요 : 1. "+myAtk.getSkillname1()+" 2. "+myAtk.getSkillname2());
            System.out.print(">>");
            skill = scan.nextInt();

            if (skill == 1) {
               myDfs.Damage(myAtk.Atk1());
             //   myAtk.Atk1(); // Atk1 메서드가 double을 반환해야 함
            } else if (skill == 2) {
                myDfs.Damage(myAtk.Atk2());
                //damage = myAtk.Atk2(); // Atk2 메서드가 double을 반환해야 함
            }
            if (!myDfs.isAlive()){
                System.out.println("다음 상대를 이어 하시겠습니까?");
                System.out.println("!!!!!!!!선택하신 상대와 다른 상대를 선택해주세요!!!!!!!!! : 1) 잠만보 2) 메타몽 3) 마자용");
                System.out.println("종료하기 >> 4번");

                int a = scan.nextInt();
               switch ( a){
                   case 1:
                   myDfs = (DfPoketMon) poketMon5;
                   break;
                   case 2:
                   myDfs = (DfPoketMon) poketMon4;
                   break;
                   case 3:
                   myDfs = (DfPoketMon) poketMon6;
                   break;
                   case 4:
                       System.out.println("게임종료");
                       break;


                   default:
                       System.out.println("게임 종료");
                       break;
               }


                myAtk.setExp(myDfs.getExp());
                if (dselect == 1) {
                    myDfs = (DfPoketMon) poketMon5;

                } else if (dselect == 2) {
                    myDfs = (DfPoketMon) poketMon4;
                }
            } else if (dselect == 3) {
                myDfs = (DfPoketMon) poketMon6;

                if (!((DfPoketMon) poketMon6).isAlive &&!((DfPoketMon) poketMon5).isAlive  &&!((DfPoketMon) poketMon4).isAlive   ) {
                       break;
                }
                //myDfs.isAlive() == false

            }

            }//while문 괄호.

        }catch (Exception e){
            System.out.println(e);
        }



    }
}
