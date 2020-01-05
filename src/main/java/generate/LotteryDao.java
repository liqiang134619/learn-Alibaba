package generate;

import generate.Lottery;

public interface LotteryDao {
    int deleteByPrimaryKey(Long id);

    int insert(Lottery record);

    int insertSelective(Lottery record);

    Lottery selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Lottery record);

    int updateByPrimaryKey(Lottery record);
}