package week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ScienceStudent extends Student {
    private String majorSubject;

    public ScienceStudent(int rollNo, String name, double marks, String majorSubject) {
        super(rollNo, name, marks);
        this.majorSubject = majorSubject;
    }

    @Override
    public String calculateResult() {
        String baseResult = super.calculateResult();
        if (marks >= 50) {
            return baseResult + " Passed in Science stream.";
        } else {
            return baseResult + " Failed in Science stream.";
        }
    }

    public String calculateResult(int graceMarks) {
        double totalMarks = marks + graceMarks;
        if (totalMarks >= 50) {
            return "Passed in Science with " + graceMarks + " grace marks. Total marks: " + totalMarks;
        } else {
            return "Failed even with grace marks. Total marks: " + totalMarks;
        }
    }
}