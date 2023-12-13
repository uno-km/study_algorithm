package Doit;

public class C002 {
	/**
	 * @author 김은호
	 * @since 20231212
	 * @category 백준1546
	 * @class bronze1
	 * @see 세준이는 기말고를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다. 일단 세준이는 자기 점수중 최댓값을 골랐다. 그런 다음
	 *      최댓값을 M이라 할 때 모든 점수를 점수 /m * 100으로 거쳤다. 예를 들어 세준이의 최고점이 70점, 수학점수가 50점이라면
	 *      수학점수는 50/70*100 이므로 71.43점이다. 세준이의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램을
	 *      작성하시오.
	 * @input 1번째 줄에 시험을 본 과목의 개수 N이 주어진다. 해당 값은 1000보다 작거나 같다. 2번째 줄에 세준이의 현재 성적이
	 *        주어진다. 해당값은 100보다 작거나 같은 ,음이 아닌 정수이고, 적어도 1개의 값은 0보다 크다.
	 * @output 1번째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대 오차 또는 상대 오차가 10^-2이하면 정답이다.
	 */
	/**
	 * @문제분석하기 최고 점수를 기준으로 전체 점수를 다시 계산해야한다. 모든 점수를 입력받은 후에 최고점을 별도로 저장해야한다. 또한 문제에서
	 *         제시한 한 과목의 점수를 계산하는 식은 총합과 관련된 식으로 변환할 수 있다. 따라서 일일이 변환 점수를 구할 필요없이
	 *         한번에 변환한 점수의 평균 점수를 구할 수 있다.
	 * @내용 60 70 80 입력받았을때 (일반점수/최대점수)*100 ... /3 => (a +b +c)/m * 100 /3이렇게 변경할
	 *     수있다. 이때 탐색하면서 총합과 최대수를 구한다.
	 */
	/**
	 * @슈도코드작성하기 변수N에 과목수를 받는다. N번만큼 수를 입력받으면서 배열 A에 넣는다. 추가로 입력과 동시에 최대값 비교와 합을
	 *           구한다. 그리고 입력이 끝났으면 합/최대값/N*100 식을 통해 값을 출력한다.
	 * @슈도코드
	 */
	/**
	 * @결과
	 * @시간
	 */
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// TODO
		short maxCnt = sc.nextShort();
		int sum = 0;
		byte maxNum = 0;
		for (short i = 0; i < maxCnt; i++) {
			byte inputNum = sc.nextByte();
			sum += inputNum;
			if (maxNum < inputNum) {
				maxNum = inputNum;
			}
		}
		double result = (double) sum / maxNum * 100 / maxCnt;
		System.out.println(result);
		sc.close();
	}
}