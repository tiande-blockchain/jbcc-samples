package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query trans by hash
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryTransByHashDemo extends BaseDemo {

    public static void main(String[] args) {

        try {
            String hash = "1_170c13d9ddc7e61f18e9fa2d7e9e9632075dbc68d742398e18126d08fd8c29c8";
            Trans result = connection.getTransByHash(hash);

            if (result != null) {
                if (result.getHash().equals(hash)) {
                    System.out.println("\n===> query trans success by hash.");
                } else {
                    System.out.println("\n===> query trans fail by hash.");
                }
            } else {
                System.out.println("\nnot fount trans .");
            }

            Tools.printResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
