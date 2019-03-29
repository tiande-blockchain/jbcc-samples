package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

import java.util.List;

/**
 * function：query lastest trans history by key and version
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryTransHistoryByKeyAndVersionDemo extends BaseDemo {

    public static void main(String[] args) {

        String key = "warne";
        int startIndex = 1;
        int endIndex = 30;
        try {
            List<Trans> transList = connection.getTransHistoryByKey(key, startIndex, endIndex);
            System.out.println("\n===> query result: ");

            Tools.printResult(transList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
