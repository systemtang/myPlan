package demo.plan.util;

import com.alibaba.fastjson.JSONObject;

public class JSONUtil {

	public static JSONObject getReqJSON(String reqData) throws Exception {
		JSONObject reqOBJ = null;
		if(reqData != null) {
			reqOBJ = JSONObject.parseObject(reqData);
		}
		return reqOBJ;
	}
	
	public static JSONObject getRespJSON() throws Exception {
		JSONObject respOBJ = new JSONObject();
		respOBJ.put("result", false);
		return respOBJ;
	}
	
	public static String returnJSON(JSONObject respData) {
		String respOBJ = "";
		if(respData != null) {
			respOBJ = respData.toJSONString();
		}
		return respOBJ;
	}

}
