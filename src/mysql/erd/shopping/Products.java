package mysql.erd.shopping;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 상품 테이블 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Products implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 상품 아이디. */
	private Integer pid;

	/** 상품명. */
	private String pname;

	/** 도입 가격. */
	private Integer cost;

	/** 판매 가격. */
	private Integer price;

	/** 카트 테이블 목록. */
	private Set<Cart> cartSet;

	/**
	 * 생성자.
	 */
	public Products() {
		this.cartSet = new HashSet<Cart>();
	}

	/**
	 * 상품 아이디을 설정합니다..
	 * 
	 * @param pid
	 *            상품 아이디
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * 상품 아이디을 가져옵니다..
	 * 
	 * @return 상품 아이디
	 */
	public Integer getPid() {
		return this.pid;
	}

	/**
	 * 상품명을 설정합니다..
	 * 
	 * @param pname
	 *            상품명
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * 상품명을 가져옵니다..
	 * 
	 * @return 상품명
	 */
	public String getPname() {
		return this.pname;
	}

	/**
	 * 도입 가격을 설정합니다..
	 * 
	 * @param cost
	 *            도입 가격
	 */
	public void setCost(Integer cost) {
		this.cost = cost;
	}

	/**
	 * 도입 가격을 가져옵니다..
	 * 
	 * @return 도입 가격
	 */
	public Integer getCost() {
		return this.cost;
	}

	/**
	 * 판매 가격을 설정합니다..
	 * 
	 * @param price
	 *            판매 가격
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * 판매 가격을 가져옵니다..
	 * 
	 * @return 판매 가격
	 */
	public Integer getPrice() {
		return this.price;
	}

	/**
	 * 카트 테이블 목록을 설정합니다..
	 * 
	 * @param cartSet
	 *            카트 테이블 목록
	 */
	public void setCartSet(Set<Cart> cartSet) {
		this.cartSet = cartSet;
	}

	/**
	 * 카트 테이블를 추가합니다..
	 * 
	 * @param cart
	 *            카트 테이블
	 */
	public void addCart(Cart cart) {
		this.cartSet.add(cart);
	}

	/**
	 * 카트 테이블 목록을 가져옵니다..
	 * 
	 * @return 카트 테이블 목록
	 */
	public Set<Cart> getCartSet() {
		return this.cartSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Products other = (Products) obj;
		if (pid == null) {
			if (other.pid != null) {
				return false;
			}
		} else if (!pid.equals(other.pid)) {
			return false;
		}
		return true;
	}

}
