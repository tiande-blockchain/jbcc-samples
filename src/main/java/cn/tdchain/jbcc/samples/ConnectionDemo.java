package cn.tdchain.jbcc.samples;

import cn.tdchain.jbcc.Connection;
import cn.tdchain.jbcc.ConnectionFactory;

/**
 * function：connection实例的获取方式
 * <p>
 * datetime：2019-03-28 14:58
 * author：warne
 */
public class ConnectionDemo {

    protected static String[] iptables = new String[]{"192.168.1.101"};
    //# 访问天德云区块链的端口
    protected final static int port = 18088;
    protected final static long timeout = 100;
    //# 访问天德云区块链的token, 注册成功之后即可获取有效token
    protected final static String token = "JFB13JBS7Z7NMZRSII643JF3TPI2MNBR66";
    //# 访问天德云区块链时需要的证书,注册成功之后即可下载证书,keystorePath为证书存放路径
    protected final static String keystorePath = "D:\\keys\\rsa\\rsa_tiande_client.pfx";
    //# 证书别名
    protected final static String keystoreAlia = "tdcert";
    //# keystore文件的密码
    protected final static String keystorePasswd = "123456";

    public static void main(String[] args) {
        ConnectionFactory.ConnectionConfig.Builder builder = ConnectionFactory.ConnectionConfig.builder();
        ConnectionFactory factory = builder.iptables(iptables)
                .port(port)
                .timeout(3000)
                .token(token)
                .keystorePtah(keystorePath)
                .keystorePassword(keystorePasswd)
                .keystoreAlia(keystoreAlia).build();


        Connection connection = factory.getConnection();

        System.out.println("connection is " + connection);
        connection = factory.getConnection();
        System.out.println("connection is " + connection);

        factory = builder.iptables(iptables)
                .port(port)
                .timeout(100)
                .token(token)
                .keystorePtah(keystorePath)
                .keystorePassword(keystorePasswd)
                .keystoreAlia(keystoreAlia).build();

        connection = factory.getConnection();
        System.out.println("connection is " + connection);

    }
}
