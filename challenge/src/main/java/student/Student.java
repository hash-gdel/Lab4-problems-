package student;

public class Student extends Person {
    private String cne;
    private Major major;
    private static Major computerScience = new Major("23", "Computer science");

    public Student() {
        this("", "", "", "", "");
    }

    public Student(String lastName, String firstName, String phone, String email,
                   String cne, Major major) {
        super(lastName, firstName, phone, email);
        this.cne = cne;
        this.major = major;
        if (major != null) {
            major.addStudent(this);
        }
    }

    public Student(String lastName, String firstName, String phone, String email, String cne) {
        this(lastName, firstName, phone, email, cne, computerScience);
    }

    public String getCne() { return cne; }
    public void setCne(String cne) { this.cne = cne; }
    public Major getMajor() { return major; }
    public void setMajor(Major major) {
        if (this.major != null) {
            this.major.removeStudent(cne);
        }
        this.major = major;
        if (major != null) {
            major.addStudent(this);
        }
    }
    public static Major getComputerScienceMajor() { return computerScience; }

    public String getFullNameFormatted() {
        return String.format("%s, %s", lastName.toUpperCase(), firstName);
    }

    @Override
    public String toString() {
        return cne + " " + lastName + " " + firstName;
    }
}