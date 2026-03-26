package oop.tp_oop.project_vehicle;

public class Vehicle {
    // Attrirbutes
    String engine;
    int speed;
    int price;

    // Constructor for Veasna
    Vehicle(int price) {
        this.price = price;
        System.out.println("price: " + this.price);   
    }

    // method 1 for Ms.Sorphea
    void accelerate(int speed) {
        this.speed = speed;
        System.out.println("speed: " + this.speed);
    }

    // method 2 for Ms.neath
    void stop() {
        this.speed = 0;
        System.out.println("stop");
    }

    // // method 3 for Ms.Sovanary
    // void decelerate(int speed) {

    // }

    // entry point 
    // ah nis jam me tver
    // ok mak
    
    public static void main(String[] args) {
        Vehicle car_1 = new Vehicle(1000);
        Vehicle car_2 = new Vehicle(1350);
        
        car_1.accelerate(10);
        car_2.accelerate(20);

        car_1.stop();
        car_2.stop();

        car_1.engine = "whatever";
        car_2.engine = "nh jong dek";

        System.out.println(car_1.engine);
        System.out.println(car_2.engine);
    }
}
