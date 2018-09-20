// ToDo List Main Functions
import ToDo.*;
import java.util.Scanner;

public class ToDoList{
	public static void main(String[] args){
		
		final int MAXTODOLIST = 10;
		Scanner inputDevice = new Scanner(System.in);
		char option = 'a';
		String todo = "";
		
		ToDo[] itemList = new ToDo[MAXTODOLIST];
		
		while(true){
		
			option = printMenu();
			
			if(option == 'a'){
				// use for loop to print array
				for(int i = 0; i < ToDo.count; i++){
					System.out.println((i+1) + " TODO: " + itemList[i].getToDo());
				}
			} else if (option == 'b'){
				System.out.print(" Type your todo item: ");
				todo = inputDevice.nextLine();
				int count = ToDo.count;
				itemList[count] = new ToDo(todo);
			} else if (option == 'c'){
				System.out.print(" Which item do you want to mark as done: ");
				int d = inputDevice.nextInt();
				inputDevice.nextLine();
				itemList[(d - 1)].markDone();
			} else if (option == 'd'){
				System.out.println(" You have " + ToDo.count + " ToDo items.");
			} else {
				// Bad option 
			}
		}
	}
	
	private static char printMenu(){
		
		Scanner iDevice = new Scanner(System.in);
		
		System.out.println("****************************");
		System.out.println(" What do you want to do?");
		System.out.println(" a) Show ToDo List");
		System.out.println(" b) Add to ToDo List");
		System.out.println(" c) Mark ToDo Item as done");
		System.out.println(" d) Print count of ToDos");
		System.out.println("*****************************");
		System.out.print(" Choose an option: ");
		char i = iDevice.next().charAt(0);
		iDevice.nextLine();
		
		return i;
	}
}