package bad;


public class Bulb {
    private boolean isOn = false;

    public void toggle(){
        isOn = !isOn; //true nm true wenw nttm false wenw

        if (isOn){
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }
}
