package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student, note;
        student = new Student();
        note = new Student();

        student.name = sc.nextLine();
        note.x = sc.nextDouble();
        note.y = sc.nextDouble();
        note.z = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalArrange(note.x, note.y, note.z));
        note.noteValidation();

        sc.close();

    }

}
