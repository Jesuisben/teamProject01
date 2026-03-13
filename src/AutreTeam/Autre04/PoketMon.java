package Project;

/**
 *이 클래스는 주석 규칙을 보여주는 예제 클래스입니다.
 * @author
 * * @version 1.0
 * */
public class PoketMon {
   private String  name;//이거는~ 이름~
   private String type;//이거는 물불전기 타입~

   public PoketMon(String name, String type) {
      this.name = name;
      this.type = type;

   }




   public String getName() {
      return name;
   }

   public String getType() {
      return type;
   }

   @Override
   public String toString() {
      return "<선택하신 포켓몬 이름>\n" + name + "\n타입 : "+type;
   }





}
