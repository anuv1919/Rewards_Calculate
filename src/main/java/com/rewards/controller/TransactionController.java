package com.rewards.controller;

import com.rewards.dao.TransactionDao;
import com.rewards.hateos.TransactionResultRepresentation;
import com.rewards.model.RewardsResult;
import com.rewards.service.RewardsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    private Logger logger = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    RewardsService rewardsService;

    @GetMapping("/rewards/v1/{userid}")
    HttpEntity<TransactionResultRepresentation> rewardsbyTransumByMonth(@PathVariable String userid) {

        RewardsResult rewardsResult = rewardsService.getRewardsByTran(userid);
        logger.info("Results are {}", rewardsResult.toString());
        TransactionResultRepresentation representation = new TransactionResultRepresentation(rewardsResult);
        return new ResponseEntity<>(representation, HttpStatus.OK);
    }
    @GetMapping("/rewards/v2/{userid}")
    HttpEntity<TransactionResultRepresentation> rewardsSummingByMonth(@PathVariable String userid) {

        RewardsResult rewardsResult = rewardsService.getRewardsByMonth(userid);
        logger.info("Results are {}", rewardsResult.toString());
        TransactionResultRepresentation representation = new TransactionResultRepresentation(rewardsResult);
        return new ResponseEntity<>(representation, HttpStatus.OK);
    }

}
