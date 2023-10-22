package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ageGroup =3*10;
		String ryokin = "";
		System.out.println("年代は"+ ageGroup +"代です。");
				ryokin = switch(ageGroup) {
				case 10 -> "1000円です";
				case 20 -> "2000円です";
				case 30 ,40 ->"3000円です";
				case 50, 60, 70 ->"4000円です";
				case 80 -> "5000円です";
				default -> "500円です";
				};
				System.out.println(ryokin);
	}

}
