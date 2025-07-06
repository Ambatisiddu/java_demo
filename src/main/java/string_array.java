class Student {
        int rollno;
        String name;
        int marks;
    }
    public class string_array {
        public static void main(String args[])
        {
            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "jay";
            s1.marks = 98;

            Student s2 = new Student();
            s2.rollno = 2;
            s2.name = "Max";
            s2.marks = 69;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name = "Ram";
            s3.marks = 80;

            Student s4 = new Student();
            s4.rollno = 4;
            s4.name = "Jas";
            s4.marks = 80;

            Student students[] = new Student[4];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;
            students[3] = s4;


            for (int i = 0; i < students.length; i++)
            {
                System.out.println(students[i].rollno + "." + students[i].name + " : " + students[i].marks);
            }

        }
    }
