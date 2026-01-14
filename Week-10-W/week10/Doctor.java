package week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int id, String name, double salary, String specialization, double consultationFee) {
        super(id, name, salary); 
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (consultationFee * 10); 
    }

    @Override
    public String toString() {
        return "Doctor [id=" + getId() + ", name=" + getName() + ", specialization=" + specialization + 
               ", consultationFee=" + consultationFee + ", totalSalary=" + calculateSalary() + "]";
    }
}