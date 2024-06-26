package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanxinxiView;


/**
 * 资产信息
 *
 * @author 
 * @email 
 * @date 2023-01-26 18:34:57
 */
public interface ZichanxinxiService extends IService<ZichanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanxinxiVO> selectListVO(Wrapper<ZichanxinxiEntity> wrapper);
   	
   	ZichanxinxiVO selectVO(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
   	
   	List<ZichanxinxiView> selectListView(Wrapper<ZichanxinxiEntity> wrapper);
   	
   	ZichanxinxiView selectView(@Param("ew") Wrapper<ZichanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZichanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZichanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZichanxinxiEntity> wrapper);



}

