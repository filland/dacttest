import com.dact.beans.*;
import com.dact.dao.TestCardDAOJSONImp;

import java.util.ArrayList;
import java.util.List;

public class DactTestModel {

    private String pathToFileWithJSONs;
    private TestCardDAOJSONImp testCardDAOJSON;

    // list for storing all test cards
    private List<ITestCard> testCards;


    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * >   Fields for test session
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     */
    // this list is initialized again when new test started
    private List<ITestCard> cardsForCurrentTest;

    // this list contains answers to test cards of current test
    private List<ITestAnswer> answersForCurrentTest;

    private int counterOfCorrectlyAnsweredTestCards = 0;
    /**
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     * >   Fields for test session
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     */

    public DactTestModel(String pathToFileWithJSONs) {

        this.pathToFileWithJSONs = pathToFileWithJSONs;
    }

    public void init(){

        testCardDAOJSON = new TestCardDAOJSONImp(pathToFileWithJSONs);

        testCards = new ArrayList<>();

        // TODO load test cards and put them into list

    }


    /**
     *
     * @param numberOfCards is the number of cards that the test will have
     */
    public void startNewTest(int numberOfCards){

        // TODO create new cardsForCurrentTest
        // TODO reset counter


    }


    public boolean hasNextTestCard(){


        return false;
    }

    public ITestCard getNextTestCard(){


        return null;
    }


    public void setAnswerToCurrentTestCard(ITestAnswer answer){

        // TODO check if the answer is correct

    }


    public boolean hasPreviousTestCard(){


        return false;
    }

    /**
     *
     * @return previous test card or null if there is no previous test card
     */
    public ITestCard getPreviousTestCard(){

        return null;
    }


    public ITestResult getResult(){

        // TODO process list with answers here

        return null;
    }





}
