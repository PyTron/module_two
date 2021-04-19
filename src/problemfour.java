import java.util.Random;

import org.graalvm.compiler.lir.aarch64.AArch64Call.DirectCallOp;
public class problemfour {
    public static void main(String[] args)throws Exception{
    int x = 0;
    int y = 0;
    System.out.println("You have a starting point of (0, 0), you will move 100 miles total, moving 1 mile at a time in a random direction...");
    Random movement = new Random();
    int counter = 0;
	while (counter < 100){
	    int randInt = movement.nextInt(4);
        System.out.println("");
        System.out.println("it is mile " + (counter + 1) + ".... you choose a mile at random...");
			if (randInt == 0){
				x = x + 1;
                System.out.println("You randomly decided to travel EAST, and your x Coorinate is now " + x);
            }
			else if (randInt == 1){
				x = x - 1;
                System.out.println("You randomly decided to travel WEST, and your x Coorinate is now " + x);
            }
			else if (randInt == 2){
				y = y + 1;
                System.out.println("You randomly decided to travel NORTH, and your y Coorinate is now " + y);
            }
			else{
                System.out.println("You randomly decided to travel SOUTH, and your y Coorinate is now " + y);
				y = y - 1;
            }
		counter++;
    }
    System.out.println("");
    System.out.println("The final X Coordinate is " + x + " and the final Y coordinate is " + y +".");
    String direction = "";
    if (x == 0)
        direction = "";
        else if(x > 0)
        direction = direction + "EAST";
        else
        direction = direction + "WEST";
    if (y == 0)
        direction = "" + direction;
        else if (y > 0)
        direction = "NORTH" + direction;
        else
        direction = "SOUTH" + direction;
    Double totalDistance;
    totalDistance = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    totalDistance = Math.round(totalDistance * 100.0) / 100.0;
    System.out.println("");
    System.out.println("You traveled a total distance of " + totalDistance + " miles " + direction + " from your starting location.");
    System.out.println("");  
}
    
}
