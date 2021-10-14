package BT4;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    double radius;
    String color = "blue";

    public Fan() {

    }

    public void getON() {
        this.on = true;
    }

    public void getOff() {
        this.on = false;
    }

    public int setSpeed(int a) {
        if (on) {
            if (a == 1) {
                this.speed = SLOW;
            } else if (a == 2) {
                this.speed = MEDIUM;
            } else if (a == 3) {
                this.speed = FAST;
            } else System.out.println("tốc độ không tồn tại !");

        }
        return this.speed;

    }

    public String getSpeed() {
        return "Speed is : " + this.speed;
    }

    public int setRadius(int a) {
        if (on) {
            this.radius = a;
        }
        return (int) this.radius;
    }

    public String getRadius() {
        return "đường kính của quạt là : " + this.radius;
    }

    public String getColor() {

        return "màu của quạt là : " + this.color;
    }

    public String setColor(String a) {
        if (on) {
            this.color = a;
        }
        return this.color;
    }

    public String toString() {
        return "fan if " + this.on + " speed : " + this.speed + " color : " + this.color + " radius : " + this.radius;
    }
}
