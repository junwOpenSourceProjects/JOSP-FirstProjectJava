package wo1261931780.javaFirst.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 红果研，考研盒子合并数据库(MergeDatabase)实体类
 *
 * @author makejava
 * @since 2023-03-15 17:40:43
 */
@Data
public class MergeDatabase implements Serializable {
	private static final long serialVersionUID = 680159516740232103L;
	/**
	 * 排名
	 */
	private Integer rank;
	/**
	 * 考生姓名
	 */
	private String studentName;
	/**
	 * 政治
	 */
	private Integer scorePolite;
	/**
	 * 英语
	 */
	private Integer scoreEnglish;
	/**
	 * 专业课一
	 */
	private Integer scoreProfessional1;
	/**
	 * 专业课二
	 */
	private Integer scoreProfessional2;
	/**
	 * 总分
	 */
	private Integer scoreTotal;
	/**
	 * 公共课总分
	 */
	private Integer scoreTotalPublic;
	/**
	 * 专业课总分
	 */
	private Integer scoreTotalProfessional;
	/**
	 * 红果研排名
	 */
	private Integer hgyRank;
	/**
	 * 考研盒子排名
	 */
	private Integer kyBoxRank;

}

