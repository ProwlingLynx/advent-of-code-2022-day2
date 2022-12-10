package roundservices;

import rounddata.GameRound;
import rounddata.IGameRound;

class TestGameServices {
    public static void main(String[] args) {
        testAwardPointsForChosenSign();
        testAwardPointsForRoundOutcome("A"); // Rock
        testAwardPointsForRoundOutcome("B"); // Paper
        testAwardPointsForRoundOutcome("C"); // Scissors
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
}
