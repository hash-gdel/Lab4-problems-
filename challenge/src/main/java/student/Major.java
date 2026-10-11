package student;

public class Major {

    private static int nextId = 1;

    private int id;
    private String code;
    private String name;

    private Student[] students;
    private int studentCount;

    public Major() {
        this("", "");
    }

    public Major(String code, String name) {

        id = nextId++;
        this.code = code;
        this.name = name;

        students = new Student[50];
        studentCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public boolean addStudent(Student s) {

        if (s == null) {
            return false;
        }

        if (studentCount >= 50) {
            System.out.println("The major is full.");
            return false;
        }

        for (int i = 0; i < studentCount; i++) {
            if (students[i] == s) {
                return true;
            }
        }

        students[studentCount] = s;
        studentCount++;

        return true;
    }

    public void displayStudents() {
        System.out.println(getStudentListAsString());
    }

    public Student findStudentByCNE(String cne) {

        for (int i = 0; i < studentCount; i++) {

            if (students[i].getCne().equals(cne)) {
                return students[i];
            }
        }

        return null;
    }

    public boolean removeStudent(String cne) {

        Student found = findStudentByCNE(cne);

        if (found == null) {
            return false;
        }

        for (int i = 0; i < studentCount; i++) {

            if (students[i] == found) {

                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }

                studentCount--;
                students[studentCount] = null;

                if (found.getMajor() == this) {
                    found.setMajor(null);
                }

                return true;
            }
        }

        return false;
    }

    public double getOccupancyRate() {
        return studentCount * 100.0 / 50;
    }

    public String getStudentListAsString() {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < studentCount; i++) {

            result.append(i + 1);
            result.append(". ");
            result.append(students[i].getCne());
            result.append(" ");
            result.append(students[i].getLastName());
            result.append(" ");
            result.append(students[i].getFirstName());
            result.append("\n");
        }

        return result.toString();
    }

    @Override
    public String toString() {
        return id + " " + code + " " + name;
    }
}