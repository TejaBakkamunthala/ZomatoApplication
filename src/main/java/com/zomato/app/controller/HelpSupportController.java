package com.zomato.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.HelpSupport;
import com.zomato.app.service.HelpSupportService;

@RestController
@RequestMapping("/helpsupport")
public class HelpSupportController {

    @Autowired
    private HelpSupportService helpSupportService;

    @GetMapping
    public List<HelpSupport> getAllHelpSupport() {
        return helpSupportService.getAllHelpSupport();
    }

    @GetMapping("/{issueId}")
    public HelpSupport getHelpSupportById(@PathVariable int issueId) {
        return helpSupportService.getHelpSupportById(issueId);
    }

    @PostMapping
    public HelpSupport createHelpSupport(@RequestBody HelpSupport helpSupport) {
        return helpSupportService.createHelpSupport(helpSupport);
    }

    @PutMapping("/{issueId}")
    public HelpSupport updateHelpSupport(@PathVariable int issueId, @RequestBody HelpSupport helpSupport) {
        HelpSupport existingHelpSupport = helpSupportService.getHelpSupportById(issueId);
        if (existingHelpSupport == null) {
            // Handle not found scenario or return a specific response
            return null;
        }
        helpSupport.setIssueId(issueId);
        return helpSupportService.updateHelpSupport(helpSupport);
    }

    @DeleteMapping("/{issueId}")
    public void deleteHelpSupport(@PathVariable int issueId) {
        helpSupportService.deleteHelpSupport(issueId);
    }
}
