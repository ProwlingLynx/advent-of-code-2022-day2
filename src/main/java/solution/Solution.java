package solution;

import filereader.GameInputReader;
import rounddata.IGameRound;
import roundservices.GameServices;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try{
            GameInputReader gir = new GameInputReader("src/main/resources/firstSolution.txt");
            List<IGameRound> gameRounds = gir.mapRoundStringToGameRoundObject();
            int totalScore = GameServices.calculateTotalScore(gameRounds);
            System.out.println(totalScore);
        } catch (Exception e) {
            System.out.println("Exception Thrown!");
            e.printStackTrace();
        }

    }
}
