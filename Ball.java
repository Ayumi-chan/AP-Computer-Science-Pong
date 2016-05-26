/*
The MIT License (MIT)
Copyright (c) 2016 Ayumi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		//super(200,200);
		
		super ((int)(Math.random() * 450) + 20, (int)(Math.random() * 450) + 20);
		
		xSpeed = 3;
		ySpeed = 3;
		
		if ((int)(Math.random() * 2) == 1) {
			xSpeed = -1 * xSpeed;
		}
		
		if ((int)(Math.random() * 2) == 1) {
			ySpeed = -1 * ySpeed;
		}
		
		width = 20;
		height = 20;
		   
		   setColor(Color.GREEN);
	}

	//add the other Ball constructors
	
	   
   //add the set methods
   

   public Ball(int i, int j, int k, int l, Color blue) {
		// TODO Auto-generated constructor stub
	   super(i, j);
	   xSpeed = k;
	   ySpeed = l;
	   setColor(blue);
	   width = 20;
	   height = 20;
	}

   public Ball(int i, int j, int k, int l) {
	// TODO Auto-generated constructor stub
	   
	   super(i, j);
	   xSpeed = k;
	   ySpeed = l;
	   
	   width = 20;
	   height = 20;
}

public Ball(int i, int j) {
	// TODO Auto-generated constructor stub
	
	super(i, j);
	width = 20;
	   height = 20;
}

public Ball(int i, int j, int k, int l, Color blue, int m, int n) {
	// TODO Auto-generated constructor stub
	
	 super(i, j);
	   xSpeed = k;
	   ySpeed = l;
	   setColor(blue);

	   width = m;
	   height = l;
}

public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd) {
	super(x, y);
	   xSpeed = xSpd;
	   ySpeed = ySpd;
	   setColor(Color.GREEN);

	   width = wid;
	   height = ht;
}

public void moveAndDraw(Graphics window)
   {
	  setX(getX()+xSpeed);
	  setY(getY()+ySpeed);
	  
	  draw(window, getColor());
   }
   
	public boolean equals(Object obj)
	{
		return this == obj;
	}

	@Override
	public String toString() {
		return "Ball [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	public int getXSpeed() {
		// TODO Auto-generated method stub
		return xSpeed;
	}

	public void setXSpeed(int i) {
		xSpeed = i;
		
	}

	public int getYSpeed() {
		// TODO Auto-generated method stub
		return ySpeed;
	}

	public void setYSpeed(int i) {
		// TODO Auto-generated method stub
		ySpeed = i;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		return getX()<=10;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return getX()>=730;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return getY()<=10;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return getY()>=550;
	}   

   //add the get methods

   //add a toString() method
}