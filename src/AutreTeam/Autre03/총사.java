package ch06_abstract_interface.리니지;

public class 총사 extends 캐릭터 implements 스킬사용 , 도망치기, 조롱하기{
    String 스킬명 = "총을 땅야땅야";

    public 총사(String 성별, String 캐릭명, double 공격력, double 방어력, double 체력, double 마나양) {
        super(성별, 캐릭명, 공격력, 방어력, 체력, 마나양);
    }

    @Override
    public void 공격(캐릭터 캐릭){
        System.out.printf("%s님이 %s님을 기본 공격 했습니다.\n",super.get캐릭명(),캐릭.get캐릭명());
        System.out.printf("%s 체력 : %.1f -> %.1f \n",캐릭.get캐릭명(),캐릭.get체력(),캐릭.get체력()-(캐릭.get공격력()-캐릭.get방어력()/2));
        캐릭.set체력(캐릭.get체력()-(캐릭.get공격력()-캐릭.get방어력()/2));
    }

    @Override
    public void 물약사용() {

        if(super.get물약수() == 0){
            System.out.println("물약이 없어서 사용할수가 없습니다.");
            return;
        }

        super.set물약수(super.get물약수() - 1);
        super.set체력(50);
        System.out.println("체력이 50 증가 했습니다.");
    }


    @Override
    public int 스킬(캐릭터 o) {
        o.set체력(o.get체력() - 300);
        System.out.println("패스트 드로우를 사용해서 " + o.get캐릭명()+"의 체력이 "+ 300 + "감소했습니다.");
        return 0;
    }

    @Override
    public void 등장멘트출력() {
        if ("남".equals(super.get성별())) {
            System.out.println("시스템 : 총사가 선택되셨습니다.");
            System.out.println("총사 : 설마 권총일거라고 생각한건 아니겠지?");
        } else {
            System.out.println("시스템 : 총사가 선택되셨습니다.");
            System.out.println("총사 : 총알 한 발로 세상을 평정해주지");
        }
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
        System.out.println(get캐릭명()+" : 이런싸가지 없는놈~~@$#=^오^=");
        System.out.printf("상대 체력이 %.1f 내려갔습니다.\n",8.0);
        캐릭.set체력(get체력()-8.0);
        System.out.printf("%s님의 현재 체력 : %.1f\n",캐릭.get캐릭명(),캐릭.get체력());
        System.out.printf("내 마나가 %d 회복됩니다.\n",20);
        System.out.println("현재 마나 : "+get마나양());

    }
}
