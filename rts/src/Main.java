import java.util.*;

public class Main {

    public static void main(String[] args) {

        //List<Integer> values=new ArrayList<Integer>();
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        int num = 1;
        Map<String, Integer> aboveBelow = aboveBelow(values, num);
        if (aboveBelow.isEmpty()) {
            System.out.println("Number not found");
        } else {

            System.out.println(aboveBelow);
        }


        String stringRotation = stringRotation("MyString", 3);
        System.out.println(stringRotation);

    }

    public static Map<String, Integer> aboveBelow(int[] values, int num) {

        Map<String, Integer> toReturn = new LinkedHashMap<String, Integer>();

        if (null == values) {
            return toReturn;
        }

        for (int i = 0; i < values.length; i++) {
            if (num == values[i]) {

                toReturn.put("above", values.length - i - 1);
                toReturn.put("below", i);

                return toReturn;
            }
        }
        return toReturn;
    }

    public static String stringRotation(String myString, int position) {

        try {
            String after = myString.substring(myString.length() - position);
            String before = myString.substring(0, myString.length() - position);
            return after + before;
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            return "Invalid input";
        }

    }


}
