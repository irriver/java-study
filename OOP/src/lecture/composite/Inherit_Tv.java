package lecture.composite;

public class Inherit_Tv {
	
}

//�ΰ��� ���赵
class Tv{   // 
	 boolean power;
	 int ch;
	 
	 void power() {
		 this.power = !this.power;
	 }
	 
	 void chUp() {
		 this.ch++;
	 }
	 void chDown() {
		 this.ch--;
	 }
}

class Vcr{  //���� �÷��̾�
		boolean power;
		void power() {
			 this.power = !this.power;
		}
		void play() {
			System.out.println("����ϱ�");
		}
		void stop() {
			 System.out.println("�����ϱ�");
		}
		
		 void rew() {}
		 void ff() {}
}


