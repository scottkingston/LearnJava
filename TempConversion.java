import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {

      Scanner reader = new Scanner(System.in);

      double fahrenheit;
      double celsius;

//      System.out.print("Enter degrees Fahrenheit: ");

//      fahrenheit = reader.nextDouble();

      System.out.print("Enter degrees Celsius: ");

      celsius = reader.nextDouble();

      //celsius = (fahrenheit-32.0) * 5.0/9.0;
    
      fahrenheit = (celsius * 9.0/5.0) + 32.0;

//      System.out.print("The equivalent in Celsius is: ");
//      System.out.print(celsius);
      System.out.print("The equivalent in Fahrenheit is: ");
      System.out.print(fahrenheit);
  }  
}
