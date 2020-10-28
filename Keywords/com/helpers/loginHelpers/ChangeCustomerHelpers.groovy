package com.helpers.loginHelpers

import com.actions.basicActions.GlobalActions
import com.actions.loginActions.ChangeCustomerActions
import com.kms.katalon.core.annotation.Keyword

public class ChangeCustomerHelpers {

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
}
