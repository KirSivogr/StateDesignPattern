public abstract class State {
    protected Plane plane;

    public State(Plane plane) {
        this.plane = plane;
    }

    public abstract void exitFromGarage();
    public abstract void enterTheGarage();
    public abstract void takeoff();
    public abstract void land();
    public abstract void doAction();
}
