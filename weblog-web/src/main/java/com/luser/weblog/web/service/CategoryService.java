package com.luser.weblog.web.service;

import com.luser.weblog.common.utils.Response;
import com.luser.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;

public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}