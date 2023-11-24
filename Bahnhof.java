public class Bahnhof{
    private Stack<Wagon> gleisA; 
    private Stack<Wagon> gleisB; 
    private Stack<Wagon> gleisC; 
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
}