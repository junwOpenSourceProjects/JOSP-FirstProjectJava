package wo1261931780.javaFirst.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.javaFirst.dao.MergeDatabaseMapper;
import wo1261931780.javaFirst.entity.MergeDatabase;

@Service
public class MergeDatabaseService extends ServiceImpl<MergeDatabaseMapper, MergeDatabase> {

    
    public int updateBatch(List<MergeDatabase> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<MergeDatabase> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<MergeDatabase> list) {
        return baseMapper.batchInsert(list);
    }
    
    public boolean insertOrUpdate(MergeDatabase record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(MergeDatabase record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
