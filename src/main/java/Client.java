import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args){
        try{
            MyInterface proxy = RPC.getProxy(MyInterface.class,1L,
                    new InetSocketAddress("127.0.0.1",42312),new Configuration());
            String res = proxy.findName(20210735010131L);
            System.out.print(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
