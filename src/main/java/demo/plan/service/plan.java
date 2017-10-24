//package demo.plan.service;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.List;
//import java.util.Map;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//public class plan {
//	
//	private static String URL = "http://ces.foresealife.com/ces/user/query.do";
//	/**
//     * 向指定URL发送GET方法的请求
//     * 
//     * @param url
//     *            发送请求的URL
//     * @param param
//     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
//     * @return URL 所代表远程资源的响应结果
//     */
//    public static String sendGet(String userCode) {
//        String result = "";
//        BufferedReader in = null;
//        try {
//        	String param = "userCode=" + userCode + "&userType=&userName=&orgId=&title=&status=";
//            String urlNameString = URL + "?" + param;
//            URL realUrl = new URL(urlNameString);
//            // 打开和URL之间的连接
//            URLConnection connection = realUrl.openConnection();
//            // 设置通用的请求属性
//            connection.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
//            connection.setRequestProperty("connection", "Keep-Alive");
//            connection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");
//            connection.setRequestProperty("Cookie", "JSESSIONID=PJozXMXWGm+SPuXMBCrqODXa; sto-id-20480-pool_ces=IIAADMAKJABP");
//            // 建立实际的连接
//            connection.connect();
//            // 获取所有响应头字段
//            Map<String, List<String>> map = connection.getHeaderFields();
//            // 遍历所有的响应头字段
////            for (String key : map.keySet()) {
////                System.out.print(key + "--->" + map.get(key) + ";");
////            }
////            System.out.println();
//            
//            // 定义 BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(new InputStreamReader(
//                    connection.getInputStream()));
//            String line;
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }
//            JSONObject obj = JSONArray.parseObject(result);
//            Integer total = obj.getInteger("total");
//            if(total > 0) {
//            	System.out.println("存在账号为：" + userCode + " 的用户有数据！");
//            }
//        } catch (Exception e) {
//            System.out.println("发送GET请求出现异常！" + e);
//            e.printStackTrace();
//        }
//        // 使用finally块来关闭输入流
//        finally {
//            try {
//                if (in != null) {
//                    in.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//        return result;
//    }
//}
