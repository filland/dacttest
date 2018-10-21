package com.dact.beans;

import java.util.List;

public class TestCard implements ITestCard {

    @Override
    public int getID() {
        return -1;
    }

    @Override
    public Object getImage() {
        return null;
    }

    @Override
    public String getQuestion() {
        return null;
    }

    @Override
    public List<TestCardOption> getOptions() {
        return null;
    }

    @Override
    public List<Integer> getIDsOfRightOptions() {
        return null;
    }

    @Override
    public boolean isRightOption(int optionID) {
        return false;
    }
}
