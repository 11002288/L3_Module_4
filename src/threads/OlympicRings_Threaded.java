package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

		public static void main(String[] args) {
			Robot a = new Robot(700, 700);
			Robot b = new Robot(850, 500);
			Robot c = new Robot(1000, 700);
			Robot d = new Robot(1100, 500);
			Robot e = new Robot(600, 500);
			
			a.setSpeed(10);
			b.setSpeed(10);
			c.setSpeed(10);
			d.setSpeed(10);
			e.setSpeed(10);
			/*&for (int i = 0; i < 180; i++) {
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
			*/
			a.penDown();
			b.penDown();
			c.penDown();
			d.penDown();
			e.penDown();
			a.setPenColor(Color.YELLOW);
			c.setPenColor(Color.GREEN);
			d.setPenColor(Color.red);
			e.setPenColor(Color.BLUE);
			a.setPenWidth(200);
			b.setPenWidth(200);
			c.setPenWidth(200);
			d.setPenWidth(200);
			e.setPenWidth(200);
		   
			for (int i = 0; i < 180; i++) {
				
			
			Thread r1 = new Thread(()->a.move(5));a.turn(2);
			Thread r2 = new Thread(()->b.move(5));b.turn(2);
			Thread r3 = new Thread(()->c.move(5));c.turn(2);
			Thread r4 = new Thread(()->d.move(5));d.turn(2);
			Thread r5 = new Thread(()->e.move(5));e.turn(2);
			
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start(); 
			}
		}
}

