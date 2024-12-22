package PatternAdapter;

public class FLAC2MP3 extends FLAC {
    private MP3 mp3;

    public FLAC2MP3 (MP3 mp3){
        this.mp3 = mp3;
    }

    public void PlayMusic(){
        System.out.println("Converted Flac 2 MP3 successfully");
        mp3.playMP3();
    }
}