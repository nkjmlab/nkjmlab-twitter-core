package org.nkjmlab.nlp.tweet.model;

import java.util.Date;

import net.sf.persist.annotations.NoTable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@NoTable
public class Tweet {

	private long id;

	private Date createdAt;
	private double lat;
	private double lng;
	private String place;
	private String user;
	private long retweetId;
	private String text;
	private String hashtagEntities;

	public Tweet() {
	}

	public Tweet(long id2, Date createdAt2, double lat2, double lng2,
			String place2, String user2, long retweetId2, String text2,
			String hashtagEntities2) {
		this.id = id2;
		this.createdAt = createdAt2;
		this.lat = lat2;
		this.lng = lng2;
		this.place = place2;
		this.user = user2;
		this.retweetId = retweetId2;
		this.text = text2;
		this.hashtagEntities = hashtagEntities2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public long getRetweetId() {
		return retweetId;
	}

	public void setRetweetId(long retweetId) {
		this.retweetId = retweetId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHashtagEntities() {
		return hashtagEntities;
	}

	public void setHashtagEntities(String hashtagEntities) {
		this.hashtagEntities = hashtagEntities;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Tweet)) {
			return false;
		}
		Tweet t = (Tweet) obj;
		return this.id == t.id;
	}

	@Override
	public int hashCode() {
		return (int) this.id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
