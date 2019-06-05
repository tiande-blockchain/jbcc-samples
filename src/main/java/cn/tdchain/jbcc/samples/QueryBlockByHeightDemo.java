package cn.tdchain.jbcc.samples;

import cn.tdchain.Block;
import cn.tdchain.jbcc.Result;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query blcok by hegith
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryBlockByHeightDemo extends BaseDemo {

    public static void main(String[] args) {

        for (int i = 1; i < 3; i++) {
            blockByHeight(Long.valueOf(i));
        }
    }

    public static void blockByHeight(long height) {
        try {
            Result<Block> result = connection.getBlock(height);

            if (result.isSuccess()) {
                if (result.getEntity().getHeight().equals(height)) {
                    log.info("\n===> query max block success.");
                }
            } else {
                log.info("\n===> query max block fail.");
            }
            Tools.printResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
