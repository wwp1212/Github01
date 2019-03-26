package cn.sxt.pojo;
/**
 * @Description: 商品实体类
 * @Date: 2019-3-26
 * @author: 汪文平
 * @version: 1.0
 *
 */
public class Goods {
	
	private int id;		/*商品编号*/
	private String name;	/*商品名称*/
	private int catid;		/*商品的类别id*/
	private int price;		/*商品的价格*/
	private String remarks;	/*商品的备注*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
