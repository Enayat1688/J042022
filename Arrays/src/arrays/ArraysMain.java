package arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//int numberOne =5;
		//int numberTwo = 4;
		//int numberThree = 7;
		//int [] arr = {5,4,7};
		//index 0|1|2|
		//length 1|2|3
		//System.out.println(arr[2]); 
		//Strirng[]strArr = { "Mary" "had" "little"};
		//String []strArr = {"Mary,had,little"};
		//char [] charArr = { 'a' 'b' 'c'};
		//double [] dblArr = new double [10];
		//System.out.println (dblArr[1]);
		// intialize an array with random values between 0 to 100
	double[] dblArr = new double [10];
			dblArr[0] = 4.5;
			dblArr[1] = 4.7;
			dblArr[2] = 3.4;
			dblArr[3] = 56.45;
			dblArr[4] = 4.234;
			dblArr[5] = 34.4;
			dblArr[6] = 4.234;
			dblArr[7] = 4.77;
			dblArr[8] = 4.555;
			dblArr[9] = 4.33;
			printArray(dblArr);
	}

    public static void printArray(double[] dblArr) {
	for (int i =0; i < dblArr.length; i ++) {
		System.out.println(dblArr[i] + "|");
}
}
}