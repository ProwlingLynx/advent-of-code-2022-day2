package filereader;

import java.io.File;
import java.io.FileNotFoundException;
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
}
