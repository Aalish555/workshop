
public class MathOperators
{
    public static void main(String[] args){
        int sum=10+5;
        int diff=10-5;
        double divide=10/5;
        int number1=10;
        int number2=20;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(divide);
        System.out.println(++number1);
        if(number1>number2)
        {
            System.out.println("number1 is greater than number2");
        }
        else
        {
            System.out.println("number2 is greater than number1");
        }
        String bool=(number2>number1) ? "true" : "false";
        System.out.println(bool);
    }
}