package com.dn.dependencyinjection;

import com.dn.dependencyinjection.helper.OSPDrawing;
import com.dn.dependencyinjection.injector.OSPCircle;
import com.dn.dependencyinjection.injector.OSPTriangle;

/**
 * @author muthukumar thangavinayagam
 *
 */
public class OSPDependencyInjectionExample {

	public static void main(String[] args) {
		
		System.out.println(" Dependency Injection Example ");
		
		OSPDrawing drawing=new OSPDrawing();
		
		OSPCircle circle = new OSPCircle();
				  drawing.setShape(circle);
				  drawing.doDraw();
				  
		OSPTriangle triangle = new OSPTriangle();
					drawing.setShape(triangle);
					drawing.doDraw();
		
	}
	
}
