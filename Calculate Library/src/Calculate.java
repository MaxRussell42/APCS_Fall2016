
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
		double pie = 3.14159;
		double halfCircle = 180;
		answer = ((halfCircle / pie)* numb);
		return answer;	
	}
	public static double toRadians(double numb){
		double answer;
		double pie = 3.14159;
		double halfCircle = 180;
		answer = ((numb * pie)/ halfCircle);
		return answer;
	}
	
}