package com.personal.practice;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String,String> stringStringMap = new HashMap();
        stringStringMap.put("foo","1");
        stringStringMap.put("Key",null);
        stringStringMap.put("bar","2");
        stringStringMap.put("Foo_bar","3");
        stringStringMap.put("foovar","4");
//        stringStringMap.put(null,"glod");
//        stringStringMap.put("abc","fill");
//        stringStringMap.put("absc","fill");
        stringStringMap.put("","d");
        stringStringMap.put("t","");
        stringStringMap = FilterSort.filtrate(stringStringMap,"abc");
        for(String key:stringStringMap.keySet()){
            System.out.println(key+": "+stringStringMap.get(key));
        }
        String stringMap = FilterSort.sortJoint(stringStringMap);
        System.out.println(stringMap);






    }
}
