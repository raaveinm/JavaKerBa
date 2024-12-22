package PatternFacade;

public class TVScreen {
    public Apps app;

    protected void TVScreenOn(){
        System.out.println("src5.TVScreen has been turned on");
    }

    protected void TVScreenOff(){
        System.out.println("src5.TVScreen has been turned off");
    }

    protected void TVScreenLaunchApp(Apps app){
        this.app = app;
        System.out.println(app+" has been launched");
    }
}