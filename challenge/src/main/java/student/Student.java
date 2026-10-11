package student;

public class Student extends Person {

    private String cne;
    private Major major;

    private static Major computerScience =
            new Major("23", "Computer science");

    public Student() {
        this("", "", "", "", "");
    }

    public Student(String lastName, String firstName,
                   String phone, String email,
                   String cne, Major major) {

        super(lastName, firstName, phone, email);

        this.cne = cne;
        this.major = null;

        setMajor(major);
    }

    public Student(String lastName, String firstName,
                   String phone, String email, String cne) {

        this(lastName, firstName, phone, email,
                cne, computerScience);
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major newMajor) {

        if (major == newMajor) {
            return;
        }

        if (newMajor != null) {

            if (!newMajor.addStudent(this)) {
                return;
            }
        }

        Major oldMajor = major;

        major = newMajor;

        if (oldMajor != null) {
            oldMajor.removeStudent(cne);
        }
    }

    public static Major getComputerScienceMajor() {
        return computerScience;
    }

    public String getFullNameFormatted() {

        return String.format("%s, %s",
                lastName.toUpperCase(), firstName);
    }

    @Override
    public String toString() {
        return cne + " " + lastName + " " + firstName;
    }
}