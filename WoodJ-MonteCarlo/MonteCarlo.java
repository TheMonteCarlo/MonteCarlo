import java.util.Random;

public class MonteCarlo {
    public double  h,k,r;

    private  Random rndm = new Random();

    public MonteCarlo(double h,double k,double r){
        this.h=h;
        this.k=k;  //"this" method calls another constructor in the 
                  //same class as the first part of your constructor 
        this.r=r; //so calls the doubles in the parameter
    }

    public double nextRainDrop_x(){
        return (rndm.nextDouble()*2*r)+(h-r); //sets the random dots for the x axis
    }

    public double nextRainDrop_y(){
        return (rndm.nextDouble()*2*r)+(k-r); //sets the random dots for the y-axis
    }

    public boolean insideCircle(double x , double y){

        return Math.pow((x-h), 2)+Math.pow((y-k), 2)<=Math.pow(r,2); //sets the area of the circle 
    }
}
