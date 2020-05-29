package com.test.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {

        String sql = "select DEPT_INFO_ONE.DEPT_NAME1 as DEPT_NAME1 , sum(DEPT_INDICATOR_BASE.DEPT_INCOME + aliasName) as 'curPeriodEndTimeData(asdaswerwerwer + werwerwerdasd)' from DEPT_INDICATOR_BASE left join DEPT_INFO_ONE on DEPT_INDICATOR_BASE.DEPT_CODE1  =  DEPT_INFO_ONE.DEPT_CODE1  where 1=1  and DEPT_INDICATOR_BASE.YEARMONTH = '2019-12' group by DEPT_INFO_ONE.DEPT_NAME1\n";
        String pattern = "\\s+as\\s+(.*?)(,|from)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(sql);
        byte counter = 0;
        Map<String,String> aliasConvert = new HashMap<String, String>();
        while (m.find()){
            String aliasName = m.group(1).trim();
            if(aliasName.length()>=30){
                sql = sql.replace(aliasName,"aliasName"+counter);
                aliasConvert.put("aliasName"+counter,aliasName.replaceAll("'",""));
                counter ++;
            }
        }
        System.out.println(sql);
        for(String aliasName:aliasConvert.keySet()){
            System.out.println(aliasName + "  " + aliasConvert.get(aliasName));
        }


    }
}
