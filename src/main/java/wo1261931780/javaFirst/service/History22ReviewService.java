package wo1261931780.javaFirst.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.javaFirst.dao.History22ReviewMapper;
import wo1261931780.javaFirst.entity.History22Review;
@Service
public class History22ReviewService extends ServiceImpl<History22ReviewMapper, History22Review> {

    
    public int updateBatch(List<History22Review> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<History22Review> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<History22Review> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(History22Review record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(History22Review record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
