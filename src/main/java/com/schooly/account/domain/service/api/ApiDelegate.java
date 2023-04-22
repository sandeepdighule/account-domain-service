package com.schooly.account.domain.service.api;

public interface ApiDelegate {
    void createExpertAccount();

    void createLearnersAccount();

    void createAdminAccount();

    void getAllExpertAccountBySubject();

    void getMyAccountDetails();

    void getMyLearners();


}
