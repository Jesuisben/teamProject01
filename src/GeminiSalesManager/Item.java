package GeminiSalesManager;

public abstract class Item implements Reportable {
    public static final String CompanyName = "이브이자동차";
    private String productName;
    private String area;
    private int retailPrice;
    private int price;

    public Item(String productName, String area, int retailPrice, int price) {
        this.productName = productName;
        this.area = area;
        this.retailPrice = retailPrice;
        this.price = price;
    }

    public abstract void itemSummary(); // 추상 메서드로 변경하여 자식에서 구현 강제

    // Getter들
    public String getProductName() { return productName; }
    public String getArea() { return area; }
    public int getRetailPrice() { return retailPrice; }
    public int getPrice() { return price; }
}