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
            //# 交易hash
            String hash = "22_3ee5f300e77beddec41e2ff66d247f0a77db93117231765881e2e2d820c7bff7";
            //# 向云区块链服务执行查询操作
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
