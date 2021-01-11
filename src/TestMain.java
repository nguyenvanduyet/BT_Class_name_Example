public class TestMain {
    private static ClassNameExample className;
    public static final String[] validAccount = new String[]{"C3121G", "A1111H"};
    public static final String[] inValidAccount = new String[]{"B3121G", "A1111Y", "A33I"};

    public static void main(String[] args) {
        className = new ClassNameExample();
        for (String s : validAccount) {
            boolean isValid = className.validate(s);
            System.out.println("Class is" + s + "valid: " + isValid);
        }
        for (String s : inValidAccount) {
            boolean isValid = className.validate(s);
            System.out.println("Class is" + s + "is valid: " + isValid);
        }
    }
}
