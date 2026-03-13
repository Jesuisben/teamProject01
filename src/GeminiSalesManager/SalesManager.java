package GeminiSalesManager;

import java.util.Scanner;

public class SalesManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 데이터 통합 관리 (배열 하나로 모든 제품 데이터 관리)
        Product[] allProducts = {
                new Product("샤미드", "스페인", 1200, 880, 78),
                new Product("샤미드", "포르투갈", 1200, 880, 52),
                new Product("샤미드", "프랑스", 1200, 880, 100),
                new Product("샤미드", "독일", 1200, 880, 35),
                new Product("부스터", "스페인", 1500, 1200, 48),
                new Product("부스터", "포르투갈", 1500, 1200, 88),
                new Product("부스터", "프랑스", 1500, 1200, 28),
                new Product("부스터", "독일", 1500, 1200, 123)
        };

        System.out.println("[### 메뉴를 선택하십시오. (1.제품별 2.지역별 3.전체) ###]");
        System.out.print("### 입력 : ");
        int menu = scan.nextInt();
        scan.nextLine();

        switch (menu) {
            case 1: // 제품별 보고서
                printReport(allProducts, "제품별", "");
                break;
            case 2: // 지역별 보고서
                System.out.print("지역 입력(프랑스, 포르투갈, 스페인, 독일) : ");
                String targetArea = scan.nextLine();
                printReport(allProducts, "지역별", targetArea);
                break;
            case 3: // 전체 보고서
                printReport(allProducts, "전체", "");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        scan.close();
    }

    // 보고서 출력을 위한 통합 메서드 (중복 로직 제거)
    private static void printReport(Product[] products, String type, String filter) {
        int totalQty = 0, totalSales = 0, totalCost = 0;
        String currentProduct = "";

        System.out.printf("####### [%s 보고서] #######%n", type);

        for (Product p : products) {
            // 지역별 필터링
            if (type.equals("지역별") && !p.getArea().equals(filter)) continue;

            int sales = p.getRetailPrice() * p.getUnitSales();
            int cost = p.getPrice() * p.getUnitSales();

            // 제품별 출력일 때 제품이 바뀌면 소계 출력 (선택 사항)
            if (type.equals("제품별") && !currentProduct.equals(p.getProductName())) {
                if (!currentProduct.isEmpty()) System.out.println("--------------------------");
                currentProduct = p.getProductName();
            }

            totalQty += p.getUnitSales();
            totalSales += sales;
            totalCost += cost;
        }

        System.out.printf("[### 전체 판매량 : %,d대 ###]%n", totalQty);
        System.out.printf("[### 전체 매출 : %,d만원 ###]%n", totalSales);
        System.out.printf("[### 전체 매출원가 : %,d만원 ###]%n", totalCost);
        System.out.printf("[### 전체 순이익 : %,d만원 ###]%n", (totalSales - totalCost));
        System.out.println(Item.CompanyName + " 보고를 종료합니다.");
    }
}