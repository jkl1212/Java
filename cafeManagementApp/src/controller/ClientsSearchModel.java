package controller;

import java.util.ArrayList;


import model.Clients;

public class ClientsSearchModel {
	private static ClientsSearchModel instance = new ClientsSearchModel();
	
	/** 고객을 저장하는 배열 */
	private ArrayList <Clients> clientsList = new ArrayList <Clients>();
	
	
	
	/** 모든 고객 instance */
	

	private ClientsSearchModel() {}

	public static ClientsSearchModel getInstance() {
		return instance;
		
	}
	
	/**
	 * 모든 고객 검색
	 * 
	 * @return 모든 ClientsList
	 */
	public ArrayList <Clients> getClientsList() {
		return clientsList;
	}
	
}
