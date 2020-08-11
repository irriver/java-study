package kr.or.bit;

public class Tv {
	public String	brand;		//null
	public int		channel;	//0
	
	public void up_channel() {
		channel++;
	}
	
	public void down_channel() {
		channel--;
	}
	
	public void printInfo() {
		System.out.printf("브랜드: %s, 채널: %d\n", brand, channel);
	}
}
