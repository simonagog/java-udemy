public class Main {
    public static void main(String[] args)
    {
        String name1 = "Tim";
        String name2 = "John";
        String name3 = "James";
        String name4 = "David";
        String name5 = "Mario";
        int score1 = 1500;
        int score2 = 999;
        int score3 = 499;
        int score4 = 99;
        int score5 = 25;

        int scorePosition1 = calculateHighScorePosition(score1);
        int scorePosition2 = calculateHighScorePosition(score2);
        int scorePosition3 = calculateHighScorePosition(score3);
        int scorePosition4 = calculateHighScorePosition(score4);
        int scorePosition5 = calculateHighScorePosition(score5);

        displayHighScorePosition(name1, scorePosition1);
        displayHighScorePosition(name2, scorePosition2);
        displayHighScorePosition(name3, scorePosition3);
        displayHighScorePosition(name4, scorePosition4);
        displayHighScorePosition(name5, scorePosition5);


    }

    public static void displayHighScorePosition(String name, int positionInHighScoreList)
    {
        System.out.println(name + " managed to get into position " + positionInHighScoreList + " on the High Score List");
    }

    public static int calculateHighScorePosition(int score)
    {
        if (score >= 1000)
        {
           return 1;
        }

        else if (score >= 500)
        {
            return 2;
        }
        else if (score >= 100)
        {
            return 3;
        }

        return 4;
    }
}




