package d_Debugging;

public class j119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int a = 0;
		a = cal.get(java.util.Calendar.YEAR) - 1900; // ---①
		a += cal.get(java.util.Calendar.MONTH); // ---②
		a += cal.get(java.util.Calendar.DATE);
		System.out.printf("%d %d %d ", 0, 121, 126); // ---③ //① ② ③에서의 a값을 1, 2, 3자리에 각각 써 넣는다.
		if (a != 1) {
			System.exit(0);
		}
	}

}
