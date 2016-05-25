package com.habuma.spitter.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.habuma.spitter.mvc.entity.Spittle;
import com.habuma.spitter.mvc.service.SpitterService;

@Service
public class SpitterServiceImpl implements SpitterService {

	public List<Spittle> getRecentSpittles(int spittlesPerPage) {
		System.out.println("go into spitterServiceImpl class and invoke getRecentSpittles method!");
		return new ArrayList<Spittle>();
	}

}
