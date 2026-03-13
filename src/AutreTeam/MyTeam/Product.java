package AutreTeam.MyTeam;

class Product extends Item {
    //고유변수가 없다?.....................
    //생성자
    public Product(String name, String area, int unitPrice, int unitCost) {
        super(name, area, unitPrice, unitCost); //Item에서 받은 변수
    }

    // 오버라이딩 항목 검색하여 추가

    @Override
    public void displayArea() {
        System.out.printf("[%s 판매지역]",getArea());// sub클래스에서 Overriding
    }

    @Override
    public void printSummary() {
        System.out.println("상품명: "+getName());
    }    // Item class에서 implement Report가 있었기 때문에
    // sub클래스에서도 Overriding해 주어야 하나?.......................
}
