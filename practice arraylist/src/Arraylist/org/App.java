package Arraylist.org;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		App app = new App();
		ArrayList<String> names= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		names.add(s);
		
		app.displaynames(names);

	}
	void displaynames(ArrayList<String> names)
	{
		for(String name:names)
		{
			System.out.print(name+" ");
		}
	}

}
