package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

		public static void main(String[] args) {
			Robot a = new Robot(700, 700);
			Robot b = new Robot(850, 500);
			Robot c = new Robot(1000, 700);
			Robot d = new Robot(1200, 500);
			Robot e = new Robot(500, 500);
			
			a.setSpeed(10);
			b.setSpeed(10);
			c.setSpeed(10);
			d.setSpeed(10);
			e.setSpeed(10);
			for (int i = 0; i < 180; i++) {
			a.turn(2);
			a.move(5);
			}
			for (int i = 0; i < 180; i++) {
			b.turn(2);
			b.move(5);
			}
			for (int i = 0; i < 180; i++) {
			c.turn(2);
			c.move(5);
			}
			for (int i = 0; i < 180; i++) {
			d.turn(2);
			d.move(5);
			}
			for (int i = 0; i < 180; i++) {
			e.turn(2);
			e.move(5);
			}
			
		    Thread r1 = new Thread(()->a.move(400));
			Thread r2 = new Thread(()->b.move(400));
			Thread r3 = new Thread(()->c.move(400));
			Thread r4 = new Thread(()->d.move(400));
			Thread r5 = new Thread(()->e.move(400));
			
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start(); 
		}
}

