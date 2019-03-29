package cn.tdchain.jbcc.samples;

import cn.tdchain.Block;
import cn.tdchain.Trans;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query blcok by hegith
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryBlockByHeightDemo extends BaseDemo {

    public static void main(String[] args) {

        long height = 5;
        try {
            Block<Trans> block = connection.getBlock(height);
            if (block != null) {
                if (block.getHeight().equals(height)) {
                    System.out.println("\n===> query max block success.");
                }
            } else {
                System.out.println("\n===> query max block fail.");
            }
            Tools.printResult(block);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
