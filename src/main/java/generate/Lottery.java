package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * lottery
 * @author 
 */
@Data
public class Lottery implements Serializable {
    private Long id;

    /**
     * 人员id
     */
    private Long personId;

    /**
     * 奖品id
     */
    private Long rewardId;

    /**
     * 企业id
     */
    private Long companyId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 状态（1有效，0无效）
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}