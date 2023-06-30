import java.util.Scanner;

public class MovieDriver {
public static void main(String[] args) {
	
Scanner myObj=new Scanner(System.in);//creating our scanner object
Movie myMovie=new Movie();//creating our movie object

while(true) {//while loop to get number of movie input
System.out.println("Enter the name of a movie ");//asking user to enter movie name
String title=myObj.nextLine(); // reading in input
myMovie.setTitle(title); 
System.out.println("Enter the rating of the movie");//asking user to enter movie title
String rating=myObj.nextLine(); //reading in input
myMovie.setRating(rating);
System.out.println("Enter the number of tickets sold for this movie");//asking user to enter number of tickets
int soldTickets=Integer.parseInt(myObj.nextLine()); //reading in input
myMovie.setSoldTickets(soldTickets);
System.out.println(myMovie.toString());//printing movie data
System.out.println("Do you want to enter another? (y or n)");
String userChoice =myObj.nextLine(); //reading in input
if(userChoice.equalsIgnoreCase("y"))//if user enters y loop will continue
continue;
else
break;//if user enters n it will break
}

System.out.println("Goodbye");

}


}