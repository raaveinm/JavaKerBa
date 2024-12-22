package PatternFacade;

public class MainFacade {
    public static void main(String[] args){
        DVDPlayer DVD = new DVDPlayer();
        TVScreen TV = new TVScreen();
        Amplifier AMPLFR = new Amplifier();

        HomeTheaterFacade HomeTheaterRa = new HomeTheaterFacade(DVD,TV,AMPLFR);
        System.out.println();
        HomeTheaterRa.SpotifyMode();
        System.out.println();
        HomeTheaterRa.NetflixMode();
        System.out.println();
        HomeTheaterRa.DVDMode();
        System.out.println();
        HomeTheaterRa.TurnOffEverything();
    }
}