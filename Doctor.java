package labmid;

public class Doctor extends Person{
    private String specialization;
    public double fee_per_day;
    public Doctor(String n,String t,int c,String s,double f){
        super(n,t,c);
        specialization=s;
        fee_per_day=f;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getFee_per_day() {
        return fee_per_day;
    }

    public void setFee_per_day(double fee_per_day) {
        this.fee_per_day = fee_per_day;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("specialization:"+specialization+" fee per day:"+fee_per_day);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name=" + super.getName() +" "+
                "specialization='" + specialization + '\'' +
                ", fee_per_day=" + fee_per_day +
                '}';
    }
}
