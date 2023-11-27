public class Bahnhof{
    public Stack<Wagon> gleisA; 
    public Stack<Wagon> gleisB; 
    public Stack<Wagon> gleisC; 
public Bahnhof() {
    gleisA = new Stack<Wagon>(); 
    gleisB = new Stack<Wagon>(); 
    gleisC = new Stack<Wagon>(); 
}
public void vonAzuB() {
    gleisB.push(gleisA.top()); 
    gleisA.pop(); 
}
public void vonAzuC() {
    gleisC.push(gleisA.top()); 
    gleisA.pop(); 
}
public void vonBzuA() {
    gleisA.push(gleisB.top()); 
    gleisB.pop(); 
}
public void vonBzuC() {
    gleisC.push(gleisB.top()); 
    gleisB.pop(); 
}
public void vonCzuA() {
    gleisA.push(gleisC.top()); 
    gleisC.pop(); 
}
public void vonCzuB() {
    gleisB.push(gleisC.top()); 
    gleisC.pop(); 
}
public void rangieren() {
    while(!gleisA.isEmpty()) {
        Wagon temp = gleisA.top(); 
        gleisA.pop(); 
        while(!gleisC.isEmpty() && gleisC.top().getGewicht() > temp.getGewicht()) {
            vonCzuA(); 
        }
        gleisC.push(temp);
    }
}
}