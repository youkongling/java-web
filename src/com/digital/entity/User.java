package com.digital.entity;
import java.util.Date;

public class User
{
  private int id;
  private String userName;
  private String password;
  private String realName;
  private String sex;
  private String address;
  private String question;
  private String answer;
  private String email;
  private String favorate;
  @Override
  public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", regDate=" + regDate + "]";
  }

private int score;
  private Date regDate;
  
  
  public User() {
	  
  }
  
  public User(String userName, String password, String realName, String sex, String address, String question,
		String answer, String email, String favorate, int score, Date regDate) {
	super();
	this.userName = userName;
	this.password = password;
	this.realName = realName;
	this.sex = sex;
	this.address = address;
	this.question = question;
	this.answer = answer;
	this.email = email;
	this.favorate = favorate;
	this.score = score;
	this.regDate = regDate;
  	}
  
  
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getRealName()
  {
    return this.realName;
  }
  
  public void setRealName(String realName)
  {
    this.realName = realName;
  }
  
  public String getSex()
  {
    return this.sex;
  }
  
  public void setSex(String sex)
  {
    this.sex = sex;
  }
  
  public String getAddress()
  {
    return this.address;
  }
  
  public void setAddress(String address)
  {
    this.address = address;
  }
  
  public String getQuestion()
  {
    return this.question;
  }
  
  public void setQuestion(String question)
  {
    this.question = question;
  }
  
  public String getAnswer()
  {
    return this.answer;
  }
  
  public void setAnswer(String answer)
  {
    this.answer = answer;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public String getFavorate()
  {
    return this.favorate;
  }
  
  public void setFavorate(String favorate)
  {
    this.favorate = favorate;
  }
  
  public int getScore()
  {
    return this.score;
  }
  
  public void setScore(int score)
  {
    this.score = score;
  }
  
  public Date getRegDate()
  {
    return this.regDate;
  }
  
  public void setRegDate(Date regDate)
  {
    this.regDate = regDate;
  }
}
