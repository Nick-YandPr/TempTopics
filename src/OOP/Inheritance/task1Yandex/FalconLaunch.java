package OOP.Inheritance.task1Yandex;

public class FalconLaunch extends AbstractRocketLaunch {

    private final int engines;

    public FalconLaunch() {
        this("Фалькон-9", 9);
    }

    public FalconLaunch(String name, int engines) {
        super(name);
        this.engines = engines;
    }

    private void orient() {
        System.out.println("Переориентация");
    }

    @Override
    public void liftoff(){
        super.liftoff();
        orient();
    }

    @Override
    public void purge() {
        for (int i = 1; i<=engines; i++){
            System.out.println("Продув двигателя: " + i);
        }
        super.purge();
    }
}