package labmid;
import java.util.*;
public class DischargeSlip {
    private double charges;
    private Date date = new Date();
    private int days_in_ward;
    private String medicines;
    public DischargeSlip(int d,String m,double c){
        days_in_ward=d;
        medicines=m;
        charges=c;
    }

    public String getMedicines() {
        return medicines;
    }

    public int getDays_in_ward() {
        return days_in_ward;
    }

    public double getCharges() {
        return charges=charges*days_in_ward;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public void setDays_in_ward(int days_in_ward) {
        this.days_in_ward = days_in_ward;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "DischargeSlip{" +
                "charges=" + charges*days_in_ward +
                ", date=" + date +
                ", days_in_ward=" + days_in_ward +
                ", medicines='" + medicines + '\'' +
                '}';
    }

    public void display(){
        System.out.println("medicines:"+getMedicines()+" days in ward:"+getDays_in_ward()+" charges:"+getCharges());
        System.out.println("Discharge time:"+date);
    }
}
