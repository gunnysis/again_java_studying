public class EducationManagementTest {

    public static void main(String[] args) {
        //for call isPass()
        EducationManagement educationManagement = new EducationManagement();
        String checkPass = educationManagement.isPass(60);
        System.out.println("Result of 80 score: "+checkPass);
        // using hash map
        System.out.println("Message of C grade: "+EducationManagement.gradeMessages.get('C'));
        // using swtich Statement
        System.out.println("Message of A grade: "+educationManagement.getMessage('A'));
    }
}
