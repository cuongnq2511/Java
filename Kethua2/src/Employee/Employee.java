package Employee;

public class Employee {
    protected int code;
    protected String surname;
    protected String name;
    protected Date dateOfBirth;
    protected int yearWorking;

    public Employee() {
    }

    public Employee(int code, String surname, String name, Date dateOfBirth, int yearWorking) {
        this.code = code;
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.yearWorking = yearWorking;
    }

    public void input(){

    }

    public void output(){
        System.out.println("Ma la " + code);
        System.out.println("Ho la " + surname);
        System.out.println("ten la" + name);
        System.out.println("Ngay lam viec" + dateOfBirth);
        System.out.println("Nam lam viec " + yearWorking);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYearWorking() {
        return yearWorking;
    }

    public void setYearWorking(int yearWorking) {
        this.yearWorking = yearWorking;
    }
}
