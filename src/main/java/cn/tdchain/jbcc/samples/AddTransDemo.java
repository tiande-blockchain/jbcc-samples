package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * function：add a trans
 * <p>
 * datetime：2019-03-26 16:03
 * author：warne
 */
public class AddTransDemo extends BaseDemo {

    public static void main(String[] args) {

        try {
            //# 构建出一笔交易信息
            Trans trans = trans();
            //# 发起一笔交易到云区块链服务中
            Trans result = connection.addTrans(trans);
            if (result != null && result.getStatus() == Trans.TransStatus.success) {
                //# 根据返回结果状态判断是否成功
                System.out.println("\n===> add trans success.");
            } else {
                System.out.println("\n===> add trans fail.");
            }

            Tools.printResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 构造一笔交易信息
     *
     * @return
     */
    public static Trans trans() {
        Trans trans = new Trans();
        trans.setKey("warne");//# key是当前交易的维度
        Map<String, Object> data = new HashMap<>();
        data.put("name", "warne");
        data.put("age", 20);
        data.put("where", "I am tian de technology.");
        trans.setData(JSON.toJSONString(data));
        trans.setType("Test");

        return trans;
    }
}
