package figures;

public class Cercle {
	
	protected Point centre;
	protected double rayon;
	
	public Cercle(Point centre, double rayon) {
		
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Cercle(Point c, Point p) {
		
		this.centre=c;
		this.rayon=centre.distance(p);		
	}
	
	public double getSurface() {
		return Math.PI*rayon*rayon;
	}
	
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}
	
	public boolean appartient(Point p) {
		double d= centre.distance(p);
		if(d<=rayon) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return ("Cercle("+centre.x+","+centre.y+","+rayon+")");
	}
}
