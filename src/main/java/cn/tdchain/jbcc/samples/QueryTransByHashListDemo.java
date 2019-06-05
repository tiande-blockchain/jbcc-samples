package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.Result;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

import java.util.Arrays;
import java.util.List;

/**
 * function：query list trans by hash lsit
 * datetime：2019-03-27 14:33
 * author：warne
 */
public class QueryTransByHashListDemo extends BaseDemo {

    public static void main(String[] args) {

        try {
            List<String> hashList = Arrays.asList(
                    "0f08877ed1f0a400854b518b3390450939687a57db21fcfeb8e8aa528a0e4feb1",
                    "88bf4a94b59fc4ee8a6fc4bb5e425c12785d2b0c65126784edb7eb609138f93e2",
                    "93dda14dd4b36eb9ecae50f06d6975eda1df563a8f9a646ce1bf474d6fbdfc2c3",
                    "43ae2352a6a3b7c7c41fddeaafe0f9795fb517483e8976a38461226fa45928614",
                    "34ff5fa355c15ca37d379efd6abc1f0ca21bcec6ae8c3e635f625af9dd9c6a445");

            Result<List<Trans>> result = connection.getTransListByHashList(hashList);
            log.info("\n===> query result: ");

            Tools.printResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
