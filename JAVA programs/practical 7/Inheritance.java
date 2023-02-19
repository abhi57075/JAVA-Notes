import java.util.Scanner;

class Player{
	String name;
	int age;
	String level;
	String city;
	int no_of_games;
	String type_of_game;
	
	void get_data(){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the name : ");
		name = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the age : ");
		age = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter the level : ");
		level = sc3.nextLine();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Enter the city : ");
		city = sc1.next();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Enter the number of games played : ");
		no_of_games = sc5.nextInt();
		
		Scanner sc6 = new Scanner(System.in);
		System.out.print("Enter the type_of_game played : ");
		type_of_game = sc6.nextLine();
	}
	
	void display() {
		System.out.println("The name of the player is : " + name);
		System.out.println("The age of the player is : " + age);
		System.out.println("The level of the player is : " + level);
		System.out.println("The city of the player is : " + city);
		System.out.println("Total number of games played are : " + no_of_games);
		System.out.println("The type of game played is : " + type_of_game);
	}
}

class Cricket_player extends Player{
	int runs;
	int wickets;
	
	void get_data() {
		super.get_data();
		
		Scanner sc7 = new Scanner(System.in);
		System.out.print("Enter the number of runs scored : ");
		runs = sc7.nextInt();
		
		Scanner sc8 = new Scanner(System.in);
		System.out.print("Enter the number of wickets taken : ");
		wickets = sc8.nextInt();
	}
	
	void display() {
		System.out.println("");
		super.display();
		
		System.out.println("Number of runs scored : " + runs);
		System.out.println("Wickets Taken : " + wickets);
	}
}

class Football_player extends Player{
	int goals;
	
	void get_data() {
		super.get_data();
		
		Scanner sc9 = new Scanner(System.in);
		System.out.print("Enter the number of goals scored : ");
		goals = sc9.nextInt();	
	}
	
	void display() {
		System.out.println("");
		super.display();
		
		System.out.println("Number of goals scored : " + goals);
	}
}

class Hockey_player extends Player{
	int goals;
	
	void get_data() {
		super.get_data();
		
		Scanner sc10 = new Scanner(System.in);
		System.out.print("Enter the number of goals scored : ");
		goals = sc10.nextInt();
	}
	
	void display() {
		System.out.println("");
		super.display();
		
		System.out.println("Number of runs scored : " + goals);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		
		System.out.print("Enter 1 to continue, -1 to exit ");
		Scanner sc11 = new Scanner (System.in);
		byte x = sc11.nextByte();
		
		while (x!=-1) {
			
			System.out.println("\nChoose any one of the three ");
			System.out.println("Enter 1 to access cricket player data");
			System.out.println("Enter 2 to access football player data");
			System.out.println("Enter 3 to access hockey player data");
			
			Scanner sc12 = new Scanner(System.in);
			byte option = sc12.nextByte();
			
			switch(option) {
			case 1 -> {
				Cricket_player c1 = new Cricket_player();
				c1.get_data();
				c1.display();
			}
			case 2 -> {
				Football_player f1 = new Football_player();
				f1.get_data();
				f1.display();
			}
			case 3 -> {
				Hockey_player h1 = new Hockey_player();
				h1.get_data();
				h1.display();
			}
			};
			Scanner sc13 = new Scanner(System.in);
			System.out.print("\nEnter 1 to continue, -1 to exit ");
			x = sc13.nextByte();
		}
	}
}
