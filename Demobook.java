package bookatuthar;
import java.util.*;

public class Demobook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		Book[]arr=new Book[3];
		
		
		
		
		String p="NA";
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter bookid");
			 int bid=scan.nextInt();
			System.out.println("Enter title");
			 String title=scan.next();
			System.out.println("Enter id");
			 int id=scan.nextInt();
			System.out.println("Enter name");
			 String name=scan.next();
			 
			 System.out.println("Enter city");
			 String city=scan.next();
			System.out.println("Enter price");
			 float price=scan.nextFloat();
			
			
				
			arr[i] =new Book(bid,title,id,name,city,price);
			 
		}
		
		 
		for(int i=0;i<2;i++) {
			
			if (arr[i].getPrice()>= 0 && arr[i].getPrice()<=500) {
				 
				   p="Low value";
				 
			 }
			 
			 else if (arr[i].getPrice() > 500 && arr[i].getPrice()<=1000)
			 {
				 p="medium Value";
			 }
			 
			 else if (arr[i].getPrice() > 1000)
			 {
				  p="high Value";
			 }
			System.out.println(arr[i]+p);
		}
		
		     
		for(int i=0;i<2;i++) {
			if(arr[i].getCity().equalsIgnoreCase("pune"))
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
