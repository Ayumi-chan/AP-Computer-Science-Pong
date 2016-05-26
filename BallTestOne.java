/*
The MIT License (MIT)
Copyright (c) 2016 Ayumi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import static java.lang.System.*;
import java.awt.Color;

class BallTestOne
{
	public static void main( String args[] )
	{
		Ball one = new Ball();
		out.println(one);
		
		Ball two = new Ball(100,90);
		out.println(two);
		
		Ball three = new Ball(100,100,30,50);
		out.println(three);
		
		Ball four = new Ball(100,100,30,50,Color.BLUE);
		out.println(four);
		
		Ball five = new Ball(100,100,30,50,Color.BLUE,5,6);
		out.println(five);
		
									//x, y, wid, ht, color, xSpd, ySpd
		Ball six = new Ball(100,100,30,50,Color.blue,5,6);
		out.println(six);		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}