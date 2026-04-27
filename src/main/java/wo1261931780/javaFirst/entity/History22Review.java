package wo1261931780.javaFirst.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 22年复试名单
    */
@Schema(description="22年复试名单")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "history22_review")
public class History22Review implements Serializable {
    /**
     * 初试排名
     */
    @TableId(value = "`rank`", type = IdType.INPUT)
    private Integer rank;

    /**
     * 考生姓名
     */
    @TableField(value = "student_name")
    private String studentName;

    /**
     * 考生编号
     */
    @TableField(value = "student_code")
    private String studentCode;

    /**
     * 学科代码
     */
    @TableField(value = "subject_code")
    private Integer subjectCode;

    /**
     * 学科名称
     */
    @TableField(value = "subject_name")
    private String subjectName;

    /**
     * 政治
     */
    @TableField(value = "score_polite")
    private Integer scorePolite;

    /**
     * 英语
     */
    @TableField(value = "score_english")
    private Integer scoreEnglish;

    /**
     * 专业课一
     */
    @TableField(value = "score_professional_1")
    private Integer scoreProfessional1;

    /**
     * 专业课二
     */
    @TableField(value = "score_professional_2")
    private Integer scoreProfessional2;

    /**
     * 总分
     */
    @TableField(value = "score_total")
    private Integer scoreTotal;

    /**
     * 公共课总分
     */
    @TableField(value = "score_total_public")
    private Integer scoreTotalPublic;

    /**
     * 专业课总分
     */
    @TableField(value = "score_total_professional")
    private Integer scoreTotalProfessional;

    private static final long serialVersionUID = 1L;

    public static final String COL_RANK = "rank";

    public static final String COL_STUDENT_NAME = "student_name";

    public static final String COL_STUDENT_CODE = "student_code";

    public static final String COL_SUBJECT_CODE = "subject_code";

    public static final String COL_SUBJECT_NAME = "subject_name";

    public static final String COL_SCORE_POLITE = "score_polite";

    public static final String COL_SCORE_ENGLISH = "score_english";

    public static final String COL_SCORE_PROFESSIONAL_1 = "score_professional_1";

    public static final String COL_SCORE_PROFESSIONAL_2 = "score_professional_2";

    public static final String COL_SCORE_TOTAL = "score_total";

    public static final String COL_SCORE_TOTAL_PUBLIC = "score_total_public";

    public static final String COL_SCORE_TOTAL_PROFESSIONAL = "score_total_professional";
}