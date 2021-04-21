public class Eagle implements Fly {
    private String name;
    private int altitude;

    public Eagle(String name) {
        this.name = name;
        this.altitude = 0;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getName() {
        return name;
    }

    public int getAltitude() {
        return altitude;
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName()+ " takes off in the sky.");
    }

    @Override
    public void fly(String flyDirection, int altitude) {
        this.setAltitude(altitude);
        System.out.println(this.getName()+" flies "+flyDirection+", altitude : "+this.getAltitude());
    }

    @Override
    public void land() {
        if(this.getAltitude() > 1){
            System.out.println(this.getName()+" is too high, it can't lands.");
        } else {
            System.out.println(this.getName()+" lands on the ground.");
        }
    }
}
