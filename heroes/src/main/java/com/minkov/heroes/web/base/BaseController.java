package com.minkov.heroes.web.base;

import com.minkov.heroes.services.models.auth.LoginUserServiceModel;

import javax.servlet.http.HttpSession;

public class BaseController {
    protected boolean isAuthenticated(HttpSession session) {
        return session.getAttribute("user") != null;
    }

    protected String getUsername(HttpSession session) {
        return ((LoginUserServiceModel) session.getAttribute("user")).getUsername();
    }

    protected String getHeroName(HttpSession session) {
        return ((LoginUserServiceModel) session.getAttribute("user")).getHeroName();
    }
}