package com.samsungds.confluence.errorpage.action;

import com.atlassian.confluence.core.ConfluenceActionSupport;

public class CustomPageNotFoundAction extends ConfluenceActionSupport {
    private Long pageId;
    private String spaceKey;
    private String title;

    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    public String getSpaceKey() {
        return spaceKey;
    }

    public void setSpaceKey(String spaceKey) {
        this.spaceKey = spaceKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SuppressWarnings("unused")
    public String getMessage() {
        return "Test message!!! " + getText("plugin.name");
    }

    @Override
    public String execute() throws Exception {
        return pageId != null && pageId > 0L ? "not-space-member" : SUCCESS;
    }
}
