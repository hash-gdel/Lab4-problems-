package Instructor;

public class Subject {
    private String code;
    private String title;
    private Instructor instructor;

    public Subject() {
        this("", "", null);
    }

    public Subject(String code, String title, Instructor instructor) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public String normalizedCode() {
        return code.trim().toUpperCase();
    }

    public String properTitle() {
        String[] words = title.trim().split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += words[i].substring(0, 1).toUpperCase();
                result += words[i].substring(1).toLowerCase();
            }
        }
        return result;
    }

    public boolean isIntroCourse() {
        return title.toLowerCase().contains("intro") || normalizedCode().startsWith("INTRO-");
    }

    public String syllabusLine(Instructor teacher) {
        StringBuilder line = new StringBuilder();
        line.append(code).append(" - ").append(title);
        line.append(" (Instructor: ").append(teacher.getLastName());
        line.append(" ").append(teacher.getFirstName()).append(")");
        return line.toString();
    }

    @Override
    public String toString() {
        return code + " " + title;
    }
}
