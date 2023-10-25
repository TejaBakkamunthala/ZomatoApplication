package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.HelpSupport;

public interface HelpSupportService {
    List<HelpSupport> getAllHelpSupport();
    HelpSupport getHelpSupportById(int issueId);
    HelpSupport createHelpSupport(HelpSupport helpSupport);
    HelpSupport updateHelpSupport(HelpSupport helpSupport);
    void deleteHelpSupport(int issueId);
}
