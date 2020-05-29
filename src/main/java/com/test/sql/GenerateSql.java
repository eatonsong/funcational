package com.test.sql;




public class GenerateSql {


    //处理平台
    public static void main(String[] args) {

//        dept_cost_subj,dept_dict_cost_method,dept_drgs_income_ordered,dept_info,dept_mixture,dept_ra_period_data,dept_rau_cost_c,dept_rau_cost_cost,dept_rau_cost_emp_c,dept_rau_cost_emp_l,dept_rau_cost_emp_num_cx,dept_rau_cost_equi_c,dept_rau_cost_equi_l,dept_rau_cost_l,dept_rau_cost_mate_c,dept_rau_cost_mate_l,dept_rau_cost_method,dept_rau_income_cost_l,dept_rau_income_ordered_c,dept_rau_income_ordered_l,drgs_dept_type_cost_c,drgs_drgs,index_drgs_scheme_bi_rel
        String yewu = "dept_cost_subj,dept_dict_cost_method,dept_drgs_income_ordered,dept_info,dept_mixture,dept_ra_period_data,dept_rau_cost_c,dept_rau_cost_cost,dept_rau_cost_emp_c,dept_rau_cost_emp_l,dept_rau_cost_emp_num_cx,dept_rau_cost_equi_c,dept_rau_cost_equi_l,dept_rau_cost_l,dept_rau_cost_mate_c,dept_rau_cost_mate_l,dept_rau_cost_method,dept_rau_income_cost_l,dept_rau_income_ordered_c,dept_rau_income_ordered_l,drgs_dept_type_cost_c,drgs_drgs,index_drgs_scheme_bi_rel";
        String add = "cbbi_";
        String []ye = yewu.split(",");


        String yuan = "td_bi_analysis_model,td_bi_chart_model,td_bi_condition,td_bi_dashboard_model,td_bi_htmlcontainer,td_bi_table_model,td_bi_storyboard_model";
       String []yu = yuan.split(",");
        System.out.println(ye.length);
        System.out.println(yu.length);
        for(String yeName:ye){
            for(String yuanName:yu){
                String sql ="UPDATE [dbo].[%s] set content = REPLACE(Cast(content as varchar(max)), '%s', '%s');";
                sql = String.format(sql, yuanName,yeName,add+yeName);
                System.out.println(sql);

            }
            String sql ="UPDATE [dbo].[%s] set tables = REPLACE(Cast(tables as varchar(max)), '%s', '%s') where name = '16.7';";
            sql = String.format(sql, "td_bi_datasource",yeName,add+yeName);
            System.out.println(sql);


        }






    }


}
