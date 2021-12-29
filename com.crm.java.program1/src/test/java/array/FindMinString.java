package array;

public class FindMinString {

	public static void main(String[] args) {
		String str[]= {"abc" ,"cde" ,"apple","mango","abcde"};
		String min=str[0];

		for(int i=0; i<str.length; i++)
		{
			if(min.length()>str[i].length())
			{min=str[i];
			
			}
		}
		for(int j=0; j<str.length; j++)
			{
			if(min.length()==str[j].length());
			
			
		     System.out.print(str[j]+" ");
			}

		}
		}
	
	


