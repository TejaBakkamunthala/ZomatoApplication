package com.zomato.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.app.Entity.HelpSupport;
import com.zomato.app.repository.HelpSupportRepository;
import com.zomato.app.service.HelpSupportService;

@Service
public class HelpSupportServiceImpl implements HelpSupportService {

    @Autowired
    private HelpSupportRepository helpSupportRepository;

    @Override
    public List<HelpSupport> getAllHelpSupport() {
        return helpSupportRepository.findAll();
    }

    @Override
    public HelpSupport getHelpSupportById(int issueId) {
        return helpSupportRepository.findById(issueId).orElse(null);
    }

    @Override
    public HelpSupport createHelpSupport(HelpSupport helpSupport) {
        return helpSupportRepository.save(helpSupport);
    }

    @Override
    public HelpSupport updateHelpSupport(HelpSupport helpSupport) {
        return helpSupportRepository.save(helpSupport);
    }

    @Override
    public void deleteHelpSupport(int issueId) {
        helpSupportRepository.deleteById(issueId);
    }
}
