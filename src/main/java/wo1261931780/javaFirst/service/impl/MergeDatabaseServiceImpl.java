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

	@Override
	public List<MergeDatabase> queryAll() {
		return this.mergeDatabaseDao.queryAll();
	}



}
