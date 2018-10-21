package com.dact.beans;

import java.util.List;

public interface ITestAnswer {

    boolean addIDOfSelectedOption(int id);

    List<Integer> getIDsOfSelectedOptions();

}
