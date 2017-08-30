package com.bjdv.gridSystemMobile.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bjdv.gridSystemMobile.pojo.Grid;
import com.bjdv.gridSystemMobile.pojo.Grid_Map;
import com.bjdv.gridSystemMobile.pojo.Notice;
import com.bjdv.gridSystemMobile.pojo.SysMetadataDict;
import com.bjdv.gridSystemMobile.pojo.SysStaff;



@Mapper
public interface gridMapper {

	List<Grid> getGridList(Map<String, Object> params);

	int deleteGridById(String id);

	List<Grid_Map> getMapByGridId(String grid_id);

	List<Map<String, String>> getQuota(Map<String, Object> params);

	List<Grid> getGridWithMap(Map<String, Object> params);

	List<Notice> getNoticeList(Map<String, Object> params);

	List<SysMetadataDict> getMetadataList(String string);

	SysStaff login(String wcode);

	int editGrid(Grid grid);

}
