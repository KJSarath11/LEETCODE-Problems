package Java.constructor;

public class home {
    public static void main(String[] args) {
        
        home h = new home();
        sample s = new sample(); // Now this line will work
    }

    home() {
        System.out.println("Hiii");
    }
}
