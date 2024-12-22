package PatternFacade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private TVScreen tvScreen;
    private Amplifier amplifier;

    public HomeTheaterFacade(DVDPlayer DVD, TVScreen TV, Amplifier AMPLFR){
        dvdPlayer = new DVDPlayer();
        tvScreen = new TVScreen();
        amplifier = new Amplifier();
    }

    public void SpotifyMode(){
        System.out.println("Prepare to enjoy music");
        amplifier.AmplifierOn();
        amplifier.AmplifierVolume(6);
        amplifier.SetAudioSchemeStereo();
        amplifier.SetAudioInput(Source.OPTICAL);
        tvScreen.TVScreenOn();
        tvScreen.TVScreenLaunchApp(Apps.SPOTIFY);
    }

    public void NetflixMode(){
        System.out.println("Prepare to enjoy movies");
        amplifier.AmplifierOn();
        amplifier.SetAudioSchemeStereo();
        amplifier.AmplifierVolume(7);
        amplifier.SetAudioInput(Source.OPTICAL);
        amplifier.SetAudioScheme51();
        tvScreen.TVScreenOn();
        tvScreen.TVScreenLaunchApp(Apps.NETFLIX);
    }

    public void DVDMode(){
        System.out.println("Prepare to enjoy movies");
        amplifier.AmplifierOn();
        amplifier.SetAudioSchemeStereo();
        amplifier.SetAudioInput(Source.HDMI);
        amplifier.AmplifierVolume(7);
        amplifier.SetAudioScheme51();
        tvScreen.TVScreenOn();
        dvdPlayer.DVDon();
        tvScreen.TVScreenLaunchApp(Apps.DVDPLAYER);
        dvdPlayer.DVDplay();
    }

    public void TurnOnEverything(){
        dvdPlayer.DVDon();
        tvScreen.TVScreenOn();
        amplifier.AmplifierOn();
    }

    public void TurnOffEverything(){
        System.out.println("Turn off everything");
        dvdPlayer.DVDstop();
        dvdPlayer.DVDoff();
        tvScreen.TVScreenOff();
        amplifier.AmplifierVolume(0);
        amplifier.AmplifierOff();
    }
}