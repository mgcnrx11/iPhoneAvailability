package im.jianyu.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLDecoder;

/**
 * 用于处理Post到Server酱的返回结果请求
 */
public class ServerChanResponseHandler implements ResponseHandler<JSONObject> {
    /**
     * Processes an {@link HttpResponse} and returns some value
     * corresponding to that response.
     *
     * @param response The response to process
     * @return A value determined by the response
     * @throws ClientProtocolException in case of an http protocol error
     * @throws IOException             in case of a problem or the connection was aborted
     */
    @Override
    public JSONObject handleResponse(HttpResponse response) throws IOException {
        HttpEntity entity = response.getEntity();
        ContentType contentType = ContentType.getOrDefault(entity);

        String responseContent = EntityUtils.toString(entity, contentType.getCharset());
        String resultMessage = URLDecoder.decode(responseContent, "UTF-8");

        return JSON.parseObject(resultMessage);
    }
}
