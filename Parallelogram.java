
public class Parallelogram{
    //Calculating the Area of Parallelogram 
    public static void main(String [] args) {
int Area, base, height;
if(args.length>2){
    System.err.println("Please you need only two values");
    System.exit(1);
}
try{
    //casting args variable to integer
    base=Integer.parseInt(args[0]);
    height=Integer.parseInt(args[1]);
    Area=base*height;
    System.out.println("The Area of the Parallelogram is :"+ Area);

}catch(ArrayIndexOutOfBoundsException e){
    System.err.println("Please you must provide the base and the height of the Parallelogram");
System.exit(2);
}

    }
}