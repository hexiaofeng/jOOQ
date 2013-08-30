package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITUnsigned extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_BYTE</code>. 
	 */
	public void setUByte(org.jooq.types.UByte value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_BYTE</code>. 
	 */
	public org.jooq.types.UByte getUByte();

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_SHORT</code>. 
	 */
	public void setUShort(org.jooq.types.UShort value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_SHORT</code>. 
	 */
	public org.jooq.types.UShort getUShort();

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_INT</code>. 
	 */
	public void setUInt(org.jooq.types.UInteger value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_INT</code>. 
	 */
	public org.jooq.types.UInteger getUInt();

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_LONG</code>. 
	 */
	public void setULong(org.jooq.types.ULong value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_LONG</code>. 
	 */
	public org.jooq.types.ULong getULong();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITUnsigned
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITUnsigned from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITUnsigned
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITUnsigned> E into(E into);
}
