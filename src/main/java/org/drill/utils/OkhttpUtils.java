package org.drill.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class OkhttpUtils {
	
	public static StringBuffer info;
	public static JSONObject jsonObject;
	
	public static JSONObject selectApi(String url, String name , String queryNo){
		
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
				.url(url)
				.get()
				.build();
		Response response;
		try {
			response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				System.out.println("服务器连接错误!");
			}
			String result = response.body().string();
			jsonObject = JSONObject.fromObject(result);
			jsonObject = JsonUtil.transToLowerObject(jsonObject);
			System.out.println(jsonObject);
			
			String idCard = queryNo;
			String qureyName = name;
			info = new StringBuffer();
			if(qureyName != null && qureyName.length() > 0){
				info.append("[{'label':'姓名','key':'name','value':").append(qureyName).append("}").append(",{'label':'身份证','key':'idCard','value':").append(idCard).append("}]");
			}
			
			info.append("{'label':'身份证','key':'idCard','value':").append(idCard).append("}");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

}
