package customKeywords
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class CommonKeywords {

	/***
	 * Check if element present in the page
	 * @param object - the target element to check if present or not
	 * @return boolean - true if the element present and false if the element no present in the page
	 * @author Nada Joma
	 * @author Anas Salahat
	 */
	def static boolean isElementPresent(TestObject object) {
		try {
			if(WebUI.verifyElementPresent(object, GlobalVariable.Elements_Absence_TimeOut, FailureHandling.OPTIONAL)) {
				return true
			}
		} catch (WebElementNotFoundException e) {
			return false;
		} catch (StepFailedException e) {
			return false;
		}
	}
}