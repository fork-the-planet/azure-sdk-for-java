// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BlockedTransformers;
import com.azure.resourcemanager.machinelearning.models.ColumnTransformer;
import com.azure.resourcemanager.machinelearning.models.FeaturizationMode;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.NCrossValidations;
import com.azure.resourcemanager.machinelearning.models.Regression;
import com.azure.resourcemanager.machinelearning.models.RegressionModels;
import com.azure.resourcemanager.machinelearning.models.RegressionPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.RegressionTrainingSettings;
import com.azure.resourcemanager.machinelearning.models.StackEnsembleSettings;
import com.azure.resourcemanager.machinelearning.models.StackMetaLearnerType;
import com.azure.resourcemanager.machinelearning.models.TableVerticalFeaturizationSettings;
import com.azure.resourcemanager.machinelearning.models.TableVerticalLimitSettings;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RegressionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Regression model = BinaryData.fromString(
            "{\"taskType\":\"Regression\",\"primaryMetric\":\"R2Score\",\"trainingSettings\":{\"allowedTrainingAlgorithms\":[\"LightGBM\"],\"blockedTrainingAlgorithms\":[\"RandomForest\",\"ExtremeRandomTrees\",\"DecisionTree\",\"ExtremeRandomTrees\"],\"enableOnnxCompatibleModels\":false,\"stackEnsembleSettings\":{\"stackMetaLearnerType\":\"LightGBMRegressor\",\"stackMetaLearnerTrainPercentage\":8.33007277629979,\"stackMetaLearnerKWargs\":\"datayvichcap\"},\"enableStackEnsemble\":true,\"enableVoteEnsemble\":false,\"ensembleModelDownloadTimeout\":\"PT9H16M19S\",\"enableModelExplainability\":true,\"enableDnnTraining\":true},\"limitSettings\":{\"maxTrials\":1273889376,\"trialTimeout\":\"PT180H28M30S\",\"timeout\":\"PT69H35M25S\",\"maxConcurrentTrials\":1570051650,\"maxCoresPerTrial\":1441156662,\"exitScore\":37.32116818441482,\"enableEarlyTermination\":true},\"nCrossValidations\":{\"mode\":\"NCrossValidations\"},\"cvSplitColumnNames\":[\"tigpksywicklktg\",\"dprtqjytdcfe\"],\"weightColumnName\":\"hbdwbvjsbgmlamo\",\"validationData\":{\"jobInputType\":\"mltable\",\"uri\":\"caytnpkvbpbltcws\",\"mode\":\"EvalDownload\",\"description\":\"eocnqoubvepvlrys\"},\"testData\":{\"jobInputType\":\"mltable\",\"uri\":\"h\",\"mode\":\"EvalDownload\",\"description\":\"hxohzbzhhavzf\"},\"validationDataSize\":40.045012854483886,\"testDataSize\":47.5872192816281,\"featurizationSettings\":{\"mode\":\"Auto\",\"blockedTransformers\":[\"CatTargetEncoder\"],\"columnNameAndTypes\":{\"fddxqfussub\":\"uehouisaklh\",\"p\":\"sspmjvailfauyv\",\"wvoglff\":\"wlkqdgwbztrthl\",\"lor\":\"dhg\"},\"transformerParams\":{\"cmo\":[{\"fields\":[\"cvxkylhc\",\"sdylmnq\",\"nkyg\"],\"parameters\":\"datatmsgkwedwl\"},{\"fields\":[\"hgbgbhudh\",\"pjimvrrqfibpkwm\",\"mrlfizjuddndi\"],\"parameters\":\"datapngyhylqyafe\"}],\"jfqreeo\":[{\"fields\":[\"uytxnxr\"],\"parameters\":\"datartzea\"},{\"fields\":[\"fvkhbjhmv\"],\"parameters\":\"dataxsdhweignybffq\"},{\"fields\":[\"ynepkt\",\"mwg\",\"conyse\",\"jijfhpxni\"],\"parameters\":\"datauoxfa\"},{\"fields\":[\"bskkypor\",\"ynieunbydlgfaphw\"],\"parameters\":\"databwtsaynrt\"}],\"rmclyqwwu\":[{\"fields\":[\"mrnblihs\",\"bfb\",\"divixzhpjgqzmiao\"],\"parameters\":\"dataeacfxaubuh\"},{\"fields\":[\"tcnxriqz\",\"dckhsq\"],\"parameters\":\"datarjsurnowo\"},{\"fields\":[\"rxmyokohlsf\",\"fouqjpzhea\",\"uvkqxqkvadmj\",\"ymudj\"],\"parameters\":\"dataajzdebhs\"}]},\"enableDnnFeaturization\":true,\"datasetLanguage\":\"aaptbs\"},\"logVerbosity\":\"Critical\",\"trainingData\":{\"jobInputType\":\"mltable\",\"uri\":\"bcbptwybloc\",\"mode\":\"Download\",\"description\":\"lxzbnsshvqn\"},\"targetColumnName\":\"zbeuybutcdzjf\"}")
            .toObject(Regression.class);
        Assertions.assertEquals(LogVerbosity.CRITICAL, model.logVerbosity());
        Assertions.assertEquals("lxzbnsshvqn", model.trainingData().description());
        Assertions.assertEquals("bcbptwybloc", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.trainingData().mode());
        Assertions.assertEquals("zbeuybutcdzjf", model.targetColumnName());
        Assertions.assertEquals(RegressionPrimaryMetrics.R2SCORE, model.primaryMetric());
        Assertions.assertEquals(false, model.trainingSettings().enableOnnxCompatibleModels());
        Assertions.assertEquals(StackMetaLearnerType.LIGHT_GBMREGRESSOR,
            model.trainingSettings().stackEnsembleSettings().stackMetaLearnerType());
        Assertions.assertEquals(8.33007277629979D,
            model.trainingSettings().stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions.assertEquals(true, model.trainingSettings().enableStackEnsemble());
        Assertions.assertEquals(false, model.trainingSettings().enableVoteEnsemble());
        Assertions.assertEquals(Duration.parse("PT9H16M19S"), model.trainingSettings().ensembleModelDownloadTimeout());
        Assertions.assertEquals(true, model.trainingSettings().enableModelExplainability());
        Assertions.assertEquals(true, model.trainingSettings().enableDnnTraining());
        Assertions.assertEquals(RegressionModels.LIGHT_GBM,
            model.trainingSettings().allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(RegressionModels.RANDOM_FOREST,
            model.trainingSettings().blockedTrainingAlgorithms().get(0));
        Assertions.assertEquals(1273889376, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT180H28M30S"), model.limitSettings().trialTimeout());
        Assertions.assertEquals(Duration.parse("PT69H35M25S"), model.limitSettings().timeout());
        Assertions.assertEquals(1570051650, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(1441156662, model.limitSettings().maxCoresPerTrial());
        Assertions.assertEquals(37.32116818441482D, model.limitSettings().exitScore());
        Assertions.assertEquals(true, model.limitSettings().enableEarlyTermination());
        Assertions.assertEquals("tigpksywicklktg", model.cvSplitColumnNames().get(0));
        Assertions.assertEquals("hbdwbvjsbgmlamo", model.weightColumnName());
        Assertions.assertEquals("eocnqoubvepvlrys", model.validationData().description());
        Assertions.assertEquals("caytnpkvbpbltcws", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.validationData().mode());
        Assertions.assertEquals("hxohzbzhhavzf", model.testData().description());
        Assertions.assertEquals("h", model.testData().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.testData().mode());
        Assertions.assertEquals(40.045012854483886D, model.validationDataSize());
        Assertions.assertEquals(47.5872192816281D, model.testDataSize());
        Assertions.assertEquals("aaptbs", model.featurizationSettings().datasetLanguage());
        Assertions.assertEquals(FeaturizationMode.AUTO, model.featurizationSettings().mode());
        Assertions.assertEquals(BlockedTransformers.CAT_TARGET_ENCODER,
            model.featurizationSettings().blockedTransformers().get(0));
        Assertions.assertEquals("uehouisaklh", model.featurizationSettings().columnNameAndTypes().get("fddxqfussub"));
        Assertions.assertEquals("cvxkylhc",
            model.featurizationSettings().transformerParams().get("cmo").get(0).fields().get(0));
        Assertions.assertEquals(true, model.featurizationSettings().enableDnnFeaturization());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Regression model
            = new Regression().withLogVerbosity(LogVerbosity.CRITICAL)
                .withTrainingData(new MLTableJobInput().withDescription("lxzbnsshvqn")
                    .withUri("bcbptwybloc")
                    .withMode(InputDeliveryMode.DOWNLOAD))
                .withTargetColumnName("zbeuybutcdzjf")
                .withPrimaryMetric(RegressionPrimaryMetrics.R2SCORE)
                .withTrainingSettings(
                    new RegressionTrainingSettings().withEnableOnnxCompatibleModels(false)
                        .withStackEnsembleSettings(new StackEnsembleSettings()
                            .withStackMetaLearnerType(StackMetaLearnerType.LIGHT_GBMREGRESSOR)
                            .withStackMetaLearnerTrainPercentage(8.33007277629979D)
                            .withStackMetaLearnerKWargs("datayvichcap"))
                        .withEnableStackEnsemble(true)
                        .withEnableVoteEnsemble(false)
                        .withEnsembleModelDownloadTimeout(Duration.parse("PT9H16M19S"))
                        .withEnableModelExplainability(true)
                        .withEnableDnnTraining(true)
                        .withAllowedTrainingAlgorithms(Arrays.asList(RegressionModels.LIGHT_GBM))
                        .withBlockedTrainingAlgorithms(
                            Arrays.asList(RegressionModels.RANDOM_FOREST, RegressionModels.EXTREME_RANDOM_TREES,
                                RegressionModels.DECISION_TREE, RegressionModels.EXTREME_RANDOM_TREES)))
                .withLimitSettings(new TableVerticalLimitSettings().withMaxTrials(1273889376)
                    .withTrialTimeout(Duration.parse("PT180H28M30S"))
                    .withTimeout(Duration.parse("PT69H35M25S"))
                    .withMaxConcurrentTrials(1570051650)
                    .withMaxCoresPerTrial(1441156662)
                    .withExitScore(37.32116818441482D)
                    .withEnableEarlyTermination(true))
                .withNCrossValidations(new NCrossValidations())
                .withCvSplitColumnNames(Arrays.asList("tigpksywicklktg", "dprtqjytdcfe"))
                .withWeightColumnName("hbdwbvjsbgmlamo")
                .withValidationData(new MLTableJobInput().withDescription("eocnqoubvepvlrys")
                    .withUri("caytnpkvbpbltcws")
                    .withMode(InputDeliveryMode.EVAL_DOWNLOAD))
                .withTestData(new MLTableJobInput()
                    .withDescription("hxohzbzhhavzf")
                    .withUri("h")
                    .withMode(InputDeliveryMode.EVAL_DOWNLOAD))
                .withValidationDataSize(40.045012854483886D)
                .withTestDataSize(47.5872192816281D)
                .withFeaturizationSettings(new TableVerticalFeaturizationSettings().withDatasetLanguage("aaptbs")
                    .withMode(FeaturizationMode.AUTO)
                    .withBlockedTransformers(Arrays.asList(BlockedTransformers.CAT_TARGET_ENCODER))
                    .withColumnNameAndTypes(mapOf("fddxqfussub", "uehouisaklh", "p", "sspmjvailfauyv", "wvoglff",
                        "wlkqdgwbztrthl", "lor", "dhg"))
                    .withTransformerParams(mapOf("cmo",
                        Arrays.asList(
                            new ColumnTransformer().withFields(Arrays.asList("cvxkylhc", "sdylmnq", "nkyg"))
                                .withParameters("datatmsgkwedwl"),
                            new ColumnTransformer()
                                .withFields(Arrays.asList("hgbgbhudh", "pjimvrrqfibpkwm", "mrlfizjuddndi"))
                                .withParameters("datapngyhylqyafe")),
                        "jfqreeo",
                        Arrays.asList(
                            new ColumnTransformer().withFields(Arrays.asList("uytxnxr")).withParameters("datartzea"),
                            new ColumnTransformer().withFields(Arrays.asList("fvkhbjhmv"))
                                .withParameters("dataxsdhweignybffq"),
                            new ColumnTransformer().withFields(Arrays.asList("ynepkt", "mwg", "conyse", "jijfhpxni"))
                                .withParameters("datauoxfa"),
                            new ColumnTransformer().withFields(Arrays.asList("bskkypor", "ynieunbydlgfaphw"))
                                .withParameters("databwtsaynrt")),
                        "rmclyqwwu",
                        Arrays.asList(
                            new ColumnTransformer().withFields(Arrays.asList("mrnblihs", "bfb", "divixzhpjgqzmiao"))
                                .withParameters("dataeacfxaubuh"),
                            new ColumnTransformer().withFields(Arrays.asList("tcnxriqz", "dckhsq"))
                                .withParameters("datarjsurnowo"),
                            new ColumnTransformer()
                                .withFields(Arrays.asList("rxmyokohlsf", "fouqjpzhea", "uvkqxqkvadmj", "ymudj"))
                                .withParameters("dataajzdebhs"))))
                    .withEnableDnnFeaturization(true));
        model = BinaryData.fromObject(model).toObject(Regression.class);
        Assertions.assertEquals(LogVerbosity.CRITICAL, model.logVerbosity());
        Assertions.assertEquals("lxzbnsshvqn", model.trainingData().description());
        Assertions.assertEquals("bcbptwybloc", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.trainingData().mode());
        Assertions.assertEquals("zbeuybutcdzjf", model.targetColumnName());
        Assertions.assertEquals(RegressionPrimaryMetrics.R2SCORE, model.primaryMetric());
        Assertions.assertEquals(false, model.trainingSettings().enableOnnxCompatibleModels());
        Assertions.assertEquals(StackMetaLearnerType.LIGHT_GBMREGRESSOR,
            model.trainingSettings().stackEnsembleSettings().stackMetaLearnerType());
        Assertions.assertEquals(8.33007277629979D,
            model.trainingSettings().stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions.assertEquals(true, model.trainingSettings().enableStackEnsemble());
        Assertions.assertEquals(false, model.trainingSettings().enableVoteEnsemble());
        Assertions.assertEquals(Duration.parse("PT9H16M19S"), model.trainingSettings().ensembleModelDownloadTimeout());
        Assertions.assertEquals(true, model.trainingSettings().enableModelExplainability());
        Assertions.assertEquals(true, model.trainingSettings().enableDnnTraining());
        Assertions.assertEquals(RegressionModels.LIGHT_GBM,
            model.trainingSettings().allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(RegressionModels.RANDOM_FOREST,
            model.trainingSettings().blockedTrainingAlgorithms().get(0));
        Assertions.assertEquals(1273889376, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT180H28M30S"), model.limitSettings().trialTimeout());
        Assertions.assertEquals(Duration.parse("PT69H35M25S"), model.limitSettings().timeout());
        Assertions.assertEquals(1570051650, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(1441156662, model.limitSettings().maxCoresPerTrial());
        Assertions.assertEquals(37.32116818441482D, model.limitSettings().exitScore());
        Assertions.assertEquals(true, model.limitSettings().enableEarlyTermination());
        Assertions.assertEquals("tigpksywicklktg", model.cvSplitColumnNames().get(0));
        Assertions.assertEquals("hbdwbvjsbgmlamo", model.weightColumnName());
        Assertions.assertEquals("eocnqoubvepvlrys", model.validationData().description());
        Assertions.assertEquals("caytnpkvbpbltcws", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.validationData().mode());
        Assertions.assertEquals("hxohzbzhhavzf", model.testData().description());
        Assertions.assertEquals("h", model.testData().uri());
        Assertions.assertEquals(InputDeliveryMode.EVAL_DOWNLOAD, model.testData().mode());
        Assertions.assertEquals(40.045012854483886D, model.validationDataSize());
        Assertions.assertEquals(47.5872192816281D, model.testDataSize());
        Assertions.assertEquals("aaptbs", model.featurizationSettings().datasetLanguage());
        Assertions.assertEquals(FeaturizationMode.AUTO, model.featurizationSettings().mode());
        Assertions.assertEquals(BlockedTransformers.CAT_TARGET_ENCODER,
            model.featurizationSettings().blockedTransformers().get(0));
        Assertions.assertEquals("uehouisaklh", model.featurizationSettings().columnNameAndTypes().get("fddxqfussub"));
        Assertions.assertEquals("cvxkylhc",
            model.featurizationSettings().transformerParams().get("cmo").get(0).fields().get(0));
        Assertions.assertEquals(true, model.featurizationSettings().enableDnnFeaturization());
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
