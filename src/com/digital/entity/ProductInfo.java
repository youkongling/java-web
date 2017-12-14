package com.digital.entity;

public class ProductInfo {
	private int id;//��Ʒ���
	private String code;//��Ʒ���
    private String name;//��Ʒ����
    private Type type;//��Ʒ���(��Ʒ�������)
    private String brand;//��ƷƷ��
    private String pic;//��ƷͼƬ
    private int num;//��Ʒ���
    private double price;//��Ʒ�۸�
    private String intro;//��Ʒ���
    private int status;//��Ʒ״̬
    private String bigpic;//��Ʒ��ͼ
    public ProductInfo() {
		// TODO Auto-generated constructor stub
	}
	public ProductInfo(int id, String code, String name, Type type, String brand, String pic, int num, double price,
			String intro, int status, String bigpic) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.pic = pic;
		this.num = num;
		this.price = price;
		this.intro = intro;
		this.status = status;
		this.bigpic = bigpic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getBigpic() {
		return bigpic;
	}
	public void setBigpic(String bigpic) {
		this.bigpic = bigpic;
	}
    
}
