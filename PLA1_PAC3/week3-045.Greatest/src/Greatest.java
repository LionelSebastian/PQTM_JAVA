
public class Greatest 
{

    public static int greatest(int number1, int number2, int number3)
    {
        int greater =0;
        if (number1>number2&&number1>number3)
        {greater = number1;}
        else if (number2>number1&&number2>number3)
        {greater = number2;}
        else if(number3>number2&&number3>number1)
        {greater = number3;}
        else {greater = number1;}
    return greater;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
