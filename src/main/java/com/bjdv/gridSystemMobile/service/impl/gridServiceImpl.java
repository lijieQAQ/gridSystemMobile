package com.bjdv.gridSystemMobile.service.impl;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjdv.gridSystemMobile.pojo.Grid;
import com.bjdv.gridSystemMobile.pojo.Grid_Map;
import com.bjdv.gridSystemMobile.pojo.Notice;
import com.bjdv.gridSystemMobile.pojo.SysMetadataDict;
import com.bjdv.gridSystemMobile.pojo.SysStaff;
import com.bjdv.gridSystemMobile.service.gridService;
import com.bjdv.gridSystemMobile.util.Page;
import com.bjdv.gridSystemMobile.mapper.gridMapper;





/**
 * @author lijie
 *
 */
@Service
public class gridServiceImpl implements gridService {
	@Autowired
	private gridMapper gridMapper;

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#getGridList(java.lang.String, char, com.bjdv.gridSystem.util.Page)
	 * 获取所有可用网格
	 */
	@Override
	public List<Grid> getGridList(String create_staff,char state,Page<Grid> page) {
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("create_staff",create_staff);
		params.put("state", state);
		params.put("start", (page.getPageIndex()-1)*page.getPageSize());
		params.put("end", page.getPageIndex()*page.getPageSize());
		return gridMapper.getGridList(params);
	}

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#deleteGridById(java.lang.String)
	 * 根据网格id删除网格
	 */
	@Override
	public int deleteGridById(String id) {
		// TODO Auto-generated method stub
		return gridMapper.deleteGridById(id);
	}

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#getGisByGridId(java.lang.String)
	 * 根据网格id获取位置点绘制网格
	 */
	@Override
	public List<Grid_Map> getMapByGridId(String grid_id) {
		// TODO Auto-generated method stub
		return gridMapper.getMapByGridId(grid_id);
	}

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#getQuota(java.lang.String)
	 * 获取指标信息
	 */
	@Override
	public List<Map<String, String>> getQuota(String target_type,
			String target_id, String batch_id) {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("target_type",target_type);
		params.put("target_id", target_id);
		params.put("batch_id",batch_id);
		return gridMapper.getQuota(params);
	}
	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#getGridWithMap(java.lang.String)
	 * 获取网格信息
	 */
	@Override
	public List<Grid> getGridWithMap(String create_staff,String state) {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("create_staff",create_staff);
		params.put("state", state);
		return gridMapper.getGridWithMap(params);
	}

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#getNoticeList(java.lang.String)
	 * 获取公告list
	 */
	@Override
	public List<Notice> getNoticeList(Page<Notice> page) {
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("start", (page.getPageIndex()-1)*page.getPageSize());
		params.put("end", page.getPageIndex()*page.getPageSize());
		return gridMapper.getNoticeList(params);
	}

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystem.service.gridService#getMetadataList(java.lang.String)
	 * 获取字典数据
	 */
	@Override
	public List<SysMetadataDict> getMetadataList(String string) {
		// TODO Auto-generated method stub
		return gridMapper.getMetadataList(string);
	}
	
	/* (non-Javadoc)
	 * @see com.bjdv.gridSystemMobile.service.gridService#login(java.lang.String)
	 * 登录接口
	 */
	@Override
	public SysStaff login(String wcode) {
		// TODO Auto-generated method stub
		return gridMapper.login(wcode);
	}

	/* (non-Javadoc)
	 * @see com.bjdv.gridSystemMobile.service.gridService#editGrid(com.bjdv.gridSystemMobile.pojo.Grid)
	 * 修改网格
	 */
	@Override
	public int editGrid(Grid grid) {
		// TODO Auto-generated method stub
		return gridMapper.editGrid(grid);
	}


}
