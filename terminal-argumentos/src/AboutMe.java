public class AboutMe {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.parseInt(args[2]);
        double height = Integer.parseInt(args[3]);

        System.out.println("Hi, my name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + height + "cm tall.");
    }
}
