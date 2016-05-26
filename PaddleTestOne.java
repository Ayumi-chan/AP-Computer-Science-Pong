/*
The MIT License (MIT)
Copyright (c) 2016 Ayumi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import static java.lang.System.*;
import java.awt.Color;

class PaddleTestOne
{
	public static void main( String args[] )
	{
		Paddle one = new Paddle();
		out.println(one);
		
		Paddle two = new Paddle(100,90);
		out.println(two);
		
		Paddle three = new Paddle(100,100,30);
		out.println(three);
		
		Paddle four = new Paddle(100,100,30,50,8);
		out.println(four);
		
		Paddle five = new Paddle(100,100,30,20, Color.GREEN,6);
		out.println(five);
		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}