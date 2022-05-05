package com.hcl.crud;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//import java.util.*;


public class StudentImpl {

//	private static final Set<Student> studentSet = new TreeSet<>(new Comparator<Student>() {
//		
//		public int compare(Student o1, Student o2) {
//			return o1.getName().compareTo(o2.getName());
//		}
//		
//	});
	
	private static final Set<Student> studentSet = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		studentSet.add(new Student(1, "Jake", 20));
        studentSet.add(new Student(2, "Logan", 48));
        studentSet.add(new Student(3, "Nathan", 12));
        studentSet.add(new Student(4, "Brandon", 23));
        
        welcome();
        boolean cont = true;
		while(cont) {
			choices();
			int input = scanner.nextInt();
			scanner.nextLine();
			switch(input) {
				case 1:
					addStudent(scanner);
					break;
				case 2:
                    lookUpStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    listStudents();
                    break;
                case 6:
                    cont = false;
                    goodbye();
                    break;
                default:
                    invalidInput();
                    break;
			}
		}
	}
	
	
	private static void welcome() {
        System.out.println("==========Welcome==========");
	}
	
	private static void goodbye() {
		System.out.println("\n==========Goodbye==========");
	}
	
	private static void invalidInput() {
		System.out.println("There was an error with your syntax, please check the command list and try again.");
	}
	
	private static boolean studentExists(int id) {
		for(Student student: studentSet) {
			if(student.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	private static void addStudent(Scanner scanner) {
		System.out.print("Please enter the Student's ID: ");
        int id = scanner.nextInt();
        System.out.print("Please enter the Student's name: ");
        String name = scanner.next();
        System.out.print("Please enter the Student's age: ");
        int age = scanner.nextInt();
        
        if(studentExists(id)) {
        	System.out.println("A student with that ID already exists.");
        	System.out.println();
        }else {
        	Student student = new Student(id, name, age);
        	studentSet.add(student);
        	System.out.printf("Successfully added new student: \n ID: %d, Name: %s, Age: %d\n", student.getId(), student.getName(), student.getAge());
        }
	}
	
	private static void choices() {
		System.out.println("\n==========Main Menu==========");
        System.out.println("Please select from the following (1,2,3,4 or 5):");
        System.out.println("1. Add a new student");
        System.out.println("2. Find an existing student");
        System.out.println("3. Update an existing student");
        System.out.println("4. Delete an existing student");
        System.out.println("5. Print list of all students");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
	}
	
	private static Student getStudentById(int id) {
		if(studentExists(id)) {
			for(Student student: studentSet) {
				if(student.getId() == id) {
					return student;
				}
			}
		}
		return null;
	}
	
	private static boolean isRemoved(int id) {
		if(!(studentExists(id))) {
			return true;
		}
		return false;
	}
	
	private static void deleteStudent(Scanner scanner) {
		System.out.println("*******Delete Student*******");
        System.out.print("Please enter the ID of the student you would like to delete: ");
        int id = scanner.nextInt();
        if(studentExists(id)) {
        	System.out.printf("Are you sure you want to delete the student with the ID of %d? [y/n]\n", id);
        	String input = scanner.next();
        	if(input.equalsIgnoreCase("y")) {
        		studentSet.remove(getStudentById(id));
        		if(isRemoved(id)) {
        			System.out.printf("Successfully removed student %d\n", id);
        		}else {
            		System.out.printf("Student %d was not deleted.\n", id);
        		}
        	}else if(input.equalsIgnoreCase("n")) {
        		System.out.printf("Student %d was not deleted.\n", id);
        	}
        }
	}
	
	private static void lookUpStudent(Scanner scanner) {
		System.out.println("*******Look up Student*******");
        System.out.print("Please enter the Roll Number of the student you want to look up: ");
        int id = scanner.nextInt();
        
        if(studentExists(id)) {
        	Student student = getStudentById(id);
        	System.out.printf("Student #%d is %s and is %d years old.\n", id, student.getName(), student.getAge());
        }else {
        	System.out.println("Student with that ID number does not exist.");
        }
	}
	
	private static void updateStudent(Scanner scanner) {
		System.out.println("*******Update Student*******");
        System.out.println("Please enter the ID of the student you want to update: ");
        int id = scanner.nextInt();
        if(studentExists(id)) {
        	Student student = getStudentById(id);
        	System.out.printf("Student #%d's current name is: %s, and current age is: %d\n", id, student.getName(), student.getAge());
        	System.out.println("Please enter new name: ");
            student.setName(scanner.next());
            System.out.println("Please enter new age: ");
            student.setAge(scanner.nextInt());

            System.out.printf("Successfully updated student #%d with name %s, and age %d", id, student.getName(), student.getAge());
        }else {
        	System.out.printf("Student with ID of: %d could not be found.\n", id);
        }
	}
	
	private static void listStudents() {
		System.out.println("*******Printing Students*******");
		for(Student student: studentSet) {
			System.out.println(student.toString());
		}
	}
	
}
