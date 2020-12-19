package com.yx.cdss.extract.provider.serice.dict;

import com.yx.cdss.extract.model.entity.DictDrug;

import java.util.List;

public interface DictionaryService {
	
	
	/**
	 *  #查询药物字典
	 * @param drugCode
	 * @return
	 */
	public List<DictDrug> queryDictDrug(String drugCode);
	
	/**
	 * #插入字典药物
	 * @param dictDrug
	 */
	public void insert(DictDrug dictDrug);

}
