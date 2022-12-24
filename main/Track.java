public class Track extends State {
    public Track(Plane plane) {
        super(plane);
    }

    @Override
    public void exitFromGarage() {
        System.out.println("Самолет уже на взлетной полосе");
    }

    @Override
    public void enterTheGarage() {
        System.out.println("Самолет вошёл в гараж");
        plane.setState(new Garage(plane));
    }

    @Override
    public void takeoff() {
        System.out.println("Самолет собирается взлететь");
        plane.setState(new Air(plane));
    }

    @Override
    public void land() {
        System.out.println("Самолет уже на взлетной полосе");
    }

    @Override
    public void doAction() {
        System.out.println("Самолет сейчас на взлетной полосе");
    }
}
