package com.samsungds.confluence.errorpage.action;

import com.atlassian.confluence.core.ConfluenceActionSupport;

public class CustomDeletedPageAction extends ConfluenceActionSupport {
    @SuppressWarnings("unused")
    public String getMessage() {
        return "Test message!!! " + getText("plugin.name");
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
