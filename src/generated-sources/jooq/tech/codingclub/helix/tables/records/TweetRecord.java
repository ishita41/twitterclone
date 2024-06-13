/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TweetRecord extends org.jooq.impl.TableRecordImpl<tech.codingclub.helix.tables.records.TweetRecord> implements org.jooq.Record4<java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp> {

	private static final long serialVersionUID = -300476384;

	/**
	 * Setter for <code>public.tweet.message</code>.
	 */
	public void setMessage(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.tweet.message</code>.
	 */
	public java.lang.String getMessage() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.tweet.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.tweet.id</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>public.tweet.author_id</code>.
	 */
	public void setAuthorId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.tweet.author_id</code>.
	 */
	public java.lang.Long getAuthorId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>public.tweet.created_at</code>.
	 */
	public void setCreatedAt(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.tweet.created_at</code>.
	 */
	public java.sql.Timestamp getCreatedAt() {
		return (java.sql.Timestamp) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return tech.codingclub.helix.tables.Tweet.TWEET.MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return tech.codingclub.helix.tables.Tweet.TWEET.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return tech.codingclub.helix.tables.Tweet.TWEET.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return tech.codingclub.helix.tables.Tweet.TWEET.CREATED_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getCreatedAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TweetRecord value1(java.lang.String value) {
		setMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TweetRecord value2(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TweetRecord value3(java.lang.Long value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TweetRecord value4(java.sql.Timestamp value) {
		setCreatedAt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TweetRecord values(java.lang.String value1, java.lang.Long value2, java.lang.Long value3, java.sql.Timestamp value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TweetRecord
	 */
	public TweetRecord() {
		super(tech.codingclub.helix.tables.Tweet.TWEET);
	}

	/**
	 * Create a detached, initialised TweetRecord
	 */
	public TweetRecord(java.lang.String message, java.lang.Long id, java.lang.Long authorId, java.sql.Timestamp createdAt) {
		super(tech.codingclub.helix.tables.Tweet.TWEET);

		setValue(0, message);
		setValue(1, id);
		setValue(2, authorId);
		setValue(3, createdAt);
	}
}
