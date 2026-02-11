public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
        ;
    }

    public static boolean isPalindrome(int number)
    {
        int newNumber = 0;
        int storeTheNumber = Math.abs(number);

        while(storeTheNumber >= 1)
        {
            for(int i = 1; i < Math.abs(number); i*=10) {
                int rest = storeTheNumber % 10;
                newNumber *= 10;
                newNumber += rest;
                storeTheNumber /= 10;
            }
        }
        if (Math.abs(number) == newNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
