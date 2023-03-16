package wo1261931780.javaFirst.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.javaFirst.entity.MergeDatabase;

@Mapper
public interface MergeDatabaseMapper extends BaseMapper<MergeDatabase> {
    int updateBatch(List<MergeDatabase> list);

    int updateBatchSelective(List<MergeDatabase> list);

    int batchInsert(@Param("list") List<MergeDatabase> list);

    int insertOrUpdate(MergeDatabase record);

    int insertOrUpdateSelective(MergeDatabase record);
}