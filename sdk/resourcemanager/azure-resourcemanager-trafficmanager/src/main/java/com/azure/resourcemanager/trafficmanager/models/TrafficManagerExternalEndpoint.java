// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.management.Region;

/** An immutable client-side representation of an Azure traffic manager profile external endpoint. */
public interface TrafficManagerExternalEndpoint extends TrafficManagerEndpoint {
    /**
     * Gets the fully qualified DNS name of the external endpoint.
     *
     * @return the fully qualified DNS name of the external endpoint
     */
    String fqdn();

    /**
     * Gets the location of the traffic that the endpoint handles.
     *
     * @return the location of the traffic that the endpoint handles
     */
    Region sourceTrafficLocation();
}
