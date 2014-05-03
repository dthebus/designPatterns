/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.gymweb.services.impl;

import com.dthebus.gymweb.domain.AdminStaff;
import com.dthebus.gymweb.repository.AdminStaffRepository;
import com.dthebus.gymweb.services.TotalAdminStaffService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author darren
 */
@Service
public class TotalAdminStaffServiceImpl implements TotalAdminStaffService{
@Autowired
    private AdminStaffRepository fullMemberRepository;
    
    @Override
    public List<AdminStaff> getTotal() {
    return fullMemberRepository.findAll();    
    }
}