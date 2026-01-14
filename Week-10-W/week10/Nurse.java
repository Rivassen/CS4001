package week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person {
    private String shift;
    private double extraAllowance;

    public Nurse(int id, String name, double salary, String shift, double extraAllowance) {
        super(id, name, salary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getExtraAllowance() {
        return extraAllowance;
    }

    public void setExtraAllowance(double extraAllowance) {
        this.extraAllowance = extraAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + extraAllowance;
    }

    @Override
    public String toString() {
        return "Nurse [id=" + getId() + ", name=" + getName() + ", shift=" + shift + 
               ", extraAllowance=" + extraAllowance + ", totalSalary=" + calculateSalary() + "]";
    }
}