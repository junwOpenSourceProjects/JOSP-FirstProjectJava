package wo1261931780.javaFirst.service;

import com.baomidou.mybatisplus.extension.service.IService;
import wo1261931780.javaFirst.dao.MergeDatabaseDao;
import wo1261931780.javaFirst.entity.MergeDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 红果研，考研盒子合并数据库(MergeDatabase)表服务接口
 *
 * @author makejava
 * @since 2023-03-15 17:40:43
 */
public interface MergeDatabaseService extends IService<MergeDatabase> {

	List<MergeDatabase> queryAll();
}
