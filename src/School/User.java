package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Talk {
    public enum status {active, inactive, probation};
    public status status;     //with enum we created a new type
    private String firstName;
    private String lastName;
    public boolean verified = false;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public void sayHello() {
        System.out.println("This is User class.");
    }

    public static void printUsers(ArrayList<User> allUsers){
        for(User item : allUsers)
            System.out.print(item.getFullName() + "\n");
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.strip(); // strip() method removes white spaces
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static User findUser(ArrayList<User> allUsers, User user){
        for (User item : allUsers){
            if(item.equals(user)){
                return item;
            }
        }
        return null;
    }

    public static int searchList(ArrayList<User> allUsers, User user){
        return searchList(allUsers, user.getFullName());
    }

    public static int searchList(ArrayList<User> allUsers, String firstName, String lastName){
        return searchList(allUsers, firstName + " " + lastName);
    }

    public static int searchList(ArrayList<User> allUsers, String fullName){
        for(int i=0; i< allUsers.size(); i++){
            if(allUsers.get(i).getFullName().equals(fullName)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {     //calls automatically when we try to print an object
        return getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

}
