package Basic;

public class SmartTelevision implements RemoteControl2, Searchable{
    @Override
    public void turnOn(){
        System.out.println("TV ON");
    }

    @Override
    public void turnOff(){
        System.out.println("TV OFF");
    }

    @Override
    public void search(String url){
        System.out.println(url + " is on");
    }
}