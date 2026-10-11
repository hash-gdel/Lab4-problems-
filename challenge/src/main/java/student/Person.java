package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String phone;
    protected String email;

    public Person() {
        this("", "", "", "");
    }

    public Person(String lastName, String firstName, String phone, String email) {
        id = nextId++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
    }

    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return id + " " + lastName + " " + firstName + " " + phone + " " + email;
    }
}

