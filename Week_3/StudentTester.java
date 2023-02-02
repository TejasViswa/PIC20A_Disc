public class StudentTester {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("John","12345");
        s1.addCourses("English", "History", "Mathematics");
        System.out.println(s1);
    }
}
class Student {
    // fields
    public String name;
    public String id;
    public String[] courses;


    // constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // variable arguments - varargs
    public void addCourses(String ... courses)
    {
        this.courses = new String[courses.length];
        for(int i = 0; i < courses.length; i++)
        {
            this.courses[i] = courses[i]; 
        }
    }

    // toString for printing on console
    public String toString()
    {
        return "Name: " + name + ", ID: " + id + ", Courses: " + java.util.Arrays.toString(courses);
    }
}
