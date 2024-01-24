package Doit;

public class C008 {
	/**
	 * @author 김은호
	 * @since 2024. 1. 22.오후 11:00:24
	 * @category 백준1253
	 * @class 골드4
	 * @see N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
	 * 
	 *      N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
	 * 
	 *      수의 위치가 다르면 값이 같아도 다른 수이다.
	 * @input 첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다.
	 * 
	 *        (|Ai| ≤ 1,000,000,000, Ai는 정수)
	 * 
	 *        10
	 * 
	 *        1 2 3 4 5 6 7 8 9 10
	 * @output 좋은 수의 개수를 첫 번째 줄에 출력한다. 8
	 */
	/**
	 * @이해완료시간 2024. 1. 22. 오후 11:07:16 완료
	 * @문제분석하기 시간 복잡도부터 생각해 본다. n개의 개수가 최대 2000 이라 가정해도 좋은 수 하나를 찾는 알고리즘의 시간 복잡도는 N의
	 *         제곱보다 작아야한다.
	 * 
	 *         만약 시간 복잡도가 N^2인 알고리즘을 사용하면 최종 시간 복잡도는 N^3이 되어 제한시간안에 문제를 풀 수없기 때문이다.
	 * 
	 *         따라서 좋은 수하나를 찾는 알고리즘의 시간 복잡도는 최소 O(nlog)여야한다. 정렬, 투포인터 알고리즘을 사용하면 된다.
	 * 
	 *         단 정렬된 데이터에서 자기 자신을 좋은 수 만들기에 포함하면 2개의 수가 아닌 1개의 수만 가지므로 이를 예외로 두어야한다.
	 * @내용 수를 입력받아 배열에 저장한 후 정렬을 시킨다.
	 * 
	 *     투포인터 r,l을 배열 A양쪽 끝에 위치시키고 조건에 적합한 투 포인터 이동 원칙을 활용해 탐색을 수행한다. 판별의 대상이 되는
	 *     수는 K라고 가정한다.
	 * 
	 *     (S>U)=> l--,(S<U)=>r++,(S==U)=>C++ r++ l--
	 * 
	 *     그리고 위의 단계를 배여르이 모든 수에 대하여 반복해 줄 수 있도록 한다. 즉 계속 비교하고있는 값인 K가 N이 될떄까지 반복하며
	 *     좋은 수가 몇개인지 찾는다.
	 * 
	 *     추가로 이게 투포인트네 라고 했을떄 감이 안잡힐 수 있는데 , 여기서 "두 수" 라는 것을 명심하면 투포인터라는게 떠올라야한다.
	 */
	/**
	 * @슈도코드작성하기
	 * @슈도코드 수의 개수 입력값 N, 배열저장 A, 좋은수개수 cnt
	 *
	 *       N을 입력
	 * 
	 *       N개의 수를 입력받은 뒤 배열 A에 저장
	 * 
	 *       배열 A.오름차순정렬
	 * 
	 *       for(i, i>A.len, i++) {
	 * 
	 *       r = 0, l = len-1 , U= A[i]
	 * 
	 *       #투포인토로직 while((r!=l) || (r<=l) ){
	 * 
	 * 
	 *       S=A[r] + A[l]
	 * 
	 *       (S > U) => --l
	 * 
	 *       (S < U) => ++r
	 * 
	 *       (S == U) => ++cnt ++r --l }
	 * 
	 *       }
	 * 
	 *       print cnt
	 */
	/**
	 * @결과 처음에 "좋은수" 로 지정된 숫자에 대한 예외 처리를 안해서 틀렸고, 그 예외처리를 대강해서 틀렸고, 예외처리를 할때 좌우 포인터를
	 *     움직인게 아니여서 틀렸었고, 마지막엔 왼쪽 포인터를 이동시켜야하는데 i를 줄여서 계속 틀렸음
	 * 
	 * @시간
	 */
	public static void main(String[] args) {
		try {
			java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			// TODO
			int N = Integer.valueOf(bf.readLine());
			int cnt = 0;
			int A[] = new int[N];
			java.util.StringTokenizer st = new java.util.StringTokenizer(bf.readLine());
			for (int i = 0; i < A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			java.util.Arrays.sort(A);
			for (int i = 0; i < A.length; i++) {
				int R = 0;
				int L = A.length - 1;
				int U = A[i];
				while (R < L) {
					int S = A[R] + A[L];
					if (S > U) {
						--L;
					} else if (S < U) {
						++R;
					} else {
						if (R != i && L != i) {
							cnt++;
							break;
						} else if (R == i) {
							++R;
						} else if (L == i) {
							--L;
						}
					}
				}
			}
			System.out.println(cnt);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage());
		}
	}
}
