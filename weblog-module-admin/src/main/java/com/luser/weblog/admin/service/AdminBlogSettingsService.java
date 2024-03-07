package com.luser.weblog.admin.service;

import com.luser.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.luser.weblog.common.utils.Response;

public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}