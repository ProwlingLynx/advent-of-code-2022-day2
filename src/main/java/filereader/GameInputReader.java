package filereader;

import rounddata.GameRound;
import rounddata.IGameRound;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameInputReader {
    private final Scanner sc;
    public GameInputReader(String fileLocationString) throws FileNotFoundException {
        File file = new File(fileLocationString);
        sc = new Scanner(file);
    }
    public void readFile(){
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
    public List<IGameRound> mapRoundStringToGameRoundObject() {
        List<IGameRound> gameRounds = new ArrayList<>();
        while (sc.hasNext()){
            String roundString = sc.nextLine();
            String elf = roundString.substring(0,1);
            String you = roundString.substring(2, 3);
            gameRounds.add(new GameRound(elf, you));
        }
        return gameRounds;
    }
}
