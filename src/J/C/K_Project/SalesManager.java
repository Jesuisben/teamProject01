package J.C.K_Project;

import java.util.Scanner;

public class SalesManager {
    public static final String TITLE = "월별 매출 분석 보고서";

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 매출정보 배열 생성

        Item[] items = new Item[2]; //items는 어디에서 선언한 변수인가?..............
        items[0] = new Product("itemA", "Local", 100, 80);
        items[1] = new Product("itemB", "OverSea", 120, 95);

        int[][] monthlyQty = {
                {10, 5},//1월 (itemA, itemB)
                {15, 6},//2월
                {20, 7} //3월
        };

        System.out.println(TITLE);

        int m = 0;
        while (m< monthlyQty.length){
            System.out.println("------------------------------");
            System.out.println((m+1)+"월");

            for (int i = 0; i < items.length; i++) {
                Item item = items[i];
                int qty = monthlyQty[m][i];

                int salesAmount = qty*item.getUnitPrice();
                int salesCost = qty*item.getUnitCost();
                int salesProfit = salesAmount-salesCost;

                if(item instanceof Product){
                    item.displayArea();
                }

                System.out.printf("%-6s | 매출액: %d | 원가: %d | 이익: %d\n",
                        item.getName(),salesAmount,salesCost,salesProfit);
            }
            m++;
        }
        System.out.println("\n보고서를 종료하려면 'end'를 입력하세요:");
        String input = scan.next();
    }
}
