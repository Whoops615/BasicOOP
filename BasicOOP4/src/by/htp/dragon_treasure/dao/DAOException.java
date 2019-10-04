package by.htp.dragon_treasure.dao;

@SuppressWarnings("serial")
public class DAOException extends Exception {



	public DAOException() {
		super();
	}

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String mes, Exception e) {
		super(mes, e);
	}
	
	public DAOException(String mes) {
		super(mes);
	}

}
