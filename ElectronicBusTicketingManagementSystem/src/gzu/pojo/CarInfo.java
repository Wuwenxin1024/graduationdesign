package gzu.pojo;

/**
 * 车辆信息表对应实体类
 * 
 * @author 吴文鑫
 * 
 */
public final class CarInfo {

	private String id;
	/**
	 * 车牌号
	 */
	private String licensePlateNumber;
	/**
	 * 车次号
	 */
	private String trainNumber;
	/**
	 * 去程路线起点站ID
	 */
	private String tripStartPointId;
	/**
	 * 返程路线起点站ID
	 */
	private String returnJourneyPointId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTripStartPointId() {
		return tripStartPointId;
	}

	public void setTripStartPointId(String tripStartPointId) {
		this.tripStartPointId = tripStartPointId;
	}

	public String getReturnJourneyPointId() {
		return returnJourneyPointId;
	}

	public void setReturnJourneyPointId(String returnJourneyPointId) {
		this.returnJourneyPointId = returnJourneyPointId;
	}

	@Override
	public String toString() {
		return "CarInfo [id=" + id + ", licensePlateNumber="
				+ licensePlateNumber + ", trainNumber=" + trainNumber
				+ ", tripStartPointId=" + tripStartPointId
				+ ", returnJourneyPointId=" + returnJourneyPointId + "]";
	}

}
