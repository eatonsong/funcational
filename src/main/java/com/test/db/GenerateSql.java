package com.test.db;


import java.util.ArrayList;
import java.util.List;

public class GenerateSql {
    //需要增加的前缀
    static String add = "cbbi_";
    //元数据库中存储的业务库名称
    static String name = "16.7";
    //需要增加的前缀业务表名称
    static String bussinessName =
            "dept_dict_cost_method," +
            "dept_info," +
                    "dept_info1," +
            "dept_mixture," +
                    "dept_ra_income_otherc," +
            "dept_ra_period_data," +
            "dept_rau_cost_c," +
            "dept_rau_cost_cost," +
            "dept_rau_cost_emp_c," +
            "dept_rau_cost_emp_l," +
            "dept_rau_cost_emp_num_cx," +
            "dept_rau_cost_equi_c," +
            "dept_rau_cost_equi_l," +
            "dept_rau_cost_l," +
            "dept_rau_cost_mate_c," +
            "dept_rau_cost_mate_l," +
            "dept_rau_cost_method," +
            "dept_rau_income_cost_l," +
            "dept_rau_income_ordered_c," +
            "dept_rau_income_ordered_l," +
            "drgs_dept_type_cost_c,";
    //需要修改的元数据库表
    static String originName = "td_bi_analysis_model,td_bi_chart_model,td_bi_condition,td_bi_dashboard_model,td_bi_htmlcontainer,td_bi_table_model,td_bi_storyboard_model";

    static String []bn = bussinessName.split(",");

    static String []on = originName.split(",");


    //对业务数据库操作
    public static List<String> doBussinessTable(){
        List<String> l = new ArrayList<>();
        for(String b:bn){
            //修改td_bi_datasource中tables字段
            String sql ="EXEC sp_rename @objname = '%s', @newname = '%s';";
            sql = String.format(sql, b, add+b);
            l.add(sql);
            System.out.println(sql);
        }
        return l;
    }

    //对业务数据库操作
    public static List<String> doOriginTable() {
        List<String> l = new ArrayList<>();
        //对元数据库的操作
        System.out.println("-- 生成修改td_bi_datasource中tables字段sql");
        for(String b:bn){
            //修改td_bi_datasource中tables字段
            String sql ="UPDATE [dbo].[%s] set tables = REPLACE(Cast(tables as varchar(max)), '%s', '%s') where name = '%s';";
            sql = String.format(sql, "td_bi_datasource", b, add+b, name);
            l.add(sql);
            //System.out.println(sql);
        }
        System.out.println("-- 生成修改各业务表中数据的sql");
        for(String b:bn){
            for(String o:on){
                String sql ="UPDATE [dbo].[%s] set content = REPLACE(Cast(content as varchar(max)), '%s', '%s');";
                sql = String.format(sql, o, b, add+b);
                //System.out.println(sql);
                l.add(sql);
            }
        }
        return l;
    }

    //对业务数据库操作操作多了回退
    public static List<String> doOriginTableRevert() {
        List<String> l = new ArrayList<>();
        //对元数据库的操作
        System.out.println("-- 生成修改td_bi_datasource中tables字段sql");
        for(String b:bn){
            //修改td_bi_datasource中tables字段
            String sql ="UPDATE [dbo].[%s] set tables = REPLACE(Cast(tables as varchar(max)), '%s', '%s') where name = '%s';";
            sql = String.format(sql, "td_bi_datasource", add+add+b, add+b, name);
            l.add(sql);
            //System.out.println(sql);
        }
        System.out.println("-- 生成修改各业务表中数据的sql");
        for(String b:bn){
            for(String o:on){
                String sql ="UPDATE [dbo].[%s] set content = REPLACE(Cast(content as varchar(max)), '%s', '%s');";
                sql = String.format(sql, o, add+add+b, add+b);
                //System.out.println(sql);
                l.add(sql);
            }
        }
        return l;
    }

    //处理平台cbbi_问题
    public static void main(String[] args) {
        //doBussinessTable();
        System.out.println(bn.length);
        //doOriginTable();


    }


}
