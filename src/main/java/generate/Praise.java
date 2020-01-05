package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * praise
 * @author 
 */
@Data
public class Praise implements Serializable {
    private Long id;

    /**
     * 节目id
     */
    private Long showId;

    /**
     * 人员id
     */
    private Long personId;

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