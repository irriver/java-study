package scope;

public class Main {
	public static void main(String[] args) {
		
//		Static Variable: ī�尡 �������� ������ �ϴ� �Ӽ�: ����, �ʺ�
//		Instance Variable: ī�庰�� �޶�� �ϴ� �Ӽ�: �ѹ�, ���
		
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
		air1.name = "����747";
		air1.serialNo = "111";
		air1.checkInfo();
		System.out.println("������: " + Airplane.noOfPlanes);
		
		Airplane air2 = new Airplane();
		air2.name = "����747";
		air2.serialNo = "222";
		air2.checkInfo();
		System.out.println("������: " + Airplane.noOfPlanes);
		
		Airplane air3 = new Airplane();
		air3.name = "����747";
		air3.serialNo = "333";
		air3.checkInfo();
		System.out.println("������: " + Airplane.noOfPlanes);
	}
}
