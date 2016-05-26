/*
The MIT License (MIT)
Copyright (c) 2016 Ayumi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import static java.lang.System.*;
import java.awt.Color;

class BlockTestOne
{
	public static void main( String args[] )
	{
		Block one = new Block();
		out.println(one);

		Block two = new Block(50,50,30,30);
		out.println(two);

		Block three = new Block(350,350,15,15,Color.RED);
		out.println(three);

		Block four = new Block(450,50,20,60, Color.GREEN);
		out.println(four);
		
		out.println(one.equals(two));
		out.println(one.equals(one));		
	}
}