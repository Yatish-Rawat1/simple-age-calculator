package bot.java;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class bot{
public static void main(String[]args){
	Date date=new Date();
	DateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
   String formattedDate=dateFormat.format(date);
   System.out.println(formattedDate); 
   int d= Integer.parseInt(formattedDate);
   int toy=d/10000;
   int tom=(d-(toy*10000))/100;
   int tody=(d- ((d/100)*100));
   System.out.println(toy);
   System.out.println(tom);
   System.out.println(tody);
   // Inputing data from the user
   Scanner sc= new Scanner(System.in);
   System.out.println("enter year");
   int fromy=sc.nextInt();
   System.out.println("enter month");
   int fromm=sc.nextInt();
   System.out.println("enter days");
  int fromd=sc.nextInt();
  if(fromd>31|fromm>12)
  {
  if(fromd>31)
  System.out.println("wrong day  entered");
  else if(fromm>12)
  System.out.println("wrong month entered");
  }
  //Calculation of age  		       
	}
}
	
