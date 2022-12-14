package roundservices;

import rounddata.GameRound;
import rounddata.IGameRound;

import java.util.ArrayList;
import java.util.List;

class TestGameServices {
    public static void main(String[] args) {
//        testAwardPointsForChosenSign();
//        testAwardPointsForRoundOutcome("A"); // Rock
//        testAwardPointsForRoundOutcome("B"); // Paper
//        testAwardPointsForRoundOutcome("C"); // Scissors
//        testCalculateTotalScore();
        testRigGame();
    }
    private static void testAwardPointsForChosenSign(){
        IGameRound testRound = new GameRound("C", "Z");
        System.out.println("Expect a value of 3 returned when given elf: C and you: Z");
        System.out.println(GameServices.awardPointsForChosenSign(testRound));
    }
    private static void testAwardPointsForRoundOutcome(String elf) {
        IGameRound testRound1 = new GameRound(elf, "Z"); // You choose Scissors
        IGameRound testRound2 = new GameRound(elf, "Y"); // You choose Paper
        IGameRound testRound3 = new GameRound(elf, "X"); // You choose Rock
        System.out.println("When elf chose: " + elf);
        System.out.println("You chose Scissors points for the round are:");
        System.out.println(GameServices.awardPointsForRoundOutcome(testRound1));
        System.out.println("You chose Paper points for the round are:");
        System.out.println(GameServices.awardPointsForRoundOutcome(testRound2));
        System.out.println("You chose Rock points for the round are:");
        System.out.println(GameServices.awardPointsForRoundOutcome(testRound3));
    }
    private static void testCalculateTotalScore() {
        List<IGameRound> gameRounds = new ArrayList<>();
        gameRounds.add(new GameRound("A", "X"));
        int actual = GameServices.calculateTotalScore(gameRounds);
        System.out.println("We got: " + actual);
        System.out.println("We expected 4");
    }
    private static void testRigGame() {
        List<IGameRound> gameRounds = new ArrayList<>();
        gameRounds.add(new GameRound("A", "Y"));
        gameRounds.add(new GameRound("B", "X"));
        gameRounds.add(new GameRound("C", "Z"));

        GameServices.rigGame(gameRounds);
        int actual = GameServices.calculateTotalScore(gameRounds);
        System.out.println("We got: " + actual);
        System.out.println("We expected 12");
    }
}
