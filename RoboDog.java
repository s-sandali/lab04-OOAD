class RoboDog extends RoboPet{
    
    public RoboDog(String name, int model_number, int battery_level) {
        super(name, model_number, battery_level);
    }

    public void guard(){
        if(getBattery_level() < 10){            
            setBattery_level(0);    
        }else{
            System.out.println("Guarding the house");
            setBattery_level(getBattery_level() - 10);                 
        
    }

    
}
}
