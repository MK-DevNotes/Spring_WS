package com.dn.dependencyinjection;

import com.dn.dependencyinjection.injector.OSPCircle;
import com.dn.dependencyinjection.injector.OSPTriangle;
import com.dn.dependencyinjection.service.OSPShape;

/**
 * @author muthukumar thangavinayagam
 *
 */
public class OSPLooseCouplingExample {
	public static void main(String[] args) {
	
		OSPShape circle = new OSPCircle();
		myDrawMethod(circle);
	
		OSPShape triangle = new OSPTriangle();
		myDrawMethod(triangle);
	}
	
	public static void myDrawMethod(OSPShape shape){
		shape.draw();
	}
}
