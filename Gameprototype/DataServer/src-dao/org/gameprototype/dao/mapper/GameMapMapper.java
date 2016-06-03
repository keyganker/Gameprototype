package org.gameprototype.dao.mapper;

import org.gameprototype.dao.model.GameMap;

import com.sun.tools.javac.util.List;

public interface GameMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    int insert(GameMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    int insertSelective(GameMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    List<Integer> selectMapList();
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    GameMap selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    int updateByPrimaryKeySelective(GameMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gamemap
     *
     * @mbggenerated Tue Oct 20 15:20:49 CST 2015
     */
    int updateByPrimaryKey(GameMap record);
}