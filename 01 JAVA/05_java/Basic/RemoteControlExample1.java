package Basic;

public class RemoteControlExample1 {
    public static void main(String[] args) {
        RemoteControl1 rc;

        rc = new Television1();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio1();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
