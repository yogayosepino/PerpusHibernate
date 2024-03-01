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

public abstract class BaseBuku implements Serializable {

	public static String REF = "Buku";
	public static String PROP_KODEBUKU = "KodeBuku";
	public static String PROP_NAMABUKU = "NamaBuku";
	public static String PROP_KATEGORI = "NamaKategori";
//	public static String PROP_TGL_GABUNG = "TglGabung";


	// constructors
	public BaseBuku () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBuku (long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private long id;

	// fields
	private java.lang.String kodeBuku;
	private java.lang.String namaBuku;
	private java.lang.String namaKategori;
//	private java.util.Date tglGabung;



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
	public java.lang.String getKodeBuku () {
		return kodeBuku;
	}

	/**
	 * Set the value related to the column: kode_anggota
	 * @param kode the kode_anggota value
	 */
	public void setKodeBuku (java.lang.String kodeBuku) {
		this.kodeBuku = kodeBuku;
	}



	/**
	 * Return the value associated with the column: nama_anggota
	 */
	public java.lang.String getNamaBuku () {
		return namaBuku;
	}

	/**
	 * Set the value related to the column: nama_anggota
	 * @param nama the nama_anggota value
	 */
	public void setNamaBuku (java.lang.String namaBuku) {
		this.namaBuku = namaBuku;
	}



	/**
	 * Return the value associated with the column: tgl_gabung
	 */
	public java.lang.String getNamaKategori () {
		return namaKategori;
	}

	/**
	 * Set the value related to the column: tgl_gabung
	 * @param tglGabung the tgl_gabung value
	 */
	public void setNamaKategori (java.lang.String namaKategori) {
		this.namaKategori = namaKategori;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ams.model.Buku)) return false;
		else {
			com.ams.model.Buku buku = (com.ams.model.Buku) obj;
			return (this.getId() == buku.getId());
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