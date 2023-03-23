package wo1261931780.javaFirst.controller;

import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.log.Log;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import wo1261931780.javaFirst.config.ShowResult;
import wo1261931780.javaFirst.entity.LoginUser;
import wo1261931780.javaFirst.service.LoginUserService;

import java.util.UUID;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-javaFirst
 * Package:wo1261931780.javaFirst.controller
 *
 * @author liujiajun_junw
 * @Date 2023-03-20-08  星期四
 * @description
 */
@RequestMapping("/api/user")
public class LoginController {
	@Autowired
	private LoginUserService loginUserService;
	
	@PostMapping("/Login")
	public ShowResult<String> userLogin(@RequestBody LoginUser loginUser) {
		// 判断是否有id
		if (loginUser.getId() != null) {
			// 有id就查询
			LoginUser byId = loginUserService.getById(loginUser.getId());
			if (StrUtil.isEmptyIfStr(byId)) {
				return ShowResult.sendError("用户不存在");
			}
			LambdaQueryWrapper<LoginUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
			// 查询账号密码是否正确
			lambdaQueryWrapper.eq(LoginUser::getName, loginUser.getName())
					.eq(LoginUser::getPassword, loginUser.getPassword());
			LoginUser one = loginUserService.getOne(lambdaQueryWrapper);
			if (StrUtil.isEmptyIfStr(one)) {
				return ShowResult.sendError("账号或密码错误");
			}
			return ShowResult.sendSuccess("登录成功");
		}
		
		// 没有id就执行注册流程
		if (CharSequenceUtil.isNotEmpty(loginUser.getName()) && CharSequenceUtil.isNotEmpty(loginUser.getPassword())) {
			loginUser.setId(Long.valueOf(UUID.randomUUID().toString()));// 随机一个id
			loginUserService.insertOrUpdate(loginUser);// 插入一条数据
			return ShowResult.sendSuccess("登录成功");
		}
		return ShowResult.sendError("登录失败");
	}
}
