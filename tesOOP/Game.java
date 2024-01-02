package tesOOP;

public class Game {
    public static void main(String  args[]){
        Player pemburu = new Player();
        pemburu.name = "Pemburu Kode";
        pemburu.speed = 89;
        pemburu.healthPoin = 100;

        pemburu.run();
        if (pemburu.isDead()) {
            System.out.println("Game Over!!!!!");
        }
    }
}
