
public class Calculate {
	
	public static int square(int numb){
		int answer;
		answer = numb * numb;
		return(answer);
	}
	public static int cube(int numb){
		int answer;
		answer = numb * numb * numb;
		return(answer);
	}
	public static double average(double numb){
		double answer;
		answer = ((numb + numb)/ 2);
		return answer;
	}
	public static double average2(double numb){
		double answer;
		answer = ((numb + numb + numb)/ 3);
		return answer;
	}
	public static double toDegrees(double numb){
		double answer;
		answer = ((180 / 3.14159)* numb);
		return answer;	
	}
	public static double toRadians(double numb){
		double answer;
		answer = ((numb * 3.14159)/ 180);
		return answer;
	}
	public static double discriminant(double b, double a, double c){
		double answer;
		answer = ((b * b) - 4 * a * c);
	    return answer;
	}
	public static int toImproperFrac(int numb1, int numb2, int numb3){
		int answer;
		answer = (numb1 * numb2);
		return (answer/numb3);
	}
	public static int toMixedNum(int numb1, int numb2, int numb3){
		int answer;
		answer = (numb1 + numb2)/ numb3;
		return answer;
	}
	public static int foil(int numb1, int numb2, int numb3, int numb4, int numbx){
		int answer;
		answer = ((numb1 * numbx) + numb2) * ((numb3 * numbx) + numb4);
		return answer;
	}
	public static boolean isDivisibleBy(int numb1, int numb2){
		if (numb1 % numb2 == 0){
		return true;
		}
		else{
		System.out.println(numb1 + "is not divisible by" + numb2);
		return false;
		}
	}
	public static double absValue(double numb){
		if (numb < 0){
		double numb2 = numb * -1;
		return numb2;
		}
		else{
			return numb;
		}
	}
	public static int max(int numb1, int numb2){
		if (numb1 > numb2){
			return numb1;
		}
		else{
			return numb2;
		}
	}
 	public static int max2(int numb1, int numb2, int numb3){
 		if (numb1 > numb2 && numb1 > numb3){
 			return numb1;
 		}
 		else{
 			if (numb2 > numb3 && numb2 > numb1);
 			return numb2;
 		}
 		else{
 		    return numb3;
 		}
 		}
	public static double round2(double numb){
		numb = numb + .005;
		double roundNumb = (int)numb * 100;
		return (roundNumb / 100);
		
	}
	public static double exponent(double numb1, int numb2){
		for (int numb3 = 1;numb3 <= numb2;numb3++);
	    numb1 = numb1 * numb1;
	    return numb1;
	}
	public static int factorial(int numb1){
		int solution = 1;
		for(int numb2 = 2; numb2 <= numb1; numb2++){
			solution = solution * numb1;
		}
		return solution;
	}
	public static boolean isPrime(int numb1);
		if(numb1){
			
		}
	//square root algorithm sqrt(n+1)=(sqrt(n)+(num/sqrt(n)))/2.0
		//ex: sqrt5=(sqrt4 + (5/sqrt4))/2 -->
}



