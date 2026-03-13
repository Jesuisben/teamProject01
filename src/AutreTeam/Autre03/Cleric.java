package ch06_abstract_interface.리니지;

public class Cleric extends 캐릭터 implements 스킬사용 , 도망치기, 조롱하기 {
    private String orignalSkill = "힐";
    int mp_potion;

    public Cleric(String 성별, String 캐릭명, double 공격력, double 방어력, double 체력, double 마나양) {
        super(성별, 캐릭명, 공격력, 방어력, 체력, 마나양);
    }

    @Override
    public void 공격(캐릭터 o) {
       o.set체력(o.get체력()-(get공격력() - o.get방어력()/2));
    }

    @Override
    public void 물약사용() {
        if (mp_potion == 0) {
            System.out.println("현재 보유하고 있는 포션이 없습니다");
            return;
        }

        System.out.println(super.get캐릭명() + "님이 체력회복 포션을 먹었습니다.");
        set체력(get체력() + 10);
        System.out.println("현재 체력 : "+get체력());
        mp_potion--;
    }

    @Override
    public int 스킬(캐릭터 캐릭) {
        //현재 소지한 마나가 필요 마나보다 부족할 때 참으로 리턴하기
        if(get마나양()<=40){ //현재 마나 비교
            System.out.println("소지한 마나가 부족합니다. (현재마나 : "+get마나양()+")");
            return 1;
        }
        System.out.print("스킬 "+ this.orignalSkill +"을 사용했습니다.");
        //현재 체력에서 감소된 체력 보여주기
        //현재 체력 : 캐릭.get체력
        System.out.println("체력이 20회복 되었습니다.");
        set체력(get체력()+20);
        System.out.println("현재 체력 : "+get체력());
        //감소된 체력 : 현재체력 - 1.8*(공격력 - 방어력/2)
        System.out.println("상대의 체력을 깎습니다.");
        System.out.printf("%s 체력 : %.1f -> %.1f \n",캐릭.get캐릭명(),캐릭.get체력(),캐릭.get체력()-(캐릭.get공격력()-캐릭.get방어력()/2)*1.1);
        //set체력으로 실제로 감소도 시켜주기
        캐릭.set체력(캐릭.get체력()-(캐릭.get공격력()-캐릭.get방어력()/2)*1.8);
        //현재 마나 40 감소
        set마나양(get마나양()-40);
        //오류가 없으니까 0으로 리턴
        return 0;
    }

    @Override
    public void 등장멘트출력() {
        System.out.println("시스템 : 힐러가 등장했습니다.");
        System.out.println("아파하지마 힐 해줄게 힐!");
    }

    @Override
    public int 도망() {
        System.out.println(get캐릭명()+"가 도망을 시도했다!");
        //0 -> 도망 실패, 1 -> 도망 성공
        if(Math.random()<0.5){ //랜덤으로 0~1까지의 모든 실수를 받아옴. 50퍼센트 확률
            System.out.println("도망에 성공했습니다!");
            System.exit(0);
            return 1;
        }
        System.out.println("도망에 실패했습니다..");
        System.out.println("의기소침 해져 공격력 3을 잃습니다.");
        //공격력 3 영구적으로 잃기
        set공격력(get공격력()-3);
        return 0;
    }

    @Override
    public void 조롱(캐릭터 캐릭) {
        System.out.println(get캐릭명()+" : 메롱메롱~~@$#=^오^=");
        System.out.printf("상대 체력이 %.1f 내려갔습니다.\n",8.0);
        캐릭.set체력(get체력()-8.0);
        System.out.printf("%s님의 현재 체력 : %.1f\n",캐릭.get캐릭명(),캐릭.get체력());
        System.out.printf("내 마나가 %d 회복됩니다.\n",20);
        System.out.println("현재 마나 : "+get마나양());
    }
}


