import java.util.Scanner;
public class problemtwo {
    public static void main(String[] args) throws Exception {
    Scanner binary = new Scanner(System.in);
    System.out.print("Enter a binary number 4 digits in length...");
    String binStr = binary.nextLine();
    String binD = "" + binStr.charAt(0);
    Double bitOne = Double.parseDouble(binD);
    binD = "" + binStr.charAt(1);
    Double bitTwo = Double.parseDouble(binD);
    binD = "" + binStr.charAt(2);
    Double bitThree = Double.parseDouble(binD);
    binD = "" + binStr.charAt(3);
    Double bitFour = Double.parseDouble(binD);
    System.out.println(bitOne + " " + bitTwo + " " + bitThree + " " +bitFour);
    int numOne = (int)(bitOne * (Math.pow(2, 3)));
    int numTwo = (int)(bitTwo * (Math.pow(2,2)));
    int numThree = (int)(bitThree * (Math.pow(2,1)));
    int numFour = (int)(bitFour * (Math.pow(2,0)));
    int numFinal = (numOne + numTwo + numThree + numFour);
    System.out.println("The decimal value is " + numFinal);
    binary.close();
}
}