package student;

public class Test {
    public static void main(String[] args) {
        Major cs = Student.getComputerScienceMajor();
        Major math = new Major("12", "Mathematics");
        Student first = new Student("SAFI", "Amal", "", "", "22885676");
        Student second = new Student("ALAMI", "Samir", "", "", "23585976", cs);
        Student third = new Student("KARIM", "Nora", "", "", "24678910", math);

        System.out.println("The list of students in the computer science major is:");
        cs.displayStudents();
        System.out.println(first.getFullNameFormatted());
        System.out.println("Found: " + cs.findStudentByCNE("22885676"));
        System.out.println("Computer science capacity: 50 students");
        System.out.println("Current enrollment: " + cs.getStudentCount() + " students");
        System.out.printf("Occupancy rate = %.1f%%%n", cs.getOccupancyRate());
        System.out.println("Removed: " + math.removeStudent("24678910"));
        System.out.println("Mathematics enrollment: " + math.getStudentCount());
        System.out.println(cs.getStudentListAsString());

    }
}

