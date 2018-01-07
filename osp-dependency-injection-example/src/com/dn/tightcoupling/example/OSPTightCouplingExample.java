package com.dn.tightcoupling.example;

import com.dn.tightcoupling.example.Circle;
import com.dn.tightcoupling.example.Triangle;

/**
 * @author muthukumar
 *
 */
public class OSPTightCouplingExample {
	public static void main(String[] args) {
		
		Circle circle = new Circle(); 
			   circle.draw();  // <=== Tightly Coupled here
			   
		Triangle triangle = new Triangle();
				triangle.draw(); //<=== Tightly Coupled here
		
	}
}
