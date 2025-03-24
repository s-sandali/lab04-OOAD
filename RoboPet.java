public class RoboPet {
    private String name;
    private int model_number;
    private int battery_level;

    public RoboPet(String name, int model_number, int battery_level) {
        this.name = name;
        this.model_number = model_number;
        this.battery_level = 100;
            
        } 
    public void setBattery_level(int battery_level) {
           this.battery_level = battery_level;
    }   
        
    public String getName() {
            return name;
        }
    public int getModel_number() {
            return model_number;
        }
    public int getBattery_level() {
            return battery_level;
        }
    public int recharge(){
            battery_level = 100;
            return battery_level;
        }
    public void displayInfor(){
            System.out.println("Name: " + name);
            System.out.println("Model Number: " + model_number);
            System.out.println("Battery Level: " + battery_level+ "%");
    }
}
