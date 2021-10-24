//Tehtud actorite ja moviede näite järgi

public class StudentService {

    public List<Student> mockStudents{
        List<Student> students = new List<Student>;
        Student student = new Student();
        student.setId(1);
        student.setStudentName("Toomas");
        student.setClassNumber("3a");

        Grades grade = new Grades();
        grade.setId(1);
        grade.setDate(DateTime.Now);
        grade.setClassNumber("3a");

        students.Add(student);
            }

}