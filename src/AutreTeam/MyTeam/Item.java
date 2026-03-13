package AutreTeam.MyTeam;

abstract class Item implements Report {
    //변수선언
    private String name;
    private String area;
    private int unitPrice;
    private int unitCost;

    // 변수가 Privae 이기 때문에 공유 getter 설정
    public String getName() { return name; }
    public String getArea() { return area; }
    public int getUnitPrice() { return unitPrice;}
    public int getUnitCost() { return unitCost; }

    // 생성자설정- Item을 상속받는 클래스의 DB생성,배열과 관련됨
    public Item(String name, String area, int unitPrice, int unitCost) {
        this.name = name;
        this.area = area;
        this.unitPrice = unitPrice;
        this.unitCost = unitCost;
    }

    //필요 메서드 설정
    public abstract void displayArea();
  //  public abstract void displayItem();

}
