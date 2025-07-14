package com.example.commad.domain.service.impl;

import com.example.commad.domain.service.RepositoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class RepositoryServiceImpl implements RepositoryService {

    @Override
    public void save() {
        log.info("Method call save in RepositoryServiceImpl");
    }


}
