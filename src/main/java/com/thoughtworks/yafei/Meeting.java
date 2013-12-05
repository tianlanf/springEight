package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Required;

import java.util.Date;

public class Meeting {
    private Date date;

    @Override
    public String toString() {
        return "The date for the meeting is " + date.toString();
    }

    @Required
    public void setDate(Date date) {
        this.date = date;
    }
}
