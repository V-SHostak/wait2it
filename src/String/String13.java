package String;

public class String13 {
    public static void main(String[] args) {
        String str = "sdfsfsdfsf53545sdfvsdf dv4 fd";

        int k=0;
        for (int i=0; i < str.length(); i++) {
            int ch = str.charAt(i);

            if (Character.isDigit(ch)){
                k++;
            }
        }
        System.out.println(k);
    }
}
