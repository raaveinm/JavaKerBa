package PatternFacade;

public class Amplifier {
    private int volume;
    public Source source;


    protected void AmplifierOn(){
        System.out.println("src5.Amplifier has been turned on");
    }

    protected void AmplifierOff(){
        System.out.println("src5.Amplifier has been turned off");
    }

    protected void AmplifierVolume(int volume){
        System.out.println("Volume set to level "+volume);
    }

    protected void SetAudioScheme51(){
        System.out.println("Audio Scheme has been set to 5.1");
    }
    protected void SetAudioSchemeStereo(){
        System.out.println("Audio Scheme has been set to Stereo");
    }

    protected void SetAudioInput(Source source){
        this.source=source;
        System.out.println("Source: "+source);
    }
}