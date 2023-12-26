package Doit;

public class C004 {
	/**
	 * @author 김은호
	 * @since 2023. 12. 14.
	 * @category 백준11660
	 * @class 실버1
	 * @see N *N 개의 수가 N*N크기의 표에 채워져 있다. 표안의 수 중(X,Y)에 서 (X',Y')까지의 합을 구하려한다. X는
	 *      행,Y는 열을 의미한다. 예를들어 N= 4이고, 표가 다음과 같이 채워져 있을 때를 살펴보자. (2,2)에서 (3,4)까지의 합을
	 *      구하면 (2,2)+(2,3)+(2,4)+(3,1)+(3,2)+(3,3)+(3,4) 이고, (4,4)에서 (4,4)까지 의 합을
	 *      구하면 (4,4) 만 출력된다. 표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때 이를 처리하는 프로그램을 작성하시오
	 * @input 1번째 줄에 표의 크기 N과 합을 구애햐하는 M이 주어진다. 1<=N<=1024,1<=M<=100,000. 2번째 줄부터
	 *        N개의 줄에는 표에 채워져 있는 수가 1행부터 차레대로 주어진다. 다음 M개의 줄에는 4개의 정수 X,Y,X',Y' 가
	 *        주어지며 (X,Y)에서 (X',Y') 의 합을 구해 출력해야 한다. 표에 채워져 있는 수는 1000보다 작거나 같은
	 *        자연수이다. (X<=X',Y<=Y') ++ 입력값은 적은데 질의값이 큰경우는 이럴땐 정답판을 만들어보고 질의가 오면 바로답을
	 *        출력하는 형태이다. 질의가 많으면 질의할때마다 시간복잡도가 쭉쭉올라가서 그렇다. 그래서 질의에 대해 로직을 구해서 그때마다
	 *        구하는것이 아닌, 로직으로 정답에 가까운 판을 만들어 쭉만들어서, 질의가 들어왔을때 마로 리턴하는 방법으로 풀어보자.
	 * @output 총 M줄에 걸쳐 (X,Y)~(X',Y') 까지 합을 구하라
	 */
	/**
	 * @문제분석하기 구간합 배열을 이용해야한다. 이것은 2차원으로 확장된것이다. 이것을 구간합 배열을 어떻게 구성할 지 고민하는 것이 이 문제의
	 *         핵심이다.우선 2차원 구간 합 배열 D[][]의 정우는 D[][]원본배열의 00부터 X,Y 까지의 사각형 영역안에 있는 수의
	 *         합을 저장해둔 배열이 필요하다. N*N배열을 만들 N을 입력받고, LOOP를 돌려서 합을 출력하기에는 시간제한 1초를
	 *         초과한다. 따라서 이번 문제도 구간합을 구해야한다. 그런데 구간합을 더하면서 입력할 배열은 2차원이 아닌 일반 1차원 배열로
	 *         저장한다. 그리고 직접더해보는데 4*4에서 (2,2),(3,4)의 구간합을 구하려면 해당 사이의 구간합을 구해야한다.
	 * @내용 구간합을 구하기 위해서는 구간합을 구해주는 식이 필요하고, 그리고 정해진 구간의 질의에 대해 해당하는 합을 구하기 위해서의 공식 총
	 *     2개가 필요하다. 원본 데이터 배열을 A, 구간합이 구해지는 배열을 D라고 정한다. 그리고 그 구간합이 있는 배열을 더해주는 공식을
	 *     세워야한다. X,Y의 값이 입력받았다면 (X-1,Y)+(X,Y-1)+겹치는영역(X-1,Y-1)+X,Y의 원래데이터A(X,Y)를
	 *     더해주면된다. 그러면 예재로 나온것을 대입하면 |1,2,3,4|2,3,4,5|3,4,5,6|4,5,6,7|배열을 입력받았다면
	 *     구간합D배열은 |1,3,6,10|3,8,15,24|6,15,27,42|10,24,42,64| 가 될것이다. 그리고 이제 받은
	 *     좌표간의 구간합을 구하는 방법은 (X,Y)(X`,Y`) *반드시 X`,Y`가 X,Y보다 크다. 따라서 이 구간합은
	 *     구간합(X`,Y`) - 구간합(X-1,Y`) - 구간합(X`,Y-1) + 구간합 (X-1,Y-1)을 해줘야한다. 그러나 이 떄
	 *     함정은 (1,1),(1,3) 이렇게 좌표가 온다면 큐션과같은 0이 필요하니 D배열을 선언할땐 길이를 A보다 +1씩 해줘야한다!
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
			// TODO
			int N = Integer.parseInt(st.nextToken());
			int oc = Integer.parseInt(st.nextToken());
			long[] sumArr = new long[(N * N) + 1];
			for (int yIdx = 0; yIdx < N; yIdx++) {
				java.util.StringTokenizer yLine = new java.util.StringTokenizer(bf.readLine());
				for (int xIdx = 0; xIdx < N; xIdx++) {
					sumArr[(yIdx * 4) + xIdx + 1] = sumArr[(yIdx * 4) + xIdx] + Integer.parseInt(yLine.nextToken());
				}
			}
			for (int i = 0; i < oc; i++) {
				java.util.StringTokenizer sumSt = new java.util.StringTokenizer(bf.readLine());
				int x_ = Integer.parseInt(sumSt.nextToken());
				int y_ = Integer.parseInt(sumSt.nextToken());
				int xX = Integer.parseInt(sumSt.nextToken());
				int yY = Integer.parseInt(sumSt.nextToken());
				System.out.println(sumArr[(N * (yY - 1) + xX)] - sumArr[(N * (y_ - 1) + x_ + 1)]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
