/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Class extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord> {

	private static final long serialVersionUID = 1032818879;

	/**
	 * The singleton instance of CLASS
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Class CLASS = new org.jooq.test.hsqldb.generatedclasses.tables.Class();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord, java.lang.Integer> CLASS_ = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private Class() {
		super("CLASS", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private Class(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.Class as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.Class(alias);
	}
}
