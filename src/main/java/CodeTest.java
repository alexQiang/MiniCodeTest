import java.util.*;

/**
 * @author: GuiQiang
 * @date: 2020-2-17
 **/
public class CodeTest {

    private List<String> result = new ArrayList<String>();
    private Map<String, String> mapping = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> getResult(String[] digits) {
        if (digits.length != 0){
            List<String> list = Arrays.asList(digits);
            List<String> arrList = new ArrayList<String>(list);
            function("", arrList);
        }
        return result;
    }

    //core function
    private void function(String temp,  List<String> key){
        if (key.size() == 0) {
            // count down
            result.add(temp);
        } else {
            // get the first digit
            String digit = key.get(0);
            String letters;
            //if is double-digit
            if (digit.length()>1){
                String digit0 = digit.substring(0,1);
                String digit1 = digit.substring(1,2);
                letters = mapping.get(digit0) + mapping.get(digit1);
            }else {
                letters = mapping.get(digit);
            }
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                // get the second digit
                function(temp + letter, key.subList(1, key.size()));
            }
        }
    }
}
