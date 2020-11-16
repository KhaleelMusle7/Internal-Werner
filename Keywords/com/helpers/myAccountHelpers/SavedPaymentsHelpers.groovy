package com.helpers.myAccountHelpers

import com.actions.myAccountActions.SavedPaymentActions
import com.kms.katalon.core.annotation.Keyword
import com.validations.myAccountValidations.SavedPaymentValidations

public class SavedPaymentsHelpers {

	/***
	 * Delete all cards in saved payments page
	 * @author Anas Salahat
	 */
	@Keyword
	def static deleteAllCards() {
		while (!SavedPaymentValidations.verifyNoSavedPaymentsMessage()) {
			SavedPaymentActions.expandSavedCard()
			SavedPaymentActions.clickDeleteCardIcon()
			SavedPaymentActions.clickConfirmDeleteCardButton()
		}
	}
}
