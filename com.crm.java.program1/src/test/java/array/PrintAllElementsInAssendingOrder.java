package array;

public class PrintAllElementsInAssendingOrder {

	public static void main(String[] args) {
int a[]= {20,30,60,50,40};

for(int i=0; i<a.length; i++)
{
	for(int j=1+i; j<a.length; j++)

	
	
   {  if(a[i]>a[j])
	   {
	     int temp=a[i];
	
	     a[i]=a[j];
	     a[j]=temp;
	   }
	}

System.out.print(a[i]+" ");
}
}}
