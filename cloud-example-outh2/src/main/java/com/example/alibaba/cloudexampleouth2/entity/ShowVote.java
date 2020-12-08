package com.example.alibaba.cloudexampleouth2.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 节目投票
 * </p>
 *
 * @author Liq
 * @since 2020-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("show_vote")
public class ShowVote implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 人员id
     */
    @TableField("person_id")
    private Long personId;

    /**
     * 节目id
     */
    @TableField("show_id")
    private Long showId;

    /**
     * 企业id
     */
    @TableField("company_id")
    private Long companyId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 状态（1有效，0无效）
     */
    @TableField("status")
    private Integer status;


}
