package roundservices;

import rounddata.IGameRound;

import java.util.HashMap;
import java.util.List;

public final class GameServices {
    private static final HashMap<String, Integer> pointsForYourChosenSign = new HashMap<>();
    private static final HashMap<String, HashMap<String, Integer>> outcomeTree = new HashMap<>();
    static {
        pointsForYourChosenSign.put("X", 1);
        pointsForYourChosenSign.put("Y", 2);
        pointsForYourChosenSign.put("Z", 3);

        outcomeTree.put("A", new HashMap<>());
        var roundA = outcomeTree.get("A");
        roundA.put("X", 3);
        roundA.put("Y", 6);
        roundA.put("Z", 0);
        outcomeTree.put("B", new HashMap<>());
        var roundB = outcomeTree.get("B");
        roundB.put("X", 0);
        roundB.put("Y", 3);
        roundB.put("Z", 6);
        outcomeTree.put("C", new HashMap<>());
        var roundC = outcomeTree.get("C");
        roundC.put("X", 6);
        roundC.put("Y", 0);
        roundC.put("Z", 3);

    }
    public static int awardPointsForChosenSign(IGameRound gameRound){
        return pointsForYourChosenSign.get(gameRound.getYourSign());
    }
}