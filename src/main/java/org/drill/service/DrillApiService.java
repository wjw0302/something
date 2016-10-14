package org.drill.service;

import java.text.ParseException;

import org.drill.dao.DrillApiDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrillApiService {
	
	private String url;
	@Autowired
	public DrillApiDao drillApiDao;
	
	public boolean searchUser(String username, String password){
		if (drillApiDao.selectUser(username, password) > 0) {
			return true;
		} 
		return false;
	}
	
	public boolean undertakerApi(String name, String idCard) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/undertaker?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&queryName=&queryNo="+idCard;
		if(idCard != null){
			drillApiDao.undertakerApi(url, name, idCard);
			return true;
		}
		return false;
	}
	
	public boolean disruptinfoApi(String name, String idCard) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/disruptinfo?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&queryName=&queryNo=330622196710140716";
		if(idCard != null){
			drillApiDao.disruptinfoApi(url, name, idCard);
			return true;
		}
		return false;
	}
	
	public boolean wenshuApi(String text) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/wenshu?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&text=北京";
		if(text != null){
			drillApiDao.wenshuApi(url, text);
			return true;
		}
		return false;
	}
	
	public boolean courtApi(String text) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/court?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&text=北京";
		if(text != null){
			drillApiDao.courtApi(url, text);
			return true;
		}
		return false;
	}
	
	public DrillApiDao getDrillApiDao() {
		return drillApiDao;
	}

	public void setDrillApiDao(DrillApiDao drillApiDao) {
		this.drillApiDao = drillApiDao;
	}
	
	
}
