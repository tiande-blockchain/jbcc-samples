package cn.tdchain.jbcc.samples;

import cn.tdchain.Trans;
import cn.tdchain.jbcc.Result;
import cn.tdchain.jbcc.bql.BQL;
import cn.tdchain.jbcc.bql.BQLResult;
import cn.tdchain.jbcc.bql.Condition;
import cn.tdchain.jbcc.samples.base.BaseDemo;
import cn.tdchain.jbcc.samples.util.Tools;

/**
 * function：query lastest trans by BQL（BlockChain Query Langage）
 * datetime：2020-04-27 14:33
 * author：xiaoming
 */
public class BqlQueryTrans extends BaseDemo {

    public static void main(String[] args) {
    	//第一个条件：姓名等于=xiaoming  的
    	Condition c1 = new Condition("name", BQL.Relationship.equal, "xiaoming");
    	
    	//第二个条件：年龄大于18岁 的
    	Condition c2 = new Condition("age", BQL.Relationship.greater, 18);
    	
    	//条件c1和c2是并且关系，一次查询可同时支持10个条件对象Condition
    	c1.setAnd(c2);//相当于: name=="xiaoming" && age > 18
    	
        //BQL区块链面向对象查询条件，根据k、v条件查询交易列表。
    	BQL bql = new BQL();
    	bql.setPage(1);//默认查询第一页
    	bql.setCondition(c1);
    	
        try {
            Result<BQLResult> result = connection.getNewTransByBQL(bql);

            if (result.isSuccess()) {
            	BQLResult bqlResult = result.getEntity();
            	log.info("bqlResult page=" + bqlResult.getPage());//page int 获取本次返回的页码坐标，页码坐标最小是：1 （俗称第一页）
            	log.info("bqlResult size=" + bqlResult.getSize());//size int 本次查询总条数
            	log.info("bqlResult count=" + bqlResult.getCount());//count int 本次实际返回条数，一次查询返回不会超过30条，否则系统会自动分页。
            	log.info("bqlResult getList().size()=" + bqlResult.getList().size());
    			for (Trans t : bqlResult.getList()) {
    				log.info(t.toJsonString());
    			}
                log.info("\n===> query new trans success.");
            } else {
                log.info("\n===> query new trans fail.");
            }
            Tools.printResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
