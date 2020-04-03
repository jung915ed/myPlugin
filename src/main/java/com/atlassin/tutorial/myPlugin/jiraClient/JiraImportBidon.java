package com.atlassin.tutorial.myPlugin.jiraClient;

import javax.inject.Inject;
import javax.inject.Named;

import com.atlassian.jira.config.SubTaskManager;
import com.atlassian.jira.issue.IssueManager;
import com.atlassian.jira.issue.fields.FieldManager;
import com.atlassian.jira.security.PermissionManager;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;

public class JiraImportBidon {
    @Inject
    public JiraImportBidon(@ComponentImport IssueManager issueManager,
                           @ComponentImport SubTaskManager stm,
                           @ComponentImport PermissionManager pm,
                           @ComponentImport FieldManager fm) {

    }
}
