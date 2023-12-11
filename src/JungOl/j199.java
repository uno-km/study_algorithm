package JungOl;


import java.util.Scanner;

public class j199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int member = sc.nextInt();
		String memberScore[][] = new String[member][5];
		// ���ڷ� �Է��� ��ι޾� ���ڴ� ���������� ��ȯ�� ����, ���� �ٽ� ���ڷ�.
		for (int i = 0; i < member; i++) {
			for (int j = 0; j < 4; j++) {
				memberScore[i][j] = sc.next();
			}
		}
		for (int i = 0; i < member; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += Integer.parseInt(memberScore[i][j + 1]);
			}
			memberScore[i][4] = String.valueOf(sum);
		}

		sc.close();
		// �ԷµȰ��� Ȯ���Ѵ�
//		for (int i = 0; i < member; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(memberScore[i][j] + " ");
//			}
//			System.out.println();
//		}
		// Ȯ�εǾ����� ��Ȱ��
		Scores score = new Scores(memberScore);
		// 2�� �迭�� ��°�� ����
		score.Sort();

	}
}

class Scores {
	String[][] memberScore;

	Scores() {

	}

	Scores(String[][] input) {
		this.memberScore = input;
	}

	void Sort() {
		if (memberScore.length == 1) {
			for (int i = 0; i < memberScore[0].length; i++) {
				System.out.print(memberScore[0][i] + " ");
			}
		} else {
			for (int i = 0; i < memberScore.length; i++) {
				for (int j = 0; j < memberScore.length - i - 1; j++) {
					if (Integer.parseInt(memberScore[j][4]) < Integer.parseInt(memberScore[j + 1][4])) {
						String tmp[] = new String[5];
						for (int k = 0; k < 5; k++) {
							tmp[k] = memberScore[j + 1][k];
						}
						for (int k = 0; k < 5; k++) {
							memberScore[j + 1][k] = memberScore[j][k];
						}
						for (int k = 0; k < 5; k++) {
							memberScore[j][k] = tmp[k];
						}

					}
				}
			}
			for (int i = 0; i < memberScore.length; i++) {
				for (int j = 0; j < memberScore[i].length; j++) {
					System.out.print(memberScore[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
