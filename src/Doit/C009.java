package Doit;

public class C009 {
	/**
	 * @author 김은호
	 * @since 2024. 1. 30.오후 10:15:06
	 * @category 백준 12891
	 * @class 실버4
	 * @see 평소에 문자열을 가지고 노는 것을 좋아하는 민호는 DNA 문자열을 알게 되었다. DNA 문자열은 모든 문자열에 등장하는 문자가
	 *      {‘A’, ‘C’, ‘G’, ‘T’} 인 문자열을 말한다. 예를 들어 “ACKA”는 DNA 문자열이 아니지만 “ACCA”는 DNA
	 *      문자열이다. 이런 신비한 문자열에 완전히 매료된 민호는 임의의 DNA 문자열을 만들고 만들어진 DNA 문자열의 부분문자열을
	 *      비밀번호로 사용하기로 마음먹었다.
	 * 
	 *      하지만 민호는 이러한 방법에는 큰 문제가 있다는 것을 발견했다. 임의의 DNA 문자열의 부분문자열을 뽑았을 때 “AAAA”와 같이
	 *      보안에 취약한 비밀번호가 만들어 질 수 있기 때문이다. 그래서 민호는 부분문자열에서 등장하는 문자의 개수가 특정 개수 이상이여야
	 *      비밀번호로 사용할 수 있다는 규칙을 만들었다.
	 * 
	 *      임의의 DNA문자열이 “AAACCTGCCAA” 이고 민호가 뽑을 부분문자열의 길이를 4라고 하자. 그리고 부분문자열에 ‘A’ 는
	 *      1개 이상, ‘C’는 1개 이상, ‘G’는 1개 이상, ‘T’는 0개 이상이 등장해야 비밀번호로 사용할 수 있다고 하자. 이때
	 *      “ACCT” 는 ‘G’ 가 1 개 이상 등장해야 한다는 조건을 만족하지 못해 비밀번호로 사용하지 못한다. 하지만 “GCCA” 은
	 *      모든 조건을 만족하기 때문에 비밀번호로 사용할 수 있다.
	 * 
	 *      민호가 만든 임의의 DNA 문자열과 비밀번호로 사용할 부분분자열의 길이, 그리고 {‘A’, ‘C’, ‘G’, ‘T’} 가 각각
	 *      몇번 이상 등장해야 비밀번호로 사용할 수 있는지 순서대로 주어졌을 때 민호가 만들 수 있는 비밀번호의 종류의 수를 구하는
	 *      프로그램을 작성하자. 단 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급한다.
	 * @input 첫 번째 줄에 민호가 임의로 만든 DNA 문자열 길이 |S|와 비밀번호로 사용할 부분문자열의 길이 |P| 가 주어진다. (1
	 *        ≤ |P| ≤ |S| ≤ 1,000,000)
	 * 
	 *        두번 째 줄에는 민호가 임의로 만든 DNA 문자열이 주어진다.
	 * 
	 *        세번 째 줄에는 부분문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수가 공백을 구분으로 주어진다.
	 *        각각의 수는 |S| 보다 작거나 같은 음이 아닌 정수이며 총 합은 |S| 보다 작거나 같음이 보장된다.
	 * @output 첫 번째 줄에 민호가 만들 수 있는 비밀번호의 종류의 수를 출력해라.
	 * 
	 *         예제 입력1
	 * 
	 *         9 8
	 * 
	 *         CCTGGATTG
	 * 
	 *         2 0 1 1 (A 2개, C 0개, G 1개, T 1개)
	 * 
	 *         예제 출력1
	 * 
	 *         0
	 * 
	 *         예제 입력2
	 * 
	 *         2 4 2 GATA
	 * 
	 *         1 0 0 1
	 * 
	 *         예제 출력2
	 * 
	 *         2
	 */
	/**
	 * @이해완료시간 2024. 1. 31. 오후 10:26:48 완료
	 * @문제분석하기 P와 S의 길이가 1,000,000으로 매우 크기때문에 O(n)의 시간복잡도 알고리즘으로 문제를 해결해야한다. 이때 부분
	 *         문자열의 길이가 P이므로 슬라이드 윈도우의 개념을 이용하면 문제를 쉽게 해결할 수 있습니다.
	 * @내용 S 배열과 비밀번호 체크 배열을 저장한다
	 * 
	 *     윈도우에 조함된 문자로 현재 상태 배열을 만든다. 그런다음 현재 상태 배열과 비밀번호 체크 배열을 비교하여 유효 비밀번호인지
	 *     판단한다.
	 * 
	 *     윈도우를 한칸 씩 이동하며 현재 상태 배열을 업데이트 한다. 현재 상태 배열을 업데이트 한 이후에는 비밀번호 체크 배열과 비교하여
	 *     비밀번호 유효성을 판단한다.
	 * 
	 *     현재 상태 배열을 업데이트 할 때는 빠지는 문자열, 신규 문자열만 보고 업데이트하는 방식으로 진행한다.
	 * 
	 *     위 그림의 경우 윈도우를 한칸 이동하여 C가 빠지고, G가 추가되어 현재 상태 배열을 1,2,2,3,에서 1,1,3,3으로
	 *     업데이트한다. 비밀번호 체크 배열과 비교했을때 A가 2보다 작으니 유효 비밀번호가 아니다.
	 * 
	 *     이 문제는 슬라이딩 윈도우 원리 이외에도 '실제 문자열과 관련된 배열 처리를 어떻게 할 것인가?', '비밀번호 유효성 검사를 보다
	 *     빠르게 할 수 있는 방법이 있을까?' 등 코드 레벨에서 고민이 필요한 부분이 있다.
	 */
	/**
	 * @슈도코드작성하기
	 * @슈도코드
	 */
	/**
	 * @결과
	 * @시간
	 */
	public static void checkValidation(boolean condition, String errorMsg) {
		if (condition)
			throw new RuntimeException(errorMsg);
	}

//	condition
	final static java.util.List<Character> DNA_CHAR_STAND_ARR = java.util.Arrays.asList('A', 'C', 'G', 'T');

