
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
	public static double average(double numb){
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
	public static int toImproperFrac(int whole, int numerator, int denominator){
		
	}
		
}
