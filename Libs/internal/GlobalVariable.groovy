package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object EvermosUrl
     
    /**
     * <p></p>
     */
    public static Object EvermosPhoneNumber
     
    /**
     * <p></p>
     */
    public static Object EvermosPassword
     
    /**
     * <p></p>
     */
    public static Object KeywordSearch
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            EvermosUrl = selectedVariables['EvermosUrl']
            EvermosPhoneNumber = selectedVariables['EvermosPhoneNumber']
            EvermosPassword = selectedVariables['EvermosPassword']
            KeywordSearch = selectedVariables['KeywordSearch']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
