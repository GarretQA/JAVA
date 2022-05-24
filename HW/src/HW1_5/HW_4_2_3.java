package HW1_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_4_2_3 {
    public static void main(String[] args) {
        String s = "Look how Lora loves lollilolo";
        s = s.toLowerCase(Locale.ROOT);
        Matcher matcher = Pattern.compile("(?=(lo))").matcher(s);
        List<Integer> pos = new ArrayList<>();
        while (matcher.find()) {
            pos.add(matcher.start());
        }
        System.out.println(pos);

        int index = s.indexOf("lo");
        while (index != -1) {
            System.out.println(index);
            index = s.indexOf("lo", index + 1);
        }
    }
}
