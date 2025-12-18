package org.example.nova.sitesafety.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.nova.sitesafety.model.*;

@Mapper
public interface SiteInfoMapper {

    /**
     * siteCode로 현장 상세 조회
     */
    SiteDetailResDTO selectSiteInfoBySiteCode(String siteCode);

}