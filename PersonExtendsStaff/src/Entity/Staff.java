package Entity;

import java.time.LocalDate;

public class Staff extends Person{
    private String id;
    private String school;
    private double pay;
    private LocalDate dateJoin;
    private Gender gender;

    public Staff(){;}


    public Staff(String name, String address, String id,
                 String school, double pay,
                 LocalDate dateJoin, Gender gender) {
        super(name, address);
        this.id = id;
        this.school = school;
        this.pay = pay;
        this.dateJoin = dateJoin;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public void setName(String Name){
        super.setName(Name);
    }

    public void changeName(String newName) {
        super.setName(newName);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public LocalDate getdateJoin() {
        return dateJoin;
    }

    public void setdateJoin(LocalDate dateJoin) {
        dateJoin = dateJoin;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ",name=" + name +'\' ' +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                ", dateJoin=" + DateJoin +
                ", gender=" + gender +
                ",address=" + address +
                '}';
    }
}
