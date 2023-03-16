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
	List<MergeDatabase> queryAll();

}

