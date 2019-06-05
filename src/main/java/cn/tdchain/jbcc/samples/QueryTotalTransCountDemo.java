/*
 *
 *  *   @project        jbcc-samples
 *  *   @file           QueryTotalTransCountDemo
 *  *   @author         warne
 *  *   @date           19-4-1 下午5:58
 *
 */

package cn.tdchain.jbcc.samples;

import cn.tdchain.jbcc.Result;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query total trans count
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryTotalTransCountDemo extends BaseDemo {

    public static void main(String[] args) {

        try {
            Result<Long> result = connection.getTotalTransCount();
            Tools.printResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
