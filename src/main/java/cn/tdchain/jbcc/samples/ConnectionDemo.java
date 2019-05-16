package cn.tdchain.jbcc.samples;

import cn.tdchain.jbcc.Connection;
import cn.tdchain.jbcc.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * function：connection实例的获取方式
 * <p>
 * datetime：2019-03-28 14:58
 * author：warne
 */
public class ConnectionDemo {
    protected final static Logger log = LoggerFactory.getLogger("jbcc-samples");

    /**
     * 云区块链服务节点ip列表，当前是测试环境，所以只配置了一个节点，
     * 若为正式环境时，此处应为多个节点，eg:
     * iptables=new String[]{"125.12.2.33","190.11.22.45","210.45.88.52","116.45.3.12"};
     *
     *  或者
     * iptables = new String[]{
     *             "open-tdcb-node1.tdchain.cn",
     *             "open-tdcb-node2.tdchain.cn",
     *             "open-tdcb-node3.tdchain.cn",
     *             "open-tdcb-node4.tdchain.cn"};
     */
    protected static String[] iptables = new String[]{"127.0.0.1"};
    //# 访问天德云区块链的端口, 默认为18088
    protected final static int port = 18088;
    //# 连接超时时间，默认3秒,
    protected final static long timeout = 3000;
    //# 访问天德云区块链的token, 申请证书成功之后即可获取有效token
    protected final static String token = "JFB13JBS7Z7NMZRSII643JF3TPI2MNBR66";
    //# 访问天德云区块链时需要的授权文件,登录成功之后即可下载证书, keystorePath为证书存放路径
    protected final static String keystorePath = "D:\\keys\\rsa\\rsa_tiande_client.pfx";
    //# keystore文件的密码
    protected final static String keystorePasswd = "123456";


    public static void main(String[] args) {

        ConnectionFactory.ConnectionConfig.Builder builder = ConnectionFactory.ConnectionConfig.builder();
        //# 构建配置信息
        ConnectionFactory factory = builder.iptables(iptables)
                .port(port)
                .timeout(3000)
                .token(token)
                .keystorePtah(keystorePath)
                .keystorePassword(keystorePasswd).build();

        //# 获取连接器实例
        Connection connection = factory.getConnection();





        log.info("connection is {}", connection);
        connection = factory.getConnection();
        log.info("connection is {}", connection);

        //# 构建配置信息
        factory = builder.iptables(iptables)
                .port(port)
                .timeout(100)
                .token(token)
                .keystorePtah(keystorePath)
                .keystorePassword(keystorePasswd).build();

        //# 获取连接器实例
        connection = factory.getConnection();
        log.info("connection is {}", connection);

    }
}
