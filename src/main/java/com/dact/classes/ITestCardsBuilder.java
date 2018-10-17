package com.dact.classes;

import com.dact.beans.TestCard;

import java.util.List;

// TODO add custom exceptions
public interface ITestCardsBuilder {

    /**
     *
     * @param jsonWithDataForTestCards is the string produced by a class implementing
     *                                 ITestQuestionReader interface
     * @return
     */
    List<TestCard> getTestCards(String jsonWithDataForTestCards);

}
