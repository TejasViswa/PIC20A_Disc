# Group Class Exercise

Write a Group class with the following details:
- Attributes/fields
  - group (array of students)
- Behavior/methods
  - constructor (varargs of students)
    - deep copy the students to your group
  - groupByCourse (parameter String course)
    - creates and returns a new group of students with the same course
    - remember you need to create a new array with no gaps or empty slots
  - toString
    - prints all the students in the group

add this group tester class which includes the main method to your class:
```java
public class GroupTester {
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
    }
}
```
