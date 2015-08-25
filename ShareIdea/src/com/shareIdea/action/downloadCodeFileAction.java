package com.shareIdea.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.shareIdea.dao.interfaces.IUserbaseinfoDAO;
import com.shareIdea.factory.DAOFactory;

/** 
 *	@author  huazi
 * E-mail: huaziHear@gmail.com
 * @date  2015��4��18�� ����6:20:55 
 * @version 1.0   
 */
public class downloadCodeFileAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codeId;
	private String fileName;
	private int codeScore;
	private String codeUser;
	
	private HttpServletResponse response = ServletActionContext.getResponse();
	private  HttpServletRequest request = ServletActionContext.getRequest();
	
	public int getCodeScore() {
		return codeScore;
	}

	public void setCodeScore(int codeScore) {
		this.codeScore = codeScore;
	}

	public String getCodeUser() {
		return codeUser;
	}

	public void setCodeUser(String codeUser) {
		this.codeUser = codeUser;
	}

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	private String getCodeFilePath(){
		String path = DAOFactory.getICodeInfoDAOInstance().getCodeFilePath(this.codeId);
		path=ServletActionContext.getServletContext().getRealPath(path);
		return path;
	}
	public InputStream getDownloadFile() throws Exception { 
		InputStream in = null;
		try{
			//in = ServletActionContext.getServletContext().getResourceAsStream(getCodeFilePath());   
			in= new FileInputStream(new File(getCodeFilePath()));
		}catch(Exception e){
	   		e.printStackTrace();
	   	}
		return in;
	}
    @Override  
    public String execute() throws Exception { 
    	HttpSession session = request.getSession();
    	IUserbaseinfoDAO userDao = DAOFactory.getIUserbaseinfoDAOInstance();
    	int userId = Integer.parseInt(session.getAttribute("userId").toString());
    	//TODO 判断当前用户的积分是否足够下载
    	if(userDao.getUserScore(userId) >= getCodeScore()){
    		DAOFactory.getICodeInfoDAOInstance().addDownNo(getCodeId());
    		userDao.updateNo("userScore", userId, false, getCodeScore());
        	userDao.updateNo("userScore", userDao.getId(getCodeUser()), true, getCodeScore());
        	return SUCCESS;  
    	}else{
    		//提醒用户积分不够，不能下载，中断下载过程
//    		response.sendRedirect("CodeInfo_getViewCodeMsg?codeId=getCodeId()");
    		return "stop";
    	}
	}  
}

