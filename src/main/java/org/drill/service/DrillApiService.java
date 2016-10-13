package org.drill.service;

import java.text.ParseException;

import org.drill.dao.DrillApiDao;
import org.drill.model.po.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrillApiService {
	
	private String url = "http://api.biinfo.cn/biinfoservice/undertaker?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&queryName=&queryNo=330622196710140716";
	@Autowired
	public DrillApiDao drillApiDao;
	
	public boolean searchUser(String username, String password){
		if (drillApiDao.selectUser(username, password) > 0) {
			return true;
		} 
		return false;
	}
	
//	public Record insertRecord(Record record){
//		return drillApiDao.saveRecord(record);
//	}
	
	public boolean undertakerApi(String name, String idCard) throws ParseException{
		if(idCard != null){
			drillApiDao.undertakerApi(url, name, idCard);
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
