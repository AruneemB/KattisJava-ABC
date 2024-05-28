import java.util.*;
public class ABC
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] split=nums.split("\\s+");

        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        int num3 = Integer.parseInt(split[2]);

        String order = sc.nextLine();

        int a = Math.min(num1, Math.min(num2, num3));
        int c = Math.max(num1, Math.max(num2, num3));
        int b = 0;
        if(num1 != a && num1 != c)
        {
            b = num1;
        }
        else if(num2 != a && num2 != c)
        {
            b = num2;
        }
        else if(num3 != a && num3 != c)
        {
            b = num3;
        }

        StringBuilder orderedNumbers = new StringBuilder();

        for(int i = 0; i < order.length(); i++)
        {
            char character = order.charAt(i);
            if(character == 'A')
            {
                orderedNumbers.append(a).append(" ");
            }
            if(character == 'B')
            {
                orderedNumbers.append(b).append(" ");
            }
            if(character == 'C')
            {
                orderedNumbers.append(c).append(" ");
            }
        }

        System.out.println(orderedNumbers);
    }
}
