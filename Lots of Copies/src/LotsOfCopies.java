
public class LotsOfCopies {
	public static void main(String[]args){
		int num = 7;  						
		System.out.println(num);					//should print the number 7
		String strMain = "APCS";
		System.out.println(strMain);											//displays the word APCS
		int[] arrMain = {1, 2, 3, 4, 5};
		print(arrMain);
	}
	//Method to print arrays
	public static void print(int[] arrMain){
		System.out.print(arrMain[0]);
		for (int i = 1; i < arrMain.length; i++){
			System.out.print(", " + arrMain[i]);
		}
	}
	public static void changeMe(int x, String str, int[] arr){
		
	}
}