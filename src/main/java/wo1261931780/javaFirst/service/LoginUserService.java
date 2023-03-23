package wo1261931780.javaFirst.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.javaFirst.dao.LoginUserMapper;
import wo1261931780.javaFirst.entity.LoginUser;
/**
*Created by Intellij IDEA.
*Project:JOSP-javaFirst
*Package:wo1261931780.javaFirst.demo
*@author liujiajun_junw
*@Date 2023-03-20-20  星期四
*@description
*/
@Service
public class LoginUserService extends ServiceImpl<LoginUserMapper, LoginUser> {

    
    public int updateBatch(List<LoginUser> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<LoginUser> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<LoginUser> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(LoginUser record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(LoginUser record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
