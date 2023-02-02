public class UndergradStudentTester {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("John","12345");
        s1.addCourses("English", "History", "Mathematics");
        Student s2 = new Student("Peter","56789");
        s2.addCourses("Science", "English", "Economics");
        Student s3 = new Student("Elizabeth","12121");
        s3.addCourses("Science", "Art", "French");
        
        Group g1 = new Group(s1,s2,s3);
        System.out.println(g1);
        Group g2 = g1.groupByCourse("Science");
        System.out.println(g2);

        UndergradStudent s4 = new UndergradStudent("Kyle","57575","Economics");
        s4.addCourses("Economics", "History", "Mathematics");
        Group g3 = new Group(s1,s2,s3,s4);
        System.out.println(g3);
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
class UndergradStudent extends Student{
    public String major;

    // constructor
    public UndergradStudent(String name, String id, String major) {
        super(name,id);
        this.major = major;
    }

    public void changeMajor(String major) {
        this.major = major;
    }

    // toString for printing on console
    public String toString()
    {
        return super.toString()+", Major: "+major;
    }
}
class Group {
    // fields
    public Student[] students;


    // varargs constructor
    public Group(Student ... students) {
        this.students = new Student[students.length];
        for(int i=0; i<students.length; i++)
        {
            this.students[i] = students[i];
        }
    }

    // methods
    public Group groupByCourse(String course)
    {
        Student[] studentGroup = new Student[students.length];
        int counter = 0;  // To count effective number of students in the group
        for(int i = 0; i < students.length; i++)
        {
            for(int j = 0; j < students[i].courses.length; j++)
            {
                if(students[i].courses[j] == course)
                {
                    counter++;
                    studentGroup[i] = students[i];
                    break;
                }
            }
        }
        // Second for-loop to get student array without empty slots in between
        Student[] actualGroup = new Student[counter];
        counter = 0;
        for(int i = 0; i < studentGroup.length; i++)
        {
            if(studentGroup[i] != null)
            {
                actualGroup[counter] = studentGroup[i];
                counter++;
            }
            else
            {
                continue;
            }
        }
        
        return new Group(actualGroup);
    }

    // toString for printing on console
    public String toString(){
        return java.util.Arrays.toString(students);
    }
}
