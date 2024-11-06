package Employee;

public class Teacher extends Employee{
    private Subject subject;
    private double coefficientsSalary;
    private double salary;
    private int numberOfTeachingHours;

    public Teacher() {
    }

    public Teacher(int code, String surname, String name, Date dateOfBirth, int yearWorking, Subject subject, double coefficientsSalary, double salary, int numberOfTeachingHours) {
        super(code, surname, name, dateOfBirth, yearWorking);
        this.subject = subject;
        this.coefficientsSalary = coefficientsSalary;
        this.salary = salary;
        this.numberOfTeachingHours = numberOfTeachingHours;
    }

    public void input(){

    }

    public void output(){
        System.out.println("Doi tuong" + subject);
        System.out.println("He so luong" + coefficientsSalary);
        System.out.println("Luong" + salary);
        System.out.println("So gio lam viec" + numberOfTeachingHours);
    }

    public void calcuSalary(){
        salary = coefficientsSalary * 1150000 + numberOfTeachingHours *60000;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfTeachingHours() {
        return numberOfTeachingHours;
    }

    public void setNumberOfTeachingHours(int numberOfTeachingHours) {
        this.numberOfTeachingHours = numberOfTeachingHours;
    }
}
