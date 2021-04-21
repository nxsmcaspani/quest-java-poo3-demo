public class Nature {

    public static void main(String[] args){
        Eagle eddie = new Eagle("Eddie");
        eddie.takeOff();
        eddie.fly("upward", 120);
        eddie.fly("upward", 150);
        System.out.println("Eddie is flying at "+eddie.getAltitude());
        eddie.glides();
        eddie.fly("downward", 50);
        eddie.land();
        eddie.fly("downward", 10);
        eddie.land();
        eddie.fly("downward", 1);
        eddie.land();
    }

}
