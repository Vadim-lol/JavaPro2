public class Treadmill extends Obstacle {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
         participant.run(distance);
    }

}
