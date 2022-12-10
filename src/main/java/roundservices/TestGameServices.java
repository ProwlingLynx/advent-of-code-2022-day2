package roundservices;

import rounddata.GameRound;
import rounddata.IGameRound;

class TestGameServices {
    public static void main(String[] args) {
        testAwardPointsForChosenSign();
    }
    private static void testAwardPointsForChosenSign(){
        IGameRound testRound = new GameRound("C", "Z");
        System.out.println("Expect a value of 3 returned when given elf: Z and you: C");
        System.out.println(GameServices.awardPointsForChosenSign(testRound));
    }
}
