package Robot;

public class RobotMain {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.work();

        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();

        System.out.println("----------------------------");

        Robot[] array = new Robot[4];
        array[0] = robot;
        array[1] = coffeRobot;
        array[2] = robotDancer;
        array[3] = robotCoocker;

        for (int i = 0; i < 4; i++) {
            array[i].work();
        }
    }
}
