package com.jzh.utils;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;
import java.io.IOException;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public class UploadImg {
    //���ú��˺ŵ�ACCESS_KEY��SECRET_KEY
    String ACCESS_KEY = "kEg-P264ezTGiKlnHjOENI71CzcxNk30KIecYsf_";
    String SECRET_KEY = "1zU6_956bO0un56e5IwJx2gxpcOeJ0AsrZPn9JOU";
    //Ҫ�ϴ��Ŀռ�
    String bucketname = "jzh-test";
    //�ϴ�����ţ�󱣴���ļ���
    String key = "my-java.png";
    //�ϴ��ļ���·��
    String FilePath = "/.../...";

    //��Կ����
    Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

    ///////////////////////ָ���ϴ���Zone����Ϣ//////////////////
    //��һ�ַ�ʽ: ָ�������Ҫ�ϴ���zone
    //ע���þ���ָ���ķ�ʽ�������Զ�ʶ��ķ�ʽѡ����һ����
    //Ҫ�ϴ��Ŀռ�(bucket)�Ĵ洢����Ϊ����ʱ
    // Zone z = Zone.zone0();
    //Ҫ�ϴ��Ŀռ�(bucket)�Ĵ洢����Ϊ����ʱ
    Zone z = Zone.zone1();
    //Ҫ�ϴ��Ŀռ�(bucket)�Ĵ洢����Ϊ����ʱ
    // Zone z = Zone.zone2();

    //�ڶ��ַ�ʽ: �Զ�ʶ��Ҫ�ϴ��Ŀռ�(bucket)�Ĵ洢�����ǻ��������������ϡ�
    //Zone z = Zone.autoZone();
    Configuration c = new Configuration(z);

    //�����ϴ�����
    UploadManager uploadManager = new UploadManager(c);

    public static void main(String args[]) throws IOException {
        new UploadImg().upload();
    }

    //���ϴ���ʹ��Ĭ�ϲ��ԣ�ֻ��Ҫ�����ϴ��Ŀռ����Ϳ�����
    public String getUpToken() {
        return auth.uploadToken(bucketname);
    }

    public void upload() throws IOException {
        try {
            //����put�����ϴ�
            Response res = uploadManager.put(FilePath, key, getUpToken());
            //��ӡ���ص���Ϣ
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // ����ʧ��ʱ��ӡ���쳣����Ϣ
            System.out.println(r.toString());
            try {
                //��Ӧ���ı���Ϣ
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }
    }
}
