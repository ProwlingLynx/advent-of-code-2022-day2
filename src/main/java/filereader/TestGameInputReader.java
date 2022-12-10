package filereader;

class TestGameInputReader {
    public static void main(String[] args) {
        testFileReaderMethod();

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
}
