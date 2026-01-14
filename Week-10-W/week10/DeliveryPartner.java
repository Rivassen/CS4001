package week10;


/**
 * Write a description of class Delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class DeliveryPartner {
    private String partnerId;
    private String name;
    private double basePay;

    public DeliveryPartner(String partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }

    public String getPartnerId() { 
        return partnerId; 
    }
    public void setPartnerId(String partnerId) { 
        this.partnerId = partnerId; 
    }
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public double getBasePay() { 
        return basePay; 
    }
    public void setBasePay(double basePay) { 
        this.basePay = basePay; 
    }
    public double calculatePayment() {
        
        return this.basePay;
        
    }

    @Override
    public String toString() {
        
        return "DeliveryPartner [ID=" + partnerId + ", Name=" + name + ", Base Pay=" + basePay + "]";
    
    }
}