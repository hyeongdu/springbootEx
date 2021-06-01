package com.study.springboot.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.Transaction1Dto;

public interface IBuyTicketService {

	
	public int buy(String consumerId, int money, String error);
}
