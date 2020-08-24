package quiz.polymorphism;

class Cart {
	public Electronics[] carts;

	public Cart() {
		this.carts = new Electronics[10];
	}

	// ��ٱ��� �߰�: in Electronics�� ����� ��ü�� �迭 carts�� ���
	public void addCart(Electronics item, int idx) {
		for (int i = 0; i < carts.length; i++) {
			carts[idx] = item;
		}
	}

	// ���: cart �迭�� ��� ��ü�� ������ ����
	public String checkOut() {
		int totalPrice = 0;
		int totalPoint = 0;
		int i = 0;
		while (true) {
			if (carts[i] == null) {
				break;
			}
			totalPrice += carts[i].price;
			totalPoint += carts[i].point;
			++i;
		}
		return "�� �հ� $" + totalPrice + "  ���� ����Ʈ " + totalPoint + "��";
	}

	public void printReceipt() {
		System.out.print("������ �����Ͻ� ��ǰ�� ");
		int i = 0;
		while (true) {
			if (carts[i] != null) {
				break;
			}
			System.out.print("�Դϴ�");
		}

	}

	public static class Himart {
		public static void main(String[] args) {
			Cart cart = new Cart();
			cart.addCart(new Tv(100), 0);
			cart.addCart(new Audio(200), 1);
			cart.addCart(new Computer(300), 2);
			cart.addCart(new MacPro(500), 3);

			System.out.println(cart.checkOut());
			cart.printReceipt();
		}
	}

}