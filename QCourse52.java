// Q52. Design a Course class.
//     • Instance variables: courseName, enrolledStudents.
//     • Static variable: maxCapacity, the maximum number of students for any course.
//     • Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
//     • Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.

public class QCourse52 {
    static int maxCapacity;
    String courseName;
    String[] enrolledStudents;
    int enrollments;

    static {
        maxCapacity = 50;
    }

    {
        enrollments = 0;
    }

    QCourse52(String courseName) {
        this.courseName = courseName;
        String[] enrolledStudents = new String[maxCapacity];
    }

    public static void setMaxCapacity(int maxCapacity) {
        QCourse52.maxCapacity = maxCapacity;
    }

    void enrolledStudents(String studentName) {
        enrolledStudents[enrollments++] = studentName;
    }

    void unenrollStudent(String studentName) {
        String[] sarr = new String[enrollments - 1];
        for (int j = 0, i = 0; j < sarr.length; i++) {
            if (enrolledStudents[i] != studentName) {
                sarr[j++] = enrolledStudents[i];
            }
        }
        System.out.println("\nStudent Removed Successfully");
        enrolledStudents = sarr;
    }

}
