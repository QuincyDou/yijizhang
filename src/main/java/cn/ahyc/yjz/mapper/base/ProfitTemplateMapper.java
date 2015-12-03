package cn.ahyc.yjz.mapper.base;

import cn.ahyc.yjz.model.ProfitTemplate;
import cn.ahyc.yjz.model.ProfitTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfitTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int countByExample(ProfitTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int deleteByExample(ProfitTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int insert(ProfitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int insertSelective(ProfitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    List<ProfitTemplate> selectByExample(ProfitTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    ProfitTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") ProfitTemplate record, @Param("example") ProfitTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int updateByExample(@Param("record") ProfitTemplate record, @Param("example") ProfitTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int updateByPrimaryKeySelective(ProfitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit_template
     *
     * @mbggenerated Mon Nov 02 09:17:12 CST 2015
     */
    int updateByPrimaryKey(ProfitTemplate record);
}