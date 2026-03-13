package teamProject00;
// Scanner 도구 import (package와 class사이에 추가)
import java.util.Scanner;


public class cafeMain {
    static void main(String[] args) {

        // 카페이름 및 메뉴 제시 출력
        System.out.println("안녕하세요 " + Drink.CafeName + "입니다.\n\n"+
                "가게 사정으로 인해 변동사항이 있으니 메뉴 선정에 주의해주세요.\n\n"+
                "메뉴를 보여드리겠습니다.\n\n");

        // 배열 - 초기화 기법
        // 클래스명[] 배열명 = {배열 요소}
        Drink[] Menu = {
                new Americano("아메리카노", 3900.0, 3, 400.0),
                new Espresso("에스프레소", 4500.0, 2, "에티오피아"),
                new MintChoco("민트초코 스무디", 5900.0, 3, 2),
                new Yogurt("요거트", 6100, "그리스", "상")
        };

        // 향상 for 반복문, 배열요소 출력
        int i = 1;
        for (Drink item : Menu){
            System.out.println(i + "번 메뉴\n" + item);
            i++;

            // 변동사항 for 반복문에 추가하여 출력
            if(item instanceof Americano){
                ((Americano)item).lowQuality(1, 500);
            }else if(item instanceof Espresso){
                ((Espresso)item).lowQuality(1, "중국");
            }else if(item instanceof MintChoco){
                ((MintChoco)item).lowQuality(1, 1);
            }else if(item instanceof Yogurt){
                ((Yogurt)item).lowQuality("중국", "중");
            }
        }

        // 메뉴 고르기
        System.out.println("원하시는 메뉴의 숫자를 입력해주세요\n( 1 / 2 / 3 / 4 )\n");

        // 입력함수 사용
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        // 반복문 이용해서 선택한 메뉴 확인 시켜주기
        for (int j = 0; j < Menu.length; j++) {
            if(choice == j+1){
                System.out.println("\n" + (j+1) + "번 메뉴를 고르셨습니다\n\n감사합니다.");
            }
        }


    }
}
