package com.habuma.spitter.mvc.service;

import java.util.List;

import com.habuma.spitter.mvc.entity.Spittle;

public interface SpitterService {
	public List<Spittle> getRecentSpittles(int spittlesPerPage);
	
}
