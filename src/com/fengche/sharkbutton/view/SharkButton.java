package com.fengche.sharkbutton.view;

import com.fengche.sharkbutton.R;
import com.fengche.sharkbutton.anim.SharkAnim;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

public class SharkButton extends Button {

	private SharkAnim sa;
	private int repeatCount,duration;
	private float offset;
	public SharkButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context,attrs);
	}

	public SharkButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context,attrs);
	}

	public SharkButton(Context context) {
		super(context);
		init(context,null);
	}
	
	private void init(Context context,AttributeSet attrs) {
		if(null!=attrs){
			TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.shark_anim);
			repeatCount = ta.getInteger(R.styleable.shark_anim_repeat_count, 4);
			duration = ta.getInteger(R.styleable.shark_anim_duration, 500);
			offset = ta.getDimension(R.styleable.shark_anim_offset, 30);
			ta.recycle();
		}
		sa = new SharkAnim(repeatCount,offset);
		sa.setDuration(duration);
	}
	
	public void shark() {
		this.startAnimation(sa);
	}
}
