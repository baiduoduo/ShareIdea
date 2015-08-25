package com.shareIdea.po;

// Generated 2015-4-16 16:57:49 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Codeinfo generated by hbm2java
 */
public class Codeinfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer codeId;
	private Ideainfo ideainfo;
	private Userbaseinfo userbaseinfo;
	private Integer codeScore=0;
	private String codeSize;
	private Integer codeCommentNo=0;
	private Integer codeDownNo=0;
	private String codeCategory;
	private String nickName;
	private String codePath;
	private String codeUpdateTime;
	private String codeName;
	private Integer codeClickNo=0;
	private Set codecomments = new HashSet(0);

	public Codeinfo() {
	}
	public Codeinfo(int codeId) {
		this.codeId = codeId;
	}

	public Codeinfo(int codeId,String codeName,String codeSize,int codeCommentNo,
			int codeDownNo,int codeClickNo){
		this.codeId = codeId;
		this.codeName = codeName;
		this.codeSize = codeSize;
		this.codeCommentNo = codeCommentNo;
		this.codeDownNo = codeDownNo;
		this.codeClickNo = codeClickNo;
	}
	public Codeinfo(String nickName,String codeName, Userbaseinfo userbaseinfo,int codeId){
		this.nickName = nickName;
		this.codeName = codeName;
		this.userbaseinfo = userbaseinfo;
		this.codeId = codeId;
	};
	public Codeinfo(Ideainfo ideainfo, Userbaseinfo userbaseinfo,
			Integer codeScore, String codeSize, Integer codeCommentNo,
			Integer codeDownNo, String codeCategory, String nickName,
			String codePath, String codeUpdateTime, String codeName,
			Integer codeClickNo, Set codecomments) {
		this.ideainfo = ideainfo;
		this.userbaseinfo = userbaseinfo;
		this.codeScore = codeScore;
		this.codeSize = codeSize;
		this.codeCommentNo = codeCommentNo;
		this.codeDownNo = codeDownNo;
		this.codeCategory = codeCategory;
		this.nickName = nickName;
		this.codePath = codePath;
		this.codeUpdateTime = codeUpdateTime;
		this.codeName = codeName;
		this.codeClickNo = codeClickNo;
		this.codecomments = codecomments;
	}

	public Integer getCodeId() {
		return this.codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public Ideainfo getIdeainfo() {
		return this.ideainfo;
	}

	public void setIdeainfo(Ideainfo ideainfo) {
		this.ideainfo = ideainfo;
	}

	public Userbaseinfo getUserbaseinfo() {
		return this.userbaseinfo;
	}

	public void setUserbaseinfo(Userbaseinfo userbaseinfo) {
		this.userbaseinfo = userbaseinfo;
	}

	public Integer getCodeScore() {
		return this.codeScore;
	}

	public void setCodeScore(Integer codeScore) {
		this.codeScore = codeScore;
	}

	public String getCodeSize() {
		return this.codeSize;
	}

	public void setCodeSize(String codeSize) {
		this.codeSize = codeSize;
	}

	public Integer getCodeCommentNo() {
		return this.codeCommentNo;
	}

	public void setCodeCommentNo(Integer codeCommentNo) {
		this.codeCommentNo = codeCommentNo;
	}

	public Integer getCodeDownNo() {
		return this.codeDownNo;
	}

	public void setCodeDownNo(Integer codeDownNo) {
		this.codeDownNo = codeDownNo;
	}

	public String getCodeCategory() {
		return this.codeCategory;
	}

	public void setCodeCategory(String codeCategory) {
		this.codeCategory = codeCategory;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCodePath() {
		return this.codePath;
	}

	public void setCodePath(String codePath) {
		this.codePath = codePath;
	}

	public String getCodeUpdateTime() {
		return this.codeUpdateTime;
	}

	public void setCodeUpdateTime(String codeUpdateTime) {
		this.codeUpdateTime = codeUpdateTime;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Integer getCodeClickNo() {
		return this.codeClickNo;
	}

	public void setCodeClickNo(Integer codeClickNo) {
		this.codeClickNo = codeClickNo;
	}

	public Set getCodecomments() {
		return this.codecomments;
	}

	public void setCodecomments(Set codecomments) {
		this.codecomments = codecomments;
	}

}
