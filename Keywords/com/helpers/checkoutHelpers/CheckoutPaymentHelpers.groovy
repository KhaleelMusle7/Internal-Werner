package com.helpers.checkoutHelpers

import com.actions.checkoutActions.PaymentActions
import com.kms.katalon.core.annotation.Keyword

public class CheckoutPaymentHelpers {
	
	/**
	 * This keyword will do the following:
	 * 1. Choose CC Option
	 * 2. Select the first saved CC
	 * 3. Fill PO number field
	 * 4. Fill CVV field
	 * 5. Proceed to the next step
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def PaymentStepWithSavedCC(){
		// PaymentActions.choosePaymentMethod(paymentMethod)
		PaymentActions.clickCCOption()
		PaymentActions.selectSavedCC()
		PaymentActions.wrtiePONumber()
		PaymentActions.wrtieCVVForSavedCC()
		PaymentActions.clickNext()
	}

	/**
	 * This keyword will do the following:
	 * 1. Choose CC Option
	 * 2. Select Credit Card option from the drop-down
	 * 3. Select saved card info checkbox
	 * 4. Fill CC information
	 * 5. Fill PO number field
	 * 6. Proceed to the next step
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def PaymentStepWithNewCC(){
		PaymentActions.clickCCOption()
		PaymentActions.selectNewCC()
		//PaymentActions.clickSaveCardCheckbox()
		PaymentActions.wrtieCardName()
		PaymentActions.wrtieCardNumber()
		PaymentActions.wrtieCVVForNewCC()
		PaymentActions.wrtieExpDate()
		PaymentActions.wrtiePONumber()
		PaymentActions.clickNext()
	}

	/**
	 * This keyword will do the following:
	 * 1. Choose PO Option
	 * 2. Fill PO number field
	 * 3. Proceed to the next step
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def PaymentStepWithPO(){
		PaymentActions.clickPOOption()
		PaymentActions.wrtiePONumber()
		PaymentActions.clickNext()
	}
}
