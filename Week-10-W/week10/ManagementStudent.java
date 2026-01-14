package week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ManagementStudent extends Student {
    private String specialization;

    public ManagementStudent(int rollNo, String name, double marks, String specialization) {
        super(rollNo, name, marks);
        this.specialization = specialization;
    }

    @Override
    public String calculateResult() {
        String baseResult = super.calculateResult();
        if (marks >= 40) {
            return baseResult + " Passed in Management stream.";
        } else {
            return baseResult + " Failed in Management stream.";
        }
    }

    public String calculateResult(int graceMarks) {
        double totalMarks = marks + graceMarks;
        if (totalMarks >= 40) {
            return "Passed in Management with " + graceMarks + " grace marks. Total marks: " + totalMarks;
        } else {
            return "Failed even with grace marks. Total marks: " + totalMarks;
        }
    }
}