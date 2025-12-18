package org.example.nova.sitesafety.service;

import lombok.RequiredArgsConstructor;
import org.example.nova.sitesafety.mapper.SiteInfoMapper;
import org.example.nova.sitesafety.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SiteInfoService {

    private final SiteInfoMapper siteInfoMapper;

    /**
     * 현장 상세 조회
     */
    @Transactional(readOnly = true)
    public SiteDetailResDTO getSiteInfo(String siteCode) {

        SiteDetailResDTO result =
                siteInfoMapper.selectSiteInfoBySiteCode(siteCode);

        // 조회 결과가 없을 경우 예외
        if (result == null) {
            throw new IllegalArgumentException("현장 정보가 존재하지 않습니다.");
        }

        return result;
    }
}
