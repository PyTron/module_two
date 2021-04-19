import java.util.Scanner;
public class problemone {
    public static void main(String[] args) throws Exception {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Please Enter A Number...");
        int userNum = myscan.nextInt();
//convert any negative to 0
        if (userNum < 0){
        userNum = userNum * -1;
        }
//Count the number of digits in the number
        int workingNum = userNum;
        int counter = 0;
        while (workingNum != 0){
            workingNum = workingNum/10;
            counter++;
        }
        System.out.println("The number has " + counter + " digits");
//Count the odd digits of a number
        counter = 0;
        workingNum = userNum;
        while (workingNum != 0){
            if (workingNum % 2 == 0) {
                workingNum = workingNum/10;
            }
            else{
            counter++;
            workingNum = workingNum/10;
            }
        }
        System.out.println("The number your entered has " + counter + " odd digits.");
        
// Calculate the sum of the digit values of the number
        counter = 0;
        workingNum = userNum;
        while (workingNum != 0){
            counter = counter + (workingNum % 10);
            workingNum = workingNum/10;
        }
        System.out.println("The sum value of the digits in the number is " + counter);
        myscan.close();
    }
}
