package org.nkjmlab.twitter.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import net.sf.persist.annotations.Column;
import net.sf.persist.annotations.Table;
import twitter4j.Query;

@Table(name = QueryLog.TABLE_NAME)
public class QueryLog {

	public static final String TABLE_NAME = "QUERY";
	private long id;
	private Date created;
	private String tableName;
	private Long tweetId;
	private String query;
	private long maxId;
	private long sinceId;
	private String since;
	private String until;

	public QueryLog(Query query, String tableName, Long tweetId) {
		this.tableName = tableName;
		this.tweetId = tweetId;
		this.query = query.getQuery();
		this.maxId = query.getMaxId();
		this.since = query.getSince();
		this.sinceId = query.getSinceId();
		this.until = query.getUntil();
	}

	public static String getTableSchema() {
		return TABLE_NAME + "(id bigint primary key auto_increment, "
				+ "created TIMESTAMP AS CURRENT_TIMESTAMP NOT NULL, " + "table_name varchar, "
				+ "tweet_id bigint,"
				+ "query varchar, " + "max_id bigint, " + "since_id bigint, "
				+ "since varchar, " + "until varchar)";
	}

	@Column(autoGenerated = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public long getMaxId() {
		return maxId;
	}

	public void setMaxId(long maxId) {
		this.maxId = maxId;
	}

	public Long getTweetId() {
		return tweetId;
	}

	public void setTweetId(Long tweetId) {
		this.tweetId = tweetId;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public long getSinceId() {
		return sinceId;
	}

	public void setSinceId(long sinceId) {
		this.sinceId = sinceId;
	}

	public String getUntil() {
		return until;
	}

	public void setUntil(String until) {
		this.until = until;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}