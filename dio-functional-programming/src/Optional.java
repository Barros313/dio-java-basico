public class Optional {
    public static void main(String[] args) {
        java.util.Optional<String> optionalValue = java.util.Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);
    }
}
