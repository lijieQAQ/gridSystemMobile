package com.bjdv.gridSystemMobile.service;

import java.util.List;
import java.util.Map;

import com.bjdv.gridSystemMobile.pojo.Grid;
import com.bjdv.gridSystemMobile.pojo.Grid_Map;
import com.bjdv.gridSystemMobile.pojo.Notice;
import com.bjdv.gridSystemMobile.pojo.SysMetadataDict;
import com.bjdv.gridSystemMobile.pojo.SysStaff;
import com.bjdv.gridSystemMobile.util.Page;



public interface gridService {

	List<Grid> getGridList(String create_staff, char state, Page<Grid> page);

	int deleteGridById(String id);

	List<Grid_Map> getMapByGridId(String grid_id);

	List<Map<String, String>> getQuota(String target_type, String target_id, String batch_id);

	List<Grid> getGridWithMap(String create_staff, String state);

	List<Notice> getNoticeList(Page<Notice> page);

	List<SysMetadataDict> getMetadataList(String string);

	SysStaff login(String wcode);

	int editGrid(Grid grid);


}
