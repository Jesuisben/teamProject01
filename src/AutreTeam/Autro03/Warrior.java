package AutreTeam.Autro03;

public class Warrior extends 캐릭터 implements 스킬사용, 도망치기, 조롱하기 {
    //기본 스펙 생각하기
    // 물약 먹기 구현
    // 스킬명도 생각해두고, 어떻게 할건지
    // 인터페이스 구상이 끝나면 받아와서 메소드 완성하기
    // gender : "여성"
    // name : "마법사"
    // ad : 50
    // block : 6
    // hp : 85
    // mp : 100

    // 물약 갯수
    int mp_potion = 3;

    //생성자
    public Warrior(String 성별, String 캐릭명, double 공격력, double 방어력, double 체력, double 마나양) {
        super(성별, 캐릭명, 공격력, 방어력, 체력, 마나양);
    }

    @Override
    public void 등장멘트출력() {
        if ("남".equals(super.get성별())) {
            System.out.println("우량한 전사한명이 등장했습니다!");
        } else {
            System.out.println("야름한 전사한명 등장!");
        }

    }

    //기본 공격
    @Override
    public void 공격(캐릭터 캐릭) {
        System.out.printf("%s님이 %s님을 기본 공격 했습니다.",super.get캐릭명(),캐릭.get캐릭명());
        System.out.printf("%s 체력 : %.1f -> %.1f \n",캐릭.get캐릭명(),캐릭.get체력(),캐릭.get체력()-(캐릭.get공격력()-캐릭.get방어력()/2));
        캐릭.set체력(캐릭.get체력()-(캐릭.get공격력()-캐릭.get방어력()/2));
    }


    //물약 먹기
    @Override
    public void 물약사용() { //멤버변수 mp_potion으로 비교
        if (mp_potion == 0) { //포션이 0이 되었다면 사용 x
            System.out.println("현재 보유하고 있는 포션이 없습니다");
            return;
        }

        //포션 사용
        System.out.println(super.get캐릭명() + "님이 체력회복 포션을 먹었습니다.");
        //체력 10 회복해주기
        set체력(get체력() + 10);
        //멤버변수 mp_potion 하나 줄이기
        mp_potion--;

    }


    //메테오~
    @Override
    public int 스킬(캐릭터 캐릭) { //에러 제어를 위해 int로 반환 1이 오류
        //현재 소지한 마나가 필요 마나보다 부족할 때 참으로 리턴하기
        if(get마나양()<=40){ //현재 마나 비교
            System.out.println("소지한 마나가 부족합니다. (현재마나 : "+get마나양()+")");
            return 1;
        }
        System.out.println(get캐릭명()+" : 기어세커든!");
        System.out.println(get캐릭명() + "이(가) 검을 휘둘러 " + 40 + "의 피해를 입힙니다!");        //현재 체력에서 감소된 체력 보여주기
        //현재 체력 : 캐릭.get체력
        //감소된 체력 : 현재체력 - 1.8*(공격력 - 방어력/2)
        System.out.printf("체력 : %.1f -> %.1f \n",캐릭.get체력(),캐릭.get체력() - 40.0);
        //set체력으로 실제로 감소도 시켜주기
        캐릭.set체력(캐릭.get체력()-40.0);
        //현재 마나 40 감소
        set마나양(get마나양()-40);
        //오류가 없으니까 0으로 리턴
        return 0;
    }

    @Override
    public int 도망() {
        System.out.println("등뒤에 상처는 전사의 수치");
        return 0;
    }

    @Override
    public void 조롱(캐릭터 캐릭) {
        System.out.println(get캐릭명()+" : 뚜비뚜바~~@$#=^오^=");
        System.out.printf("상대 체력이 %.1f 내려갔습니다.\n",8.0);
        캐릭.set체력(get체력()-8.0);
        System.out.printf("%s님의 현재 체력 : %.1f\n",캐릭.get캐릭명(),캐릭.get체력());
        System.out.printf("내 마나가 %d 회복됩니다.\n",20);
    }
}
