package org.mifos.identityaccountmapper.api.definition;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.mifos.identityaccountmapper.data.RequestDTO;
import org.mifos.identityaccountmapper.data.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.concurrent.ExecutionException;
@Tag(name = "GOV")
public interface UpdatePaymentModalityApi {
    @PutMapping("/paymentModality")
    @Operation(
            summary = "Updating payment modality")
    ResponseEntity<ResponseDTO> updatePaymentModality(@RequestHeader(value="X-CallbackURL") String callbackURL,
                                                      @RequestHeader(value = "registeringInstitutionId") String registeringInstitutionId,
                                                      @RequestBody RequestDTO requestBody) throws ExecutionException, InterruptedException, JsonProcessingException;

}
