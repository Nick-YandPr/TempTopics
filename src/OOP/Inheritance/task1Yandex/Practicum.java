package OOP.Inheritance.task1Yandex;

public class Practicum {
    //этот класс нельзя изменять
    public static void main(String[] args) {
        SoyuzLaunch sol = new SoyuzLaunch();
        sol.executeLaunchSequence();
        System.out.println();

        ProtonLaunch pro = new ProtonLaunch();
        pro.executeLaunchSequence();
        System.out.println();

        FalconLaunch falcon = new FalconLaunch();
        falcon.executeLaunchSequence();
        System.out.println();

        StarshipLaunch starship = new StarshipLaunch();
        starship.executeLaunchSequence();
    }

}