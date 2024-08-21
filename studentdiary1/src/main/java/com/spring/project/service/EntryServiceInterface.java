package com.spring.project.service;

import java.util.List;

import com.spring.project.entity.Entries;

public interface EntryServiceInterface {
	
	
	 public Entries saveEntry(Entries entry);
	 
	public List<Entries>findAllEntries(long id);
	
	   public Entries findById(long id);
	  public void deleteEntry(long id);

}
