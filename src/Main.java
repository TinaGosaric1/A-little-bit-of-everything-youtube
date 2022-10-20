import School.Student;
import School.Talk;
import School.Teacher;
import School.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jax", "Nice", false, "Singing");
        Teacher teacher1 = new Teacher("G", "Callen");

        ArrayList<User> allUsers = new ArrayList<User>();
        ArrayList<Talk> thingsThatTalk = new ArrayList<Talk>();
        thingsThatTalk.add(student1);

        allUsers.add(student1);
        allUsers.add(teacher1);

        for(User item : allUsers){
            item.sayHello();
        }
        student1.status = student1.status.probation;
        System.out.println(student1.status);

        switch (student1.status){
            case probation:
                System.out.println("Ouch.");
                break;
            case active:
                System.out.println("Great!");
                break;
            case inactive:
                System.out.println("Come back!");
                break;
        }
    }
}
