package String;

public class String62 {
    public static void main(String[] args) {
        String str = "ggergerggregKKIFdfzfdfZ";

        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z') {
                sb.append('a');
            } else if (str.charAt(i) == 'Z') {
                sb.append('A');
            } else if (Character.isLetter(str.charAt(i))) {
                sb.append((char) (str.charAt(i) + 1));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
