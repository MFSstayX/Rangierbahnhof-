public class Main {
    public static void main(String[] args) {
        Wagon wagon1 = new Wagon(10); 
        Wagon wagon2 = new Wagon(9); 
        Wagon wagon3 = new Wagon(11); 
        Wagon wagon4 = new Wagon(3); 
        Bahnhof bahnhof = new Bahnhof(); 
        bahnhof.gleisA.push(wagon1); 
        bahnhof.gleisA.push(wagon2); 
        bahnhof.gleisA.push(wagon3); 
        bahnhof.gleisA.push(wagon4); 
        bahnhof.rangieren();
        while(!bahnhof.gleisC.isEmpty()) {
            System.out.println(bahnhof.gleisC.top().getGewicht()); 
            bahnhof.gleisC.pop(); 
        }
    }
}
