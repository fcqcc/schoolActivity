package com.github.mju.schoolActivity.wx.mp.controller;

import com.github.mju.schoolActivity.wx.mp.service.ActivityLabelService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;




@RequestMapping("/activity")
@RestController
public class ActivityLabelController 
{

    @Autowired
    private ActivityLabelService activityLabelService;


}
