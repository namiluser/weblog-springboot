package com.luser.weblog.admin.service;

import com.luser.weblog.admin.model.vo.tag.AddTagReqVO;
import com.luser.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.luser.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.luser.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.luser.weblog.common.utils.PageResponse;
import com.luser.weblog.common.utils.Response;

public interface AdminTagService {

    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */

    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键字模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTag(SearchTagReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}
