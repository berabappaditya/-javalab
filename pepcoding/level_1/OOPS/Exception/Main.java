public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured " + e);
        } catch (Exception e) {
            System.out.println("Exception occured " + e);
        } finally {
            System.out.println("Finally block");
        }
    }
}