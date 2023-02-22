import java.util.*;
public class ClassSection {
    private String subject;
    private int capacity;
    private static int yearLevel;
    public static ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student){
        if (student.getYearLevel() == yearLevel && !(isStudentEnrolled(student)))
            students.add(student);
    }

    public static void removeStudent(Student student){
        students.remove(student);
    }

    public static boolean isStudentEnrolled(Student student){
        for (Student i: students )
            if(i.equals(student)) return true;
       return false;
    }

    @Override
    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students="+students.toString()+"}";
    }
}
