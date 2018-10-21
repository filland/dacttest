package com.dact.beans;

public interface ITestResult {

    int getNumberOfTestCards();

    int getNumberOfCorrectlyAnsweredTestCards();

    /**
     *
     * @return number of correctly answered cards divide by number of all cards
     */
    double getCorrectToAllRatio();
}
