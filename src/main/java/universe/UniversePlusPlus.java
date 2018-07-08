import util.BigNum;
import physics.Time;

public class UniversePlusPlus {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Init UniversePlusPlus!");
    BigNum a_Num = new BigNum(1000001);
    Time time = new Time(a_Num);
    System.out.println(time.toString());
    a_Num.add(1);
    a_Num.multiply(4);
    int foo_value = 1;

    System.out.println(a_Num.toString());
  }
}
