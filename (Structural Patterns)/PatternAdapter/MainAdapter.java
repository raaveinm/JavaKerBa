package PatternAdapter;

public class MainAdapter {
    public static void main(String[] args){
        MP3 PinkFloyd_mp3 = new MP3();
        FLAC PinkFloyd_flac = new FLAC2MP3(PinkFloyd_mp3);
        ((FLAC2MP3) PinkFloyd_flac).PlayMusic();
    }
}