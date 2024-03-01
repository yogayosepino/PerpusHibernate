package com.ams.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the anggota table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="anggota"
 */

public abstract class BaseAnggota  implements Serializable {

	public static String REF = "Anggota";
	public static String PROP_KODE = "Kode";
	public static String PROP_NAMA = "Nama";
	public static String PROP_TGL_GABUNG = "TglGabung";


	// constructors
	public BaseAnggota () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAnggota (long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private long id;

	// fields
	private java.lang.String kode;
	private java.lang.String nama;
	private java.util.Date tglGabung;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="id_anggota"
     */
	public long getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: kode_anggota
	 */
	public java.lang.String getKode () {
		return kode;
	}

	/**
	 * Set the value related to the column: kode_anggota
	 * @param kode the kode_anggota value
	 */
	public void setKode (java.lang.String kode) {
		this.kode = kode;
	}



	/**
	 * Return the value associated with the column: nama_anggota
	 */
	public java.lang.String getNama () {
		return nama;
	}

	/**
	 * Set the value related to the column: nama_anggota
	 * @param nama the nama_anggota value
	 */
	public void setNama (java.lang.String nama) {
		this.nama = nama;
	}



	/**
	 * Return the value associated with the column: tgl_gabung
	 */
	public java.util.Date getTglGabung () {
		return tglGabung;
	}

	/**
	 * Set the value related to the column: tgl_gabung
	 * @param tglGabung the tgl_gabung value
	 */
	public void setTglGabung (java.util.Date tglGabung) {
		this.tglGabung = tglGabung;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ams.model.Anggota)) return false;
		else {
			com.ams.model.Anggota anggota = (com.ams.model.Anggota) obj;
			return (this.getId() == anggota.getId());
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			return (int) this.getId();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}