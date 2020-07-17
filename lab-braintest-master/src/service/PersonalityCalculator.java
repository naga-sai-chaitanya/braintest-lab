package service;

public class PersonalityCalculator{
	
	String findYourBrainType(String options) {
		int A,B,X;
		int result_array[]=findAnswers(options);
		for(int i=0;i<result_array.length;i++) {
			if (i%2==0) {
				B+=result_array[i];
			}
			else {
				A+=result_array[i];
			}
		}
		X=66-A+B;
		if(X>=20 && X<=55) {
			return "Left-Brained";
		}
		else if(X>=56 && X<=64) {
			return "No clear preference";
		}
		else if(X>=65 && X<=100) {
			return "Right-Brained";
		}
		
	}
	
	int[] findAnswers(String[] str)
	{
		int ar1[] = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			ar1[i] = Integer.parseInt(str[i]);
		}
		return ar1;
	}
}