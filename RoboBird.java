public class RoboBird extends RoboPet{
    
    public RoboBird(String name, int model_number, int battery_level) {
        super(name, model_number, battery_level);
    }

    public void fly(){
        if(getBattery_level() < 10){
            setBattery_level(0);            ;
        }else{
            System.out.println("Flying");
            setBattery_level(getBattery_level() - 10);
        }
        
    }

    
}