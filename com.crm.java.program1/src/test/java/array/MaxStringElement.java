package array;

public class MaxStringElement {

	public static void main(String[] args) {
String str[]= {"abc" ,"cde" ,"apple","mango","abcde"};
String max=str[0];

for(int i=0; i<str.length; i++)
{
	if(max.length()<str[i].length())
	{max=str[i];
	
	}
}
for(int j=0; j<str.length; j++)
	{
	if(max.length()==str[j].length())
	
	{
System.out.print(str[j]+" ");
	}

}
}}

