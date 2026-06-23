public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * function name : greet
     * 
     * Inside function :
     * 1.prints : 'Hi'
     */
    public static void greeet() {
        System.out.println("Hi");
    }
    /**
     * function name : printText
     * 
     * @param name (string)
     * @param age (string)
     * 
     * Inside the function:
     * 1. prints the name and age as part of a text
     */
    public static void printText(String name , String age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
    /**
     * function name : calculateArea 
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function :
     * 1. calculate the area and return it
     */
    public static double calculateArea(double length , double width) {
        double area = length * width;
        return area;
    }
}
