package pl.vistula.exercise12;


public class TrafficLightColor {

    public enum TrafficLight {
        RED,GREEN,YELLOW
    }


    TrafficLight cc= TrafficLight.RED;

    public void ChangeColor(){
        switch (cc){
            case RED:
                cc= TrafficLight.GREEN;
                break;

            case YELLOW:
                cc=TrafficLight.RED;
                break;

            case GREEN:
                cc= TrafficLight.YELLOW;
                break;
        }
    }

    public String toString(){return " "+ cc;}
}

class Task2 {
    public static void main(String[] args) {
        TrafficLightColor aa= new TrafficLightColor();
        for(int i=0;i < 9; i++){
            System.out.println(aa);
            aa.ChangeColor();
        }

    }
}
