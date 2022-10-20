package School;

public class Teacher extends User implements Talk{
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm a teacher: " + this.getFullName() );
    }

}
