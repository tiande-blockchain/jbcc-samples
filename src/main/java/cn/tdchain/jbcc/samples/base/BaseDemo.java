package cn.tdchain.jbcc.samples.base;


import cn.tdchain.jbcc.Connection;
import cn.tdchain.jbcc.ConnectionFactory;

/**
 * function：description
 * datetime：2019-03-27 14:58
 * author：warne
 */
public abstract class BaseDemo {
    protected static String[] iptables = new String[]{"192.168.1.101"};
    //# 访问天德云区块链的端口
    protected final static int port = 18088;
    protected final static long timeout = 3000;
    //# 访问天德云区块链的token, 注册成功之后即可获取有效token
    protected final static String token = "JFB13JBS7Z7NMZRSII643JF3TPI2MNBR66";
    //# 访问天德云区块链时需要的证书,注册成功之后即可下载证书,keystorePath为证书存放路径
    protected final static String keystorePath = "D:\\keys\\rsa\\rsa_tiande_client.pfx";
    //# 证书别名
    protected final static String keystoreAlia = "tdcert";
    //# keystore文件的密码
    protected final static String keystorePasswd = "123456";
    protected static ConnectionFactory factory = null;

    static {

        factory = ConnectionFactory.ConnectionConfig.builder().iptables(iptables)
                .port(port)
                .timeout(timeout)
                .token(token)
                .keystorePtah(keystorePath)
                .keystorePassword(keystorePasswd)
                .keystoreAlia(keystoreAlia).build();
    }

    protected static Connection connection = factory.getConnection();

}