	public static void main(String[] args) {
		try {
			java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			// TODO
			java.util.StringTokenizer dnaWindowLenStrTokenizer = new java.util.StringTokenizer(bf.readLine());
			int dnaLength = Integer.valueOf(dnaWindowLenStrTokenizer.nextToken());
			int windowLensLength = Integer.valueOf(dnaWindowLenStrTokenizer.nextToken());
			char[] dnaCharArr = setDnaCharArr(bf);
			checkValidation(dnaCharArr.length != dnaLength, "길이가 맞지않음");
			java.util.HashMap<Character, Integer> pwdStandardFrame = setPwdStandardFrame(bf);
			java.util.HashMap<Character, Integer> defaultWindowLens = setDefaultWindowLensArray(dnaCharArr);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			System.err.println(e.getMessage());
		}
	}

	private static char[] setDnaCharArr(java.io.BufferedReader bf) throws java.io.IOException {
		java.util.StringTokenizer dnaStrTokenizer = new java.util.StringTokenizer(bf.readLine());
		return dnaStrTokenizer.nextToken().toCharArray();
	}

	private static java.util.HashMap<Character, Integer> setPwdStandardFrame(java.io.BufferedReader bf)
			throws java.io.IOException {
		java.util.HashMap<Character, Integer> pwdStandardFrame = new java.util.HashMap<>();
		java.util.StringTokenizer pwdConditionsStrTokenizer = new java.util.StringTokenizer(bf.readLine());
		for (final Character DNA_CHAR : DNA_CHAR_STAND_ARR) {
			pwdStandardFrame.put(DNA_CHAR, Integer.parseInt(pwdConditionsStrTokenizer.nextToken()));
		}
		return pwdStandardFrame;
	}

	private static java.util.HashMap<Character, Integer> setDefaultWindowLensArray(char[] dnaCharArr) {
		java.util.HashMap<Character, Integer> defaultWindowLens = new java.util.HashMap<>();
		java.util.Arrays.sort(dnaCharArr);
		String dnaStr = new String(dnaCharArr);
		for (final Character DNA_CHAR : DNA_CHAR_STAND_ARR) {
			int beforeStrLength = dnaStr.length();
			dnaStr = dnaStr.replaceAll(String.valueOf(DNA_CHAR), "");
			defaultWindowLens.put(DNA_CHAR, beforeStrLength - dnaStr.length());
		}
		return defaultWindowLens;
	}
}