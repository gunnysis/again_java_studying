package exam;

import java.util.OptionalInt;

public class Analysis {
    Score score;
    Student student;
    Analysis(Score score, Student student) {
        this.score = score;
        this.student = student;
    }

    int maxScore() {
        OptionalInt max = score.getStudentScore().stream().mapToInt(v -> (int) v).max();
        return max.getAsInt();
    }

    int averageScore() {
        OptionalInt sum = OptionalInt.of(score.getStudentScore().stream().mapToInt(v ->(int) v).sum());
        int average = sum.getAsInt()/ student.getNumber();
        return average;
    }



}
