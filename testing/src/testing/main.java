package testing;

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		printName();
		printAge();
		printGender();
		printMarital();
		printCitizen();
		printcgpa();
		printPhone();
		printHome();
		printGrade();
		printBirthday();
		printLanguage();
		printAward();
		printExam();
		printWork();
		printSkill();
		

	}

	public static void printName() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your name:");
		String name = in.next();
		System.out.println("name " + name);
	}
	
	public static void printAge() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your age:");
		int age = in.nextInt();
		System.out.println("age " + age);

	}

	public static void printcgpa() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your cgpa:");
		String cgpa = in.next();
		System.out.println("cgpa " + cgpa);

	}
	
	public static void printGrade() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your grade :");
		String grade = in.next();
		System.out.println("grade " + grade);

	}
	
	public static void printGender() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your gender:");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("gender " + gender);

	}
	
	public static void printMarital() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your marital:");
		String marital = in.next();
		System.out.println("marital " + marital);
	}
	
	public static void printCitizen() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your citizen:");
		String citizen = in.next();
		System.out.println("citizen " + citizen);

	}
	
	public static void printPhone() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your phone:");
		String phone = in.next();
		System.out.println("phone " + phone);

	}
	
	public static void printHome() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your home:");
		String home = in.next();
		System.out.println("home " + home);

	}
	
	public static void printAward() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your award");
		String award = in.next();
		System.out.println("award " + award);

	}
	
	public static void printBirthday() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your birthday:");
		String birthday = in.next();
		System.out.println("birthday " + birthday);

	}
	
	public static void printLanguage() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your lan1: ");
		String lan1 = in.next();
		System.out.println("lan1 " + lan1);
		System.out.print("enter your lan2: ");
		String lan2 = in.next();
		System.out.println("lan2 " + lan2);
		System.out.print("enter your lan3: ");
		String lan3 = in.next();
		System.out.println("lan3 " + lan3);	

	}

	public static void printExam() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your exam:");
		String exam = in.next();
		System.out.println("exam " + exam);
	}	
	
	public static void printWork() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your work:");
		String work = in.next();
		System.out.println("work " + work);
	}
	
	public static void printSkill() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("enter your skill:");
		String skill = in.next();
		System.out.println("skill " + skill);
	}

}