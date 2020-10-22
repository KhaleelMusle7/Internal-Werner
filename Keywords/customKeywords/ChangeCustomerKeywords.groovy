package customKeywords

import com.actions.basicActions.GlobalActions
import com.actions.changeCustomer.ChangeCustomerActions
import com.kms.katalon.core.annotation.Keyword

public class ChangeCustomerKeywords {

	/**
	 * Change Customer and choose the first bill to and ship to
	 * @author User Iman Abu Abiah
	 */
	@Keyword
	def ChangeCustomer() {
		ChangeCustomerActions.selectBillToAddress()
		ChangeCustomerActions.selectShipToAddress()
		ChangeCustomerActions.clickChangeCustomerButton()
		GlobalActions.WaitForLoaderToFinish()
	}

	/**
	 * Change customer with a specific Bill To and Ship To customer number
	 * @param billToCustomerNumber
	 * @param shipToCustomerNumber
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def ChangeCustomerByCustomerNumber (String billToCustomerNumber, String shipToCustomerNumber) {
		ChangeCustomerActions.selectBillToAddressByCustomer(billToCustomerNumber)
		ChangeCustomerActions.selectShipToAddressByCustomer(shipToCustomerNumber)
		ChangeCustomerActions.clickChangeCustomerButton()
		GlobalActions.WaitForLoaderToFinish()
	}

	/**
	 * Change customer with a specific Bill To customer number
	 * @param customerNumber
	 * @author User Iman Abu Abiah
	 */
	@Keyword
	def ChangeCustomerByBillToCustomerNumber (String customerNumber){
		ChangeCustomerActions.selectBillToAddressByCustomer(customerNumber)
		ChangeCustomerActions.selectShipToAddress()
		ChangeCustomerActions.clickChangeCustomerButton()
		GlobalActions.WaitForLoaderToFinish()
	}

	/**
	 * Change customer with a specific Ship To customer number
	 * @param customerNumber
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def ChangeCustomerByShipToCustomerNumber (String customerNumber){
		ChangeCustomerActions.selectBillToAddress()
		ChangeCustomerActions.selectShipToAddressByCustomer(customerNumber)
		ChangeCustomerActions.clickChangeCustomerButton()
		GlobalActions.WaitForLoaderToFinish()
	}

	/**
	 * Change the fulfillment method depends on the given value
	 * @param FulfillmentMethod
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def SelectFulfillmentMethod (String FulfillmentMethod){
		ChangeCustomerActions.selectFulfillmentMethod(FulfillmentMethod)
	}
}
