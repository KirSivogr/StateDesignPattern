public class Plane {
    private State state;

    public Plane() {
        state = new Garage(this);
    }


    public void exitFromGarage() {
        state.exitFromGarage();
    }


    public void enterTheGarage() {
        state.enterTheGarage();
    }


    public void takeoff() {
        state.takeoff();
    }


    public void land() {
        state.land();
    }


    public void doAction() {
        state.doAction();
    }


    public State getState() {
        return state;
    }


    public void setState(State state) {
        this.state = state;
    }
}
