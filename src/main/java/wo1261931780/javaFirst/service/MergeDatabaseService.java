package wo1261931780.javaFirst.service;

import wo1261931780.javaFirst.entity.MergeDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 红果研，考研盒子合并数据库(MergeDatabase)表服务接口
 *
 * @author makejava
 * @since 2023-03-15 17:40:43
 */
public interface MergeDatabaseService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param rank 主键
	 * @return 实例对象
	 */
	MergeDatabase queryById(Integer rank);

	/**
	 * 分页查询
	 *
	 * @param mergeDatabase 筛选条件
	 * @param pageRequest   分页对象
	 * @return 查询结果
	 */
	Page<MergeDatabase> queryByPage(MergeDatabase mergeDatabase, PageRequest pageRequest);

	/**
	 * 新增数据
	 *
	 * @param mergeDatabase 实例对象
	 * @return 实例对象
	 */
	MergeDatabase insert(MergeDatabase mergeDatabase);

	/**
	 * 修改数据
	 *
	 * @param mergeDatabase 实例对象
	 * @return 实例对象
	 */
	MergeDatabase update(MergeDatabase mergeDatabase);

	/**
	 * 通过主键删除数据
	 *
	 * @param rank 主键
	 * @return 是否成功
	 */
	boolean deleteById(Integer rank);

}
