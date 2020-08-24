package quiz.polymorphism;

class Cart {
	public Electronics[] carts;

	public Cart() {
		this.carts = new Electronics[10];
	}

	// 장바구니 추가: in Electronics를 상속한 객체를 배열 carts에 담기
	public void addCart(Electronics item, int idx) {
		for (int i = 0; i < carts.length; i++) {
			carts[idx] = item;
		}
	}

	// 계산: cart 배열에 담긴 객체의 가격을 누적
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
		return "총 합계 $" + totalPrice + "  누적 포인트 " + totalPoint + "점";
	}

	public void printReceipt() {
		System.out.print("고객님이 구매하신 제품은 ");
		int i = 0;
		while (true) {
			if (carts[i] != null) {
				break;
			}
			System.out.print("입니다");
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