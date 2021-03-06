package cn.ahyc.yjz.mapper.base;

import cn.ahyc.yjz.model.CompanyCommonValue;
import cn.ahyc.yjz.model.CompanyCommonValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyCommonValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int countByExample(CompanyCommonValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int deleteByExample(CompanyCommonValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int insert(CompanyCommonValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int insertSelective(CompanyCommonValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    List<CompanyCommonValue> selectByExample(CompanyCommonValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    CompanyCommonValue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") CompanyCommonValue record, @Param("example") CompanyCommonValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByExample(@Param("record") CompanyCommonValue record, @Param("example") CompanyCommonValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByPrimaryKeySelective(CompanyCommonValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_common_value
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByPrimaryKey(CompanyCommonValue record);
}