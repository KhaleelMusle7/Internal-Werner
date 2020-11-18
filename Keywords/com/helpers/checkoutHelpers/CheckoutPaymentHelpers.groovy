package com.helpers.checkoutHelpers

import com.actions.checkoutActions.PaymentActions
import com.kms.katalon.core.annotation.Keyword

public class CheckoutPaymentHelpers {

	/**
	 * This keyword will do the following:
	 * 1. Choose CC Option
	 * 2. Select the first saved CC
	 * 3. Fill random PO number
	 * 4. Fill CVV field
	 * 5. Proceed to the next step
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */
	@Keyword
	def PaymentStepWithSavedCC(){
		PaymentActions.clickCCOption()
		PaymentActions.selectSavedCC()
		String poNumber = PaymentActions.writeRandomPONumber()
		PaymentActions.wrtieCVVForSavedCC()
		PaymentActions.clickNext()
		return poNumber
	}
	
	/**
	 * This keyword will do the following:
	 * 1. Choose CC Option
	 * 2. Select Credit Card option from the drop-down
	 * 3. Select saved card info checkbox
	 * 4. Fill CC information
	 * 5. Fill random PO Number
	 * 6. Proceed to the next step
	 * @return PO Number
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */
	@Keyword
	def PaymentStepWithNewCC(){
		PaymentActions.clickCCOption()
		PaymentActions.selectNewCC()
		PaymentActions.wrtieCardName()
		PaymentActions.wrtieCardNumber()
		PaymentActions.wrtieCVVForNewCC()
		PaymentActions.wrtieExpDate()
		String poNumber = PaymentActions.writeRandomPONumber()
		PaymentActions.clickNext()
		return poNumber
	}
	
	/**
	 * This keyword will do the following:
	 * 1. Choose CC Option
	 * 2. Select Credit Card option from the drop-down
	 * 4. Fill CC information
	 * 5. Fill PO number field
	 * 6. Proceed to the next step
	 * @return PO Number
	 * @author Anas Salahat
	 */
	@Keyword
	def PaymentStepWithSaveNewCC(){
		PaymentActions.clickCCOption()
		PaymentActions.selectNewCC()
		PaymentActions.clickSaveCardCheckbox()
		PaymentActions.wrtieCardName()
		PaymentActions.wrtieCardNumber()
		PaymentActions.wrtieCVVForNewCC()
		PaymentActions.wrtieExpDate()
		String poNumber = PaymentActions.writeRandomPONumber()
		PaymentActions.clickNext()
		return poNumber
	}

	/**
	 * This keyword will do the following:
	 * 1. Choose PO Option
	 * 2. Fill random PO number field
	 * 3. Proceed to the next step
	 * @return the entered PO number
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */
	@Keyword
	def PaymentStepWithPO(){
		PaymentActions.clickPOOption()
		String PO = PaymentActions.writeRandomPONumber()
		PaymentActions.clickNext()
		return PO
	}
	

	/**
	 * This keyword will do the following:
	 * 1. Fill random PO number field
	 * 2. Proceed to the next step
	 * @return the entered PO number
	 * @author Shurooq Salahat
	 */
	@Keyword
	def PaymentStepWithPOInOrderApproval(){
		String PO = PaymentActions.writeRandomPONumber()
		PaymentActions.clickNext()
		return PO
	}
}
