package wo1261931780.javaFirst.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 红果研，考研盒子合并数据库
    */
@ApiModel(description="红果研，考研盒子合并数据库")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "merge_database")
public class MergeDatabase implements Serializable {
    /**
     * 排名
     */
    @ApiModelProperty(value="排名")
    @TableId(value = "`rank`", type = IdType.INPUT)
    private Integer rank;

    /**
     * 考生姓名
     */
    @TableField(value = "student_name")
    @ApiModelProperty(value="考生姓名")
    private String studentName;

    /**
     * 政治
     */
    @TableField(value = "score_polite")
    @ApiModelProperty(value="政治")
    private Integer scorePolite;

    /**
     * 英语
     */
    @TableField(value = "score_english")
    @ApiModelProperty(value="英语")
    private Integer scoreEnglish;

    /**
     * 专业课一
     */
    @TableField(value = "score_professional_1")
    @ApiModelProperty(value="专业课一")
    private Integer scoreProfessional1;

    /**
     * 专业课二
     */
    @TableField(value = "score_professional_2")
    @ApiModelProperty(value="专业课二")
    private Integer scoreProfessional2;

    /**
     * 总分
     */
    @TableField(value = "score_total")
    @ApiModelProperty(value="总分")
    private Integer scoreTotal;

    /**
     * 公共课总分
     */
    @TableField(value = "score_total_public")
    @ApiModelProperty(value="公共课总分")
    private Integer scoreTotalPublic;

    /**
     * 专业课总分
     */
    @TableField(value = "score_total_professional")
    @ApiModelProperty(value="专业课总分")
    private Integer scoreTotalProfessional;

    /**
     * 红果研排名
     */
    @TableField(value = "hgy_rank")
    @ApiModelProperty(value="红果研排名")
    private Integer hgyRank;

    /**
     * 考研盒子排名
     */
    @TableField(value = "ky_box_rank")
    @ApiModelProperty(value="考研盒子排名")
    private Integer kyBoxRank;

    private static final long serialVersionUID = 1L;

    public static final String COL_RANK = "rank";

    public static final String COL_STUDENT_NAME = "student_name";

    public static final String COL_SCORE_POLITE = "score_polite";

    public static final String COL_SCORE_ENGLISH = "score_english";

    public static final String COL_SCORE_PROFESSIONAL_1 = "score_professional_1";

    public static final String COL_SCORE_PROFESSIONAL_2 = "score_professional_2";

    public static final String COL_SCORE_TOTAL = "score_total";

    public static final String COL_SCORE_TOTAL_PUBLIC = "score_total_public";

    public static final String COL_SCORE_TOTAL_PROFESSIONAL = "score_total_professional";

    public static final String COL_HGY_RANK = "hgy_rank";

    public static final String COL_KY_BOX_RANK = "ky_box_rank";
}