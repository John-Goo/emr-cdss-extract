package com.yx.cdss.extract.provider.serice.dict;

import com.yx.cdss.extract.model.entity.DictDrug;
import com.yx.cdss.extract.model.entity.DictDrugExample;
import com.yx.cdss.extract.model.mapper.DictDrugMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("dictionaryService")
public class DictionaryServiceImpl implements  DictionaryService{ 
	
	@Resource
	private DictDrugMapper dictDrugMapper;

	@Override
	public List<DictDrug> queryDictDrug(String drugCode) {
		DictDrugExample criteria = null;
		if(drugCode !=null) {
			 criteria = new DictDrugExample();
			 criteria.createCriteria().andDrugCodeEqualTo(drugCode);
		}
		//DictDrug dd = dictDrugMapper.selectById(1l);
		//System.out.println(" dd:"+dd);
		
		return dictDrugMapper.selectByExample(criteria);
	}

	@Override
	public void insert(DictDrug dictDrug) {
		dictDrugMapper.insert(dictDrug);
	}

}
