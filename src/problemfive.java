import java.util.Scanner;
public class problemfive {
    public static void main(String[] args)throws Exception{
    Scanner st = new Scanner(System.in);
    System.out.println("This is a test, to see if one string appears in another...");
    System.out.println("");
    System.out.println("Please Enter the First String...");
    String strOne = st.nextLine();
    strOne =  strOne.toLowerCase();
    System.out.println("");
    System.out.print("Now Please Enter the Second String...");
    System.out.println("");
    String strTwo = st.nextLine();
    strTwo = strTwo.toLowerCase();
    Boolean testBool = strOne.contains(strTwo);
    System.out.println("We have tested the second string against the first string, the result came back " + testBool);
    }
    
}
