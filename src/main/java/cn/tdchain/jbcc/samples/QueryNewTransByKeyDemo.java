package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query lastest trans by key
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryNewTransByKeyDemo extends BaseDemo {

    public static void main(String[] args) {

        String key = "warne";
        try {
            Trans newTrans = connection.getNewTransByKey(key);
            if (newTrans != null) {
                if (newTrans.getKey().equals(key)) {
                    System.out.println("\n===> query new trans success.");
                }
            } else {
                System.out.println("\n===> query new trans fail.");
            }
            Tools.printResult(newTrans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
