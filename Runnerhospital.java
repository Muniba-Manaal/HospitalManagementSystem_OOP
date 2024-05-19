package labmid;

public class Runnerhospital {
    public static void main(String[] args) {
        Patient p1=new Patient("Alia","patient",923453663,34,"blood cancer");
        Patient p2=new Patient("Farhan","patient",923411123,41,"diabetes");
        Patient p3=new Patient("Aslam","patient",926666663,17,"low bp");
        Patient p4=new Patient("Arham","patient",923453663,34,"brain tumor");
        Patient []p={p1,p2,p3};
        Patient []p_1={p4};


        Doctor d1=new Doctor("Irum","doctor",92567388,"neurologist",3000);
        Doctor d2=new Doctor("Haris","doctor",92567388,"Hematologist-oncologist",7000);
        Doctor d3=new Doctor("Inam","doctor",92567399,"pediatrician" + "",2000);
        Doctor []d={d2,d3};
        Doctor []d_1={d1};

        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();
        System.out.println("            Patient");
        System.out.println("*************************");
        p1.displayInfo();
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();
        System.out.println("            Doctor");
        System.out.println("*************************");
        d2.displayInfo();
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("                        slip");
        System.out.println("--------------------------------------------------------------------");
        DischargeSlip dis1=new DischargeSlip(3,"Busulfex(Busulfan)",d2.fee_per_day);
        dis1.display();
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("*********************");
        System.out.println("ward");
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();
        Ward w1=new Ward(1,p,d);
        w1.display();
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();


        System.out.println("*********************");
        System.out.println("ward");
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();
        Ward w2=new Ward(2,p_1,d_1);
        w2.display();
        System.out.print("____________________________________________________________________");
        System.out.print("____________________________________________________________________");
        System.out.println();

        System.out.println("Discharges");
        System.out.println("____________________________________________________________________");
        p2.discharge(2,"risek",1500.45);
        p1.discharge(1,"xyz",1200.5);



    }

}
