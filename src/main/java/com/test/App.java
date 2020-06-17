package com.test;

import com.test.db.GenerateSql;
import com.test.db.JdbcDao;

import java.util.List;
import java.util.Map;

public class App {
    //处理cbbi_问题
    public static void main(String[] args) {
        //List<Map<String, Object>> rs = JdbcDao.select("select * from td_bi_analysis_model");
        List<String> sqlList = GenerateSql.doOriginTable();
        //List<String> sqlList = GenerateSql.doBussinessTable();
        //List<String> sqlList = GenerateSql.doOriginTableRevert();
        for(String sql:sqlList){
            JdbcDao.insertOrDeleteOrUpdate(sql);
        }
        System.out.println("执行完毕");
    }
}
