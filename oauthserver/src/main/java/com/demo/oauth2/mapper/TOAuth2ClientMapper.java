package com.demo.oauth2.mapper;

import com.demo.oauth2.entity.TOAuth2Client;
import com.demo.oauth2.entity.TOAuth2ClientCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOAuth2ClientMapper {
    int countByExample(TOAuth2ClientCriteria example);

    int deleteByExample(TOAuth2ClientCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TOAuth2Client record);

    int insertSelective(TOAuth2Client record);

    List<TOAuth2Client> selectByExample(TOAuth2ClientCriteria example);

    TOAuth2Client selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TOAuth2Client record, @Param("example") TOAuth2ClientCriteria example);

    int updateByExample(@Param("record") TOAuth2Client record, @Param("example") TOAuth2ClientCriteria example);

    int updateByPrimaryKeySelective(TOAuth2Client record);

    int updateByPrimaryKey(TOAuth2Client record);
}