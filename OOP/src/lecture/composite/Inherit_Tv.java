package lecture.composite;

public class Inherit_Tv {
	
}

//두개의 설계도
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

class Vcr{  //비디오 플레이어
		boolean power;
		void power() {
			 this.power = !this.power;
		}
		void play() {
			System.out.println("재생하기");
		}
		void stop() {
			 System.out.println("정지하기");
		}
		
		 void rew() {}
		 void ff() {}
}


