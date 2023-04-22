package com.schooly.account.domain.service.api.impl;

import com.schooly.account.domain.service.api.ApiDelegate;
import com.schooly.account.domain.service.models.ExpertAccountDataModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class V1ApiDelegateImpl implements ApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(V1ApiDelegateImpl.class);

    @PostMapping("/createExpertAccount")
    @Override
    public void createExpertAccount() {
        System.out.println("account");
    }
@PostMapping("createLearnersAccount")
    @Override
    public void createLearnersAccount() {

    }
@PostMapping("createAdminAccount")
    @Override
    public void createAdminAccount() {

    }
@GetMapping("getAllExpertOfParticularSubject")
    @Override
    public void getAllExpertAccountBySubject() {

    }
@GetMapping("getMyDetails")
    @Override
    public void getMyAccountDetails() {

    }
@GetMapping("getMyLearners")
    @Override()
    public void getMyLearners() {

    }
}
