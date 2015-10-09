
public class Radius {
	
	  private int Radius ;
	  private  int showradius;
	  private  double Area ;

	 
	  public int getRadius(){
			return Radius;
	  
	  }
		
	  public void setRadius(int Radius) {
			this.Radius = Radius;
		}
	  public int getshowradius() {
			return showradius;
		}
		public void setshowradius(int showradius) {
			this.showradius = showradius;
		}
		
		public double Area() {
			return  3.14*this.Radius*this.Radius;
		}
		
		public double Area(int Radius) {
			return (3.14*Radius*Radius);
		}
		
	}