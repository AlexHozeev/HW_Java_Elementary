package alex.homework3;

public class ReverseString {
    private String tmp = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        r.reverseString();
    }

    private void reverseString() {
        tmp = tmp.replace("Z", " ");
        String[] array = tmp.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            String r = new StringBuilder(array[i]).reverse().toString();
            result = result.concat(r).concat(" ");
        }
        System.out.println(result);
    }
}
