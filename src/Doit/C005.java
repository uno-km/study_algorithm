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
	 * @문제이해완료 1차 2023. 12. 27. 오후 11:00:23 완료
	 * @문제이해완료 2차 2023. 12. 27. 오후 11:58:39 완료
	 * @문제이해완료 3차 2023. 12. 28. 오전 12:02:39 완료
	 * @문제분석하기 N의 최대값이 10^6이라 연산량이 작게 느껴질 수 있지만. 잠시생각해 보면 10^6개의 수에 대하여 모든 구간 합을 구해야
	 *         하므로 1초안에 연산하기는 어렵다. 여기서도 구간합 배열을 이용해야한다. 이문제의 핵심은 아래와 같다.
	 * @내용 <strong>나머지 합 문제 풀이의 핵심 아이디어</strong> - - - - - -- - - -- - - - - -
	 *     -(A+B)%C는 ((A%C)+(B%C))와 같다. 다시 말해 특정 구간 수들의 나머지 연산을 더해 나머지 연산을 한 값과 이 구간
	 *     합의 나머지 연산을 한 값은 동일하다. - - - - - - - - -- - - - - - - - - - - - - - -
	 *     -구간합배열을 이용한 식 s[i]-s[j]는 원본 리스트의 j+1부터 i까지의 구간합이다. - - - - - - - - - - -
	 *     -s[i]%m의 값과 s[j]%m의 값이 같다면 (s[i]-s[j])%m은 0이다. 즉 구간합 배열의 원소를 M으로 나눈 나머지로
	 *     업데이트 하고 s와 sj가 같은 쌍을 찾으면 원본 리스트에서 j+1 부터 i까지의 구간합이 M으로 나누어떨어진다는 것을 알 수
	 *     있따. 1. 합배열을 맨든다. 1,2,3,1,2, => 1,3,6,7,9 2. 합배열 s의 모든 값을 3으로 나머지 연산을 수행해
	 *     값을 업데이트 한다.이걸 3으로 나눈다. 1,0,0,1,0 3. 우선 변경된 합 배열에서 원소 값이 0인 개수만 세어 정답에
	 *     더한다. 변경된 합 배열의 원소 값이 0-이라는 뜻은 원본 리스트의 0부터 i까지의 구간합이 이미 M으로 나누어떨어진다는
	 *     뜻이기때문이다. (경우의 수 = +3) 4. 이제 변경된 합 배열에서 원소 값이 같은 인덱스의 개수, 즉 , 나머지 값이 같은 합
	 *     배열의 개수를 셉니다. 변경된 합 배열에서 원소 값이 같은 2개의 원소를 뽑는 모든 경우의 수를 구하여 정답에 더하면 됩니다. 위의
	 *     예에서 0이 3개, 1이 2개이므로, 3C2, 2C2 로 경우의 수를 구하여 더하면 됩니다. 이때 경우의 수를 구하는 식인
	 *     C(콤비네이션)을 쓰게되면 3C2 = 3*2/2*1이렇게된다.따라서 약분되어 3이 나온다. 그리고 그변경된 합배열 2c2의 경우의
	 *     수는 2*1/2*1=1이므로 애초에 0이었을때 3개 + 3c2 일때 3 + 2c2 일때 1개 해서 총 7개가 나온것이다.
	 */
	/**
	 * @슈도코드작성하기
	 * @슈도코드
	 */
	/**
	 * @결과 1차. 시간초과
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
				for (int j = 0; j < i; j++) {
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