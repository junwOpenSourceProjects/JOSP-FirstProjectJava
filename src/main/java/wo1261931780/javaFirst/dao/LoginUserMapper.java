package wo1261931780.javaFirst.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.javaFirst.entity.LoginUser;

/**
*Created by Intellij IDEA.
*Project:JOSP-javaFirst
*Package:wo1261931780.javaFirst.demo
*@author liujiajun_junw
*@Date 2023-03-20-20  星期四
*@description
*/
@Mapper
public interface LoginUserMapper extends BaseMapper<LoginUser> {
    int updateBatch(List<LoginUser> list);

    int updateBatchSelective(List<LoginUser> list);

    int batchInsert(@Param("list") List<LoginUser> list);

    boolean insertOrUpdate(LoginUser record);

    int insertOrUpdateSelective(LoginUser record);
}
