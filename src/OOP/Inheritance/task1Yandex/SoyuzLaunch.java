package OOP.Inheritance.task1Yandex;

public class SoyuzLaunch extends AbstractRocketLaunch {

    private int check1 = 0;
    private int check2 = 0;

    public SoyuzLaunch() {
        this("Союз-2Б");
    }

    public SoyuzLaunch(String name) {
        super(name);
    }

    @Override
    public void purge(){
        super.purge();
    }


    @Override
    public void preLaunchCheck() {
        check1 = 1;
        check2 = 1;
        super.preLaunchCheck();
    }

}