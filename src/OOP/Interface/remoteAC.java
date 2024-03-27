package OOP.Interface;

public class remoteAC {
    public static void main(String[] args) {
        Airconditioner ac = new Airconditioner();
        ac.turnon();
        ac.set_temperature(36);
        ac.set_timer();
        ac.turnoff();
        Bulb bbb = new Bulb();
        bbb.turnon();
        bbb.set_temperatur(-25);
        bbb.turnoff();
    }
}

interface remotecontrol {
    public void turnon();

    public void turnoff();

    default void set_timer() {
        System.out.println("Timer is on");
    }
}

class Airconditioner implements remotecontrol {
    public void turnon() {
        System.out.println("Turning on the AC");
    }
    public void turnoff() {
        System.out.println("Turning off the AC");
    }
    public void set_temperature(int user_temp) {
        System.out.println("Setting the temperature to "+user_temp +" degree celcius");
    }
}

class Bulb implements remotecontrol {
    public void turnon() {
        System.out.println("Turning on the bulb");
    }

    public void turnoff() {
        System.out.println("Turning of the bulb");
    }

    public void set_temperatur(int user_temp) {
        System.out.println("Setting the temperature to " + user_temp + " degree celcius");
    }
}




// java version "20.0.2" 2023-07-18