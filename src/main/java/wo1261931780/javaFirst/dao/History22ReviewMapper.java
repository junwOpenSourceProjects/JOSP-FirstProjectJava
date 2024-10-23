package wo1261931780.javaFirst.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.javaFirst.entity.History22Review;

@Mapper
public interface History22ReviewMapper extends BaseMapper<History22Review> {
    int updateBatch(List<History22Review> list);

    int updateBatchSelective(List<History22Review> list);

    int batchInsert(@Param("list") List<History22Review> list);

    boolean insertOrUpdate(History22Review record);

    int insertOrUpdateSelective(History22Review record);
}
