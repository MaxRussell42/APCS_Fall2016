
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
		answer = ((numb1 * numbx) + numb2) * (numb3 * numbx) + numb4));
		return answer;
	}
	public static int isDivisibleBy(int numb1, int numb2){
		if (numb1 % numb2 == 0){
		System.out.println(numb1 + "is divisible by" + numb2);
		return numb1;
		}
		else{
		System.out.println(numb1 + "is not divisible by" + numb2);
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
 		if (numb1 > numb2 && numb3){
 			return numb1;
 		}
 		else{
 			(numb2 > numb3 && numb 1);
 			return numb2;
 		}
 		}
	public static double round2(double numb){
		answer = numb * 100;
		
		
	}
	public static int (int numb1, int numb2)
}



