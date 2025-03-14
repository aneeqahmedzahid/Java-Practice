import java.util.Scanner;

public class Main2 {
    public static class Student {

        int Id;
        float gpa;
        String Name;
        Scanner S = new Scanner(System.in);
        Student()
        {

        }
        void setId() {
            System.out.print("Enter ID: ");
            Id = S.nextInt();
        }
        void setName () {
            System.out.print("Enter Name: ");
            Name = S.nextLine();
        }
        void setGpa () {
            System.out.print("Enter GPA: ");
            gpa = S.nextFloat();
        }

    }

    public static void main(String[] args) {

        Student S = new Student();

        S.setName();
        S.setId();
        S.setGpa();

        System.out.println(S.gpa);
        System.out.println(S.Name);
        System.out.println(S.Id);

    }
}
