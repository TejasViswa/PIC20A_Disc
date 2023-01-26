public class StudentTester {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("John","12345");
        s1.addCourses("English", "History", "Mathematics");
        System.out.println(s1);
    }
}
class Student {
    // fields...

    public String name;
    public String id;
    public String[] courses;


    // constructors...

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void addCourses(String ... course)
    {
        this.courses = new String[courses.length];
        for(int i = 0; i < courses.length; i++)
        {
            this.courses[i] = courses[i]; 
        }
    }
//variable arguments - varargs
    public String toString()
    {
        return "Name: " + name + ", ID: " + id + ", Courses: " + java.util.Arrays.toString(courses);
    }
}
