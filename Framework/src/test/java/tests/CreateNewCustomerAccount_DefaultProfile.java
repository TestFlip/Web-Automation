package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/a90f0679-6ce6-4ae0-96f3-3a48db2c7989
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 580, profileId = 100821)
public class CreateNewCustomerAccount_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "22d8d491-5f6a-4634-bf99-7f09b266c13b")
    public void CreateNewCustomerAccountGotopageNegativeEnterFirstNameError()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f93cea7d-3b64-445c-895e-cd5f129791a0");
    _Create_New_Customer_Account.Enter_First_Name("389348");

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "b8d928c0-63ee-4676-ae81-6bbca621e581")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNameNegativeEnterLastNameError()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("culpa");

    TestModellerLogger.SetLastNodeGuid("eeeeb81b-938a-4c4e-8219-fee69963941d");
    _Create_New_Customer_Account.Enter_Last_Name("");

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "1e0b1340-5bda-45c9-856a-45278c4c5734")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnterEmailP()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("rerum");

    TestModellerLogger.SetLastNodeGuid("e55f68bb-2487-4eb7-9915-92810e1f44b8");
    _Create_New_Customer_Account.Enter_Last_Name("Spencer");

    TestModellerLogger.SetLastNodeGuid("2525f08f-e8b9-4da9-b221-602e954c412c");
    _Create_New_Customer_Account.Enter_Email("james.walker@curiosity.software");

    TestModellerLogger.SetLastNodeGuid("31dc0600-d68a-4021-a4b4-e74f0e1e6a0c");
    _Create_New_Customer_Account.Enter_Password("ZtieC7vMJE");

    TestModellerLogger.SetLastNodeGuid("733b77a7-12ad-4b2a-b08c-ed9fca9cc032");
    _Create_New_Customer_Account.Enter__Confirm_Password_("LF7OxmXebq");

    TestModellerLogger.SetLastNodeGuid("c98c8f93-26f5-4c61-b9f1-bc843b09f742");
    _Create_New_Customer_Account.Click__Create_an_Account_();

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "04bdd82e-ab56-40a7-9b72-85efd44fe953")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnterEmailP1()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("et");

    TestModellerLogger.SetLastNodeGuid("e55f68bb-2487-4eb7-9915-92810e1f44b8");
    _Create_New_Customer_Account.Enter_Last_Name("Armstrong");

    TestModellerLogger.SetLastNodeGuid("2525f08f-e8b9-4da9-b221-602e954c412c");
    _Create_New_Customer_Account.Enter_Email("james.walker@curiosity.software");

    TestModellerLogger.SetLastNodeGuid("31dc0600-d68a-4021-a4b4-e74f0e1e6a0c");
    _Create_New_Customer_Account.Enter_Password("J6vDAjfqn0");

    TestModellerLogger.SetLastNodeGuid("b37902f3-bf5b-4db0-a2b9-2254247d9d26");
    _Create_New_Customer_Account.Enter__Confirm_Password_("#!_ @");

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "6161e970-95ec-4b12-b4ff-44badcf79fd6")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnterEmailN()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("et");

    TestModellerLogger.SetLastNodeGuid("e55f68bb-2487-4eb7-9915-92810e1f44b8");
    _Create_New_Customer_Account.Enter_Last_Name("Beier");

    TestModellerLogger.SetLastNodeGuid("2525f08f-e8b9-4da9-b221-602e954c412c");
    _Create_New_Customer_Account.Enter_Email("james.walker@curiosity.software");

    TestModellerLogger.SetLastNodeGuid("af971e19-213f-4cd8-b359-a64dccc13eb4");
    _Create_New_Customer_Account.Enter_Password("#!_ @");

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "bfca3365-9cf8-4b0d-89be-5d4ada288391")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNamePositiveEnterLastNameNegativeEnterEmailE()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("quia");

    TestModellerLogger.SetLastNodeGuid("e55f68bb-2487-4eb7-9915-92810e1f44b8");
    _Create_New_Customer_Account.Enter_Last_Name("Runolfsdottir");

    TestModellerLogger.SetLastNodeGuid("487fb050-0d63-4258-bd86-5b546d1a75be");
    _Create_New_Customer_Account.Enter_Email("james.walker");

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "2eed9a10-60aa-4167-81f4-405a3ae944e5")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNamePositiveEnterLastNameNegativeEnterEmailE1()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("rerum");

    TestModellerLogger.SetLastNodeGuid("e55f68bb-2487-4eb7-9915-92810e1f44b8");
    _Create_New_Customer_Account.Enter_Last_Name("Muller");

    TestModellerLogger.SetLastNodeGuid("487fb050-0d63-4258-bd86-5b546d1a75be");
    _Create_New_Customer_Account.Enter_Email("");

    }


    @Test  (groups= {"Create_New_Customer_Account","Create_New_Customer_Account - Default Profile"})
    @TestModellerPath(guid = "a78f9843-2e3e-4e87-a7e3-d1d45ed98e7f")
    public void CreateNewCustomerAccountGotopagePositiveEnterFirstNameNegativeEnterLastNameError1()
    {
        
           pages.Create_New_Customer_Account _Create_New_Customer_Account = new pages.Create_New_Customer_Account(getDriver());
    TestModellerLogger.SetLastNodeGuid("47e0f53f-308d-4c59-86c8-43e98a6e705a");
    _Create_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("9d512e46-928c-4b43-a650-7041ea1a28f2");
    _Create_New_Customer_Account.Enter_First_Name("laudantium");

    TestModellerLogger.SetLastNodeGuid("eeeeb81b-938a-4c4e-8219-fee69963941d");
    _Create_New_Customer_Account.Enter_Last_Name("#!_ @");

    }


}