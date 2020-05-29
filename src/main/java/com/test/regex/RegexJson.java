package com.test.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexJson {
    //处理安徽省立Oracle数据库小写转大写问题
    public static void main(String[] args) {
        String jsonStr = "{\"categoryid\":\"\",\"connectInfo\":[{\"from\":{\"tableName\":\"dept_income_detail\",\"elementId\":\"dept_income_detail\",\"anchor\":\"RightMiddle\"},\"to\":{\"tableName\":\"UP_ORG_UNIT\",\"elementId\":\"UP_ORG_UNIT\",\"anchor\":\"LeftMiddle\"},\"joinInfo\":{\"joinType\":\"INNERJOIN\",\"relations\":[{\"from\":\"dept_income_detail.courtyard_area_code\",\"operater\":\"=\",\"to\":\"UP_ORG_UNIT.NAME\"}]},\"id\":\"con_06937846633855682\"},{\"from\":{\"tableName\":\"income_detail\",\"elementId\":\"income_detail\",\"anchor\":\"RightMiddle\"},\"to\":{\"tableName\":\"UP_ORG_UNIT\",\"elementId\":\"UP_ORG_UNIT\",\"anchor\":\"LeftMiddle\"},\"joinInfo\":{\"joinType\":\"INNERJOIN\",\"relations\":[{\"from\":\"income_detail.COMP_CODE\",\"operater\":\"=\",\"to\":\"UP_ORG_UNIT.CODE\"}]},\"id\":\"con_25448422269539606\"},{\"from\":{\"tableName\":\"income_detail\",\"elementId\":\"income_detail\",\"anchor\":\"RightMiddle\"},\"to\":{\"tableName\":\"DATE_RELA\",\"elementId\":\"DATE_RELA\",\"anchor\":\"LeftMiddle\"},\"joinInfo\":{\"joinType\":\"INNERJOIN\",\"relations\":[{\"from\":\"income_detail.ACCT_YEAR\",\"operater\":\"=\",\"to\":\"DATE_RELA.acct_year\"},{\"from\":\"income_detail.ACCT_MONTH\",\"operater\":\"=\",\"to\":\"DATE_RELA.acct_month\"}]},\"id\":\"con_8979133019359173\"},{\"from\":{\"tableName\":\"income_detail\",\"elementId\":\"income_detail\",\"anchor\":\"RightMiddle\"},\"to\":{\"tableName\":\"sys_dept\",\"elementId\":\"sys_dept\",\"anchor\":\"LeftMiddle\"},\"joinInfo\":{\"joinType\":\"INNERJOIN\",\"relations\":[{\"from\":\"income_detail.ORDERED_BY\",\"operater\":\"=\",\"to\":\"sys_dept.dept_id\"}]},\"id\":\"con_47525678450343145\"}],\"description\":\"\",\"name\":\"order_income_detail\",\"tableList\":[{\"displayName\":\"院区字典\",\"fieldsInfo\":[{\"aliasName\":null,\"comments\":\"ID\",\"dataType\":\"string\",\"fieldName\":\"ID\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"名称\",\"dataType\":\"string\",\"fieldName\":\"NAME\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"编码\",\"dataType\":\"string\",\"fieldName\":\"CODE\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"生效时间\",\"dataType\":\"date\",\"fieldName\":\"TIME_BEGIN\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"失效时间\",\"dataType\":\"date\",\"fieldName\":\"TIME_END\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"是否启用\",\"dataType\":\"string\",\"fieldName\":\"IS_ENABLED\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"单位级次\",\"dataType\":\"int\",\"fieldName\":\"comp_level\",\"fieldType\":\"measure\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":\"super_code\",\"comments\":\"上级编码\",\"dataType\":\"string\",\"fieldName\":\"super_code\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":\"is_last\",\"comments\":\"是否末级\",\"dataType\":\"string\",\"fieldName\":\"is_last\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"单位类别\",\"dataType\":\"string\",\"fieldName\":\"comp_level_code\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":\"u_id\",\"comments\":\"u_id\",\"dataType\":\"string\",\"fieldName\":\"u_id\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"},{\"aliasName\":null,\"comments\":\"cid\",\"dataType\":\"string\",\"fieldName\":\"cid\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"UP_ORG_UNIT\"}],\"isHideFieldList\":false,\"location\":{\"left\":\"658px\",\"top\":\"172px\"},\"tableName\":\"UP_ORG_UNIT\",\"isMainTable\":false},{\"displayName\":\"科室字典\",\"fieldsInfo\":[{\"aliasName\":null,\"comments\":\"部门序号\",\"dataType\":\"int\",\"fieldName\":\"dept_id\",\"fieldType\":\"measure\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":\"comp_code1\",\"comments\":\"单位编码\",\"dataType\":\"string\",\"fieldName\":\"comp_code\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"comments\":\"部门编码\",\"dataType\":\"string\",\"fieldName\":\"dept_code\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门名称\",\"dataType\":\"string\",\"fieldName\":\"dept_name\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门全称\",\"dataType\":\"string\",\"fieldName\":\"dept_name_all\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":\"super_code1\",\"comments\":\"上级编码\",\"dataType\":\"string\",\"fieldName\":\"super_code\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门类型编号\",\"dataType\":\"int\",\"fieldName\":\"kind_id\",\"fieldType\":\"measure\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门类别编码\",\"dataType\":\"string\",\"fieldName\":\"type_code\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门性质编码\",\"dataType\":\"string\",\"fieldName\":\"attr_code\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门级别\",\"dataType\":\"string\",\"fieldName\":\"dept_level\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"spell\",\"dataType\":\"string\",\"fieldName\":\"spell\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"职能科室标记\",\"dataType\":\"string\",\"fieldName\":\"is_func\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":\"is_last1\",\"comments\":\"末级标记\",\"dataType\":\"string\",\"fieldName\":\"is_last\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"是否采购\",\"dataType\":\"string\",\"fieldName\":\"is_stock\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"是否服务\",\"dataType\":\"string\",\"fieldName\":\"is_service\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"收支类型编码\",\"dataType\":\"string\",\"fieldName\":\"inout_type_code\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"停用标记\",\"dataType\":\"string\",\"fieldName\":\"is_stop\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"停用日期\",\"dataType\":\"date\",\"fieldName\":\"stop_date\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"是否分摊\",\"dataType\":\"string\",\"fieldName\":\"is_app\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"分摊级别\",\"dataType\":\"int\",\"fieldName\":\"app_level\",\"fieldType\":\"measure\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":\"u_id1\",\"comments\":\"u_id\",\"dataType\":\"int\",\"fieldName\":\"u_id\",\"fieldType\":\"measure\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"是否预算科室\",\"dataType\":\"string\",\"fieldName\":\"is_budget\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"},{\"aliasName\":null,\"comments\":\"部门路径\",\"dataType\":\"string\",\"fieldName\":\"dept_path\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"sys_dept\"}],\"isHideFieldList\":false,\"location\":{\"left\":\"652px\",\"top\":\"417px\",\"height\":400,\"width\":298},\"tableName\":\"sys_dept\",\"isMainTable\":false},{\"displayName\":\"income_detail\",\"fieldsInfo\":[{\"aliasName\":\"COMP_CODE2\",\"comments\":\"COMP_CODE\",\"dataType\":\"string\",\"fieldName\":\"COMP_CODE\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"income_detail\"},{\"aliasName\":\"ACCT_YEAR2\",\"comments\":\"ACCT_YEAR\",\"dataType\":\"string\",\"fieldName\":\"ACCT_YEAR\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"income_detail\"},{\"aliasName\":\"ACCT_MONTH2\",\"comments\":\"ACCT_MONTH\",\"dataType\":\"string\",\"fieldName\":\"ACCT_MONTH\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"income_detail\"},{\"aliasName\":null,\"comments\":\"ORDERED_BY\",\"dataType\":\"string\",\"fieldName\":\"ORDERED_BY\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"income_detail\"},{\"aliasName\":null,\"comments\":\"PERFORM_BY\",\"dataType\":\"string\",\"fieldName\":\"PERFORM_BY\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"income_detail\"},{\"aliasName\":null,\"comments\":\"INCOME_SUBJ_CODE\",\"dataType\":\"string\",\"fieldName\":\"INCOME_SUBJ_CODE\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"income_detail\"},{\"aliasName\":null,\"comments\":\"AMOUNT\",\"dataType\":\"int\",\"fieldName\":\"AMOUNT\",\"fieldType\":\"measure\",\"isChecked\":true,\"tableName\":\"income_detail\"},{\"aliasName\":null,\"comments\":\"SOURCE_TYPE\",\"dataType\":\"string\",\"fieldName\":\"SOURCE_TYPE\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"income_detail\"}],\"isHideFieldList\":false,\"location\":{\"left\":\"39px\",\"top\":\"284px\",\"height\":421},\"tableName\":\"income_detail\",\"isMainTable\":true},{\"displayName\":\"日期转换参照\",\"fieldsInfo\":[{\"aliasName\":\"acct_year3\",\"comments\":\"acct_year\",\"dataType\":\"string\",\"fieldName\":\"acct_year\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"DATE_RELA\"},{\"aliasName\":\"acct_month3\",\"comments\":\"acct_month\",\"dataType\":\"string\",\"fieldName\":\"acct_month\",\"fieldType\":\"dimension\",\"isChecked\":false,\"tableName\":\"DATE_RELA\"},{\"aliasName\":null,\"comments\":\"yeardate\",\"dataType\":\"int\",\"fieldName\":\"yeardate\",\"fieldType\":\"measure\",\"isChecked\":true,\"tableName\":\"DATE_RELA\"},{\"aliasName\":null,\"comments\":\"yearmonth\",\"dataType\":\"string\",\"fieldName\":\"yearmonth\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"DATE_RELA\"},{\"aliasName\":null,\"comments\":\"season\",\"dataType\":\"string\",\"fieldName\":\"season\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"DATE_RELA\"},{\"aliasName\":null,\"comments\":\"halfyear\",\"dataType\":\"string\",\"fieldName\":\"halfyear\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"DATE_RELA\"}],\"isHideFieldList\":false,\"location\":{\"left\":\"395px\",\"top\":\"0px\",\"height\":231},\"tableName\":\"DATE_RELA\",\"isMainTable\":false}],\"title\":{},\"userDefineFields\":[],\"isSaveToAllCategories\":true,\"id\":\"337987745567735808\",\"subjectID\":\"\",\"oldName\":\"comp_income_detail\"}";
        String jsonStr1 = "{\"title\":{\"show\":true,\"text\":\"\",\"subtext\":\"\",\"location\":1,\"x\":\"left\",\"y\":\"top\",\"textAlign\":\"\",\"textStyle\":{\"fontFamily\":\"微软雅黑\",\"fontSize\":\"14\",\"fontStyle\":\"normal\",\"fontWeight\":\"normal\",\"align\":\"\",\"color\":\"\"},\"padding\":[3,0,0,0]},\"legend\":{\"show\":true,\"orient\":1,\"location\":2,\"textStyle\":{\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\",\"fontStyle\":\"normal\",\"fontWeight\":\"normal\",\"align\":\"\",\"color\":\"#666\"},\"selectedMode\":\"\",\"format\":\"\"},\"toolbox\":{\"show\":true,\"iconStyle\":{\"borderColor\":\"#b4ccd7\"},\"orient\":\"horizontal\",\"location\":{\"x\":\"\",\"y\":\"\"},\"style\":{},\"feature\":{\"dataView\":{\"show\":false},\"magicType\":{\"show\":false,\"type\":[\"line\",\"bar\"]},\"restore\":{\"show\":false},\"saveAsImage\":{\"show\":false}}},\"tooltip\":{\"show\":true,\"format\":\"\",\"textStyle\":{},\"style\":{}},\"xAxis\":[{\"type\":\"category\",\"splitLine\":{\"show\":false,\"lineStyle\":{\"color\":[\"#ccc\"],\"width\":1,\"type\":\"dashed\"}},\"name\":\"\",\"nameTextStyle\":{\"fontWeight\":\"normal\",\"fontStyle\":\"normal\",\"align\":\"\",\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\"},\"axisLabel\":{\"rotate\":0,\"clickable\":true,\"textStyle\":{\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\",\"fontStyle\":\"normal\",\"fontWeight\":\"normal\",\"align\":\"\",\"color\":\"#666\"}},\"axisLine\":{\"lineStyle\":{\"color\":\"#D9D9D9\",\"width\":2,\"type\":\"solid\"}},\"axisTick\":{\"lineStyle\":{\"color\":\"#666\",\"width\":1},\"show\":true}}],\"yAxis\":[{\"type\":\"value\",\"splitLine\":{\"show\":true,\"lineStyle\":{\"color\":[\"#ccc\"],\"width\":1,\"type\":\"dashed\"}},\"name\":\"\",\"nameTextStyle\":{\"fontWeight\":\"normal\",\"fontStyle\":\"normal\",\"align\":\"\",\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\"},\"axisLabel\":{\"rotate\":0,\"clickable\":true,\"textStyle\":{\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\",\"fontStyle\":\"normal\",\"fontWeight\":\"normal\",\"align\":\"\",\"color\":\"#666\"}},\"axisLine\":{\"lineStyle\":{\"color\":\"#D9D9D9\",\"width\":2,\"type\":\"solid\"},\"show\":true},\"axisTick\":{\"lineStyle\":{\"color\":\"#666\",\"width\":1},\"show\":true},\"ValueType\":\"left\",\"dataFormat\":{\"digits\":\"2\",\"axisType\":\"leftValueAxis\"}},{\"type\":\"value\",\"splitLine\":{\"show\":true,\"lineStyle\":{\"color\":[\"#ccc\"],\"width\":1,\"type\":\"dashed\"}},\"name\":\"\",\"nameTextStyle\":{\"fontWeight\":\"normal\",\"fontStyle\":\"normal\",\"align\":\"\",\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\"},\"axisLabel\":{\"rotate\":0,\"clickable\":true,\"textStyle\":{\"fontFamily\":\"微软雅黑\",\"fontSize\":\"12\",\"fontStyle\":\"normal\",\"fontWeight\":\"normal\",\"align\":\"\",\"color\":\"#666\"}},\"axisLine\":{\"lineStyle\":{\"color\":\"#D9D9D9\",\"width\":2,\"type\":\"solid\"},\"show\":true},\"axisTick\":{\"lineStyle\":{\"color\":\"#666\",\"width\":1},\"show\":true},\"ValueType\":\"right\",\"dataFormat\":{\"digits\":\"2\",\"axisType\":\"rightValueAxis\",\"format\":\"%\"}}],\"series\":[],\"dimensions\":[{\"tableName\":\"dept_indicator_base\",\"fieldName\":\"yearmonth\",\"text\":\"月\",\"dataType\":\"string\",\"fieldType\":\"dimension\",\"type\":\"dimension\",\"title\":\"分类\"}],\"measures\":[{\"fieldName\":\"sntq\",\"text\":\"上年同期\",\"expression\":\"=getPreviousPeriod(sum(Fields.direct_cost))\",\"isChartUserDefined\":true,\"fieldType\":\"measure\",\"key\":\"1\",\"type\":\"measure\",\"title\":\"左值轴\",\"ValueType\":\"left\"},{\"tableName\":\"dept_indicator_base\",\"fieldName\":\"direct_cost\",\"text\":\"科室直接成本\",\"dataType\":\"int\",\"fieldType\":\"measure\",\"type\":\"measure\",\"title\":\"左值轴\",\"ValueType\":\"left\"},{\"fieldName\":\"zzl\",\"text\":\"增长率\",\"expression\":\"=increaseRate(sum(Fields.direct_cost))\",\"isChartUserDefined\":true,\"fieldType\":\"measure\",\"key\":\"newTab49828435601783827\",\"type\":\"measure\",\"title\":\"右值轴\",\"ValueType\":\"right\"}],\"referenceSeries\":[],\"categoryId\":\"302852007855652864\",\"analysisModelId\":\"303106754101641216\",\"chartType\":\"bar-line\",\"action\":[{\"linkAgeSource\":\"\",\"targetObject\":[],\"target\":\"\",\"conditions\":[]}],\"conditions\":[{\"operation\":\"range_all\",\"tableName\":\"dept_indicator_base\",\"fieldName\":\"dateLevel_$Period\",\"dateLevel\":\"dateLevel\",\"id\":\"07479873052979968\",\"comments\":\"周期\",\"referenceInfo\":{\"type\":\"range\",\"content\":{\"year\":\"yeardate\",\"month\":\"yearmonth\",\"half_year\":\"halfyear\",\"quarter\":\"season\",\"hiddenTBHB\":true,\"openCalendar\":false},\"rangeType\":\"month\",\"rangeComparison\":\"origin\"},\"analysisModelId\":\"303106754101641216\",\"dataType\":\"dateLevel\",\"values\":\"2019-01,2020-02\"},{\"operation\":\"=\",\"aliasName\":\"dept_type\",\"comments\":\"四大类科室分类\",\"dataType\":\"string\",\"fieldName\":\"dept_type\",\"fieldType\":\"dimension\",\"isChecked\":true,\"tableName\":\"dept_indicator_base\",\"analysisModelId\":\"303106754101641216\",\"values\":\"临床服务类科室\"}],\"orders\":[],\"topn\":\"\",\"markLine\":{\"state\":\"none\",\"customNumber\":\"\",\"lineStyle\":{\"color\":\"#00D3FF\"},\"label\":{\"position\":\"middle\"},\"avgData\":\"afterFilter\"},\"leftValueAxisIsShowNumber\":false,\"rightValueAxisIsShowNumber\":false,\"leftValueAxisChartWidth\":\"\",\"rightValueAxisChartWidth\":\"\",\"bubbleSymbolSize\":1,\"showPieLabelPercent\":false,\"centerLabelExpression\":\"\",\"centerLabelExpressionName\":\"\",\"leftAxisShowStackColumnPercent\":null,\"chartUserDefinedFields\":[{\"comments\":\"上年同期\",\"expression\":\"=getPreviousPeriod(sum(Fields.direct_cost))\",\"aliasName\":\"sntq\",\"fieldType\":\"measure\",\"key\":\"1\"},{\"comments\":\"增长率\",\"expression\":\"=increaseRate(sum(Fields.direct_cost))\",\"aliasName\":\"zzl\",\"fieldType\":\"measure\",\"key\":\"newTab49828435601783827\"}],\"name\":\"柱折-院级-临床科室直接成本\",\"remark\":\"\",\"expressions\":[]}";
        String jsonStr2 = "{\"Report\":{\"ReportHeader\":{\"Items\":{\"Tables\":[],\"TextBoxs\":[]},\"height\":80,\"isShow\":false},\"ReportBody\":{\"Items\":{\"Tables\":[{\"type\":\"table\",\"fixedHeader\":true,\"pageTotalRows\":20,\"fixedColumn\":true,\"position\":{\"x\":0,\"y\":0},\"columns\":[{\"fieldName\":\"doctor_name\",\"type\":\"dimension\",\"width\":\"\",\"style\":\"\",\"isSort\":true,\"isShow\":true,\"comments\":\"doctor_name\",\"sortfieldName\":\"doctor_name\"},{\"fieldName\":\"drug_income\",\"type\":\"measure\",\"width\":\"\",\"style\":\"\",\"isSort\":true,\"isShow\":true,\"comments\":\"药品收入\",\"sortfieldName\":\"\"},{\"fieldName\":\"column&@Name2\",\"width\":\"\",\"type\":\"init\",\"style\":\"\",\"isSort\":true,\"isShow\":false},{\"fieldName\":\"column&@Name3\",\"type\":\"init\",\"width\":\"\",\"style\":\"\",\"isSort\":true,\"isShow\":true,\"sortfieldName\":\"\"},{\"fieldName\":\"column&@Name4\",\"type\":\"init\",\"width\":\"\",\"style\":\"\",\"isSort\":true,\"isShow\":true,\"sortfieldName\":\"\"},{\"fieldName\":\"column&@Name5\",\"width\":\"\",\"type\":\"init\",\"style\":\"\",\"isSort\":true,\"isShow\":false},{\"fieldName\":\"column&@Name6\",\"type\":\"init\",\"width\":\"\",\"style\":\"\",\"isSort\":true,\"isShow\":true,\"sortfieldName\":\"\"}],\"heights\":[43,33,33],\"widths\":[170,177,80,126,160,80,124],\"corner\":[[]],\"body\":[[{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C6F93CDC_7A42_4494_2B6C_333EC4C48B32\",\"value\":\"=Fields.doctor_name\",\"dataType\":\"string\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C1248B2A_1048_F46C_4D7B_A1B3C88299CE\",\"value\":\"=Fields.curPeriodEndTimeData(drug_income)\",\"dataType\":\"int\",\"contentSourceStyle\":\"Number\",\"formatObject\":{\"type\":\"Number\",\"pattern\":\"#,##0.00;-#,##0.00\"}}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C9194D51_AB06_BBF6_DF90_1E104B2A575C\",\"value\":\"=Fields.curPeriodEndTimeWithCompare(drug_income)\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"CDA87666_84EF_B9F2_F4B5_15235BC81EEB\",\"value\":\"=(Fields.curPeriodEndTimeData(drug_income)-Fields.curPeriodEndTimeWithCompare(drug_income))/Fields.curPeriodEndTimeWithCompare(drug_income)\",\"dataType\":\"int\",\"contentSourceStyle\":\"Number\",\"formatObject\":{\"type\":\"Percent\",\"pattern\":\"0.00%;-0.00%\"}}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C65C29C0_DD58_B59D_C72F_F32B25FE1C48\",\"value\":\"=Fields.accumulatedData(drug_income)\",\"contentSourceStyle\":\"Number\",\"formatObject\":{\"type\":\"Number\",\"pattern\":\"#,##0.00;-#,##0.00\"}}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C46A0EC0_FD3C_AC10_70D0_836EB21F15B8\",\"value\":\"=Fields.accumulatedWithCompare(drug_income)\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C3FB23CE_93FE_ABFA_5BAC_359605C3865E\",\"value\":\"=(Fields.accumulatedData(drug_income)-Fields.accumulatedWithCompare(drug_income))/Fields.accumulatedWithCompare(drug_income)\",\"contentSourceStyle\":\"Number\",\"formatObject\":{\"type\":\"Percent\",\"pattern\":\"0.00%;-0.00%\"}}}],[{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C01288C3_5085_63DC_E3CA_469D89B1DB3C\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"CB232927_B917_3F79_F463_F54A5BDA3DD3\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"CB72A1EA_9DAD_AA6B_9F28_C96F842A53D0\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"CECBB4AA_B96C_675E_8691_D7149AFE8E07\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C8D7A0CB_40AD_CAC6_A151_F38BDE0EBD06\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"CE6083B3_E6C2_2945_90C9_D7FF911CA847\"}},{\"rowspan\":1,\"colspan\":1,\"display\":1,\"textBox\":{\"id\":\"C9CA500D_071C_10C5_843F_0D8F9CEE983B\"}}]],\"columnHierarchy\":[{\"content\":{\"textBox\":{\"id\":\"CF402702_3461_DBB8_DD34_262D55EF86DB\",\"value\":\"医师姓名\",\"dataType\":\"string\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":0,\"pos\":0},{\"content\":{\"textBox\":{\"id\":\"C87CE825_3EA5_F602_EFBB_3AD86AC1289B\",\"value\":\"本期药品开单收入\",\"dataType\":\"string\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":1,\"pos\":0},{\"content\":{\"textBox\":{\"id\":\"C63AACA1_89BD_71AC_016E_106998B1DD8D\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":2,\"pos\":0},{\"content\":{\"textBox\":{\"id\":\"CA5A661E_05B2_3C48_71B8_EA63D9EB549A\",\"value\":\"本期同比\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":3,\"pos\":0},{\"content\":{\"textBox\":{\"id\":\"C817396E_F4F6_1B9D_05E8_F563CC6A9E5A\",\"value\":\"累计药品开单收入\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":4,\"pos\":0},{\"content\":{\"textBox\":{\"id\":\"C98AE799_739C_218B_1681_7E4473D837C9\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":5,\"pos\":0},{\"content\":{\"textBox\":{\"id\":\"C98DE93B_968F_6678_799F_449D37C46711\",\"value\":\"累计同比\"}},\"rowspan\":1,\"colspan\":1,\"height\":43,\"children\":[],\"start\":6,\"pos\":0}],\"rowHierarchy\":[{\"name\":\"详细信息\",\"pos\":0,\"group\":[],\"sort\":[],\"start\":1,\"end\":1,\"children\":[]},{\"children\":[],\"start\":2,\"end\":2,\"pos\":0}],\"tableProperty\":{\"unitName\":\"\",\"isUnitDisplay\":false,\"isPaging\":false,\"fixedColumn\":true,\"groupLevelField\":\"\",\"isBorder\":\"yes\",\"title\":\"\",\"isDisplay\":true,\"adaptive\":true,\"HeadData\":{\"height\":80,\"isShow\":false,\"textBoxes\":[]},\"globalVariableList\":[],\"numberDisplay\":false,\"numberName\":\"序号\",\"tableFootMerge\":false}}],\"TextBoxs\":[]}},\"ReportFooter\":{\"Items\":{\"Tables\":[],\"TextBoxs\":[]},\"height\":80,\"isShow\":false},\"dataSets\":[{\"analysisModelId\":\"311505828702060544\",\"conditions\":[{\"operation\":\"range_all\",\"tableName\":\"doc_indicator_base\",\"fieldName\":\"dateLevel_$Period\",\"dateLevel\":\"dateLevel\",\"id\":\"7321356496065967\",\"comments\":\"期间\",\"referenceInfo\":{\"type\":\"range\",\"content\":{\"year\":\"yeardate\",\"month\":\"yearmonth\",\"half_year\":\"halfyear\",\"quarter\":\"season\",\"hiddenTBHB\":true,\"openCalendar\":false},\"rangeType\":\"month\",\"rangeComparison\":\"origin\"},\"analysisModelId\":\"311505828702060544\",\"dataType\":\"dateLevel\",\"values\":\"2019-01,2019-12\"}],\"modelSpecialAttr\":null,\"fields\":[\"doctor_name\",\"curPeriodEndTimeData(drug_income)\",\"curPeriodEndTimeWithCompare(drug_income)\",\"(Fields.curPeriodEndTimeData(drug_income)-Fields.curPeriodEndTimeWithCompare(drug_income))/Fields.curPeriodEndTimeWithCompare(drug_income)\",\"accumulatedData(drug_income)\",\"accumulatedWithCompare(drug_income)\",\"(Fields.accumulatedData(drug_income)-Fields.accumulatedWithCompare(drug_income))/Fields.accumulatedWithCompare(drug_income)\"],\"pageSize\":100,\"showDetailRow\":true,\"groupFields\":[],\"totalFields\":[],\"isPaging\":false,\"fixedColumn\":true,\"groupLevelField\":\"\",\"collapse\":true,\"yearTotalParameter\":\"\",\"sortExpressions\":[],\"topN\":\"\",\"totalFieldsExpressions\":{}}]}}";
        //resoloveTB1(jsonStr);
        //resoloveTB2(jsonStr1);
        resoloveTB3(jsonStr2);
//        String regex1 = "Fields\\.(.*)(\\+|\\-|\\*|/|\\)?)";
//        String s1 = "=Fields.curPeriodEndTimeData(drug_income)";
//        String s2 = "=Fields.drug_income";
//        replaceByRegex(s2,regex1);
    }

    //处理TD_BI_ANALYSIS_MODEL表
    public static String resoloveTB1(String str){
        //"tableName":"dept_income_detail",
        //"from":"dept_income_detail.courtyard_area_code",
        // "to":"UP_ORG_UNIT.NAME"
        //"aliasName":null,
        //"fieldName":"ID",
        String []toReplace = {"tableName","from","to","aliasName","fieldName"};
        for(String s:toReplace){
            String regex = "\""+s+"\":\"(.*?)\"";
            str = replaceByRegex(str,regex);
        }
        System.out.println("处理TD_BI_ANALYSIS_MODEL表结果:"+str);
        return str;
    }

    //处理Td_bi_chart_model表
    public static String resoloveTB2(String str){
        //"tableName":"dept_indicator_base",
        //"fieldName":"yearmonth",
        //"expression":"=getPreviousPeriod(sum(Fields.direct_cost))
        // "year":"yeardate",
        // "month":"yearmonth",
        // "half_year":"halfyear",
        //  "quarter":"season",
        //"aliasName":"dept_type",
        String []toReplace = {"tableName","fieldName","year","month","half_year","quarter","aliasName"};
        for(String s:toReplace){
            String regex = "\""+s+"\":\"(.*?)\"";
            str = replaceByRegex(str,regex);
        }
        str = replaceExpressionByRegex(str);
        System.out.println("处理TD_BI_ANALYSIS_MODEL表结果:"+str);
        return str;
    }

    //处理TD_BI_TABLE_MODEL表
    public static String resoloveTB3(String str){
        //  "fieldName":"doctor_name",
        //"sortfieldName":"doctor_name"
        //"tableName":"doc_indicator_base",
        //"value":"=Fields.doctor_name",
        //"value":"=(Fields.curPeriodEndTimeData(drug_income)-Fields.curPeriodEndTimeWithCompare(drug_income))/Fields.curPeriodEndTimeWithCompare(drug_income)",

        //"year":"yeardate",
        //                                "month":"yearmonth",
        //                                "half_year":"halfyear",
        //                                "quarter":"season",
        // "fields":[
        //                    "doctor_name",
        //                    "curPeriodEndTimeData(drug_income)",
        //                    "curPeriodEndTimeWithCompare(drug_income)",
        //                    "(Fields.curPeriodEndTimeData(drug_income)-Fields.curPeriodEndTimeWithCompare(drug_income))/Fields.curPeriodEndTimeWithCompare(drug_income)",
        //                    "accumulatedData(drug_income)",
        //                    "accumulatedWithCompare(drug_income)",
        //                    "(Fields.accumulatedData(drug_income)-Fields.accumulatedWithCompare(drug_income))/Fields.accumulatedWithCompare(drug_income)"
        //                ],
        String []toReplace = {"tableName","fieldName","sortfieldName","month","half_year","quarter","year"};
        for(String s:toReplace){
            String regex = "\""+s+"\":\"(.*?)\"";
            str = replaceByRegex(str,regex);
        }
        str = replaceValueByRegex(str);
        str = replaceFieldsByRegex(str);
        System.out.println("处理TD_BI_TABLE_MODEL表结果:"+str);
        return str;
    }

    public static String replaceByRegex(String str,String regex){
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(str);
        StringBuffer sb = new StringBuffer();

        while (m.find()){
            System.out.println("匹配到串：" +m.group(0)+"|||转换字段: "+m.group(1)+" 为大写");
            if(!"null".equals(m.group(1))){
                if (m.group(1).contains("$")){
                    String replcaeStr = m.group(0).replaceAll(Matcher.quoteReplacement(m.group(1)),Matcher.quoteReplacement(m.group(1).toUpperCase()));
                    replcaeStr = Matcher.quoteReplacement(replcaeStr);
                    m.appendReplacement(sb, replcaeStr);
                }else{
                    m.appendReplacement(sb, m.group(0).replaceAll(m.group(1),m.group(1).toUpperCase()));
                }
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }

    public static String replaceExpressionByRegex(String str){
        String regex = "\"expression\":\"(.*?)\"";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
            //System.out.println("转换字段: "+m.group(1)+" 为大写");
            if(!"null".equals(m.group(1))){
                String expression = m.group(1);
                String regex1 = "Fields\\.(.*?)(\\+|\\-|\\*|/|\\))";
                expression = replaceByRegex(expression,regex1);
                m.appendReplacement(sb, m.group(0).replace(m.group(1),expression));
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }
    public static String replaceValueByRegex(String str){

        String regex = "\"value\":\"(.*?)\"";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
            //System.out.println("转换字段: "+m.group(1)+" 为大写");
            if(!"null".equals(m.group(1))){
                String expression = m.group(1);
                String regex1 = "Fields\\.(.*)(\\+|\\-|\\*|/|\\)?)";
                if(expression.contains("(")){
                    regex1 = "Fields\\..*\\((.*?)(\\+|\\-|\\*|/|\\))";
                }
                expression = replaceByRegex(expression,regex1);
                m.appendReplacement(sb, m.group(0).replace(m.group(1),expression));
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }

    public static String replaceFieldsByRegex(String str){
        // "fields":[
        //                    "doctor_name",
        //                    "curPeriodEndTimeData(drug_income)",
        //                    "curPeriodEndTimeWithCompare(drug_income)",
        //                    "(Fields.curPeriodEndTimeData(drug_income)-Fields.curPeriodEndTimeWithCompare(drug_income))/Fields.curPeriodEndTimeWithCompare(drug_income)",
        //                    "accumulatedData(drug_income)",
        //                    "accumulatedWithCompare(drug_income)",
        //                    "(Fields.accumulatedData(drug_income)-Fields.accumulatedWithCompare(drug_income))/Fields.accumulatedWithCompare(drug_income)"
        //                ],
        String regex = "\"fields\":\\[(.*?)\\]";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
            //System.out.println("转换字段: "+m.group(1)+" 为大写");
            if(!"null".equals(m.group(1))){
                String expression = m.group(1);
                String []es = expression.split(",");
                StringBuffer rs = new StringBuffer();
                for(int i=0;i<es.length;i++){
                    String s = es[i];
                    if(s.contains("(")){
                        if(s.contains("Fields")){
                            String regex1 = "Fields\\..*\\((.*?)(\\+|\\-|\\*|/|\\))";
                            s = replaceByRegex(s,regex1);
                        }else{
                            String regex1 = ".*\\((.*?)(\\+|\\-|\\*|/|\\))";
                            s = replaceByRegex(s,regex1);
                        }

                    }else{
                        s = s.toUpperCase();
                    }
                    rs.append(s);
                    if(i!=es.length-1){
                        rs.append(",");
                    }
                }

                m.appendReplacement(sb, m.group(0).replace(m.group(1),rs));
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }

}
