package com.test.random;

/**
 * @Description:
 *
 * @Title: RandomUtil.java
 * @Package com.joyce.util
 * @Copyright: Copyright (c) 2014
 *
 * @author Comsys-LZP
 * @date 2014-4-29 下午03:14:06
 * @version V2.0
 */

import java.util.Random;

/**
 * @Description: 生成随机数
 *
 * @ClassName: RandomUtil
 * @Copyright: Copyright (c) 2014
 *
 * @author Comsys-LZP
 * @date 2014-4-29 下午03:14:06
 * @version V2.0
 */
public class RandomUtil {
    /**
     * 随机数的最小值
     */
    private static final Integer rand_min = 0;
    /**
     * 随机数的最大值
     */
    private static final Integer rand_max = 100;
    /**
     * 实例化对象
     */
    private static final Random RANDOM = new Random();

    /**
     * @Description: 生成指定范围的随机数[minValue,maxValue]
     *
     * @param minValue
     *            最小值
     * @param maxValue
     *            最大值
     * @return 指定范围内的随机数
     *
     * @Title: RandomUtil.java
     * @Copyright: Copyright (c) 2014
     *
     * @author Comsys-LZP
     * @date 2014-4-29 下午03:23:09
     * @version V2.0
     * @throws Exception
     */
    public static Integer appointRangeValue(Integer minValue, Integer maxValue) throws Exception {
        if(maxValue <= 0){
            throw new RuntimeException("maxValue must more than zero");
        }
        return RANDOM.nextInt(maxValue) % (maxValue - minValue + 1) + minValue;
    }

    /**
     * @Description: 生成指定结束值的随机数[startValue,100]
     *
     * @param startValue
     *            开始值
     * @return 开始值~100之间的值
     *
     * @Title: RandomUtil.java
     * @Copyright: Copyright (c) 2014
     *
     * @author Comsys-LZP
     * @date 2014-4-29 下午03:37:21
     * @version V2.0
     * @throws Exception
     */
    public static Integer appointStartValue(Integer startValue) throws Exception {
        return appointRangeValue(startValue, rand_max);
    }

    /**
     * @Description: 生成指定结束值的随机数[0,endValue]
     *
     * @param endValue
     *            结束值
     * @return 0~指定结束值之间的值
     *
     * @Title: RandomUtil.java
     * @Copyright: Copyright (c) 2014
     *
     * @author Comsys-LZP
     * @date 2014-4-29 下午03:34:35
     * @version V2.0
     * @throws Exception
     */
    public static Integer appointEndValue(Integer endValue) throws Exception {
        return appointRangeValue(rand_min, endValue);
    }

    public static Float randomFloat(){
        return RANDOM.nextFloat()*10000;
    }
}

