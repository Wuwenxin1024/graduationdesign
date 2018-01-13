package gzu.pojo;
/**
 * 公交站信息表对应实体类
 * @author 吴文鑫
 *
 */
public class StationInfo {
	private String id;
	/**
	 * 是否是起点站
	 */
	private int isStartingStation;
	/**
	 * 站名
	 */
	private String StationName;
	/**
	 * 上一站id
	 */
	private String previousStationId;
	/**
	 * 上一站距离
	 */
	private double previousStationDistance;
	/***
	 * 下一站id
	 */
	private String NextStationId;
	/**
	 * 下一站距离
	 */
	private double NextStationDistance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getIsStartingStation() {
		return isStartingStation;
	}
	public void setIsStartingStation(int isStartingStation) {
		this.isStartingStation = isStartingStation;
	}
	public String getStationName() {
		return StationName;
	}
	public void setStationName(String stationName) {
		StationName = stationName;
	}
	public String getPreviousStationId() {
		return previousStationId;
	}
	public void setPreviousStationId(String previousStationId) {
		this.previousStationId = previousStationId;
	}
	public double getPreviousStationDistance() {
		return previousStationDistance;
	}
	public void setPreviousStationDistance(double previousStationDistance) {
		this.previousStationDistance = previousStationDistance;
	}
	public String getNextStationId() {
		return NextStationId;
	}
	public void setNextStationId(String nextStationId) {
		NextStationId = nextStationId;
	}
	public double getNextStationDistance() {
		return NextStationDistance;
	}
	public void setNextStationDistance(double nextStationDistance) {
		NextStationDistance = nextStationDistance;
	}
	@Override
	public String toString() {
		return "StationInfo [id=" + id + ", isStartingStation="
				+ isStartingStation + ", StationName=" + StationName
				+ ", previousStationId=" + previousStationId
				+ ", previousStationDistance=" + previousStationDistance
				+ ", NextStationId=" + NextStationId + ", NextStationDistance="
				+ NextStationDistance + "]";
	}

}
