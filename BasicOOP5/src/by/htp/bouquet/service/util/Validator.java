package by.htp.bouquet.service.util;

import by.htp.bouquet.bean.CoverType;

public class Validator {

	public static boolean validCover(String type) {

		if (type.compareTo(CoverType.PAPER.name()) == 0) {
			return true;
		} else if (type.compareTo(CoverType.PLASTIC.name()) == 0) {
			return true;
		}

		return false;
	}

	public static boolean validFlower(String type) {

		switch (type) {
		case "ROSE":
			return true;
		case "TULIP":
			return true;
		case "CHAMOMILE":
			return true;
		case "ALOE":
			return true;
		case "CARNATION":
			return true;
		default:
			return false;
		}
	}

}
