package Doit;

import java.util.Scanner;

public class C001 {

	/**
	 * @author zhfld
	 * @since 20231211
	 * @category 백준11720
	 * @class bronze
	 * @see N개의 숫자가 공백없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
	 * @input 1번째 줄에 숫자의 개수 N(1<=N100), 2번저잴에 숫자 N개가 공백없이 주어진다.
	 * @output 입력으로 주어진 숫자 N개의 합을 출력한다.
	 */
	/**
	 * @문제분석하기
	 * @내용 N의 범위가 1부터 100까지 이므로 값을 int형 , long형과 같은 숫자형으로 담을 수없다. 먼저 문자열 형태로 입력값을 받은
	 *     후 이를 문자 배열로 변환하고, 문자 배열값을 순서대로 읽으면서 숫자형으로 변환하여 더해야한다.
	 */
	/**
	 * @슈도코드작성하기
	 * @슈도코드 1)입력값 N을 정한다. 2)숫자(문자열)를 입력받는다. 3)문자열을char배열로변환후길이를 입력값 N과 비교한다.4)동일할경우
	 *       for문을 돌려서 각 char를 숫자로변환해 더한다.
	 */
	/**
	 * @결과 맞음
	 * @시간 212
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO
		final int maxCnt = sc.nextInt();
		String inputStr = sc.next();
		if (maxCnt == inputStr.length()) {
			short sum = 0;
			for (char c : inputStr.toCharArray()) {
				sum += Character.getNumericValue(c);
			}
			System.out.println(sum);
		} else {
			System.out.println("입력값 불일치");
		}
		sc.close();
	}
}
