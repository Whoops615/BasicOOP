package by.htp.dragon_treasure.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import by.htp.dragon_treasure.bean.Cave;
import by.htp.dragon_treasure.bean.Treasure;
import by.htp.dragon_treasure.dao.DAOException;
import by.htp.dragon_treasure.dao.TreasureDAO;

public class FileCaveDao implements TreasureDAO {

	private static final String CAVE_DATA = "data/cave.txt";

	@Override
	public Cave getCave() throws DAOException {

		Cave cave = new Cave();

		try (BufferedReader b = new BufferedReader(new FileReader(CAVE_DATA))) {

			String readLine;

			while ((readLine = b.readLine()) != null) {

				Treasure t = new Treasure();

				t.setTitle(readLine.split(" ")[0]);
				t.setPrice(Integer.parseInt(readLine.split(" ")[1]));
				cave.getTreasures().add(t);

			}

		} catch (IOException e) {
			throw new DAOException("!!!", e);
		}

		return cave;
	}

}
