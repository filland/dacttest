package com.dact.beans;

import java.util.List;

public class TestAnswer implements ITestAnswer {

    @Override
    public boolean addIDOfSelectedOption(int id) {
        return false;
    }

    @Override
    public List<Integer> getIDsOfSelectedOptions() {
        return null;
    }

}
