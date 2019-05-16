package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.rpc.RPCResult;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

import java.util.List;

/**
 * function：query trans by type
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryTransByTypeDemo extends BaseDemo {

    public static void main(String[] args) {

        String type = "Test";
        try {
            RPCResult<List<Trans>> result = connection.getTransListByType(type);

            log.info("\n===> query result: ");

            Tools.printResult(result.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
