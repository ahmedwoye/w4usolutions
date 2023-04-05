package com.albiscom.w4usolutions.service;

import com.albiscom.w4usolutions.domain.staff;

import java.util.List;

public interface staffservice {

    List<staff> getAllstaff();

    staff getSinglestaff (Long id);

    void deleteSingleStaff (Long id);

    staff updatesinglestaff (staff Staff);

    staff savesinglestaff (staff Staff);
}
