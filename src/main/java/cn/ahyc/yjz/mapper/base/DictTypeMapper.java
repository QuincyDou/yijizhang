package cn.ahyc.yjz.mapper.base;

import cn.ahyc.yjz.model.DictType;
import cn.ahyc.yjz.model.DictTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int countByExample(DictTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int deleteByExample(DictTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int insert(DictType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int insertSelective(DictType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    List<DictType> selectByExample(DictTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    DictType selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") DictType record, @Param("example") DictTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByExample(@Param("record") DictType record, @Param("example") DictTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByPrimaryKeySelective(DictType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_type
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByPrimaryKey(DictType record);
}