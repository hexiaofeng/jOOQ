/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class String extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> {

	private static final long serialVersionUID = -685932955;

	/**
	 * The singleton instance of STRING
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.String STRING = new org.jooq.test.hsqldb.generatedclasses.tables.String();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord, java.lang.String> OTHER = createField("OTHER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private String() {
		super("STRING", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private String(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.String.STRING);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.String as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.String(alias);
	}
}
