package team;

public class Employee implements Comparable<Employee> {
    protected String firstName;
    protected String lastName;
    protected String email;

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + email;
    }

    @Override
    public int compareTo(Employee o) {
        if(lastName.compareTo(o.lastName) > 0) {
            return 1;
        } else if(lastName.compareTo(o.lastName) < 0) {
            return -1;
        } else {
            if(firstName.compareTo(o.firstName) > 0) {
                return 1;
            } else if(firstName.compareTo(o.firstName) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
