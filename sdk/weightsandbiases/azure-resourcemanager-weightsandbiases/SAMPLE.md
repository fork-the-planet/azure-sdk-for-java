# Code snippets and samples


## Instances

- [CreateOrUpdate](#instances_createorupdate)
- [Delete](#instances_delete)
- [GetByResourceGroup](#instances_getbyresourcegroup)
- [List](#instances_list)
- [ListByResourceGroup](#instances_listbyresourcegroup)
- [Update](#instances_update)

## Operations

- [List](#operations_list)
### Instances_CreateOrUpdate

```java
import com.azure.resourcemanager.weightsandbiases.models.InstanceProperties;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentity;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.weightsandbiases.models.MarketplaceDetails;
import com.azure.resourcemanager.weightsandbiases.models.OfferDetails;
import com.azure.resourcemanager.weightsandbiases.models.PartnerProperties;
import com.azure.resourcemanager.weightsandbiases.models.Region;
import com.azure.resourcemanager.weightsandbiases.models.SingleSignOnPropertiesV2;
import com.azure.resourcemanager.weightsandbiases.models.SingleSignOnStates;
import com.azure.resourcemanager.weightsandbiases.models.SingleSignOnType;
import com.azure.resourcemanager.weightsandbiases.models.UserDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Instances CreateOrUpdate.
 */
public final class InstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-09-18/Instances_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Instances_CreateOrUpdate - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesCreateOrUpdateGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances()
            .define("myinstance")
            .withRegion("pudewmshbcvbt")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf())
            .withProperties(new InstanceProperties()
                .withMarketplace(new MarketplaceDetails().withSubscriptionId("00000000-0000-0000-0000-000000000000")
                    .withOfferDetails(new OfferDetails().withPublisherId("kf")
                        .withOfferId("rfgoevxeke")
                        .withPlanId("ufopn")
                        .withPlanName("adysakgqlryufffz")
                        .withTermUnit("dgrkojow")
                        .withTermId("kklscqq")))
                .withUser(new UserDetails().withFirstName("kiiehcojcldrlndoid")
                    .withLastName("zhkvsfqvthwkfkvgxcruyud")
                    .withEmailAddress("user@outlook.com")
                    .withUpn("rmjpgqchpbw")
                    .withPhoneNumber("cogmqmuwfcpstkwbzgkgo"))
                .withPartnerProperties(
                    new PartnerProperties().withRegion(Region.EASTUS).withSubdomain("xkecokwnwtkwnkxfgucmzybzzb"))
                .withSingleSignOnProperties(new SingleSignOnPropertiesV2().withType(SingleSignOnType.SAML)
                    .withState(SingleSignOnStates.INITIAL)
                    .withEnterpriseAppId("hkxtmpv")
                    .withUrl("iqlemoksqdygqyxpp")
                    .withAadDomains(Arrays.asList("mxnw"))))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf()))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Instances_Delete

```java
/**
 * Samples for Instances Delete.
 */
public final class InstancesDeleteSamples {
    /*
     * x-ms-original-file: 2024-09-18/Instances_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Instances_Delete - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesDeleteGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances().delete("rgopenapi", "myinstance", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_GetByResourceGroup

```java
/**
 * Samples for Instances GetByResourceGroup.
 */
public final class InstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-09-18/Instances_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Instances_Get - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesGetGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances().getByResourceGroupWithResponse("rgopenapi", "myinstance", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_List

```java
/**
 * Samples for Instances List.
 */
public final class InstancesListSamples {
    /*
     * x-ms-original-file: 2024-09-18/Instances_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Instances_ListBySubscription - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesListBySubscriptionGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-09-18/Instances_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: Instances_ListBySubscription - generated by [MinimumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesListBySubscriptionGeneratedByMinimumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances().list(com.azure.core.util.Context.NONE);
    }
}
```

### Instances_ListByResourceGroup

```java
/**
 * Samples for Instances ListByResourceGroup.
 */
public final class InstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-09-18/Instances_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Instances_ListByResourceGroup - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesListByResourceGroupGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-09-18/Instances_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Instances_ListByResourceGroup - generated by [MinimumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesListByResourceGroupGeneratedByMinimumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.instances().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_Update

```java
import com.azure.resourcemanager.weightsandbiases.models.InstanceResource;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentity;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentityType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Instances Update.
 */
public final class InstancesUpdateSamples {
    /*
     * x-ms-original-file: 2024-09-18/Instances_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Instances_Update - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void instancesUpdateGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        InstanceResource resource = manager.instances()
            .getByResourceGroupWithResponse("rgopenapi", "myinstance", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf()))
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-09-18/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void operationsListGeneratedByMaximumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-09-18/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List - generated by [MinimumSet] rule.
     * 
     * @param manager Entry point to WeightsAndBiasesManager.
     */
    public static void operationsListGeneratedByMinimumSetRule(
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

