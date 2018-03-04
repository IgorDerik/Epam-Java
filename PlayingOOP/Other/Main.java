package PlayingOOP.Other;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();

        System.out.println(robot.getInfo());

        Robot robot1 = new RobotPlus();

        System.out.println(robot1.getInfo());

        RobotPlus robot2 = new RobotPlus();

        System.out.println(robot2.getInfo());

        Object robotPlus = new RobotPlus();

        System.out.println(robotPlus);

    }

}
