package com.ontrack.service;

import com.ontrack.model.Task;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskInboxService {
    public List<Task> getTaskInbox(String studentId) {
        // This is a mock implementation. Replace it with actual data fetching logic.
        List<Task> tasks = new ArrayList<>();
        if (studentId.equals("12345")) {
            Task task1 = new Task();
            task1.setTaskId("task1");
            task1.setTitle("Math Homework");
            task1.setSubmissionDate(new Date(1622520000000L)); // Use fixed date for consistency
            task1.setFeedbackStatus("Pending");
            task1.setChatMessages(List.of("Please complete the exercise", "Done"));

            Task task2 = new Task();
            task2.setTaskId("task2");
            task2.setTitle("Science Project");
            task2.setSubmissionDate(new Date(1622606400000L)); // Use fixed date for consistency
            task2.setFeedbackStatus("Reviewed");
            task2.setChatMessages(List.of("Good work", "Thank you"));

            tasks.add(task1);
            tasks.add(task2);
        }
        return tasks;
    }
}
