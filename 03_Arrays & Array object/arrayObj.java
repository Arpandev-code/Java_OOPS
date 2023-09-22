class student{
    int roll;
    String name;
    int marks;
}

public class arrayObj {
    public static void main(String[] args) {
     student s1= new student();
     s1. roll=12;
     s1.name="Arpandev";
     s1.marks=90;

     student s2= new student();
     s2. roll=10;
     s2.name="Panda";
     s2.marks=80;
     
     student s3= new student();
     s3. roll=13;
     s3.name="Sudipa";
     s3.marks=81;

    student students[]= new student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;
    // for(int i=0;i<student.length;i++){
    //     System.out.println(students[i].name + " : " +students[i].marks);
    // }
    for(student stu: students){
        System.out.println(stu.name +":"+ stu.marks);
    }
    }
}
