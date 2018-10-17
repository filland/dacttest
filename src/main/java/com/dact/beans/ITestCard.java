package com.dact.beans;

import java.util.List;

public interface ITestCard {

    Object getImage();

    String getQuestion();

    List<TestCardOption> getTestCardOptions();

    List<Integer> getNumberOfRightOptions();

}
