package lecture.static_members;

/*
 	���� ����ϴ� �޼ҵ�� static���� �����	>>	class Math�� random() �޼ҵ�� ���� ����ϴϱ�
 	new Constructor() ���� ��� ����
 */

public class StaticResource {
	int iv;
	static int sv;	//	�������� ���� StaticClass.sv �� ����ϴ°� ������
	
	void im() {
		//can use sv, iv
	}
	
	static void sm() {
		//can use sv, not iv
	}
	
	public static void main(String[] args) {
		
		//	��ü ���� ���� ��� ������ static �ڿ���
		StaticResource.sm();
		System.out.println(StaticResource.sv);
		
		//	�ν��Ͻ� ���� �� ��� ������ instance �ڿ���
		StaticResource sm = new StaticResource();
		sm.im();
		System.out.println(sm.iv);
	}
}
