package quiz.two_dimension;

public class CinemaMain {
	public static void main(String[] args) {
		
		Cinema cinema = new Cinema();
		String[][] seatNo = cinema.makeSeat();
		cinema.showReservationStatus(seatNo);
		
		String[] userSeat = cinema.selectSeat();
		
		//����
		System.out.println("--- ���Ÿ� �����մϴ� ---");
		cinema.booking(userSeat);
		//���� ���� Ȯ��
		System.out.println("--- ���� �� ---");
		cinema.showReservationStatus(seatNo);
		System.out.println();
		
		//���Ź�ȣ ����
		String bookNo = cinema.reservationNo(userSeat);
		System.out.println("���Ź�ȣ Ȯ��: " + bookNo);
//		//���� ���  
//		System.out.println("--- ���Ÿ� ����մϴ� ---");
//		cinema.cancleSeat(bookNo);
//		//���� ���� Ȯ��
//		System.out.println("--- ��� �� ---");
//		cinema.showReservationStatus(seatNo);
//		System.out.println();
//		
//		//��� �¼� �ʱ�ȭ
//		System.out.println("--- ��� �¼� �ʱ�ȭ ---");
//		cinema.initSeat();
//		//���� ���� Ȯ��
//		cinema.showReservationStatus(seatNo);
//		System.out.println();
	}
}
