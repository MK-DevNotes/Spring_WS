package com.osp.tightcoupling.example;

import com.osp.tightcoupling.example.Circle;
import com.osp.tightcoupling.example.Triangle;
//Tight Coupling Between Java Objects

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
