package org.example.nova.sitesafety.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.nova.sitesafety.model.*;

@Mapper
public interface SiteInfoMapper {

    /**
     * siteCode로 현장 상세 조회
     */
    SiteDetailResDTO selectSiteInfoBySiteCode(String siteCode);

    /**
     * 지역/도시 기준 마지막 일련번호 조회
     */
    int selectLastSerialNum(SiteCreateReqDTO req);

    /**
    * 현장 정보 저장
    */
    void insertSiteInfo(SiteCreateReqDTO req);

    /**
    * 지역/도시별 마지막 시리얼 번호 업데이트
    */
    int updateLastSerialNum(SerialNumUpdateDTO dto);

}