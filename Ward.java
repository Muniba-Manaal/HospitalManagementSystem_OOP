package labmid;

import java.util.Arrays;

public class Ward {
    private int ward_no;
    private Patient[] patients;
    private Doctor[] doctors;
    public Ward(int w,Patient[] p,Doctor[] d){
        ward_no=w;
        patients=p;
        doctors=d;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public int getWard_no() {
        return ward_no;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setWard_no(int ward_no) {
        this.ward_no = ward_no;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }


    public void display(){
        System.out.println("ward no:"+ward_no+" patients:"+patients.length+" doctors:"+doctors.length);
        System.out.println("============================================================================");
        System.out.println("Patients:");
        System.out.println("===========");
        for (int i=0;i< patients.length;i++){
            System.out.println(patients[i].toString());
        }
        System.out.println("============================================================================");
        System.out.println("Doctors:");
        System.out.println("===========");
        for (int i=0;i< doctors.length;i++){
            System.out.println(doctors[i].toString());
        }
        System.out.println("============================================================================");

    }
}
