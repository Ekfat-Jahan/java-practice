//task-1
public class Rectangle extends Shape {
	//data field
		private double length;
		private double width;
	//constructor
		public Rectangle(String name, double length, double width) {
			super(name);
			this.length = length;
			this.width = width;
		}
		//getter setter
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		@Override
		public double area() {
			return length*width;
		}
		@Override
		public double perimeter() {
			return 2*(length+width);
		}
		@Override
		public String toString() {
			return "Rectangle [name="+super.getName()+", length=" + length + ", width=" + width + "]";
		}
		
		
		

}
