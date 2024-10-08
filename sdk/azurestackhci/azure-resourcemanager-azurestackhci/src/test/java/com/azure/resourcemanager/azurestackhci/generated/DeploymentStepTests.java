// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.DeploymentStep;

public final class DeploymentStepTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentStep model = BinaryData.fromString(
            "{\"name\":\"hhahhxvrhmzkwpjg\",\"description\":\"spughftqsxhq\",\"fullStepIndex\":\"j\",\"startTimeUtc\":\"kndxdigrjgu\",\"endTimeUtc\":\"zdmsyqtfi\",\"status\":\"hbotzingamvppho\",\"steps\":[{\"name\":\"udphqamvdkfwyn\",\"description\":\"vtbvkayh\",\"fullStepIndex\":\"nvyq\",\"startTimeUtc\":\"tkzwpcnpwzc\",\"endTimeUtc\":\"esgvvsccyaj\",\"status\":\"qfhwyg\",\"steps\":[{\"name\":\"nk\",\"description\":\"usemdwzrmuhap\",\"fullStepIndex\":\"qdpsqxqvpsvu\",\"startTimeUtc\":\"mgccelvezrypq\",\"endTimeUtc\":\"feo\",\"status\":\"rqwky\",\"steps\":[{}],\"exception\":[\"pg\",\"edkowepbqpcrfk\",\"wccsnjvcdwxlpqek\"]},{\"name\":\"nkhtjsyingw\",\"description\":\"atmtdhtmdvy\",\"fullStepIndex\":\"ikdgszywkbir\",\"startTimeUtc\":\"uzhlhkjoqrv\",\"endTimeUtc\":\"aatjinrvgoupmfi\",\"status\":\"fggjioolvr\",\"steps\":[{},{}],\"exception\":[\"kkgll\",\"wjygvjayvblmhvk\",\"uhbxvvy\"]},{\"name\":\"s\",\"description\":\"byrqufeg\",\"fullStepIndex\":\"vwz\",\"startTimeUtc\":\"nhlmctlpdng\",\"endTimeUtc\":\"vgbmhr\",\"status\":\"kw\",\"steps\":[{},{},{}],\"exception\":[\"jvegrhbpnaixexcc\",\"dreaxh\",\"exdrrvqahqkg\",\"tpwijnh\"]}],\"exception\":[\"vfycxzb\",\"voowvr\",\"mtg\"]},{\"name\":\"ppyostronzmyhgf\",\"description\":\"nsxkmcwaekrrjr\",\"fullStepIndex\":\"fxtsgum\",\"startTimeUtc\":\"glikkxwslolb\",\"endTimeUtc\":\"vuzlm\",\"status\":\"elfk\",\"steps\":[{\"name\":\"crpw\",\"description\":\"eznoig\",\"fullStepIndex\":\"njwmwkpnbsazejj\",\"startTimeUtc\":\"kagfhsxtt\",\"endTimeUtc\":\"gzxnfaazpxdtnk\",\"status\":\"kqjjlwuenvrkp\",\"steps\":[{},{},{},{}],\"exception\":[\"bre\",\"qaaysjkixqt\"]},{\"name\":\"ttezlw\",\"description\":\"fiakpjpqqm\",\"fullStepIndex\":\"d\",\"startTimeUtc\":\"mmji\",\"endTimeUtc\":\"eozphv\",\"status\":\"uyqncygupkvipmd\",\"steps\":[{}],\"exception\":[\"upev\",\"hfstotxhojujbyp\"]},{\"name\":\"mc\",\"description\":\"hixbjxyfwnyl\",\"fullStepIndex\":\"ool\",\"startTimeUtc\":\"tpkiwkkbnujry\",\"endTimeUtc\":\"tylbfpncurdoiw\",\"status\":\"thtywub\",\"steps\":[{},{},{}],\"exception\":[\"wqknfdn\"]},{\"name\":\"jchrdgoihxumw\",\"description\":\"ond\",\"fullStepIndex\":\"luudfdlwggytsb\",\"startTimeUtc\":\"ovvtgseinqfiu\",\"endTimeUtc\":\"qknp\",\"status\":\"gnepttwqmsni\",\"steps\":[{}],\"exception\":[\"qnrojlpijnkrxfrd\",\"hcrat\",\"zzronasx\",\"ft\"]}],\"exception\":[\"yzhftwesgogczh\",\"nnxk\"]}],\"exception\":[\"nyhmossxkkgthr\",\"gh\",\"jbdhqxvc\"]}")
            .toObject(DeploymentStep.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentStep model = new DeploymentStep();
        model = BinaryData.fromObject(model).toObject(DeploymentStep.class);
    }
}
