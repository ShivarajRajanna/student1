package com.spring.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.Entries;
import com.spring.project.repository.EntryRepository;

@Service
public class EntryServiceInterfaceImpl implements EntryServiceInterface {
	
	@Autowired
	private EntryRepository entryRepository;
	
	

	public EntryRepository getEntryRepository() {
		return entryRepository;
	}

	public void setEntryRepository(EntryRepository entryRepository) {
		this.entryRepository = entryRepository;
	}

	@Override
	public Entries saveEntry(Entries entry) {
		
		return  entryRepository.save(entry);
	}

	@Override
	public List<Entries> findAllEntries(long id) {
		List<Entries>entries= entryRepository.findAllById(id);
		return entries;
	}

	@Override
	public Entries findById(long id) {
		
		Entries entries=entryRepository.findByUserId(id);
		
		return entries;
	}

	@Override
	public void deleteEntry(long id) {
		
		entryRepository.deleteById(id);
		
	}

}
