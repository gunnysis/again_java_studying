package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyzeScore {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("------------------------------------------------");
        input();

    }

    static void input() {

        Student student = new Student();
        Score score = new Score();
        Analysis analysis = new Analysis(score, student);

        int choice = 0;
        while (choice != 5) {
            System.out.print("선택> ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.print("학생수> ");
                    int number = new Scanner(System.in).nextInt();
                    student.setNumber(number);
                    break;
                case 2:
                    List<Integer> studentScores = new ArrayList<>();
                    for (int i=0;i < student.getNumber(); i++) {
                        System.out.print("점수입력> ");
                        studentScores.add(new Scanner(System.in).nextInt());
                    }
                    score.setStudentScores(studentScores);
                    break;
                case 3:
                    score.printScores();
                    break;
                case 4:
                    System.out.println("최고 점수: "+analysis.maxScore());
                    System.out.println("평균 점수: "+analysis.averageScore());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    continue;
            }
        }

    }
}
