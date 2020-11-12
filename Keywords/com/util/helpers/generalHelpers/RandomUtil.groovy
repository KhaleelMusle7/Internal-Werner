package com.util.helpers.generalHelpers

import com.github.javafaker.Faker

class RandomUtil {

	static Faker faker = new Faker(new Locale("en-US"))


	public static String getRandomName() {
		return faker.app().name();
	}

	public static String getRandomCardNumber() {
		return faker.business().creditCardNumber()
	}

	public static String getRandomPhone() {
		return faker.phoneNumber().phoneNumber()
	}

	public static String getRandomStreetAddress() {
		return faker.address().streetAddress();
	}

	public static String getRandomCity() {
		return faker.address().cityName();
	}

	public static String getRandomState() {
		return faker.address().state();
	}

	public static String getRandomPostalCode() {
		return faker.address().zipCode();
	}

	public static String getRandomEmail() {
		return faker.internet().emailAddress();
	}

	public static String getRandomNumber() {
		return faker.number().digits(6);
	}

	public static String getRandomNumber(int digitsLength) {
		return faker.number().digits(digitsLength);
	}

	public static String getRandomQty(int digits) {
		return faker.number().digits(digits);
	}

	/***
	 * Return random number between two values
	 * @param from lowest random number
	 * @param to max random number
	 * @return random number between two values as String
	 */

	public static String getRandomNumberInRange(int from, int to) {
		return faker.number().numberBetween(from, to)
	}

	public static String getRandomString() {
		return faker.lorem().fixedString(10);
	}
}