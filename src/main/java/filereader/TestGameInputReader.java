package filereader;

import rounddata.IGameRound;

import java.util.List;

class TestGameInputReader {
    public static void main(String[] args) {
        testFileReaderMethod();
        testMapRoundStringToGameRoundObject();

    }
    private static void testFileReaderMethod(){
        try {
            System.out.println("Testing file reader. Should not throw an exception");
            GameInputReader reader = new GameInputReader("src/main/resources/sampleGameRounds.txt");
            reader.readFile();
        } catch (Exception e) {
            System.out.println("Test failed, exception thrown");
        }
    }

    private static void testMapRoundStringToGameRoundObject() {
        try {
            System.out.println("Testing file reader. Should not throw an exception");
            GameInputReader reader = new GameInputReader("src/main/resources/sampleGameRounds.txt");
            List<IGameRound> testList = reader.mapRoundStringToGameRoundObject();
            System.out.println(String.format("Expect testList to be of size 3.\n We got size: %s", testList.size()));
        } catch (Exception e) {
            System.out.println("Test failed, exception thrown");
        }
    }
}
