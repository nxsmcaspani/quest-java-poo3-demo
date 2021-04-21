public interface Fly {
    void takeOff();
    void fly(String direction, int altitude);
    void land();
    default void glides(){
        System.out.println("It glides into the air");
    }
}
