package Doit;

public class C005 {
	/**
	 * @author 김은호
	 * @since 2023. 12. 27.
	 * @category 백준10986
	 * @class 골드3
	 * @see N개의 수 A1,A2,A...,AN이 주어졌을 때 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을
	 *      작성하시오. 즉 A1 + ... AJ(i<=j)의 합이 M으로 나누어떨어지는 (i,j)쌍의 개수를 구하시오.
	 * @input 1번째 줄에 N과 (1<=N<=10^6,2<=M<10^3),2번쨰 줄에 N개의 수 A1,A2,...,An이 주어진다.
	 *        (0<=Ai<=10^9).
	 * @output 1번째 줄에 연속된 부분의 합이 M이므로, 누너어떨어지는 구간의 개수를 출력한다. 입력 : 5 3\n 1 2 3 1 2,
	 *         출력 : 7
	 */
	/**
	 * @문제이해완료 2023. 12. 27. 오후 11:00:23 완료
	 * @문제분석하기
	 * @내용
	 */
	/**
	 * @슈도코드작성하기
	 * @슈도코드
	 */
	/**
	 * @결과
	 * @시간
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			java.util.StringTokenizer st = new java.util.StringTokenizer(bf.readLine());
			java.util.StringTokenizer numinput = new java.util.StringTokenizer(bf.readLine());
			// TODO
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int c = 0;
			long[] numArr = new long[n + 1];
			long[] sumArr = new long[n + 1];
			for (int i = 1; i <= n; i++) {
				int x = Integer.parseInt(numinput.nextToken());
				numArr[i] = x;
				sumArr[i] = sumArr[i - 1] + x;
				for (int j = 1; j < i; j++) {
					if ((sumArr[i] - sumArr[j]) % m == 0) {
						c++;
					}
				}
			}
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
