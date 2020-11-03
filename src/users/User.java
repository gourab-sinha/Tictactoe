package users;

public class User {
    private String firstName;
    private String lastName;
    private String userHandle;
    public User(String firstName, String lastName, String userHandle){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userHandle=userHandle;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserHandle() {
        return userHandle;
    }
}
