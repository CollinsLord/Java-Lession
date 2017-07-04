
public class Sphere{
    //Calculating the Area of Sphare
    public static void main(String [] args) {
int surface,radius; 
double Area;
if(args.length>2 ||args.length>2){
    System.err.println("Please you need only two values");
    System.exit(1);
}
try{
    //casting args variable to integer
    surface=Integer.parseInt(args[0]);
    radius=Integer.parseInt(args[0]);
    Area=surface*Math.PI*radius*radius;
    System.out.println("The Area of the Sphere is :"+ Area);

}catch(ArrayIndexOutOfBoundsException e){
    System.err.println("Please you must provide the Surface and the radius of the Sphere");
System.exit(2);
}

    }
}