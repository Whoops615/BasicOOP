package by.htp.dragon_treasure.service;

@SuppressWarnings("serial")
public class ServiceException extends Exception {

	public ServiceException() {
		super();
	}

	public ServiceException(String mes) {
		super(mes);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String mes, Exception e) {
		super(mes, e);
	}

}
