package com.pelter.data.nterfaces;

import com.pelter.data.models.Owner;

public interface Ownable {
	public boolean hasOwner();
	public Owner getOwner();
	public void SetOwner(Owner owner);
}
