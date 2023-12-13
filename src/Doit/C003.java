package Doit;

public class C003 {
	/**
	 * @author 김은호
	 * @since 2023.12.13
	 * @category 백준11659
	 * @class silver4
	 * @see 수 N개가 주어졌을때 I 번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오
	 * @input 1번째 줄에 수의 개수N <= N<=100,000 합을 구해야하는 획수 M <=100,000 2번째줄에 N개의 수가 주어진다.
	 *        각 수는 1000보다 작거나 같은 수다. 3번째 줄부터는 M개의 줄에 합을 구해야하는 구간 i와 j가 주어진다.
	 * @output 총 M개의 줄에 입력으로 주어진 i전째 수에서 j번째 수까지의 합을 구해 출력한다.
	 */
	/**
	 * @문제분석하기 문제에서 수의 개수와, 합을 구해야하 하는 횟수는 최대 100,000 이다. 게다가 구간마다 합을 매번 계산하면 0.5초
	 *         안에 모든 구간 합 계산을 끝날수가 없다. 이럴 때 바로 구간합을 이용해야 한다. 구간 합 개념을 적용하는 가장 기본적인
	 *         문제이므로 핵심 이론에서 배웠던 내용을 그대로 적용해 작성하면된다.
	 * @내용 처음주어진 배열이 변하지 않는다. 그리고 질의개수가 엄청 많다. 그러면 구간합을 써야한다. (합배열) 1. N개의 수를 입력받음과
	 *     동시에 합 배열을 생성한다. 그리고 여기서 함정이 i~j 중에 1~3 과같은 것인데, 그 경우 0에서 시작하는 것과 마찬가지이다.
	 *     다시 설명하자면, 배열의 수를 입력받으면서 동시에 다른 배열에서는 이전 입력같을 계속더해온 값을 더해주고, 나중에 i와 j를
	 *     입력받았을때, 그 덧셈합배열에서 [j] - [i-1] 를 돌려서 출력시키게하면된다. 그리고 10만개가 더해지다보면 int로 받기
	 *     너무힘들어져서 String 토크나이저로 받아야한다.
	 */
	/**
	 * @슈도코드작성하기 N ( 수 개수 ) , M ( 합을 구하는 횟수 ) 입력받고, N만큼 반복문을 돌려서 값을 입력받는다. 이떄 값을
	 *           입력받을때 합배열을 만들어준다. 그리고 M 개수만큼 반복문을 돌려서 구간 합 출력한다. 이떄 중요한다. 구간값을 입력받고
	 *           배열[j] - 배열[i-1]로 계산한 후 출력 한다.
	 * @슈도코드
	 */
	/**
	 * @결과 재채점2회/ 성공 오답이유 : 스트링버퍼를 처음쓰고 그리고 입력을 5엔터 4엔터 하는줄알았는데 첫번째 줄에 5 4 이렇게 해서
	 *     오답이 났었던 것임 문제와 입력칸을 보고 이해하고 수정했더니 성공함
	 * @시간 1496
	 */
	public static void main(String[] args) {
		try {
			java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			java.util.StringTokenizer numCntSt = new java.util.StringTokenizer(bf.readLine());
			// TODO
			int numCnt = Integer.parseInt(numCntSt.nextToken());
			int sumCnt = Integer.parseInt(numCntSt.nextToken());
			long[] sumArr = new long[numCnt + 1];
			java.util.StringTokenizer sumLoopSt = new java.util.StringTokenizer(bf.readLine());
			for (int i = 0; i < numCnt; i++) {
				sumArr[i + 1] = sumArr[i] + Integer.parseInt(sumLoopSt.nextToken());
			}
			for (int idx = 0; idx < sumCnt; idx++) {
				java.util.StringTokenizer parseLoopSt = new java.util.StringTokenizer(bf.readLine());
				int i = Integer.parseInt(parseLoopSt.nextToken());
				int j = Integer.parseInt(parseLoopSt.nextToken());
				System.out.println(sumArr[j] - sumArr[i - 1]);
			}
			bf.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}