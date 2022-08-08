import java.util.Scanner;

public class RentCar {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		String cars[] = { "Ford, Fiesta, 2015", "Ford, Focus, 2011", "Opel, Astra, 2018", 
				"Opel, Insignia, 2017", "Honda, Civic, 2016", "BMW, 118i, 2015", "BMW, 320d, 2016", 
				"Mercedes, CLK 500, 2007", "Mercedes, S 600, 2010", "Bugatti, Chiron, 2018" }; 
				
		int prices[] = { 100, 150, 180, 200, 170, 230, 260, 250, 280, 500 }; 
		int counts[] = { 10, 3, 5, 2, 4, 3, 2, 4, 2, 1 }; 
		
		String brands [] = new String[10];
		String models [] = new String[10];
		String years [] = new String[10];
		
		for (int a=0; a<=9; a++) {
			brands[a] = cars[a].substring(0,cars[a].indexOf(","));
		}
		
		for (int b=0; b<=9; b++) {
			models[b] = cars[b].substring(cars[b].indexOf(",")+2,cars[b].lastIndexOf(","));
		}
		
		for (int c=0; c<=9; c++) {
			years[c] = cars[c].substring(cars[c].lastIndexOf(",")+2,cars[c].length());
		}
		
		int sinir =10;
		
		System.out.println("Welcome to Rent a Car Company");
		System.out.println("1 View All");
		System.out.println("2 View Available");
		System.out.println("3 View Brands");
		System.out.println("4 View By Price");
		System.out.println("5 Rent");
		System.out.println("6 Return");
		System.out.println("7 Exit");
		System.out.println("Operation:");
		int oprtn = key.nextInt();
		
		while (oprtn>=1 && oprtn != 7) {
					
			if (oprtn==1) {
				for (int a=0; a<10; a++) {
					System.out.println((a+1) + "-" + brands[a] +" "+ models[a] + " (" + prices[a] + " TL)");
				}
			}
			
			else if (oprtn==2) {
				for (int a=0; a<10; a++) {
					System.out.println((a+1) + "-" +brands[a]+" "+models[a]+ " (" +prices[a]+ " TL)" + " - "+ counts[a]+" available.");
				}
			}
			
			else if (oprtn==3) {
				for (int i = 0 ; i < brands.length ; i++){
				int simile = 0;
				
					for (int j = 0 ; j < i ; j++) {
						if (brands[i].equals(brands[j])) {
							simile = 1;
							break;
						}
					}
					if (simile == 0) {
						System.out.println(brands[i]);
					}
				}
			}
			
			else if (oprtn==4) {
				System.out.println("Enter minimum and maximum prices: ");
				int min = key.nextInt();
				int max = key.nextInt();
				int i = 1;
				
				if (min>500 || max<100) {
					System.out.println("No cars found between these prices!");
				}
				
				for (int a=0; a<10; a++) {
					if (prices[a]>=min && prices[a]<=max) {
						System.out.println(i +"-"+ brands[a] + " "+models[a] + " (" +prices[a]+ " TL)");
						i++;
					}
				}
				
				
			}
			
			else if (oprtn==5) {
				int i=1;
				for (int a=0; a<10; a++) {
					
					if (counts[a]!=0) {
					System.out.println((i) + "-" +brands[a]+" "+models[a]+ " (" +prices[a]+ " TL)");
					i++;
					}
				}
				System.out.println("Please select a car to rent: ");
				int num = key.nextInt();
				
				if (num>=0 && num<=cars.length) {
					if (counts[num-1]>0 && counts[num-1]!=0) {
						System.out.println("You have rented " +brands[num-1]+" "+models[num-1] + " (" +years[num-1]+"). Daily price is "+prices[num-1]+" TL.");	
						counts[num-1]--;
					}
					else {
						System.out.println("No cars available.");
					}
					
				}
				else {
					System.out.println("Wrong car no!");					
				}
			}
			
			else if (oprtn==6) {
				for (int a=0; a<10; a++) {
					System.out.println((a+1) + "-" +brands[a]+" "+models[a]+ " (" +prices[a]+ " TL)");
				}
				
				System.out.println("Please select a car to return: ");
				int num = key.nextInt();
				
				if (num>=0 && num<=cars.length) {
				System.out.println("You have returned " +brands[num-1]+" "+models[num-1] + " ("+years[num-1]+"). Thank you for choosing our company.");
				counts[num-1]++;
				}
				else {
					System.out.println("Wrong car no!");
				}
			}
			
			else if (oprtn>7) {
				System.out.println("Invalid input. Please try again.");
			}
			
			System.out.println();
			System.out.println("1 View All");
			System.out.println("2 View Available");
			System.out.println("3 View Brands");
			System.out.println("4 View By Price");
			System.out.println("5 Rent");
			System.out.println("6 Return");
			System.out.println("7 Exit");
			System.out.println("Operation:");
			oprtn = key.nextInt();
						
		}
		
		if (oprtn==7) {
			System.out.println("Good bye.");
		}
		
		
	}

}














