package Chapter1_Section1;

import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		
		String name = null;
		int age;
		String gender;
		
		Scanner kb = new Scanner(System.in); // ""�� �ѷ��� ���ڿ��� string literal�̶�� �θ���.
		System.out.println("Please type your name and your age and your gender: ");
		
		name = kb.next();	// Ű����κ��� ����(�ܾ�) �Է¹���.
		age = kb.nextInt();	// Ű����κ��� ���� �Է¹���.
		gender = kb.next(); // Ű����κ��� ����(�ܾ�) �Է¹���.
		
		if(gender.equals("male")) // if�� �߰�ȣ ���� ����.
			System.out.println(name + ", you're " + age + "years old man.");
		else if(gender.equals("female"))
			System.out.println(name + ", you're " + age + "years old woman.");
		else
			System.out.println("Hmm... interesting."); // if ~ else if ~ else�� ���� �� ����.
		
		kb.close();
	}

}