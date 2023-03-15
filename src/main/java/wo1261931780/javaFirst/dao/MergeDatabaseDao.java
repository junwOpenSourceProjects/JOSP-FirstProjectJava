package wo1261931780.javaFirst.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import wo1261931780.javaFirst.entity.MergeDatabase;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 红果研，考研盒子合并数据库(MergeDatabase)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-15 17:40:42
 */
@Mapper
public interface MergeDatabaseDao extends BaseMapper<MergeDatabase> {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param rank 主键
	 * @return 实例对象
	 */
	MergeDatabase queryById(Integer rank);

	/**
	 * 查询指定行数据
	 *
	 * @param mergeDatabase 查询条件
	 * @param pageable      分页对象
	 * @return 对象列表
	 */
	List<MergeDatabase> queryAllByLimit(MergeDatabase mergeDatabase, @Param("pageable") Pageable pageable);

	/**
	 * 统计总行数
	 *
	 * @param mergeDatabase 查询条件
	 * @return 总行数
	 */
	long count(MergeDatabase mergeDatabase);

	/**
	 * 新增数据
	 *
	 * @param mergeDatabase 实例对象
	 * @return 影响行数
	 */
	int insert(MergeDatabase mergeDatabase);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<MergeDatabase> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<MergeDatabase> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<MergeDatabase> 实例对象列表
	 * @return 影响行数
	 * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
	 */
	int insertOrUpdateBatch(@Param("entities") List<MergeDatabase> entities);

	/**
	 * 修改数据
	 *
	 * @param mergeDatabase 实例对象
	 * @return 影响行数
	 */
	int update(MergeDatabase mergeDatabase);

	/**
	 * 通过主键删除数据
	 *
	 * @param rank 主键
	 * @return 影响行数
	 */
	int deleteById(Integer rank);

}

