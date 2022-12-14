package rounddata;

public class GameRound implements IGameRound{
    private final String elf;
    private String you;
    public GameRound(String elf, String you) {
        this.elf = elf;
        this.you = you;
    }
    public String getElfSign(){ return elf; }
    public String getYourSign(){ return you; }
    public void setYourSign(String newSign){ you = newSign;}
}
