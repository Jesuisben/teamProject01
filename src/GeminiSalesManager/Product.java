package GeminiSalesManager;

public class Product extends Item {
    private int unitSales;

    public Product(String productName, String area, int retailPrice, int price, int unitSales) {
        super(productName, area, retailPrice, price);
        this.unitSales = unitSales;
    }

    @Override
    public void itemSummary() {
        System.out.printf("[### %s %s 요약 ###]%n", Item.CompanyName, getProductName());
        System.out.println("[### 판매 지역 : " + getArea() + " ###]");
        System.out.println("[### 권장 소비자가격 : " + getRetailPrice() + "만원 ###]");
        System.out.println("[### 제작 원가 : " + getPrice() + "만원 ###]");
    }

    @Override
    public void displayItemType() {
        System.out.println("[### " + getProductName() + " 재고 현황 확인 ###]");
    }

    public int getUnitSales() { return unitSales; }
}