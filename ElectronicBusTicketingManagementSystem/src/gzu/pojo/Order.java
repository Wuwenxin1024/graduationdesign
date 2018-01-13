package gzu.pojo;

/**
 * 订单表对应实体类
 * 
 * @author 吴文鑫
 * 
 */
public class Order {

	private String id;
	private String orderId;
	private String userId;
	/**
	 * 车辆ID
	 */
	private String carId;
	/**
	 * 公司账户ID
	 */
	private String companyAcountId;
	/**
	 * 上车站ID
	 */
	private String rideStationId;
	/**
	 * 下车站ID
	 */
	private String terminusId;
	/**
	 * 积分点
	 */
	private int integral;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCompanyAcountId() {
		return companyAcountId;
	}

	public void setCompanyAcountId(String companyAcountId) {
		this.companyAcountId = companyAcountId;
	}

	public String getRideStationId() {
		return rideStationId;
	}

	public void setRideStationId(String rideStationId) {
		this.rideStationId = rideStationId;
	}

	public String getTerminusId() {
		return terminusId;
	}

	public void setTerminusId(String terminusId) {
		this.terminusId = terminusId;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", userId="
				+ userId + ", carId=" + carId + ", companyAcountId="
				+ companyAcountId + ", rideStationId=" + rideStationId
				+ ", terminusId=" + terminusId + ", integral=" + integral + "]";
	}

}
