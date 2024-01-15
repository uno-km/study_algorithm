package Doit;

public class C006 {
	/**
	 * @author 김은호
	 * @since 2024. 1. 8.오후 10:27:45
	 * @category 백준2018
	 * @class 브론즈1
	 * @see 어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤
	 *      10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는
	 *      자연수는 N이하여야 한다. 예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다.
	 *      반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다. N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.
	 * @input 첫 줄에 정수 N이 주어진다. 15
	 * @output 4
	 */
	/**
	 * @이해완료시간 2024. 1. 8. 오후 10:31:39 완료
	 * @문제분석하기 이 문제는 시간 복잡도 분석으로 사용할 알고리즘의 범위부터 줄여야 한다. 우선 무제에 주어진 시간 제한은 2초이다. 그런데
	 *         N의 최대값은 10,000,000으로 매우 크게 잡혀있다. 이런 상황에서는 O의 시간 복잡도 알고리즘을 사용하면 제한 시간을
	 *         초과하므로 O의 시간 복잡도 알고리즘을 사용해야한다. 이런 경우 자주 사용하는 방법이 "투 포인터"입니다. 연속된 자연수의
	 *         합을 구하는 것이 문제이므로, 시작 인덱스와 종료 인덱스를 지정하여 연속된 수를 표현하겠습니다. 시작 인덱스, 종료인덱스를
	 *         투 포인터로 지정한 후 문제에 접근해 보겠습니다.
	 * @내용 입력받은 값을 N에 저장한 후 코드에서 사용할 변수를 모두 초기화한다. 결과 변수를 1로 초기화 하는 이유는 N이 15일 때 숫자
	 *     15만 뽑는 경우의 수를 미리 넣고 초기화 했기때문이다.(15의 합중 15자체로 혼자 합해도 15니까 해당 수를 +1로 우선 1로
	 *     초기화하였다.) 2단계를 end_index N 이 될때까지 반복하되, 포인터가 이동할 떄마다 현재의 총합과 N을 비교해 값이 같으면
	 *     count를 1만큼 증가시키면된다.
	 * @투포인터 이동 원칙 -sum > N : sum = sum-start_index ; start_indext++; -sum < N :
	 *       end_index++; sum = sum +end_index; -sum == N : end_index++; sum = sum +
	 *       end_index; count++;
	 */
	/**
	 * @슈도코드작성하기 N 변수 저장, 사용변수 초기화 (cnt =1, stIdx = 1, endIdx = 1, sum = 1) loop
	 *           if(sum== N) cnt++. endIdx++/else if(sum> N stIdx++ / else if(sum <
	 *           N endIdx++ / print(cnt)
	 * @슈도코드
	 */
	/**
	 * @결과
	 * @시간
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// TODO
		int inputVal = sc.nextInt();
		int stIdx = 1;
		int endIdx = 1;
		int cnt = 1;
		int sum = 1;
		while (endIdx != inputVal) {
			if (sum == inputVal) {
				cnt++;
				sum += ++endIdx;
			} else if (sum > inputVal) {
				sum -= stIdx++;
			} else if (sum < inputVal) {
				sum += ++endIdx;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
