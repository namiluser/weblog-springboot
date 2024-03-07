package com.luser.weblog.web.service;

import com.luser.weblog.common.utils.Response;
import com.luser.weblog.web.archive.FindArchiveArticlePageListReqVO;

public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}