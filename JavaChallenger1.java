package week2.day2;

public class JavaChallenger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello@World";
		String iArray[] = input.split("@");
		int ilength = iArray.length-1;
		String output = iArray[ilength];
		int lenthofoutput = output.length();
		System.out.println(output);
		System.out.println(lenthofoutput);

	}

}
