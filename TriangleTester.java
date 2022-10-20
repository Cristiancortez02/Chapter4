package Chapter4Homework;

public class TriangleTester {
    public static void main(String[] args) {
        boolean valid = false;
        int sides = 0;
        while(!valid){
            try{
                Triangle t1 = new Triangle(3.5, 2.8, 5.6);
                valid = false;
            }catch (IllegalTriangleSideException e){
                System.out.println(e);
                System.out.println("Please try again.");
            }
            finally {
                System.out.println(sides);
            }
        }
    }
}
