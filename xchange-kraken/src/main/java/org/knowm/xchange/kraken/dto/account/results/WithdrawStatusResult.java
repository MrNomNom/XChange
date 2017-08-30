package org.knowm.xchange.kraken.dto.account.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.kraken.dto.KrakenResult;
import org.knowm.xchange.kraken.dto.account.WithdrawStatus;

import java.util.List;

public class WithdrawStatusResult extends KrakenResult<List<WithdrawStatus>> {

  public WithdrawStatusResult(@JsonProperty("result") List<WithdrawStatus> result, @JsonProperty("error") String[] error) {
    super(result, error);
  }

}
