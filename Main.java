import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // crete scanner for user input
    Scanner input= new Scanner(System.in);
final int INTEGERS = 10;
int number = 0;
    //create an array with 10 spots
    double[] user = new double[INTEGERS];
//put integers into the array using a loop
 System.out.println("Please enter in 10 integers into the array");
for(int i =0; i < INTEGERS; i++){
    user[i] = input.nextDouble();
}

// user a for loop to go through the array and find the number
for(int i = 0; i < INTEGERS; i++){
if(INTEGERS > user[i]){
}
  }
  System.out.println("The largest number is " + INTEGERS);

}
}
