package School;

public class Student extends User implements Talk{
    public boolean verified = true;
    public String major;

    public Student(String firstName, String lastName, boolean verified, String major) {
        super(firstName, lastName);
        this.verified = verified;
        this.major = major;
    }



    @Override
    public void sayHello() {
        System.out.println("My name is " + this.getFullName() + " and my major is " + major + ".");
    }
}
