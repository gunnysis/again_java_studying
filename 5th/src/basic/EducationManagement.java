package basic;

import java.util.HashMap;
import java.util.Map;

public class EducationManagement {

    static final Map<Character, String> gradeMessages = new HashMap<>();
    static {
        gradeMessages.put('A',"very good");
        gradeMessages.put('B',"normal good");
        gradeMessages.put('C',"not good");
        gradeMessages.put('D',"fail");
        gradeMessages.put('E',"terrible");
    }


    int baseScore = 70;

    String isPass(int score) {
        // Ternary Operator
        return score >= baseScore ? "Pass" : "Non-Pass";
    }

    // Using Swich Statement
    String getMessage(char grade) {
        String message;

        switch (grade) {
            case 'A':
                message = "very good";
                break;
            case 'B':
                message = "normal good";
                break;
            case 'C':
                message = "not good";
                break;
            case 'D':
                message = "fail";
                break;
            case 'E':
                message = "terrible";
                break;
            default:
                message = "invalid grade";
                break;
        }
        return message;
    }



}
