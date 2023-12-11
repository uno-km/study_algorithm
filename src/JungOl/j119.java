package JungOl;

public class j119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int a = 0;
		a = cal.get(java.util.Calendar.YEAR) - 1900; // ---��
		a += cal.get(java.util.Calendar.MONTH); // ---��
		a += cal.get(java.util.Calendar.DATE);
		System.out.printf("%d %d %d ", 0, 121, 126); // ---�� //�� �� �鿡���� a���� 1, 2, 3�ڸ��� ���� �� �ִ´�.
		if (a != 1) {
			System.exit(0);
		}
	}

}
