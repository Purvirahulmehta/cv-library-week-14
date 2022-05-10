package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow","5", "30000", "500000","Per annum","Permanent","Permanent Testerjobs in Harrow on the Hill"},
               {"Teacher","Harrow","10", "35000", "50000","Per annum","Permanent","Permanent Teachersjobs in Harrow on the Hill"},
               {"Tester","London","25", "30000", "500000","Per annum","Permanent","Permanent Testerjobs in London"},
               {"Tester","London","20", "30000", "400000","Per annum","Permanent","Permanent Testerjobs in London"},
                {"Teacher","London","5", "30000", "500000","Per annum","Permanent","Permanent Testerjobs in London"},
              {"Teacher","London","5", "30000", "500000","Per annum","Permanent","Permanent Testerjobs in London"},
               {"Tester","scotland","5", "30000", "500000","Per annum","Permanent","Permanent Testerjobs in scotland"},

           };
        return data;
    }

}
