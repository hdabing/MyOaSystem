package com.bookmanage.ssh.base;

import java.util.List;

import com.bookmanage.ssh.model.PageBean;
import com.bookmanage.ssh.util.QueryHelper;

/**
 * @author anbang
 * @description @param <T>封装"增删改查"等共有方法
 * @date 2015年12月26日 上午12:12:20
 */
public interface BaseDao<T> {
	/**
	 * 添加一个实体(增)
	 * 
	 * @param entity
	 *            需要添加的实体
	 */
	void save(T entity);

	/**
	 * 根据id删除一个实体(删)
	 * 
	 * @param id
	 *            需要删除实体的id
	 */
	void delete(Long id);

	/**
	 * 更新一个实体对象
	 * 
	 * @param entity
	 *            需要更新的实体
	 */
	void update(T entity);

	/**
	 * 根据id得到一个实体
	 * 
	 * @param id
	 *            需要得到实体的id
	 * @return 返回希望得到的实体
	 */
	T getById(Long id);

	/**
	 * 根据id数组得到一个实体数组
	 * 
	 * @param ids 
	 * @return 返回得到的实体数组
	 */
	List<T> getByIds(Long[] ids);

	/**
	 * 查找所有实体
	 * 
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * 
	 * @param pageNum 当前页
	 * @param pageSize 每页显示的数量
	 * @param queryHelper
	 * @return
	 */
	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);
}
