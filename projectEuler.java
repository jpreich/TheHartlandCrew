public class whatTheClass {
	public static void main(String[] args){
		
	}
	
	public static int problemSix(){
		int endNumber = 100;
		int sumSquare = 0;
		int squareSum = 0;
		int tempSum = 0;
		int difference;
		for(int i = 1; i <= endNumber; i ++){
			tempSum += i;
			sumSquare += i * i;
		}
		squareSum = tempSum * tempSum;
		difference = Math.abs(sumSquare - squareSum);
		System.out.println(difference);
		return difference;
	}
	public static void problemSeven(){
		
	}
}
