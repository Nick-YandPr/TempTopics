package OOP.Inheritance.task1Yandex;

import java.util.ArrayList;
import java.util.List;

public class ProtonLaunch extends SoyuzLaunch {

    List<SoyuzLaunch> parts = new ArrayList<>();

    public ProtonLaunch() {
        super("Протон-М");
        for (int p = 1; p <= 4; p++) {
            parts.add(new SoyuzLaunch("Протон-М."+p));
        }
    }

    @Override
    public void liftoff(){
        super.liftoff(); // проверка самого Протона
        for (SoyuzLaunch part : parts) {
            part.liftoff(); // проверка каждой части
        }
    }

    @Override
    public void ignition(){
        super.ignition(); // проверка самого Протона
        for (SoyuzLaunch part : parts) {
            part.ignition(); // проверка каждой части
        }
    }


    @Override
    public void purge(){
        super.purge(); // проверка самого Протона
        for (SoyuzLaunch part : parts) {
            part.purge(); // проверка каждой части
        }
    }


    @Override
    public void preLaunchCheck() {
        super.preLaunchCheck(); // проверка самого Протона
        for (SoyuzLaunch part : parts) {
            part.preLaunchCheck(); // проверка каждой части
        }
    }
}