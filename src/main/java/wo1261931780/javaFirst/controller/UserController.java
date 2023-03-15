package wo1261931780.javaFirst.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.javaFirst.config.ShowResult;
import wo1261931780.javaFirst.dao.MergeDatabaseDao;
import wo1261931780.javaFirst.entity.MergeDatabase;
import wo1261931780.javaFirst.service.MergeDatabaseService;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

	@Autowired
	private MergeDatabaseService mergeDatabaseService;

	@PostMapping()
	public ShowResult queryAll() {
		// MergeDatabase mergeDatabase = mergeDatabaseService.getById(1);
		// LambdaQueryWrapper<MergeDatabase> objectLambdaQueryWrapper = new LambdaQueryWrapper<>();
		// objectLambdaQueryWrapper.eq(MergeDatabase::getScoreTotal, 389);
		// MergeDatabase one = mergeDatabaseService.getOne(objectLambdaQueryWrapper);
		// log.info(one + "");
		MergeDatabase database = mergeDatabaseService.queryById(1);
		log.info("请求成功");
		return ShowResult.sendSuccess(database);
	}
}
