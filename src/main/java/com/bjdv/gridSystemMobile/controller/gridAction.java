package com.bjdv.gridSystemMobile.controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjdv.gridSystemMobile.pojo.Grid;
import com.bjdv.gridSystemMobile.pojo.Grid_Map;
import com.bjdv.gridSystemMobile.pojo.Notice;
import com.bjdv.gridSystemMobile.pojo.SysMetadataDict;
import com.bjdv.gridSystemMobile.pojo.SysStaff;
import com.bjdv.gridSystemMobile.pojo.resultData;
import com.bjdv.gridSystemMobile.service.gridService;
import com.bjdv.gridSystemMobile.util.MD5Encrypt;
import com.bjdv.gridSystemMobile.util.Page;
import com.bjdv.gridSystemMobile.util.resUtil;
import java.security.MessageDigest;


/**
 * @author lijie
 *
 */
@SuppressWarnings("all")
@Controller
@RequestMapping("/")
public class gridAction {
	private static final Log log = LogFactory.getLog(gridAction.class);
	
	@Autowired
	private gridService gridService;
	/**
	 * @param request
	 * @param response
	 * 获取网格
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/getGrid")
	public void getGrid(HttpServletRequest request,HttpServletResponse response,String create_staff,char state,int pageNumber,int pageSize) throws IOException{
		Page<Grid> page=new Page<Grid>(pageNumber, pageSize);
		List<Grid> gridList=gridService.getGridList(create_staff,state,page);
		resultData data=new resultData();
		if(gridList!=null && gridList.size()>0){
			data.setData(gridList);
			data.setStatus("success");
			data.setInfo("查询成功");
		}else{
			data.setStatus("fail");
			data.setInfo("查询失败");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 删除网格
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/deleteGrid")
	public void deleteGrid(HttpServletRequest request,HttpServletResponse response,String id) throws IOException{
		int result=gridService.deleteGridById(id);
		resultData data=new resultData();
		if(result==1){
			data.setStatus("success");
			data.setInfo("删除成功");
		}else{
			data.setStatus("fail");
			data.setInfo("删除失败");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 根据网格id获取gis
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/getMapByGridId")
	public void getMapByGridId(HttpServletRequest request,HttpServletResponse response,String grid_id) throws IOException{
		List<Grid_Map> mapList=gridService.getMapByGridId(grid_id);
		resultData data=new resultData();
		if(mapList.size()>0 && mapList!=null){
			data.setData(mapList);
			data.setStatus("success");
			data.setInfo("查询成功");
		}else{
			data.setStatus("fail");
			data.setInfo("查询失败");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 根据网格id获取gis
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/getGridWithMap")
	public void getGridWithMap(HttpServletRequest request,HttpServletResponse response,String create_staff,String state) throws IOException{
		List<Grid> mapList=gridService.getGridWithMap(create_staff,state);
		resultData data=new resultData();
		if(mapList.size()>0 && mapList!=null){
			data.setData(mapList);
			data.setStatus("success");
			data.setInfo("查询成功");
		}else{
			data.setStatus("fail");
			data.setInfo("查询失败");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/getQuota")
	public void getQuota(HttpServletRequest request,HttpServletResponse response,String target_type,String target_id,String batch_id) throws IOException{
		List<Map<String, String>> mapList=gridService.getQuota(target_type,target_id,batch_id);
		resultData data=new resultData();
		if(mapList.size()>0 && mapList!=null){
			data.setData(mapList);
			data.setStatus("success");
			data.setInfo("查询成功");
		}else{
			data.setStatus("fail");
			data.setInfo("查询失败");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 获取在线浏览公告
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/getNoticeList")
	public void getNoticeList(HttpServletRequest request,HttpServletResponse response,int pageNumber,int pageSize) throws IOException{
		Page<Notice> page=new Page<Notice>(pageNumber, pageSize);
		List<Notice> NoticeList=gridService.getNoticeList(page);
		resultData data=new resultData();
		if(NoticeList.size()>0 && NoticeList!=null){
			for (Notice notice2 : NoticeList) {
				String srt=new String(notice2.getContent(),"UTF-8");
				notice2.setContentByte(srt);
			}
			data.setData(NoticeList);
			data.setStatus("success");
			data.setInfo("查询成功");
		}else{
			data.setStatus("fail");
			data.setInfo("查询失败");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 查看公告详情时获取优先级和公告类型
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/getMetadataList")
	public void getMetadataList(HttpServletRequest request,HttpServletResponse response,String content) throws IOException{
		resultData data=new resultData();
		if(content!=null && content!=""){
			String[] split = content.split(",");
			ArrayList<List> arrayList=new ArrayList<List>();
			for (String string : split) {
				List<SysMetadataDict> metadatas = gridService.getMetadataList(string);
				arrayList.add(metadatas);
			}
			if(arrayList.size()>0 && arrayList!=null){
				data.setData(arrayList);
				data.setStatus("success");
				data.setInfo("查询成功");
			}else{
				data.setStatus("fail");
				data.setInfo("查询失败");
			}
		}else{
			data.setStatus("fail");
			data.setInfo("请传入参数");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 登录
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/login")
	public void login(HttpServletRequest request,HttpServletResponse response,String wcode,String password) throws IOException{
		SysStaff sysStaff=gridService.login(wcode);
		resultData data=new resultData();
		if(sysStaff!=null){
			String inPassword=MD5Encrypt.MD5Encode(password);
			if(inPassword.equals(sysStaff.getPassword())){
				data.setData(sysStaff);
				data.setStatus("success");
				data.setInfo("查询成功");
			}else{
				data.setStatus("fail");
				data.setInfo("密码错误");
			}
		}else{
			data.setStatus("fail");
			data.setInfo("用户名不存在");
		}
		resUtil.resString(response, data);
	}
	/**
	 * @param request
	 * @param response
	 * 修改网格
	 * @return 
	 * @throws IOException 
	 */
	@RequestMapping("/editGrid")
	public void editGrid(HttpServletRequest request,HttpServletResponse response,Grid grid) throws IOException{
		int status=gridService.editGrid(grid);
		resultData data=new resultData();
		if(status!=0){
			data.setStatus("success");
			data.setInfo("修改成功");
		}else{
			data.setStatus("fail");
			data.setInfo("修改失败");
		}
		resUtil.resString(response, data);
	}
}
