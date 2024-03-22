package Day7_Innerclasses;

import java.awt.Rectangle;

import Day7_Innerclasses.Shape.Circle;
import Day7_Innerclasses.Shape.Drawable;

interface Shape
  {
	
	interface Drawable  
	{
		void draw();
		
	}
	class Circle implements Drawable
	{

		@Override
		public void draw() {
             System.out.println("painting");			
		}
		class Rectangle implements Drawable
		{

			@Override
			public void draw() {
	             System.out.println("Art");			

			}
			
		}
	
		
	}
  }
public class Lavanya_program7 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Rectangle r= new Rectangle();
		// ((Drawable) r).draw();
	}

}
