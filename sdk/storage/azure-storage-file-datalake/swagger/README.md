# Azure File Data Lake Storage for Java

> see https://aka.ms/autorest

### Setup

> see https://github.com/Azure/autorest.java

### Generation
> see https://github.com/Azure/autorest.java/releases for the latest version of autorest
```ps
cd <swagger-folder>
autorest
```

### Code generation settings
``` yaml
use: '@autorest/java@4.1.52'
input-file: https://github.com/Azure/azure-rest-api-specs/blob/main/specification/storage/data-plane/Azure.Storage.Files.DataLake/stable/2025-05-05/DataLakeStorage.json
java: true
output-folder: ../
namespace: com.azure.storage.file.datalake
generate-client-as-impl: true
license-header: MICROSOFT_MIT_SMALL
enable-sync-stack: true
optional-constant-as-enum: true
default-http-exception-type: com.azure.storage.file.datalake.implementation.models.DataLakeStorageExceptionInternal
models-subpackage: implementation.models
custom-types: FileSystemInfo,FileSystemItem,FileSystemProperties,PathInfo,PathItem,PathProperties,ListFileSystemsOptions,PathHttpHeaders,EncryptionAlgorithmType,LeaseAction
custom-types-subpackage: models
customization-class: src/main/java/DataLakeStorageCustomization.java
use-input-stream-for-binary: true
disable-client-builder: true
```

### Make the body of append octet-stream /{filesystem}/{path}?action=append
``` yaml
directive:
- from: swagger-document
  where: $["x-ms-paths"]["/{filesystem}/{path}?action=append"]
  transform: >
    $.patch.consumes = ["application/octet-stream"];
```

### Make ACL on Path Get Properties lower case
``` yaml
directive:
- from: swagger-document
  where: $["x-ms-paths"]["/{filesystem}/{path}"]["head"]["responses"]["200"]
  transform: >
      $.headers["x-ms-acl"]["x-ms-client-name"] = "acl";
```

### Rename PathHTTPHeaders to PathHttpHeaders
``` yaml
directive:
- from: swagger-document
  where: $.parameters
  transform: >
    $.CacheControl["x-ms-parameter-grouping"].name = "path-http-headers";
    $.ContentDisposition["x-ms-parameter-grouping"].name = "path-http-headers";
    $.ContentEncoding["x-ms-parameter-grouping"].name = "path-http-headers";
    $.ContentLanguage["x-ms-parameter-grouping"].name = "path-http-headers";
    $.ContentMD5["x-ms-parameter-grouping"].name = "path-http-headers";
    $.ContentMD5["x-ms-client-name"] = "contentMd5";
    $.ContentType["x-ms-parameter-grouping"].name = "path-http-headers";
    $.TransactionalContentMD5["x-ms-parameter-grouping"].name = "path-http-headers";
```

### Delete FileSystem_ListPaths x-ms-pageable as autorest doesn't allow you to set the nextLinkName to be a header.
``` yaml
directive:
- from: swagger-document
  where: $["x-ms-paths"]["/{filesystem}?resource=filesystem"].get
  transform: >
    delete $["x-ms-pageable"];
```

### Delete Container_ListBlobHierarchySegment x-ms-pageable as autorest can't recognize the itemName for this
``` yaml
directive:
- from: swagger-document
  where: $["x-ms-paths"]["/{filesystem}?restype=container&comp=list&hierarchy"].get
  transform: >
    delete $["x-ms-pageable"];
```

### ListBlobsHierarchySegmentResponse
``` yaml
directive:
- from: swagger-document
  where: $.definitions.ListBlobsHierarchySegmentResponse
  transform: >
    if (!$.required.includes("Prefix")) {
      $.required.push("Prefix");
      $.required.push("Marker");
      $.required.push("MaxResults");
      $.required.push("Delimiter");
      $.required.push("NextMarker");
    }
```

### Turn Path eTag into etag
``` yaml
directive:
- from: swagger-document
  where: $.definitions.Path
  transform: >
    $.properties.etag = $.properties.eTag;
    delete $.properties.eTag;
    $.properties.etag["x-ms-client-name"] = "eTag";
```




