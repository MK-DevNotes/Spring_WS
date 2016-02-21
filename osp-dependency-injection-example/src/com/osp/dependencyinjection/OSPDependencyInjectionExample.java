package com.osp.dependencyinjection;

import com.osp.dependencyinjection.helper.OSPDrawing;
import com.osp.dependencyinjection.injector.OSPCircle;
import com.osp.dependencyinjection.injector.OSPTriangle;

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
