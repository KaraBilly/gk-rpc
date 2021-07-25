import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyInterfaceImpl implements MyInterface{
    Map<Long,String> data= new HashMap(){
    };

    public MyInterfaceImpl(){
        data.put(20210735010131L,"乔盛飞");
    }

    @Override
    public String findName(long studentId) {
        System.out.print("\n"+studentId);
        return data.get(studentId);
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return MyInterface.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        //return null;
        return new ProtocolSignature(MyInterface.versionID,null);
    }
}
