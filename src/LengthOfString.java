interface StringLength{
    public int getLength(String s);
}
public class LengthOfString {
    public static void main(String[] args) {
        StringLength S = s -> {
            return s.length();
        };
        System.out.println(S.getLength("Rajkumar"));
    }
}
