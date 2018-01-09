package org.bb.ssm.service;

import java.util.List;

import org.bb.ssm.model.Titles;

/**
 * Dao���Ǻ����ݿ�򽻵��ģ�Service����װ�����ҵ���е����.. e.g. �û�����ϵͳ
 * dao��װ���û�����ɾ�Ĳ顣��ҵ����Ҫ������ɾ���û���Service�Ϳ��Է�װ��һ������ɾ���û��Ĺ���
 * ������ʵ��ֻ��ѭ������dao�ĵ���ɾ��  
 * �˴�û�������ҵ���������Ժ�dao��д��һģһ��
 * 
 * @author Administrator
 *
 */
public interface TitlesInfoService {

	List<Titles> findAll();
	
	int deleteByPrimaryKey(Integer id);

	int insert(Titles record);

	int insertSelective(Titles record);

	Titles selectByPrimaryKey(Integer id);
	
	Titles selectByPwd(Titles record);

	int updateByPrimaryKeySelective(Titles record);

	int updateByPrimaryKey(Titles record);
}