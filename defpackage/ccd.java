package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ccd implements eff {
    DEBUG_DIAG_CODE_UNDEFINED(0),
    BACKGROUND_TRAINING_PERSONALIZATION_CHECKPOINT_PUBLISHED(1),
    BACKGROUND_TRAINING_PROTO_STORE_CLEANUP_UNNECESSARY(2),
    BACKGROUND_TRAINING_TASK_NOT_SCHEDULED(3),
    INTSERVICE_UPDATE_TRAINING_STATUS(200),
    INTSERVICE_GET_TRAINING_STATUS(AIFeature.Id.LLM_IT_XS_GEM),
    INTSERVICE_GET_EXAMPLES(AIFeature.Id.RECORDER_SUMMARIZATION_IT_XS_GEM),
    INTSERVICE_CLEAR_EXAMPLE_STORE(AIFeature.Id.LLM_MMIT_XS_GEM),
    INTSERVICE_RESCHEDULE_BEFORE(AIFeature.Id.TEXT_EMBEDDING_ST5),
    INTSERVICE_RESCHEDULE_AFTER(AIFeature.Id.AIAI_ZERO_STATE),
    EXAMPLE_STORE_CONTEXT_POPULATION_SUCCESS(301),
    EXAMPLE_STORE_CONTEXT_POPULATION_ERROR(302),
    EXAMPLE_STORE_ADD_SUCCESSFULLY(303),
    EXAMPLE_STORE_OPEN_LEVELDB(304),
    EXAMPLE_STORE_LEVELDB_DATA_ADDED(305),
    EXAMPLE_STORE_CHECK_EXPIRED_EXAMPLE_NOT_READY(306),
    EXAMPLE_STORE_CHECK_EXPIRED_EXAMPLE_READY(307),
    EXAMPLE_STORE_CHECK_FUTURE_EXAMPLE(308),
    EXAMPLE_STORE_CHECK_EXCEEDING_EXAMPLE(309),
    EXAMPLE_STORE_COLLECTION_UNDER_LIMIT(310),
    EXAMPLE_STORE_COLLECTION_OVER_LIMIT(311),
    EXAMPLE_STORE_UPDATE_COLLECTION_OPTION(312),
    EXAMPLE_STORE_UPDATE_COLLECTION_INFO_TO_STORE(313),
    EXAMPLE_STORE_COLLECTION_INFO_BATCH_CREATED(314),
    EXAMPLE_STORE_COLLECTION_INFO_BATCH_FLUSHED(315),
    EXAMPLE_STORE_CLEAR_ERROR(316),
    EXAMPLE_STORE_CLEAR_SUCCESSFULLY(317),
    EXAMPLE_STORE_LEVELDB_COLLECTION_REMOVAL(318),
    EXAMPLE_STORE_SNAPSHOT_NOT_READY(319),
    EXAMPLE_STORE_SNAPSHOT_READY(320),
    PREDICTOR_CONTEXT_POPULATION_SUCCESS(401),
    PREDICTOR_CONTROLLER_RANK_CALLED(402),
    PREDICTOR_ENGINE_REFRESHED(403),
    PREDICTOR_PREDICT_RESULT_RECEIVED(404),
    PREDICTOR_PREDICT_RESULTS_RETURNED(405),
    PREDICTOR_TENSORFLOW_START_TO_CREATE_PREDICT_ENGINE(406),
    PREDICTOR_TENSORFLOW_ENGINE_SESSION_CREATED(407),
    PREDICTOR_TENSORFLOW_ENGINE_SESSION_FAILED(408),
    PREDICTOR_TENSORFLOW_ENGINE_CHECKPOINT_READ(409),
    PREDICTOR_TENSORFLOW_ENGINE_CHECKPOINT_READ_FAILED(410),
    PREDICTOR_TENSORFLOW_RANKING_ENGINE_CREATED(411),
    PREDICTOR_TENSORFLOW_RANKING_PREDICT_SINGLE(412),
    PREDICTOR_TENSORFLOW_RANKING_GOT_TENSOR_PROTO(413),
    PREDICTOR_TENSORFLOW_RANKING_PREDICT_SERIALIZED_FORM(414),
    PREDICTOR_TENSORFLOW_RANKING_CASE_KEY_OUTPUT(415),
    PREDICTOR_TENSORFLOW_RANKING_SESSION_RUN_STARTED(416),
    PREDICTOR_TENSORFLOW_RANKING_SESSION_RUN_FINISHED(417),
    PREDICTOR_SUCCESS(418),
    PREDICTOR_MAIN_PLAN_AND_PARAMS_USED(419),
    PREDICTOR_FALLBACK_PLAN_AND_PARAMS_USED(420),
    PREDICTOR_ENGINE_NEW_PARAMS(421),
    PREDICTOR_TENSORFLOW_RANKING_PREDICT_RAW_TENSOR_FORM(422),
    CONTEXT_PROVIDER_USE_DEFAULT_ACCOUNT(500),
    CONTEXT_PROVIDER_USE_REAL_ACCOUNT(AIFeature.Id.SUMMARIZATION_GPU_CROS),
    CONTEXT_PROVIDER_START_COLLECT(AIFeature.Id.GBOARD_SMARTREPLY_GPU_CROS),
    CONTEXT_PROVIDER_POPULATE_CONTEXT(503),
    CONTEXT_PROVIDER_INELIGIBLE_ACCOUNT(504),
    CONTEXT_PROVIDER_ELIGIBLE_ACCOUNT(505),
    CONTEXT_PROVIDER_CREATED_CONTEXT_LISTENER(506),
    CONTEXT_PROVIDER_CREATED_PLACE_FENCE_LISTENER(507),
    CONTEXT_PROVIDER_CONNECT_TO_GCORE(508),
    CONTEXT_PROVIDER_DISCONNECT_TO_GCORE(509),
    CONTEXT_PROVIDER_ON_GCORE_CONNECTED(510),
    CONTEXT_PROVIDER_REGISTER_CONTEXT_LISTENER(511),
    CONTEXT_PROVIDER_REGISTER_PLACE_FENCE_LISTENER(512),
    CONTEXT_PROVIDER_NO_CONTEXT_REGISTERED(513),
    CONTEXT_PROVIDER_UNREGISTER_CONTEXT_LISTENER(514),
    CONTEXT_PROVIDER_UNREGISTER_PLACE_FENCE_LISTENER(515),
    CONTEXT_PROVIDER_EXAMPLE_CONTEXT_POPULATED(516),
    CONTEXT_PROVIDER_REGISTER_CONTEXT_ERROR(517),
    CONTEXT_PROVIDER_REGISTER_CONTEXT_LISTENER_SUCCESSFULLY(540),
    CONTEXT_PROVIDER_REGISTER_PLACE_FENCE_LISTENER_SUCCESSFULLY(541),
    CONTEXT_PROVIDER_ALL_LISTENER_REGISTERED_SUCCESSFULLY(542),
    CONTEXT_PROVIDER_CONTEXT_UPDATE_RECEIVED(543),
    CONTEXT_PROVIDER_PLACE_FENCE_UPDATE_RECEIVED(544),
    DYNAMITE_FEATURE_REQUEST_DISABLED(600),
    DYNAMITE_FEATURE_NOT_UNREQUESTED(AIFeature.Id.SAPI_SUMMARIZATION_1),
    DOWNLOAD_ALREADY_DONE(700),
    DOWNLOAD_ALREADY_SCHEDULED(701),
    LEARNING_CONTEXT_REFCOUNT_INCREMENTED(800),
    LEARNING_CONTEXT_REFCOUNT_DECREMENTED(801),
    LEARNING_CONTEXT_CREATED(802),
    LEARNING_CONTEXT_DESTROYED(803),
    FAT_DYNAMITE_LOADER_USED(804),
    CUSTOM_NATIVE_LIBRARY_LOADED(805),
    CUSTOM_CLIENT_NAME_USED(806),
    ATTESTATION_CLIENT_OVERRIDE_USED(807),
    IN_APP_EXAMPLE_STORE_PROXY_DESTROY(900),
    IN_APP_EXAMPLE_STORE_PROXY_USED_DYNAMITE_MODULE_INIT(901),
    TRAINING_BEFORE_LOOP_OP(1000),
    TRAINING_AFTER_LOOP_OP(AIFeature.Id.LLM_CPU_GEM_QUALCOMM),
    TRAINING_OPSTATS_ENABLED(AIFeature.Id.SUMMARIZATION_CPU_GEM_QUALCOMM),
    RESULT_HANDLING_SERVICE_CLIENT_SUCCEEDED_V2(1100),
    TRAINING_CONDITION_CHECK_THROTTLED_V2(1101),
    RESOURCE_CACHE_HIT(1200),
    RESOURCE_CACHE_MISS(1201),
    UNRECOGNIZED(-1);

    private final int aU;

    ccd(int i) {
        this.aU = i;
    }

    public static ccd b(int i) {
        if (i == 0) {
            return DEBUG_DIAG_CODE_UNDEFINED;
        }
        if (i == 1) {
            return BACKGROUND_TRAINING_PERSONALIZATION_CHECKPOINT_PUBLISHED;
        }
        if (i == 2) {
            return BACKGROUND_TRAINING_PROTO_STORE_CLEANUP_UNNECESSARY;
        }
        if (i == 3) {
            return BACKGROUND_TRAINING_TASK_NOT_SCHEDULED;
        }
        if (i == 600) {
            return DYNAMITE_FEATURE_REQUEST_DISABLED;
        }
        if (i == 601) {
            return DYNAMITE_FEATURE_NOT_UNREQUESTED;
        }
        if (i == 700) {
            return DOWNLOAD_ALREADY_DONE;
        }
        if (i == 701) {
            return DOWNLOAD_ALREADY_SCHEDULED;
        }
        if (i == 900) {
            return IN_APP_EXAMPLE_STORE_PROXY_DESTROY;
        }
        if (i == 901) {
            return IN_APP_EXAMPLE_STORE_PROXY_USED_DYNAMITE_MODULE_INIT;
        }
        switch (i) {
            case 200:
                return INTSERVICE_UPDATE_TRAINING_STATUS;
            case AIFeature.Id.LLM_IT_XS_GEM /* 201 */:
                return INTSERVICE_GET_TRAINING_STATUS;
            case AIFeature.Id.RECORDER_SUMMARIZATION_IT_XS_GEM /* 202 */:
                return INTSERVICE_GET_EXAMPLES;
            case AIFeature.Id.LLM_MMIT_XS_GEM /* 203 */:
                return INTSERVICE_CLEAR_EXAMPLE_STORE;
            case AIFeature.Id.TEXT_EMBEDDING_ST5 /* 204 */:
                return INTSERVICE_RESCHEDULE_BEFORE;
            case AIFeature.Id.AIAI_ZERO_STATE /* 205 */:
                return INTSERVICE_RESCHEDULE_AFTER;
            default:
                switch (i) {
                    case 301:
                        return EXAMPLE_STORE_CONTEXT_POPULATION_SUCCESS;
                    case 302:
                        return EXAMPLE_STORE_CONTEXT_POPULATION_ERROR;
                    case 303:
                        return EXAMPLE_STORE_ADD_SUCCESSFULLY;
                    case 304:
                        return EXAMPLE_STORE_OPEN_LEVELDB;
                    case 305:
                        return EXAMPLE_STORE_LEVELDB_DATA_ADDED;
                    case 306:
                        return EXAMPLE_STORE_CHECK_EXPIRED_EXAMPLE_NOT_READY;
                    case 307:
                        return EXAMPLE_STORE_CHECK_EXPIRED_EXAMPLE_READY;
                    case 308:
                        return EXAMPLE_STORE_CHECK_FUTURE_EXAMPLE;
                    case 309:
                        return EXAMPLE_STORE_CHECK_EXCEEDING_EXAMPLE;
                    case 310:
                        return EXAMPLE_STORE_COLLECTION_UNDER_LIMIT;
                    case 311:
                        return EXAMPLE_STORE_COLLECTION_OVER_LIMIT;
                    case 312:
                        return EXAMPLE_STORE_UPDATE_COLLECTION_OPTION;
                    case 313:
                        return EXAMPLE_STORE_UPDATE_COLLECTION_INFO_TO_STORE;
                    case 314:
                        return EXAMPLE_STORE_COLLECTION_INFO_BATCH_CREATED;
                    case 315:
                        return EXAMPLE_STORE_COLLECTION_INFO_BATCH_FLUSHED;
                    case 316:
                        return EXAMPLE_STORE_CLEAR_ERROR;
                    case 317:
                        return EXAMPLE_STORE_CLEAR_SUCCESSFULLY;
                    case 318:
                        return EXAMPLE_STORE_LEVELDB_COLLECTION_REMOVAL;
                    case 319:
                        return EXAMPLE_STORE_SNAPSHOT_NOT_READY;
                    case 320:
                        return EXAMPLE_STORE_SNAPSHOT_READY;
                    default:
                        switch (i) {
                            case 401:
                                return PREDICTOR_CONTEXT_POPULATION_SUCCESS;
                            case 402:
                                return PREDICTOR_CONTROLLER_RANK_CALLED;
                            case 403:
                                return PREDICTOR_ENGINE_REFRESHED;
                            case 404:
                                return PREDICTOR_PREDICT_RESULT_RECEIVED;
                            case 405:
                                return PREDICTOR_PREDICT_RESULTS_RETURNED;
                            case 406:
                                return PREDICTOR_TENSORFLOW_START_TO_CREATE_PREDICT_ENGINE;
                            case 407:
                                return PREDICTOR_TENSORFLOW_ENGINE_SESSION_CREATED;
                            case 408:
                                return PREDICTOR_TENSORFLOW_ENGINE_SESSION_FAILED;
                            case 409:
                                return PREDICTOR_TENSORFLOW_ENGINE_CHECKPOINT_READ;
                            case 410:
                                return PREDICTOR_TENSORFLOW_ENGINE_CHECKPOINT_READ_FAILED;
                            case 411:
                                return PREDICTOR_TENSORFLOW_RANKING_ENGINE_CREATED;
                            case 412:
                                return PREDICTOR_TENSORFLOW_RANKING_PREDICT_SINGLE;
                            case 413:
                                return PREDICTOR_TENSORFLOW_RANKING_GOT_TENSOR_PROTO;
                            case 414:
                                return PREDICTOR_TENSORFLOW_RANKING_PREDICT_SERIALIZED_FORM;
                            case 415:
                                return PREDICTOR_TENSORFLOW_RANKING_CASE_KEY_OUTPUT;
                            case 416:
                                return PREDICTOR_TENSORFLOW_RANKING_SESSION_RUN_STARTED;
                            case 417:
                                return PREDICTOR_TENSORFLOW_RANKING_SESSION_RUN_FINISHED;
                            case 418:
                                return PREDICTOR_SUCCESS;
                            case 419:
                                return PREDICTOR_MAIN_PLAN_AND_PARAMS_USED;
                            case 420:
                                return PREDICTOR_FALLBACK_PLAN_AND_PARAMS_USED;
                            case 421:
                                return PREDICTOR_ENGINE_NEW_PARAMS;
                            case 422:
                                return PREDICTOR_TENSORFLOW_RANKING_PREDICT_RAW_TENSOR_FORM;
                            case 1000:
                                return TRAINING_BEFORE_LOOP_OP;
                            case AIFeature.Id.LLM_CPU_GEM_QUALCOMM /* 1001 */:
                                return TRAINING_AFTER_LOOP_OP;
                            case AIFeature.Id.SUMMARIZATION_CPU_GEM_QUALCOMM /* 1002 */:
                                return TRAINING_OPSTATS_ENABLED;
                            case 1100:
                                return RESULT_HANDLING_SERVICE_CLIENT_SUCCEEDED_V2;
                            case 1101:
                                return TRAINING_CONDITION_CHECK_THROTTLED_V2;
                            case 1200:
                                return RESOURCE_CACHE_HIT;
                            case 1201:
                                return RESOURCE_CACHE_MISS;
                            default:
                                switch (i) {
                                    case 500:
                                        return CONTEXT_PROVIDER_USE_DEFAULT_ACCOUNT;
                                    case AIFeature.Id.SUMMARIZATION_GPU_CROS /* 501 */:
                                        return CONTEXT_PROVIDER_USE_REAL_ACCOUNT;
                                    case AIFeature.Id.GBOARD_SMARTREPLY_GPU_CROS /* 502 */:
                                        return CONTEXT_PROVIDER_START_COLLECT;
                                    case 503:
                                        return CONTEXT_PROVIDER_POPULATE_CONTEXT;
                                    case 504:
                                        return CONTEXT_PROVIDER_INELIGIBLE_ACCOUNT;
                                    case 505:
                                        return CONTEXT_PROVIDER_ELIGIBLE_ACCOUNT;
                                    case 506:
                                        return CONTEXT_PROVIDER_CREATED_CONTEXT_LISTENER;
                                    case 507:
                                        return CONTEXT_PROVIDER_CREATED_PLACE_FENCE_LISTENER;
                                    case 508:
                                        return CONTEXT_PROVIDER_CONNECT_TO_GCORE;
                                    case 509:
                                        return CONTEXT_PROVIDER_DISCONNECT_TO_GCORE;
                                    case 510:
                                        return CONTEXT_PROVIDER_ON_GCORE_CONNECTED;
                                    case 511:
                                        return CONTEXT_PROVIDER_REGISTER_CONTEXT_LISTENER;
                                    case 512:
                                        return CONTEXT_PROVIDER_REGISTER_PLACE_FENCE_LISTENER;
                                    case 513:
                                        return CONTEXT_PROVIDER_NO_CONTEXT_REGISTERED;
                                    case 514:
                                        return CONTEXT_PROVIDER_UNREGISTER_CONTEXT_LISTENER;
                                    case 515:
                                        return CONTEXT_PROVIDER_UNREGISTER_PLACE_FENCE_LISTENER;
                                    case 516:
                                        return CONTEXT_PROVIDER_EXAMPLE_CONTEXT_POPULATED;
                                    case 517:
                                        return CONTEXT_PROVIDER_REGISTER_CONTEXT_ERROR;
                                    default:
                                        switch (i) {
                                            case 540:
                                                return CONTEXT_PROVIDER_REGISTER_CONTEXT_LISTENER_SUCCESSFULLY;
                                            case 541:
                                                return CONTEXT_PROVIDER_REGISTER_PLACE_FENCE_LISTENER_SUCCESSFULLY;
                                            case 542:
                                                return CONTEXT_PROVIDER_ALL_LISTENER_REGISTERED_SUCCESSFULLY;
                                            case 543:
                                                return CONTEXT_PROVIDER_CONTEXT_UPDATE_RECEIVED;
                                            case 544:
                                                return CONTEXT_PROVIDER_PLACE_FENCE_UPDATE_RECEIVED;
                                            default:
                                                switch (i) {
                                                    case 800:
                                                        return LEARNING_CONTEXT_REFCOUNT_INCREMENTED;
                                                    case 801:
                                                        return LEARNING_CONTEXT_REFCOUNT_DECREMENTED;
                                                    case 802:
                                                        return LEARNING_CONTEXT_CREATED;
                                                    case 803:
                                                        return LEARNING_CONTEXT_DESTROYED;
                                                    case 804:
                                                        return FAT_DYNAMITE_LOADER_USED;
                                                    case 805:
                                                        return CUSTOM_NATIVE_LIBRARY_LOADED;
                                                    case 806:
                                                        return CUSTOM_CLIENT_NAME_USED;
                                                    case 807:
                                                        return ATTESTATION_CLIENT_OVERRIDE_USED;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.eff
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.aU;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
