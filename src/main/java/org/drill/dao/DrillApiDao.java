package org.drill.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.drill.model.po.Record;
import org.drill.utils.OkhttpUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class DrillApiDao extends HibernateDaoSupport{
	
	private String newDate;
	
	@Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory)  
    {  
  
        super.setSessionFactory(sessionFactory);  
    }  
	
	public int selectUser(String username,String password){
		List list = this.getHibernateTemplate().find("select account from Account account where " + 
				"account.username='"+username
			    +"' and account.pwd='"+password+"'");
		
		if (list.size() > 0) {
			return (Integer) list.get(0);
		}
		return 0;
	}
	
	public boolean undertakerApi(String url, String name, String idCard){
		OkhttpUtils okhttpUtils = new OkhttpUtils();
		okhttpUtils.selectApi(url,name,idCard);
		String info = okhttpUtils.info.toString();
		dateFormat();
		System.out.println(newDate);
		Record record = new Record();
		record.setInfo(info);
		record.setType("undertaker");
		record.setCreateDate(new Date(newDate));
		saveRecord(record);
		return true;
	}
	
	public Record saveRecord(Record record){
		return (Record) this.getHibernateTemplate().save(record);
	} 
	
	
	public void dateFormat(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		newDate = simpleDateFormat.format(date);
	}

}
