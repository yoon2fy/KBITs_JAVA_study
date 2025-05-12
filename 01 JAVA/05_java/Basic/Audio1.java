package Basic;

public class Audio1 implements RemoteControl1 {
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("Turning on");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl1.MAX_VOLUME){
            this.volume = RemoteControl1.MAX_VOLUME;
        } else if(volume < RemoteControl1.MIN_VOLUME){
            this.volume = RemoteControl1.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Volume set to " + volume);
    }
}
