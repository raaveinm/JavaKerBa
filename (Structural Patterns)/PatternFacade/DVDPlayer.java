package PatternFacade;

public class DVDPlayer {

    protected void DVDon(){
        System.out.println("DVD has been turned on");
    }

    protected void DVDoff(){
        System.out.println("DVD has been turned off");
    }

    protected void DVDplay(){
        System.out.println("Music is playing");
    }

    protected void DVDstop(){
        System.out.println("Nothing is playing");
    }
}