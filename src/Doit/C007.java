package Doit;

public class C007 {
	/**
	 * @author 김은호
	 * @since 2024. 1. 18.오후 10:26:31
	 * @category 백준1940
	 * @class 실버4
	 * @see 주몽은 철기군을 양성하기 위한 프로젝트에 나섰다. 그래서 야철대장에게 철기군이 입을 갑옷을 만들라고 명령했다. 야청대장은 주몽의
	 *      명령에 따르기 위해 연구에 작수하던 중 갑옷을 만드는 재료들을 각각 고유한 번호가 있고, 갑온은 2개의 재료로 만드는 데 2가지
	 *      재료의 고유한 번호를 합쳐 M(1<=M<=10,000,000)이 되면 갑옷이 만들어진다는 사실을 발견했다. 야철대장은 자신이
	 *      만들고 있는 재료로 갑옷을 몇개나 만들 수 있는지 궁금해졌다. 야철대장의 굼긍증을 풀어주기 위해 N(1<=N<-15,000)개의
	 *      재료와 M이 주어졌을 떄 몇 개의 갑옷을 만들수있는지를 구하는 프로그램을 작성하시오
	 * @input 1번째 줄에 재료의 개수 N(1<=15,000), 2번째 줄에 갑옷을 만드는데 필요한 수 M(1<=10,000,000)이
	 *        주어진다. 3번째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다. 고유한 번호는 100,000 보다
	 *        작거나 같은 자연수다.
	 * @output
	 */
	/**
	 * @이해완료시간 2024. 1. 18. 오후 10:32:48 완료
	 * @문제분석하기 먼저 시간 복잡도를 고려해안다. 두 재료으 ㅣ 번호의 합, 즉 크기를 비교하니까 값을 정렬하면 문제를 좀더 쉽게 풀 수
	 *         있다. N의 최대 범위가 15,000이므로, O(nLogn)시간 복잡도 알고리즘을 사용해도 문제가 없다. 일반적으로 정렬
	 *         알고리즘의 시간복잡도는 O(nLongn)이다. 즉 정렬을 사용해도 된다. 입력받은 N의 재룟값을 정렬한다음 양쪽 끝의 위치를
	 *         투포인터로 지정해 문제에 접근해 보겠다.
	 * @내용 6입력받고 입력받은뒤 2 7 4 1 5 3 을 입력받은다음 이걸 정렬시켜서 1 2 3 4 5 7 이렇게 줄세운다. 이렇게 줄세운뒤
	 *     양쪽에 포인터를 놓는다. [1] 2 3 4 5 [7] 이렇게 놓아서 가운데로 서로 값을 합쳐서 9가 나오는지 비교한다음 양쪽에서
	 *     움직여준다. 만약 맞췄다면 cnt 변수에 1을 추가한다. @1 재료 데이터를 배열 A[N]에 저장한 후 오름차순 정렬한다. @2
	 *     정렬해놓고 어떤 데이터에 값이 있는데 이건 2개를 선택해서 값이 만들어져야한다. 그럼 제일 큰애랑 제일 작은애를 더해줘야한다. 하나
	 *     두개를 뽑아서 9가되어야한다. 그럼 처음에 맨처음이랑 맨마직막으랑 더해본다. 그럼 8이나온ㄷㅏ. 이때 8은 9보다 작으니까8보다
	 *     약간 더 큰애가 필요하다. 따라서 1에서 한칸 움직인다. 1[2]345[7] 이렇게 움직이게된다. 더해보니 9가된다. 그렇게 한쌍을
	 *     제거하는 원리로 양쪽의 포인터를 이동시킨다. 12[3]4[5] 이러면 8이된다. 8은 9보다 작으니 좌측포인터를 우측으로 이동한다.
	 *     123[4][5]7 이렇게된다. 이것은
	 */
	/**
	 * @슈도코드작성하기 N(재료의 개수), N(갑옷이 되는 번호) 저장하기 for(N만큼 반복) => 재료배열 저장하기 재료배열 정렬하기
	 *           while(i<j) { if(재료합< M ) 작은 번호 재료를 한 칸 위로 변경하기 else if (재료 합 > M) 큰
	 *           번호 재료를 한 칸 아래로 변경하기 else 경우의 수 증가, 양쪽 index각각 변경하기 } cnt출력
	 * @슈도코드
	 */
	/**
	 * @결과
	 * @시간
	 * @혼자풀기시작 2024. 1. 18. 오후 10:47:14 완료
	 * @혼자풀기종료 2024. 1. 18. 오후 11:37:54 완료
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			// TODO
			int ingrediont = Integer.parseInt(bf.readLine());
			int amorNum = Integer.parseInt(bf.readLine());
			int[] ingrediontArr = new int[ingrediont];
			java.util.StringTokenizer st = new java.util.StringTokenizer(bf.readLine());
			for (int i = 0; i < ingrediontArr.length; i++) {
				if (st.hasMoreTokens()) {
					ingrediontArr[i] = Integer.parseInt(st.nextToken());
				} else {
					throw new Exception("재료 개수와 입력값 개수 불일치!!");
				}
			}
			int cnt = 0;
			int leftPoint = 0;
			int rightPoint = ingrediontArr.length - 1;
			java.util.Arrays.sort(ingrediontArr);
			while (leftPoint < rightPoint) {
				if (ingrediontArr[leftPoint] + ingrediontArr[rightPoint] < amorNum) {
					leftPoint++;
				} else if (ingrediontArr[leftPoint] + ingrediontArr[rightPoint] > amorNum) {
					rightPoint--;
				} else {
					cnt++;
					leftPoint++;
					rightPoint--;
				}
			}
			System.out.println(cnt);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}