public class Rectangle{
    //Calculating the Area of rectangle
    public static void main(String [] args) {
int Area,length , width;
if(args.length>2){
    System.err.println("Please you need only two values");
    System.exit(1);
}
try{
    //casting args variable to integer
    length=Integer.parseInt(args[0]);
    width=Integer.parseInt(args[1]);
    Area=length*width;
    System.out.println("The Area of the Rectangle is :"+ Area);

}catch(ArrayIndexOutOfBoundsException e){
    System.err.println("Please you must provide the Lenght and the Width of the rectangle");
System.exit(1);
}

    }
}