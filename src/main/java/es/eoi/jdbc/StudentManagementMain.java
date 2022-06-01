package es.eoi.jdbc;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.service.StudentService;

import java.util.Date;
import java.util.Scanner;

public class StudentManagementMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Introduce el numero de tu consulta: ");
            String option = sc.nextLine();

            switch (option){
                case "1":
                    System.out.println("Listado de Alumnos");
                    break;
                case "2":
                    System.out.println("Busca Alumno (DNI)");
                    break;
                case "3":
                    System.out.println("Crear Alumno");
                    create();
                    break;
                case "4":
                    System.out.println("Modificar Alumno");
                    break;
                case "5":
                    System.out.println("Elimar Alumno");
                    break;
                case "0":
                    System.out.println("SALIR");
                    return;
                default:
                    System.out.println("Este numero de consulta NO existe");
            }

        }

    }
    public static void create (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Name: ");
        String name = entrada.nextLine();
        System.out.print("Surname: ");
        String surname = entrada.nextLine();
        System.out.print("Birth_date: ");
        Date birth_date = new Date(entrada.nextLine());


        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setBirthDate(birth_date);

        StudentService studentService = new StudentService();
        studentService.create(student);

    }

}