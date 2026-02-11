public class Main {
    public static void main(String[] args)
    {
        System.out.println(sumOdd(1, 11));
    }
    public static boolean isOdd(int number)
    {
        if (number % 2 != 0 && number > 0)
        {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if (start > 0 && end > 0 && start <= end)
        {
            for (int x = start; x <= end; x++)
            {
                if(isOdd(x))
                {
                    sum += x;
                }
            }
        }
        else
        {
            return -1;
        }
        return sum;
    }

}
