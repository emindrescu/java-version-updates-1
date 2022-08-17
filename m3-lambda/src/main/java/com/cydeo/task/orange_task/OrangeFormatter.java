package com.cydeo.task.orange_task;

import com.cydeo.task.orange_task.Orange;

@FunctionalInterface
public interface OrangeFormatter {
    String accept(Orange orange);
}
