public class Trapezoid{
 
    //Calculating the Area of Trapezoid
    public static void main(String [] args) {
int  base1, base2, height;
double Area;
//check if the value pass is less or greater than 2 or greater than 3
if(args.length>3 || args.length<=2){
    System.err.println("Please you need only three values");
    System.exit(1);
}
try{
    //casting args variable to integer
    base1=Integer.parseInt(args[0]);
    base2=Integer.parseInt(args[1]);
    height=Integer.parseInt(args[2]);
    
    Area=0.5 *(base1 + base2) * height;
    System.out.println("The Area of the Trapezoid is :"+ Area);

}catch(ArrayIndexOutOfBoundsException e){
    System.err.println("Please you must provide the base1,base2 and height of the Trapexoid");
System.exit(2);
}

    }
}
