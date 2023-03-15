package wo1261931780.javaFirst.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.javaFirst.config.ShowResult;
import wo1261931780.javaFirst.dao.MergeDatabaseDao;
import wo1261931780.javaFirst.entity.MergeDatabase;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Resource
	MergeDatabaseDao mergeDatabaseDao;

	@PostMapping("/addOne")
	public ShowResult addOne(@RequestBody MergeDatabase mergeDatabase){

		mergeDatabaseDao.insert(mergeDatabase);
		return ShowResult.sendSuccess("");
	}
}
