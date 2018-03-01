import java.util.Random;


public class RandomNumbers {

	public static void main(String[] args) {
		int []tomb = new int[10];
		int []tomb2 = new int[10];
		Random rand = new Random();
		int random;
		
		for(int i=0; i<10; i++){
			random = rand.nextInt(50)+1;
			tomb[i] = random;
		}
		
		
		/*for(int i=0; i<10; i++){
			
			System.out.println("A tomb " + (i+1) +". eleme: " + tomb[i]);
		}*/
		
		//for-each loop
		System.out.println("A tomb elemei: ");
		
		for(int i : tomb){
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++){
			random = (int)(Math.random() * 50) + 1;
			tomb2[i] = random;
		}
		
		System.out.println("\nA 2. tomb elemei: ");
		
		for(int i : tomb2){
			System.out.println(i);
		}
		
		}
	
		

}
