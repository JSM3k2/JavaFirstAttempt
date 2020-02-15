import java.util.*;

public class Main {
    // defining the input from the Scanner class
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {

        CreditCard creditCard1 = new CreditCard();


        System.out.print("Enter the credit card number: ");
        long getInput = getCreditcardNumber();
        //System.out.println("the credit card is : "+getInput);
        System.out.print(getValidCard(getInput));



    }
    public static long getCreditcardNumber()
    {
        long number;
        do
        {
            number = input.nextLong();
        }
        while (number < 0);
        return number;
    }
    public static boolean getValidCard(long cc)
    {
        int sum = 0;
        int count = 0;
        int lastDigit;

        long n = cc;
        while (n > 0)
        {
            lastDigit = (int) (n % 10);
            n /= 10;

            if (count % 2 == 1)
            {
                if (lastDigit >= 5)
                {
                    sum = sum + ((lastDigit * 2) - 9);
                }
                else
                {
                    sum = sum + lastDigit * 2;
                }
            }
            else
            {
                sum = sum + lastDigit;
            }
            //System.out.println("last digit is "+lastDigit+" count is "+count+" and the sum is "+sum);
            count += 1;

        }
        if (sum % 10 == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
