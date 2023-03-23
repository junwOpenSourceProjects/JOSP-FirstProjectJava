package wo1261931780.javaFirst.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wo1261931780.javaFirst.config.ShowResult;
import wo1261931780.javaFirst.entity.MergeDatabase;
import wo1261931780.javaFirst.service.MergeDatabaseService;


@RestController
@RequestMapping("/MergeDatabase")
public class MergeDatabaseController {
	@Autowired
	private MergeDatabaseService mergeDatabaseService;
	
	@GetMapping
	public ShowResult<Page<MergeDatabase>> showMePage(@RequestParam Integer pageSize, @RequestParam Integer currentPage) {
		Page<MergeDatabase> pageInfo = new Page<>();
		pageInfo.setSize(pageSize);
		pageInfo.setCurrent(currentPage);
		Page<MergeDatabase> testPage = mergeDatabaseService.page(pageInfo);
		return ShowResult.sendSuccess(testPage);
	}
	
	@DeleteMapping("/{id}")
	public ShowResult<String> delOne(@PathVariable Integer id) {
		if (StrUtil.isBlankIfStr(id)) {
			return ShowResult.sendError("id不能为空");
		}
		boolean removeById = mergeDatabaseService.removeById(id);
		return removeById ? ShowResult.sendSuccess("删除成功") : ShowResult.sendError("删除失败");
	}
	
	@PostMapping()
	public ShowResult<String> insertOne(@RequestBody MergeDatabase mergeDatabase) {
		if (StrUtil.isBlankIfStr(mergeDatabase)) {
			return ShowResult.sendError("不能为空");
		}
		int insertOrUpdate = mergeDatabaseService.insertOrUpdate(mergeDatabase);
		return insertOrUpdate > 0 ? ShowResult.sendSuccess("成功") : ShowResult.sendError("失败");
	}
}
