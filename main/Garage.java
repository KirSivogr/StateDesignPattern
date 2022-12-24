public class Garage extends State {
    public Garage(Plane plane) {
        super(plane);
    }

    @Override
    public void exitFromGarage() {
        System.out.println("Самолет вышел из гаража");
        plane.setState(new Track(plane));
    }

    @Override
    public void enterTheGarage() {
        System.out.println("Самолет уже в гараже");
    }

    @Override
    public void takeoff() {
        System.out.println("Самолет не может взлететь! Он уже в гараже");
    }

    @Override
    public void land() {
        System.out.println("Самолет не может приземлиться! Он уже в гараже");
    }

    @Override
    public void doAction() {
        System.out.println("Самолет сейчас в гараже");
    }
}
