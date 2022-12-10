package rounddata;

public class TestGameRound {
    public static void main(String[] args) {
        GameRound round1 = new GameRound("A", "X");
//        expect to see A when we call elf getter and X when we call yourGetter.
//        Should not throw exception
        System.out.println("Elf sign: ");
        System.out.println(round1.getElfSign());
        System.out.println("Your sign: ");
        System.out.println(round1.getYourSign());
    }
}
