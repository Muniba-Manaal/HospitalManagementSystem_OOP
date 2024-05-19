package labmid;

public class Person {
    private String name;
    private String type;
    private int contact;

    public Person(String n,String t,int c){
        name=n;
        type=t;
        contact=c;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public long getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    public void displayInfo(){
        System.out.println("Name:"+name+" Designation:"+type+" contact:"+contact);
    }
}
