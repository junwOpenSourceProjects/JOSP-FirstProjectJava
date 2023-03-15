package wo1261931780.javaFirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import wo1261931780.javaFirst.entity.MergeDatabase;
import wo1261931780.javaFirst.service.MergeDatabaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * 红果研，考研盒子合并数据库(MergeDatabase)表控制层
 *
 * @author makejava
 * @since 2023-03-15 17:40:42
 */
@RestController
@RequestMapping("mergeDatabase")
public class MergeDatabaseController {
	/**
	 * 服务对象
	 */
	@Autowired
	private MergeDatabaseService mergeDatabaseService;

	/**
	 * 分页查询
	 *
	 * @param mergeDatabase 筛选条件
	 * @param pageRequest   分页对象
	 * @return 查询结果
	 */
	@GetMapping
	public ResponseEntity<Page<MergeDatabase>> queryByPage(MergeDatabase mergeDatabase, PageRequest pageRequest) {
		return ResponseEntity.ok(this.mergeDatabaseService.queryByPage(mergeDatabase, pageRequest));
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("{id}")
	public ResponseEntity<MergeDatabase> queryById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(this.mergeDatabaseService.queryById(id));
	}

	/**
	 * 新增数据
	 *
	 * @param mergeDatabase 实体
	 * @return 新增结果
	 */
	@PostMapping
	public ResponseEntity<MergeDatabase> add(MergeDatabase mergeDatabase) {
		return ResponseEntity.ok(this.mergeDatabaseService.insert(mergeDatabase));
	}

	/**
	 * 编辑数据
	 *
	 * @param mergeDatabase 实体
	 * @return 编辑结果
	 */
	@PutMapping
	public ResponseEntity<MergeDatabase> edit(MergeDatabase mergeDatabase) {
		return ResponseEntity.ok(this.mergeDatabaseService.update(mergeDatabase));
	}

	/**
	 * 删除数据
	 *
	 * @param id 主键
	 * @return 删除是否成功
	 */
	@DeleteMapping
	public ResponseEntity<Boolean> deleteById(Integer id) {
		return ResponseEntity.ok(this.mergeDatabaseService.deleteById(id));
	}

}

