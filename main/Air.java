public class Air extends State{
    public Air(Plane plane) {
        super(plane);
    }

    @Override
    public void exitFromGarage() {
        System.out.println("Действие невозможно! Самолет в воздухе");
    }

    @Override
    public void enterTheGarage() {
        System.out.println("Действие невозможно! Самолет в воздухе");
    }

    @Override
    public void takeoff() {
        System.out.println("Самолет уже в воздухе");
    }

    @Override
    public void land() {
        System.out.println("Самолет приземляется");
        plane.setState(new Track(plane));
    }

    @Override
    public void doAction() {
        System.out.println("Самолет сейчас в воздухе");
    }
}
