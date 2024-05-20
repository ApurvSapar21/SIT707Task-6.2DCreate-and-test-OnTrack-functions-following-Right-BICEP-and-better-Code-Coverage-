package com.ontrack.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Task {
    private String taskId;
    private String title;
    private Date submissionDate;
    private String feedbackStatus;
    private List<String> chatMessages;

    public Task() {
        // Default constructor
    }

    // Parameterized constructor
    public Task(String taskId, String title, Date submissionDate, String feedbackStatus, List<String> chatMessages) {
        this.taskId = taskId;
        this.title = title;
        this.submissionDate = submissionDate;
        this.feedbackStatus = feedbackStatus;
        this.chatMessages = chatMessages;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskId, task.taskId) &&
                Objects.equals(title, task.title) &&
                Objects.equals(submissionDate, task.submissionDate) &&
                Objects.equals(feedbackStatus, task.feedbackStatus) &&
                Objects.equals(chatMessages, task.chatMessages);
    }

    // Getters and setters
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public List<String> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<String> chatMessages) {
        this.chatMessages = chatMessages;
    }
    
    public int hashCode() {
        return Objects.hash(taskId, title, submissionDate, feedbackStatus, chatMessages);
    }
}
