package com.onlineshop.library.service;

import com.onlineshop.library.dto.AdminDto;
import com.onlineshop.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save (AdminDto adminDto);
}
