package exam;

import java.util.ArrayList;
import java.util.List;

public class Score {
    private List<Integer> studentScores;

    Score() {
        studentScores = new ArrayList<Integer>();
    }

    public List getStudentScore() {
        return studentScores;
    }

    public void setStudentScores(List<Integer> studentScores) {
        this.studentScores = studentScores;
    }

    public void printScores () {
        for (int i = 0; i < studentScores.size(); i++) {
            if (i == studentScores.size() -1) {
                System.out.println(studentScores.get(i));
                break;
            }
            System.out.print(studentScores.get(i)+",");
        }
    }
}
