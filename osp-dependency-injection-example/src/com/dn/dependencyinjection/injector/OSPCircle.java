package com.dn.dependencyinjection.injector;

import com.dn.dependencyinjection.service.OSPShape;

/**
 * @author muthukumar thangavinayagam
 *
 */
public class OSPCircle implements OSPShape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" Draw Circle called...");
	}
	
}
