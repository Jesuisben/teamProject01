package PoketMonster01;

import java.util.Scanner;

public class PoketMonMain {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        int dselect;
        int skill;
        double damage;


        PoketMon poketMon1 = new AtPoketMon("파치리스","전기", "천만볼트","번개",10);
        PoketMon poketMon2 = new AtPoketMon("피카츄","전기", "백만볼트","전기쇼크",10);
        PoketMon poketMon3 = new DfPoketMon("꼬부기","물", 100,100);
        PoketMon poketMon4 = new DfPoketMon("잉어킹","물", 100,100);
        AtPoketMon myAtk;
        DfPoketMon myDfs;
        System.out.println("-----------------------------------------");
        System.out.println("<사용하실 포켓몬을 골라주세요 : 1.파치리스 2.피카츄>");
        System.out.println("-----------------------------------------");
        System.out.print(">>");
        select = scan.nextInt();


        if (select == 1) {
            myAtk = (AtPoketMon) poketMon1;

        }
            else if (select == 2) {
             myAtk = (AtPoketMon) poketMon2;

            }
            else {
            System.out.println("잘못된 입력입니다. 1번 아니면 2번으로 골라주세요.");
            myAtk = null;
        }
        System.out.println("-----------------------------------------");
        System.out.println("<선택하신 포켓몬 이름>");
        System.out.println(myAtk.getName());
        System.out.println("타입: "+ myAtk.getType()+"타입");
        System.out.println("보유중인 기술: "+myAtk.getSkillname1()+" , "+myAtk.getSkillname2());
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("<상대 포켓몬을 결정해주세요>");
        System.out.println("1. 꼬부기 2. 잉어킹");
        try {

            dselect = scan.nextInt();
            if (dselect == 1) {
                myDfs = (DfPoketMon) poketMon3;

            }
            else if (dselect == 2) {
                myDfs = (DfPoketMon) poketMon4;

            }
            else {
                System.out.println("잘못된 입력입니다. 1번 아니면 2번으로 골라주세요.");
                myDfs = null;
            }


//-----------------------상대 포켓몬----------------------------------//


        System.out.println("<선택하신 포켓몬 이름>");
        System.out.println(myDfs.getName());
        System.out.println("타입: "+ myDfs.getType()+"타입");
        System.out.println("HP : "+ myDfs.health);
        System.out.println("-----------------------------------------");
//------------------------------------------------------//
        System.out.println("앗, 야생의"+myDfs.getName()+"가 나타났다!!");
        System.out.println("가랏, "+myAtk.getName()+"!!!!!");
        System.out.println("-----------------------------------------");
//=========================================================================
        while (myDfs.isAlive()) {
            System.out.println("상대"+myDfs.getName()+"의 체력"+myDfs.getHealth());
            System.out.println("어떤 기술을 사용할까요 : 1. "+myAtk.getSkillname1()+" 2. "+myAtk.getSkillname2());
            skill = scan.nextInt();

            if (skill == 1) {
               myDfs.Damage(myAtk.Atk1());
             //   myAtk.Atk1(); // Atk1 메서드가 double을 반환해야 함
            } else if (skill == 2) {
                myDfs.Damage(myAtk.Atk2());
                //damage = myAtk.Atk2(); // Atk2 메서드가 double을 반환해야 함
            }
            if (!myDfs.isAlive()){

                myAtk.setExp(myDfs.getExp());
                if (dselect == 1) {
                    myDfs = (DfPoketMon) poketMon4;
                } else if (select == 2) {
                    myDfs = (DfPoketMon) poketMon3;
                }
                if (!((DfPoketMon) poketMon4).isAlive &&!((DfPoketMon) poketMon3).isAlive  ) {
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
