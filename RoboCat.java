public class RoboCat extends RoboPet{
    
    public RoboCat(String name, int model_number, int battery_level) {
        super(name, model_number, battery_level);
    }

    public void climb(){
        if(getBattery_level() < 10){
            setBattery_level(0);    
        }else{
            System.out.println("Climbing the tree");
            setBattery_level(getBattery_level() - 10);
        }
    

    }
}
