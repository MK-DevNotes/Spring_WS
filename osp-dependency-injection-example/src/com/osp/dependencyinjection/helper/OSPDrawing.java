package com.osp.dependencyinjection.helper;

import com.osp.dependencyinjection.service.OSPShape;

/**
 * @author muthukumar thangavinayagam
 *
 */
public class OSPDrawing {

	private OSPShape shape;

	public void setShape(OSPShape shape) {
		this.shape = shape;
	}
	
	public void doDraw(){
		shape.draw();
	}
	
}
