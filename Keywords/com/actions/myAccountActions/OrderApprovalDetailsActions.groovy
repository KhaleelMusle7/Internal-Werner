package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.actions.basicActions.BasicActions

public class OrderApprovalDetailsActions {

	/**
	 * Click on Approve Order button
	 * @author Anas Salahat
	 */
	@Keyword
	def clickApproveOrder() {
		TestObject approveOrderButton = findTestObject("Object Repository/My Account/Page_Order Approval Details/button_approveOrder")
		BasicActions.clickElement(approveOrderButton)
		GlobalActions.WaitForLoaderToFinish()
	}
}
