package com.cg.iter.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Student;
import com.cg.iter.service.StudentService;

public class StudentMain {
	
	private StudentService studService;
	
		public StudentMain() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("student.xml");
		studService =(StudentService) ctx.getBean("service");
		System.out.println(studService);
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			choice = getChoice(scan);
			switch (choice) {
			case 1:
				System.out.println("Create student");
				System.out.println(" Enter<ID> <Name> <Mobile> <Subject>");
				Student stud = new Student(scan.nextInt(), scan.next(), scan.nextLong(), scan.next());
				boolean success = studService.create(stud);
				if (success) {
					System.out.println("Student Enrolled");
				}
				else {
					System.out.println("student was not enrolled");
				}
				break;
			case 2:
				System.out.println("Find student");
				System.out.println("enter Student id");
				 stud= studService.getStudent(scan.nextInt()) ;
				 if(stud!=null)
				 {
						System.out.println("Student found");
					}
					else 
					{
						System.out.println("Student not found");
					}

				
				break;
			case 3:
				System.out.println("Update student");
				
				System.out.println("Enter student id");
				 stud = studService.getStudent(scan.nextInt()) ;
				if(stud!=null) {
					System.out.println("Author eixst");
					System.out.println("Enter <Name> <Mobile> <Subject>");
					stud.setName(scan.next());
					stud.setMobile(scan.nextLong());
					stud.setSubject(scan.next());
					boolean success1 = studService.update(stud);
					if(success1) 
					{
						System.out.println("Author updated");
					}
					else 
					{
						System.out.println("Author not found");
					}
				}
				break;
			case 4:
				System.out.println("Delete student");
				System.out.println("enter the id to delete");
				stud= studService.getStudent(scan.nextInt()) ;
				boolean success2 = studService.delete(stud);
				if(success2)
				{
					System.out.println("author deleted");
				}else
				{
					System.out.println("author not deleted");
				}
				break;
			case 5:
				System.out.println("Exiting Program...");
				System.exit(0);
				break;

			default:
				System.out.println("enter a number from the given options");
				break;
			}
			}
		}
		private int getChoice(Scanner scan) {
			int choice = 0;
			System.out.println("STUDENT MANAGEMENT");
			System.out.println("1. Create student");
			System.out.println("2. Find student");
			System.out.println("3. Update student");
			System.out.println("4. Delete student");
			System.out.println("5.Exit program");
			System.out.println("choose option");
			try {
				choice = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("please choose a number");
				scan.nextLine();
			}
			return choice;
		}
	
		public static void main(String[] args) {
			new StudentMain();
		}

}
