import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.*;
 
@Entity
@Table(name = "hibernate_category")
public class Category implements java.io.Serializable {
 
	private Integer categoryId;
	private String category_name;
	private String desc;
	private Set<Stock> stocks = new HashSet<Stock>(0);
 
	public Category() {
	}
 
	public Category(String category_name, String desc) {
		this.category_name = category_name;
		this.desc = desc;
	}
 
	public Category(String category_name, String desc, Set<Stock> stocks) {
		this.category_name = category_name;
		this.desc = desc;
		this.stocks = stocks;
	}
 
	@Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy = "increment")
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}
 
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
 
	@Column(name = "category_name", nullable = false, length = 10)
	public String getCategory_name() {
		return this.category_name;
	}
 
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
 
	@Column(name = "category_DESC", nullable = false)
	public String getDesc() {
		return this.desc;
	}
 
	public void setDesc(String desc) {
		this.desc = desc;
	}
 
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Stock> getStocks() {
		return this.stocks;
	}
 
	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}
 
}