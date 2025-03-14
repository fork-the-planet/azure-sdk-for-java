// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger.certificate;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.security.confidentialledger.certificate.implementation.ConfidentialLedgerCertificateClientImpl;

/**
 * Initializes a new instance of the synchronous ConfidentialLedgerCertificateClient type.
 */
@ServiceClient(builder = ConfidentialLedgerCertificateClientBuilder.class)
public final class ConfidentialLedgerCertificateClient {
    @Generated
    private final ConfidentialLedgerCertificateClientImpl serviceClient;

    /**
     * Initializes an instance of ConfidentialLedgerCertificateClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ConfidentialLedgerCertificateClient(ConfidentialLedgerCertificateClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets identity information for a Confidential Ledger instance.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     ledgerId: String (Optional)
     *     ledgerTlsCertificate: String (Required)
     * }
     * }
     * </pre>
     * 
     * @param ledgerId Id of the Confidential Ledger instance to get information for.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return identity information for a Confidential Ledger instance along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLedgerIdentityWithResponse(String ledgerId, RequestOptions requestOptions) {
        return this.serviceClient.getLedgerIdentityWithResponse(ledgerId, requestOptions);
    }
}
