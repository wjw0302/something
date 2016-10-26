package org.drill.service;

import java.text.ParseException;

import org.drill.dao.DrillApiDao;
import org.drill.model.common.ContentOut;
import org.drill.model.vo.Court;
import org.drill.model.vo.Disruptinfo;
import org.drill.model.vo.Undertaker;
import org.drill.model.vo.Wenshu;
import org.drill.utils.OkhttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Service
public class DrillApiService {
	
	private String url;
	private String result;
	
	@Autowired
	public DrillApiDao drillApiDao;
	
	public boolean searchUser(String username, String password){
		if (drillApiDao.selectUser(username, password) > 0) {
			return true;
		} 
		return false;
	}
	
	public String undertakerApi(String name, String idCard) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/undertaker?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&queryName=&queryNo="+idCard;
		if(idCard != null){
			String data = OkhttpUtils.selectApi(url,name,idCard);
			Gson gson = new Gson();
			ContentOut<Undertaker> undertaker = gson.fromJson(data.toString(), ContentOut.class);
			result = undertaker.toString();
			drillApiDao.undertakerApi(url, name, idCard);
			return data;
		}
		return null;
	}
	
	public String disruptinfoApi(String name, String idCard) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/disruptinfo?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&queryName=&queryNo=330622196710140716";
		String data = OkhttpUtils.selectApi(url,name,idCard);
		Gson gson = new Gson();
		ContentOut<Disruptinfo> disruptinfo = gson.fromJson(data.toString(), ContentOut.class);
		result = disruptinfo.toString();
		if(idCard != null){
			drillApiDao.disruptinfoApi(url, name, idCard);
			return result;
		}
		return null;
	}
	
	public String wenshuApi(String text) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/wenshu?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&text=北京";
		if(text != null){
			String data = OkhttpUtils.findApi(url, text);
			Gson gson = new Gson();
			ContentOut<Wenshu> wenshu = gson.fromJson(data.toString(), ContentOut.class);
			result = wenshu.toString();
			drillApiDao.wenshuApi(url, text);
			return result;
		}
		return null;
	}
	
	public String courtApi(String text) throws ParseException{
		url = "http://api.biinfo.cn/biinfoservice/court?apiKey=6vTGbGWB9lIqgMNnOyAVWkkslB64nvpqseU1ljwPyTLN3pcEYAj83hns&text=北京";
		if(text != null){
			String data = OkhttpUtils.findApi(url, text);
			Gson gson = new Gson();
			JsonObject obj = new JsonObject();
			ContentOut<Court> court = gson.fromJson(data.toString(), ContentOut.class);
			drillApiDao.courtApi(url, text);
//			obj = gson.toJsonTree(court).getAsJsonObject();
//			return obj.toString();
			result = court.toString();
			return result;
		}
		return null;
	}
	
	public DrillApiDao getDrillApiDao() {
		return drillApiDao;
	}

	public void setDrillApiDao(DrillApiDao drillApiDao) {
		this.drillApiDao = drillApiDao;
	}
	
	
}
