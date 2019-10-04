package by.htp.dragon_treasure.dao;

import by.htp.dragon_treasure.dao.impl.FileCaveDao;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	private TreasureDAO treasureDao = new FileCaveDao();

	public TreasureDAO getTreasureDao() {
		return treasureDao;
	}

}
