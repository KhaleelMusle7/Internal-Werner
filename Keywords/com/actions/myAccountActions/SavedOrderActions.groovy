package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword

public class SavedOrderActions {

	/***
	 * Clicks on Place Save Order Button
	 * @author Shurooq Salahat
	 */
	@Keyword
	def clickPlaceSaveOrderButton() {
		BasicActions.clickElement(findTestObject('Object Repository/Page_SavedOrder/button_PlaceSavedOrder'))
	}
}
