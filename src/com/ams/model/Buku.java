package com.ams.model;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.ams.model.base.BaseBuku;



public class Buku extends BaseBuku {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Buku () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Buku (long id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

/*	public String getFormatedTglGabung()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(getTglGabung());
	}*/
}