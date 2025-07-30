public class Main {
    public static void main(String[] args) {
        RoboCat cat1 = new RoboCat("Harry", 123, 100);
        RoboDog dog1 = new RoboDog("Bruno", 456, 100);
        RoboBird bird1 = new RoboBird("Tweety", 789, 100);

        cat1.displayInfor();
        dog1.displayInfor();
        bird1.displayInfor();

        cat1.climb();
       System.out.printf("Battery level: %d%n", cat1.getBattery_level());
       dog1.guard();
       bird1.fly();
       System.out.printf("Battery level: %d%n", bird1.getBattery_level());

    
}
}
