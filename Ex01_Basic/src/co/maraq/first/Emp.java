package co.maraq.first;

/*
 * 	Date	20-08-04
 * 	Author	Ram
 *	'���'�̶�� ���赵
 *	����� ������ ��� ����ϴ� ����
 *	��ǰ ����, ��� ������ ���ԵǾ�� ���赵
 *	���, �̸�, �μ���, ��å, �Ի���
 */
public class Emp {
	//�Ӽ�, ����: ������ ���� �� �ִ� ������
	private int		empno;
	private String	ename;
	public	String	job;
	
	//���: private�� empno�� ��ȣ�ϸ鼭 ���� �Ҵ�
	//���� �Ҵ� method >> setter >> write
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	//method >> getter >> read
	public int getEmpno() {
		return this.empno;
	}
	
	public void setEmpname(String ename) {
		this.ename = ename;
	}
	
}
