package structural;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class simpleShapes {
	public static void main(String[] args) {
		Shape tri = new triangle();
		Shape rect = new rectangle();
		Shape cone = new cone();
		Shape squ = new square();
		Shape cir = new circle();
		Drawing draw = new Drawing();
		draw.add(cir);
		draw.draw("Yellow");
		draw.clear();
		draw.add(squ);
		draw.add(cone);
		draw.draw("Pink");
		draw.add(rect);
		draw.draw("Black");
		draw.add(tri);
		draw.draw("Purple");
		draw.clear();
		
	}
}
interface Shape {
	public void draw(String fill);
}
class triangle implements Shape {
	@Override
	public void draw(String fill) {
		System.out.println("Drew "+fill+" Triangle");
	}
}
class square implements Shape {
	@Override
	public void draw(String fill) {
		System.out.println("Drew "+fill+" Square");
	}
}

class rectangle implements Shape {
	@Override
	public void draw(String fill) {
		System.out.println("Drew "+fill+" Rectangle");
	}
}

class cone implements Shape {
	@Override
	public void draw(String fill) {
		System.out.println("Drew "+fill+" Cone");
	}
}

class circle implements Shape {
	@Override
	public void draw(String fill) {
		System.out.println("Drew "+fill+" Circle");
	}
}
class Drawing implements Shape {
	private List<Shape> shapes = new ArrayList<Shape>();
	@Override
	public void draw(String fill) {
		for(Shape sh : shapes) {
			sh.draw(fill);
		}
	}
	public void add(Shape s){
		this.shapes.add(s);
	}
	public void remove(Shape s){
		shapes.remove(s);
	}
	public void clear(){
		System.out.println("Cleared all Drawings!");
		this.shapes.clear();
	}
}