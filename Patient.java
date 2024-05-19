package labmid;

public class Patient extends Person {
    private int age;
    private String disease;
    private DischargeSlip slip;

    public Patient(String n,String t,int c,int a,String d){
        super(n,t,c);
        age=a;
        disease=d;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void discharge(int d,String m,double c){
        slip=new DischargeSlip(d,m,c);
        System.out.println(slip.toString());
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Age:"+age+" Disease:"+disease);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name=" + super.getName() +" "+
                "age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }
}
