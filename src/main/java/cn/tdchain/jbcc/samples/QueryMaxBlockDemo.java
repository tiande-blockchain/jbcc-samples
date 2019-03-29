package cn.tdchain.jbcc.samples;

import cn.tdchain.Block;
import cn.tdchain.Trans;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query max block
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryMaxBlockDemo extends BaseDemo {

    public static void main(String[] args) {

        try {
            Block<Trans> maxBlock = connection.getMaxBlock();
            if (maxBlock != null) {
                System.out.println("\n===> query max block success.");
            } else {
                System.out.println("\n===> query max block fail.");
            }

            Tools.printResult(maxBlock);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
