package wo1261931780.javaFirst.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import wo1261931780.javaFirst.entity.MergeDatabase;
import wo1261931780.javaFirst.dao.MergeDatabaseDao;
import wo1261931780.javaFirst.service.MergeDatabaseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.List;


/**
 * 红果研，考研盒子合并数据库(MergeDatabase)表服务实现类
 *
 * @author makejava
 * @since 2023-03-15 17:40:43
 */
@Service("mergeDatabaseService")
public class MergeDatabaseServiceImpl extends ServiceImpl<MergeDatabaseDao,MergeDatabase> implements MergeDatabaseService {
	@Resource
	private MergeDatabaseDao mergeDatabaseDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param rank 主键
	 * @return 实例对象
	 */
	@Override
	public MergeDatabase queryById(Integer rank) {
		return this.mergeDatabaseDao.queryById(rank);
	}

	@Override
	public List<MergeDatabase> queryAll() {
		return this.mergeDatabaseDao.queryAll();
	}

	/**
	 * 分页查询
	 *
	 * @param mergeDatabase 筛选条件
	 * @param pageRequest   分页对象
	 * @return 查询结果
	 */
	@Override
	public Page<MergeDatabase> queryByPage(MergeDatabase mergeDatabase, PageRequest pageRequest) {
		long total = this.mergeDatabaseDao.count(mergeDatabase);
		return new PageImpl<>(this.mergeDatabaseDao.queryAllByLimit(mergeDatabase, pageRequest), pageRequest, total);
	}

	/**
	 * 新增数据
	 *
	 * @param mergeDatabase 实例对象
	 * @return 实例对象
	 */
	@Override
	public MergeDatabase insert(MergeDatabase mergeDatabase) {
		this.mergeDatabaseDao.insert(mergeDatabase);
		return mergeDatabase;
	}

	/**
	 * 修改数据
	 *
	 * @param mergeDatabase 实例对象
	 * @return 实例对象
	 */
	@Override
	public MergeDatabase update(MergeDatabase mergeDatabase) {
		this.mergeDatabaseDao.update(mergeDatabase);
		return this.queryById(mergeDatabase.getRank());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param rank 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Integer rank) {
		return this.mergeDatabaseDao.deleteById(rank) > 0;
	}
}
