import java.util.Scanner;
public class problemthree {
    public static void main(String[] args)throws Exception{
int numShakes = 0;
Scanner totpeep = new Scanner(System.in);
System.out.println("How many people will be attending the party??");
int numPeople = totpeep.nextInt();
int counter = 0;

while (counter <= numPeople - 1){
	numShakes = numShakes + counter;
	counter++;
	System.out.println("There are now " + counter + " people at the party, and the number of total handshakes is now " + numShakes);
    }
    System.out.println("A total of " + numShakes + " handshakes will take place when " + numPeople + " people attend the party.");
}
}
