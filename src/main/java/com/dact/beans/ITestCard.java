package com.dact.beans;

import java.util.List;

public interface ITestCard {

    int getID();

    Object getImage();

    String getQuestion();

    List<TestCardOption> getOptions();

    List<Integer> getIDsOfRightOptions();


    boolean isRightOption(int optionID);

    /**
     *
     * @return returns true if all necessary options were selected
     * (or in other words if the question was answered correctly)
     */
    boolean isAnswered();

}
