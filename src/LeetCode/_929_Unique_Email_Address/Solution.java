package LeetCode._929_Unique_Email_Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int numUniqueEmails(String[] emails) {

        Map<String, List<String>> map = new HashMap<>();

        for(String email : emails){
            String[] input = email.split("@");
            String domain = input[1];
            String name = input[0];

            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < name.length(); j++) {
                char cur = name.charAt(j);
                if (cur == '.') continue;
                if (cur == '+') break;
                builder.append(cur);
            }

            if (map.containsKey(domain)){
                var list = map.get(domain);
                if (!list.contains(builder.toString())){
                    list.add(builder.toString());
                }
            }else {
                List<String> l = new ArrayList<>();
                l.add(builder.toString());
                map.put(domain, l);
            }
        }


        int counter = 0;

        for (var set : map.entrySet()){
            counter += set.getValue().size();
        }

        return counter;
    }
}
