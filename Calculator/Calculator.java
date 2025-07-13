import java.util.*;

class Calculator{
    public static void main(String args[]){
        int result;
        System.out.println(" ------ Welcome To Calculator App ------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = sc.nextInt();

         System.out.print("Select Operation (+, - , * , % , /) : ");
         char operation = sc.next().charAt(0);

         switch (operation) {
            case '+' :
                result = firstNumber + secondNumber;
                System.out.println("Result is : " + result);
                break;

                 case '-' :
                result = firstNumber - secondNumber;
                System.out.println("Result is : " + result);
                break;

                case '*' :
                result = firstNumber * secondNumber;
                System.out.println("Result is : " + result);
                break;

                case '/' :
                result = firstNumber / secondNumber;
                System.out.println("Result is : " + result);
                break;

                case '%' :
                result = firstNumber % secondNumber;
                System.out.println("Result is : " + result);
                break;
         
            default:
            System.out.println("Invalid Syntax");
                break;
         }
    }
}