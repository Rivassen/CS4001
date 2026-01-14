package week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Student {
    private int rollNo;
    private String name;
    protected double marks; 
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public String calculateResult() {
        return "Result calculated based on course.";
    }

    @Override
    public String toString() {
        return "Student [Roll No=" + rollNo + ", Name=" + name + ", Marks=" + marks + "]";
    }
}