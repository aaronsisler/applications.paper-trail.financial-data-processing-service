package com.ebsolutions.papertrail.financialdataproviderservice.transaction;

import com.ebsolutions.papertrail.financialdataproviderservice.model.AcceptedTransaction;
import java.util.UUID;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transactions")
public class TransactionController {
  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> post() {
    AcceptedTransaction acceptedTransaction =
        AcceptedTransaction.builder().receiptId(UUID.randomUUID().toString()).build();
    return ResponseEntity.ok().body(acceptedTransaction);
  }
}
