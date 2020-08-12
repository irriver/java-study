package scope;

public class Main {
	public static void main(String[] args) {
		
//		Static Variable: 카드가 공통으로 가져야 하는 속성: 높이, 너비
//		Instance Variable: 카드별로 달라야 하는 속성: 넘버, 모양
		
//		Card c = new Card();
//		c.setNumber(1);
//		c.setKind("Heart");
//		c.cardInfo();
//		
//		Card c2 = new Card();
//		c2.setNumber(2);
//		c2.setKind("Spade");
//		c2.cardInfo();
	
		Airplane air1 = new Airplane();
		air1.name = "보잉747";
		air1.serialNo = "111";
		air1.checkInfo();
		System.out.println("생산대수: " + Airplane.noOfPlanes);
		
		Airplane air2 = new Airplane();
		air2.name = "고잉747";
		air2.serialNo = "222";
		air2.checkInfo();
		System.out.println("생산대수: " + Airplane.noOfPlanes);
		
		Airplane air3 = new Airplane();
		air3.name = "오잉747";
		air3.serialNo = "333";
		air3.checkInfo();
		System.out.println("생산대수: " + Airplane.noOfPlanes);
	}
}
