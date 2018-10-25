package com.dact.beans;

import java.util.List;

public class TestCard {

    public int getID() {
        return -1;
    }

    public Object getImage() {
        return null;
    }

    public String getQuestion() {
        return null;
    }

    public List<TestCardOption> getOptions() {
        return null;
    }

    public List<Integer> getIDsOfRightOptions() {
        return null;
    }

    public boolean isRightOption(int optionID) {
        return false;
    }

    /**
     *
     * @return returns true if all necessary options were selected
     * (or in other words if the question was answered correctly)
     */
    public boolean isAnswered() {
        return false;
    }
}
