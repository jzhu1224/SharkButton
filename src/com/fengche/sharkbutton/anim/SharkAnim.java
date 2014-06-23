package com.fengche.sharkbutton.anim;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public class SharkAnim extends Animation {
	
	private int repeatCount;
	private float offset;
	public SharkAnim(int repeatCount,float offset) {
		this.repeatCount = repeatCount;
		this.offset = offset;
	}
	@Override
	public void initialize(int width, int height, int parentWidth,
			int parentHeight) {
		super.initialize(width, height, parentWidth, parentHeight);
	}
	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		t.getMatrix().setTranslate((float)Math.sin(repeatCount*interpolatedTime*2*Math.PI)*offset, 0);
		super.applyTransformation(interpolatedTime, t);
	}
}
