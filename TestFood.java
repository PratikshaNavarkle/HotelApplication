import java.util.*;
public class TestFood
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Food f=null;
		int ch=0;
		do
		{
		System.out.println("Menu Card: 1.Veg Food  \n 2.Non-Veg Food");
		System.out.println("\n Enter your choice");
		ch=sc.nextInt();
		if(ch==1)
		{
			do
			{
			System.out.println("--------------VEG MENU--------------");
			System.out.println("1.Pavbhaji\n 2.Dosa");
			Veg v=new Pavbhaji();
			v.price();
			v=new Dosa();
		    v.price();
			System.out.println("If you want to order,Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				f=new Pavbhaji();
				f.receipe();
				break;
			case 2:
				f=new Dosa();
				f.receipe();
				break;
			}
			System.out.println("Do you want to continue with veg menu? press 1 ");
			ch=sc.nextInt();
			}while(ch==1);
		}
		else if(ch==2)
		{
			do
			{
			System.out.println("------------------NON-VEG MENU-----------------");
			System.out.println("1.Butter Chicken \n 2.Biryani");
			NonVeg n=new ButterChicken();
			n.price1();
			n=new Biryani();
			n.price1();
			System.out.println("Do yo want to order, Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				f=new ButterChicken();
				f.receipe();
				break;
			case 2:
				f=new Biryani();
				f.receipe();
				break;
			}
			System.out.println("Do you want to continue with non veg menu? press 1");
			ch=sc.nextInt();
			}while(ch==1);
		}
		System.out.println("Do you want to change menu press 1");
		ch=sc.nextInt();
		}while(ch==1);
		
	}

}
