package com.samsungds.confluence.errorpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorPageController {
    @GetMapping("/permission-not-found")
    public String handlePermissionNotFound() {
        // TODO: Custom error handling logic here
        return "my-theme:error-pages/permission-not-found";
    }

    @GetMapping("/page-not-found")
    public String handlePageNotFound() {
        // TODO: Custom error handling logic here
        return "my-theme:error-pages/page-not-found";
    }

    @GetMapping("/page-deleted")
    public String handleDeleted() {
        // TODO: Custom error handling logic here
        return "my-theme:error-pages/page-deleted";
    }
}
