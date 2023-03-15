package wo1261931780.javaFirst.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.models.auth.In;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.javaFirst.config.ShowResult;
import wo1261931780.javaFirst.dao.MergeDatabaseDao;
import wo1261931780.javaFirst.entity.MergeDatabase;
import wo1261931780.javaFirst.service.MergeDatabaseService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

	@Autowired
	private MergeDatabaseService mergeDatabaseService;

	@PostMapping()
	public ShowResult queryById() {
		MergeDatabase database = mergeDatabaseService.queryById(1);
		log.info("请求成功");
		log.info(database + "");
		return ShowResult.sendSuccess(database);
	}
	@GetMapping()
	public ShowResult queryAll() {
		List<MergeDatabase> mergeDatabases = mergeDatabaseService.queryAll();
		return ShowResult.sendSuccess(mergeDatabases);
	}
}
