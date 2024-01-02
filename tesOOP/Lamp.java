package tesOOP;

public class Lamp {
    boolean isOn;
    void  turnOn(){
        isOn = true;
        System.out.println("Lampu Menyalah ?"+ isOn);
    }
    void turnOff(){
        isOn = false;
        System.out.println("Lampu Menyalah ?"+ isOn);
    }
}
