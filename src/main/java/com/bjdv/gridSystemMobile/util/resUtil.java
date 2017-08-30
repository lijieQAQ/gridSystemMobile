package com.bjdv.gridSystemMobile.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;


public class resUtil {
	public static void resString(HttpServletResponse response,Object jsonObject){
		JSONObject json=JSONObject.fromObject(jsonObject);
		response.setCharacterEncoding("utf-8");
		PrintWriter writer;
		try {
			writer = response.getWriter();
			writer.print(json);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
