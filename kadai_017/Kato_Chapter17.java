package kadai_017;

public abstract class Kato_Chapter17 {
	
	public String familyname = "加藤" ;
	
	public String givenName ;
	
	public static String address = "住所は東京都中野区◯×です";
	
	public static void commonIntroduce(){
		System.out.println(address);
	}
	
	abstract void eachIntroduce();{
	}
	
	public void execIntroduce() {
		System.out.println("私はJavaが得意です。");
		System.out.println("好きな食べ物はりんごです");
		System.out.println("趣味は読書です");
	}
}
