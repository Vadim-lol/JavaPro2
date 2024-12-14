abstract class Participant {

    protected String name;

    protected int maxRun;

    protected int maxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Учасник " + name + " пробіг " + distance + " метрів.");
        } else {
            System.out.println("Учасник " + name + " не зміг пробігти " + distance + " метрів.");
        }
    }

    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Учасник " + name + " перестрибнув " + height + " метрів.");
        } else {
            System.out.println("Учасник " + name + " не зміг перестрибнути " + height + " метрів.");
        }
    }
}
