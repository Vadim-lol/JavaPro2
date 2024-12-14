import java.util.ArrayList;

public class Main {

    public static double calculateTotalArea(AreaCalculable[] areas) {
        double totalArea = 0;
        for (AreaCalculable area : areas) {
            totalArea += area.calculateArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        AreaCalculable[] areas = {
                new Circle(3),
                new Square(4),
                new Triangle(3, 4, 5)
        };
        System.out.println(calculateTotalArea(areas));


        Participant[] participants = {
                new Human("Alex", 1000, 2),
                new Cat("Snickers", 500, 3),
                new Robot("Terminator", 5000, 1)
        };


        Obstacle[] obstacles = {
                new Treadmill(300),
                new Wall(1),
                new Treadmill(700),
                new Wall(2),
                new Treadmill(1500),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }

}