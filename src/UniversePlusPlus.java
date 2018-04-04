import util.BigNum;

public class UniversePlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Init UniversePlusPlus!");
		BigNum a_Num = new BigNum(10);
		a_Num.add(1);
		a_Num.multiply(4);
		System.out.println(a_Num.to_string());
	}

}
