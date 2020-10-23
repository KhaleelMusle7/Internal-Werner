package customKeywords
import customKeywords.Navigations
import internal.GlobalVariable as GlobalVariable
import com.actions.basicActions.GlobalActions
import com.actions.checkoutActions.AddressesActions
import com.actions.checkoutActions.PaymentActions
import com.actions.checkoutActions.ReviewActions
import com.actions.checkoutActions.ShippingActions
import com.kms.katalon.core.annotation.Keyword
import com.actions.myAccountActions.OrderHistoryActions
import com.kms.katalon.entity.global.GlobalVariableEntity

public class CheckoutKeywords {

	/**
	 * This keyword will do the following:
	 * 1. Uncheck the use ship-to checkbox
	 * 2. Fill the ship one-time shipping address fields
	 * 3
	 import com.kms.katalon.entity.global.GlobalVariableEntity. Click on save button
	 * 4. Proceed to the next step
	 * Note: if one-time shipping address already entered, then only the last step will be applied
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddressesStepWithOneTimeShippingAddress (){
		AddressesActions.uncheckUseShipToCheckbox()
		AddressesActions.fillOneTimeShippingAddressForm()
		AddressesActions.clickNextButton()
	}

	/**
	 * This keyword will do the following:
	 * 1. Check the use ship-to checkbox
	 * 2. Proceed to the next step
	 * Note: if one-time shipping address already entered, then only the last step will be applied
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddressesStepWithDeliveryAddress (){
		AddressesActions.checkUseShipToCheckbox()
		AddressesActions.clickNextButton()
	}

	/**
	 * This keyword will do the following:
	 * 1. Change the fulfilment method to pickup
	 * 2. Proceed to the next step
	 * Note: if one-time shipping address already entered, then only the last step will be applied
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddressesStepWithPickUpAddress (){
		GlobalActions.changeFulfilmentMethodToPickUp()
		AddressesActions.clickNextButton()
	}

	/**
	 * This keyword will do the following:
	 * 1. Choose the shipping method based on the given method
	 * 2. Fill AttentionTo field (if not empty)
	 * 3. Fill Shipping Instructions field (if not empty)
	 * 4. Proceed to the next step
	 * @param shippingMethod
	 * @param AttentionTo
	 * @param ShippingInstructions
	 * @author Iman Abu Abiah 
	 */
	@Keyword
	def ShippingStep(String shippingMethod, String AttentionTo, String ShippingInstructions){
		ShippingActions.chooseShippingMethod(shippingMethod)
		ShippingActions.writeAttentionTo(AttentionTo)
		ShippingActions.writeShippingInstructions(ShippingInstructions)
		ShippingActions.clickNextButton()
	}

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

	/**
	 * Submit the order
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def ReviewStep(){
		ReviewActions.clickSubmitOrder()
		GlobalActions.WaitForLoaderToFinish()
	}

	@Keyword
	def verifyOrderPlaced(String orderNumber) {

		OrderHistoryActions.navigateToSpecificOrder(orderNumber, 0)
	}
}
