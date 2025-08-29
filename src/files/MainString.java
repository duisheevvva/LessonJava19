package files;

public class MainString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(2));
        stringBuilder.setCharAt(3,'c');
        System.out.println(stringBuilder);


    }
}
