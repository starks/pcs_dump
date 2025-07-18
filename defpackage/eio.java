package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eio implements eff {
    UNKNOWN_COUNT(0),
    AIAI_USAGE_JOB_SCHEDULER_SUCCESS(1),
    AIAI_USAGE_JOB_SCHEDULER_FAILURE_ALREADY_SCHEDULED(2),
    AIAI_USAGE_JOB_SCHEDULER_FAILURE_UNKNOWN(3),
    AIAI_USAGE_JOB_SCHEDULER_UPLOAD_SUCCESS(4),
    AIAI_USAGE_JOB_SCHEDULER_UPLOAD_FAILURE(5),
    AIAI_USAGE_SCHEDULED_EXECUTOR_START(6),
    AIAI_USAGE_SCHEDULED_EXECUTOR_SUCCESS(7),
    AIAI_USAGE_SCHEDULED_EXECUTOR_FAILURE(8),
    AIAI_USAGE_PRIORITY_SUGGESTION_SHOWN(9),
    AIAI_USAGE_PRIORITY_SUGGESTION_SEEN(10),
    AIAI_USAGE_PRIORITY_SUGGESTION_OPENED(11),
    AIAI_USAGE_PRIORITY_SUGGESTION_ACCEPTED(12),
    PCS_HTTP_DOWNLOAD_SUCCESS(13),
    PCS_HTTP_DOWNLOAD_FAILURE(14),
    PCS_INPROCESS_HTTP_DOWNLOAD_SUCCESS(15),
    PCS_INPROCESS_HTTP_DOWNLOAD_FAILURE(16),
    PCS_PIR_DOWNLOAD_SUCCESS(17),
    PCS_PIR_DOWNLOAD_FAILURE(18),
    PCS_INPROCESS_PIR_DOWNLOAD_SUCCESS(19),
    PCS_INPROCESS_PIR_DOWNLOAD_FAILURE(20),
    AIAI_SUPERPACKS_PIR_DOWNLOAD_SUCCESS(21),
    AIAI_SUPERPACKS_PIR_DOWNLOAD_FAILURE(22),
    PCS_SCHEDULE_BRELLA_JOB_FAILURE(23),
    PCS_AIAI_BINDING_FAILURE(24),
    PCS_PARSE_CRITERIA_FAILED(25),
    PCS_RESOLVE_POLICY_FAILED_POLICY_NOT_PRESENT_IN_THE_APK(26),
    PCS_RESOLVE_POLICY_FAILED_POLICY_INCOMPATIBLE_WITH_APK_POLICIES(27),
    AIAI_QUERY_VALIDATION_FAILURE(28),
    AIAI_ON_TRIM_MEMORY_UNKNOWN(29),
    AIAI_ON_TRIM_MEMORY_MODERATE(30),
    AIAI_ON_TRIM_MEMORY_LOW(31),
    AIAI_ON_TRIM_MEMORY_CRITICAL(32),
    ARCS_REF_MODE_STORE_PENDING_REFERENCE_TIMEOUT(33),
    AIAI_GELLER_DATA_SHARE_SUCCESS(34),
    AIAI_GELLER_DATA_SHARE_FAILURE(35),
    AIAI_SMARTSPACE_WEATHER_SCHEDULE_START(36),
    AIAI_SMARTSPACE_WEATHER_SCHEDULE_FAILURE(37),
    AIAI_SMARTSPACE_WEATHER_DOWNLOAD_SUCCESS(38),
    AIAI_SMARTSPACE_WEATHER_DOWNLOAD_FAILURE(39),
    AIAI_SMARTSPACE_WEATHER_SCHEDULE_CANCELED(40),
    AIAI_OUTLOOK_NOTIFICATION_TYPE_EVENT_REMINDER(41),
    AIAI_OUTLOOK_NOTIFICATION_TYPE_EMAIL(42),
    AIAI_OUTLOOK_NOTIFICATION_TYPE_OTHER(43),
    AIAI_OUTLOOK_NOTIFICATION_EVENT_REGEXP_MATCH(44),
    AIAI_OUTLOOK_NOTIFICATION_EVENT_REGEXP_FAIL(45),
    AIAI_OUTLOOK_NOTIFICATION_EVENT_INVALID_12_HOUR(46),
    AIAI_OUTLOOK_NOTIFICATION_EVENT_OUTSIDE_WINDOW(47),
    AIAI_OUTLOOK_NOTIFICATION_EVENT_SENT_TO_SMARTSPACE(48),
    AIAI_ECHO_APP_SUGGESTIONS_REFRACTION_LOAD_MDD(49),
    AIAI_ECHO_APP_SUGGESTIONS_REFRACTION_LOAD_ASSESTS(50),
    AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_LOCK_SCREEN(51),
    AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_HOME_SCREEN(52),
    AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_MEDIA(53),
    AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_DREAM(54),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_LOCK_SCREEN(63),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_LOCK_SCREEN(64),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_HOME_SCREEN(65),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_HOME_SCREEN(66),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_MEDIA(67),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_MEDIA(68),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_DREAM(69),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_DREAM(70),
    AIAI_SMARTSPACE_IMAGE_DECODE_FAILURE(71),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_SEEN(72),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_NO_LONGER_SEEN(73),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_SUPPRESSED_BY_TWIDDLER(74),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_SEEN_EXPIRES_BY_TIME(75),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_NO_LONGER_SEEN_EXPIRES_BY_TIME(76),
    AIAI_SMARTSPACE_DOORBELL_CHANNEL_BREAKAGE(77),
    AIAI_SMARTSPACE_DOORBELL_NOTIFICATION(78),
    AIAI_SMARTSPACE_DOORBELL_EXPIRES_BY_TIME_COUNT(129),
    AIAI_SMARTSPACE_ETA_RIDESHARE_SUCCESSFUL_PARSE(79),
    AIAI_SMARTSPACE_ETA_RIDESHARE_MISSING_METADATA(80),
    AIAI_SMARTSPACE_ETA_RIDESHARE_DRIVER_ARRIVING_TIME_DELTA_MORE_THAN_1_MIN(81),
    AIAI_SMARTSPACE_ETA_RIDESHARE_DRIVER_ARRIVING_TIME_DELTA_MORE_THAN_3_MIN(82),
    AIAI_SMARTSPACE_ETA_RIDESHARE_DRIVER_ARRIVING_TIME_DELTA_MORE_THAN_5_MIN(83),
    AIAI_SMARTSPACE_ETA_RIDESHARE_ETA_TOO_LARGE(100),
    AIAI_SMARTSPACE_ETA_RIDESHARE_EXPIRES_BY_TIME(84),
    AIAI_SMARTSPACE_ETA_RIDESHARE_FIRST_PUSH(85),
    AIAI_SMARTSPACE_ETA_RIDESHARE_SECOND_PUSH(86),
    AIAI_SMARTSPACE_ETA_RIDESHARE_ETA_NEITHER_FIRST_NOR_SECOND_PUSH(AIFeature.Id.LLM_PER_LAYER_GEM),
    AIAI_SMARTSPACE_ETA_RIDESHARE_WHEN_ZERO(87),
    AIAI_SMARTSPACE_ETA_RIDESHARE_WHEN_MISSING(88),
    AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SERVICE(89),
    AIAI_SMARTSPACE_BEDTIME_OPT_IN_NOTIFICATION_ENABLEMENT_SHOWN(AIFeature.Id.RECORDER_SUMMARIZATION_PER_LAYER_GEM),
    AIAI_SMARTSPACE_BEDTIME_OPT_IN_NOTIFICATION_ENABLEMENT_TAPPED(AIFeature.Id.GBOARD_SMARTREPLY_PER_LAYER_GEM),
    AIAI_SMARTSPACE_BEDTIME_EXPIRES_BY_TIME_COUNT(130),
    AIAI_SMARTSPACE_EARTHQUAKE_EXPIRES_BY_TIME_COUNT(131),
    AIAI_TOAST_APP_CORPUS_EMPTY_TOTAL_LIGHT_FETCHER_TRIGGER(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1),
    AIAI_TOAST_APP_CORPUS_EMPTY_USEFUL_LIGHT_FETCHER_TRIGGER(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1),
    AIAI_TOAST_PNB_AGGREGATE_STARTED(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2),
    AIAI_TOAST_PNB_AGGREGATE_SUCCESS(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2),
    AIAI_TOAST_PNB_AGGREGATE_FAILURE(AIFeature.Id.LLM_IT_PER_LAYER_GEM),
    AIAI_TOAST_FA_INTERACTION_AIAI(AIFeature.Id.BUMBLEBEE),
    AIAI_TOAST_FA_INTERACTION_OTHER(AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM),
    AIAI_AUTOFILL_REQUEST_TIMEOUT(122),
    AIAI_SHARESHEET_APP_SHARE_REQUEST(123),
    AIAI_SHARESHEET_DIRECT_SHARE_REQUEST(124),
    PCC_SETTINGS_OPENED(90),
    ASI_SETTINGS_OPENED(91),
    PCS_NETWORK_USAGE_LOG_ACTIVITY_ENABLED(92),
    PCS_NETWORK_USAGE_LOG_OPTED_OUT(93),
    PCS_NETWORK_USAGE_LOG_OPTED_IN(94),
    PCS_NETWORK_USAGE_LOG_OPENED(95),
    PCS_NETWORK_USAGE_LOG_ITEM_INSPECTED(96),
    PCS_NETWORK_USAGE_LOG_NO_ITEM_INSPECTED(97),
    PCS_NETWORK_USAGE_LOG_POLICY_INSPECTED(98),
    PCS_NETWORK_USAGE_LOG_UNRECOGNISED_REQUEST(99),
    PCC_ATTESTATION_MEASUREMENT_REQUEST(AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1),
    PCC_ATTESTATION_RECORD_GENERATED(AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_2),
    PCS_TRAINING_STATS_UNAVAILABLE_EXCEPTION(113),
    PCS_TRAINING_STATS_QUERY_EXCEPTION(114),
    PCS_TRAINING_STATS_QUERY_SUCCESS(115),
    PCS_TRAINING_STATS_ATTEMPTED(116),
    PCS_TRAINING_STATS_EXCEPTION_NO_CONFIGS_FOUND(117),
    PCS_TRAINING_STATS_EXCEPTION_NO_MATCHING_RESTRICTED_CONFIGS(118),
    PCS_TRAINING_STATS_EXCEPTION_AMBIGUOUS_CONFIG_KEY(119),
    PCS_TRAINING_STATS_EXCEPTION_INCONSISTENT_ROW_SIZES(120),
    PCS_TRAINING_STATS_EXCEPTION_UNKNOWN(121),
    PCS_TRAINING_BINDER_DIED(125),
    PCS_TRAINING_BINDER_NULL(126),
    PCS_TRAINING_BINDER_SERVICE_DISCONNECTED(127),
    PCS_TRAINING_BINDER_SERVICE_CONNECTED(128),
    AIAI_SMART_SUGGESTIONS_NOTIFICATION_ENQUEUED(132),
    AIAI_SMART_SUGGESTIONS_OTP_NOT_CHECKED(133),
    AIAI_SMART_SUGGESTIONS_OTP_CHECKED(134),
    AIAI_SMART_SUGGESTIONS_OTP_FOUND(135),
    AIAI_SMART_SUGGESTIONS_ADDED_REPLIES_OR_ACTIONS(136),
    AIAI_SMART_SUGGESTIONS_DEADLINE_MISSED(137),
    AIAI_SMART_SUGGESTIONS_NOTIFICATION_SKIPPED_DUE_TO_LOAD(138),
    AIAI_SMART_SUGGESTIONS_VERY_HIGH_PROCESSING_TIME(139),
    AIAI_SMART_SUGGESTIONS_SMS_CHANGED_BROADCAST(140),
    AIAI_SMART_SUGGESTIONS_SMS_CHANGED_POLL(141),
    AIAI_SMART_SUGGESTIONS_OTP_DETECTION_METHOD_TEXT_CLASSIFIER(142),
    AIAI_SMART_SUGGESTIONS_OTP_DETECTION_METHOD_LOCAL_HELPER(143);

    public final int bG;

    eio(int i) {
        this.bG = i;
    }

    public static eio b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COUNT;
            case 1:
                return AIAI_USAGE_JOB_SCHEDULER_SUCCESS;
            case 2:
                return AIAI_USAGE_JOB_SCHEDULER_FAILURE_ALREADY_SCHEDULED;
            case 3:
                return AIAI_USAGE_JOB_SCHEDULER_FAILURE_UNKNOWN;
            case 4:
                return AIAI_USAGE_JOB_SCHEDULER_UPLOAD_SUCCESS;
            case 5:
                return AIAI_USAGE_JOB_SCHEDULER_UPLOAD_FAILURE;
            case 6:
                return AIAI_USAGE_SCHEDULED_EXECUTOR_START;
            case 7:
                return AIAI_USAGE_SCHEDULED_EXECUTOR_SUCCESS;
            case 8:
                return AIAI_USAGE_SCHEDULED_EXECUTOR_FAILURE;
            case 9:
                return AIAI_USAGE_PRIORITY_SUGGESTION_SHOWN;
            case 10:
                return AIAI_USAGE_PRIORITY_SUGGESTION_SEEN;
            case 11:
                return AIAI_USAGE_PRIORITY_SUGGESTION_OPENED;
            case 12:
                return AIAI_USAGE_PRIORITY_SUGGESTION_ACCEPTED;
            case 13:
                return PCS_HTTP_DOWNLOAD_SUCCESS;
            case 14:
                return PCS_HTTP_DOWNLOAD_FAILURE;
            case 15:
                return PCS_INPROCESS_HTTP_DOWNLOAD_SUCCESS;
            case 16:
                return PCS_INPROCESS_HTTP_DOWNLOAD_FAILURE;
            case 17:
                return PCS_PIR_DOWNLOAD_SUCCESS;
            case 18:
                return PCS_PIR_DOWNLOAD_FAILURE;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return PCS_INPROCESS_PIR_DOWNLOAD_SUCCESS;
            case 20:
                return PCS_INPROCESS_PIR_DOWNLOAD_FAILURE;
            case 21:
                return AIAI_SUPERPACKS_PIR_DOWNLOAD_SUCCESS;
            case 22:
                return AIAI_SUPERPACKS_PIR_DOWNLOAD_FAILURE;
            case 23:
                return PCS_SCHEDULE_BRELLA_JOB_FAILURE;
            case 24:
                return PCS_AIAI_BINDING_FAILURE;
            case 25:
                return PCS_PARSE_CRITERIA_FAILED;
            case 26:
                return PCS_RESOLVE_POLICY_FAILED_POLICY_NOT_PRESENT_IN_THE_APK;
            case 27:
                return PCS_RESOLVE_POLICY_FAILED_POLICY_INCOMPATIBLE_WITH_APK_POLICIES;
            case 28:
                return AIAI_QUERY_VALIDATION_FAILURE;
            case 29:
                return AIAI_ON_TRIM_MEMORY_UNKNOWN;
            case 30:
                return AIAI_ON_TRIM_MEMORY_MODERATE;
            case 31:
                return AIAI_ON_TRIM_MEMORY_LOW;
            case 32:
                return AIAI_ON_TRIM_MEMORY_CRITICAL;
            case 33:
                return ARCS_REF_MODE_STORE_PENDING_REFERENCE_TIMEOUT;
            case 34:
                return AIAI_GELLER_DATA_SHARE_SUCCESS;
            case 35:
                return AIAI_GELLER_DATA_SHARE_FAILURE;
            case 36:
                return AIAI_SMARTSPACE_WEATHER_SCHEDULE_START;
            case 37:
                return AIAI_SMARTSPACE_WEATHER_SCHEDULE_FAILURE;
            case 38:
                return AIAI_SMARTSPACE_WEATHER_DOWNLOAD_SUCCESS;
            case 39:
                return AIAI_SMARTSPACE_WEATHER_DOWNLOAD_FAILURE;
            case 40:
                return AIAI_SMARTSPACE_WEATHER_SCHEDULE_CANCELED;
            case 41:
                return AIAI_OUTLOOK_NOTIFICATION_TYPE_EVENT_REMINDER;
            case 42:
                return AIAI_OUTLOOK_NOTIFICATION_TYPE_EMAIL;
            case 43:
                return AIAI_OUTLOOK_NOTIFICATION_TYPE_OTHER;
            case 44:
                return AIAI_OUTLOOK_NOTIFICATION_EVENT_REGEXP_MATCH;
            case 45:
                return AIAI_OUTLOOK_NOTIFICATION_EVENT_REGEXP_FAIL;
            case 46:
                return AIAI_OUTLOOK_NOTIFICATION_EVENT_INVALID_12_HOUR;
            case 47:
                return AIAI_OUTLOOK_NOTIFICATION_EVENT_OUTSIDE_WINDOW;
            case 48:
                return AIAI_OUTLOOK_NOTIFICATION_EVENT_SENT_TO_SMARTSPACE;
            case 49:
                return AIAI_ECHO_APP_SUGGESTIONS_REFRACTION_LOAD_MDD;
            case 50:
                return AIAI_ECHO_APP_SUGGESTIONS_REFRACTION_LOAD_ASSESTS;
            case 51:
                return AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_LOCK_SCREEN;
            case 52:
                return AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_HOME_SCREEN;
            case 53:
                return AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_MEDIA;
            case 54:
                return AIAI_SMARTSPACE_SERVICE_DATA_REQUEST_DREAM;
            default:
                switch (i) {
                    case 63:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_LOCK_SCREEN;
                    case 64:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_LOCK_SCREEN;
                    case 65:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_HOME_SCREEN;
                    case 66:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_HOME_SCREEN;
                    case 67:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_MEDIA;
                    case 68:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_MEDIA;
                    case 69:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SESSION_DREAM;
                    case 70:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_DESTROY_SESSION_DREAM;
                    case 71:
                        return AIAI_SMARTSPACE_IMAGE_DECODE_FAILURE;
                    case 72:
                        return AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_SEEN;
                    case 73:
                        return AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_NO_LONGER_SEEN;
                    case 74:
                        return AIAI_SMARTSPACE_PACKAGE_DELIVERY_SUPPRESSED_BY_TWIDDLER;
                    case 75:
                        return AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_SEEN_EXPIRES_BY_TIME;
                    case 76:
                        return AIAI_SMARTSPACE_PACKAGE_DELIVERY_PACKAGE_NO_LONGER_SEEN_EXPIRES_BY_TIME;
                    case 77:
                        return AIAI_SMARTSPACE_DOORBELL_CHANNEL_BREAKAGE;
                    case 78:
                        return AIAI_SMARTSPACE_DOORBELL_NOTIFICATION;
                    case 79:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_SUCCESSFUL_PARSE;
                    case 80:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_MISSING_METADATA;
                    case 81:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_DRIVER_ARRIVING_TIME_DELTA_MORE_THAN_1_MIN;
                    case 82:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_DRIVER_ARRIVING_TIME_DELTA_MORE_THAN_3_MIN;
                    case 83:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_DRIVER_ARRIVING_TIME_DELTA_MORE_THAN_5_MIN;
                    case 84:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_EXPIRES_BY_TIME;
                    case 85:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_FIRST_PUSH;
                    case 86:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_SECOND_PUSH;
                    case 87:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_WHEN_ZERO;
                    case 88:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_WHEN_MISSING;
                    case 89:
                        return AIAI_SMARTSPACE_SERVICE_CONNECTOR_CREATE_SERVICE;
                    case 90:
                        return PCC_SETTINGS_OPENED;
                    case 91:
                        return ASI_SETTINGS_OPENED;
                    case 92:
                        return PCS_NETWORK_USAGE_LOG_ACTIVITY_ENABLED;
                    case 93:
                        return PCS_NETWORK_USAGE_LOG_OPTED_OUT;
                    case 94:
                        return PCS_NETWORK_USAGE_LOG_OPTED_IN;
                    case 95:
                        return PCS_NETWORK_USAGE_LOG_OPENED;
                    case 96:
                        return PCS_NETWORK_USAGE_LOG_ITEM_INSPECTED;
                    case 97:
                        return PCS_NETWORK_USAGE_LOG_NO_ITEM_INSPECTED;
                    case 98:
                        return PCS_NETWORK_USAGE_LOG_POLICY_INSPECTED;
                    case 99:
                        return PCS_NETWORK_USAGE_LOG_UNRECOGNISED_REQUEST;
                    case 100:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_ETA_TOO_LARGE;
                    case AIFeature.Id.LLM_PER_LAYER_GEM /* 101 */:
                        return AIAI_SMARTSPACE_ETA_RIDESHARE_ETA_NEITHER_FIRST_NOR_SECOND_PUSH;
                    case AIFeature.Id.RECORDER_SUMMARIZATION_PER_LAYER_GEM /* 102 */:
                        return AIAI_SMARTSPACE_BEDTIME_OPT_IN_NOTIFICATION_ENABLEMENT_SHOWN;
                    case AIFeature.Id.GBOARD_SMARTREPLY_PER_LAYER_GEM /* 103 */:
                        return AIAI_SMARTSPACE_BEDTIME_OPT_IN_NOTIFICATION_ENABLEMENT_TAPPED;
                    case AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1 /* 104 */:
                        return AIAI_TOAST_APP_CORPUS_EMPTY_TOTAL_LIGHT_FETCHER_TRIGGER;
                    case AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1 /* 105 */:
                        return AIAI_TOAST_APP_CORPUS_EMPTY_USEFUL_LIGHT_FETCHER_TRIGGER;
                    case AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2 /* 106 */:
                        return AIAI_TOAST_PNB_AGGREGATE_STARTED;
                    case AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2 /* 107 */:
                        return AIAI_TOAST_PNB_AGGREGATE_SUCCESS;
                    case AIFeature.Id.LLM_IT_PER_LAYER_GEM /* 108 */:
                        return AIAI_TOAST_PNB_AGGREGATE_FAILURE;
                    case AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1 /* 109 */:
                        return PCC_ATTESTATION_MEASUREMENT_REQUEST;
                    case AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_2 /* 110 */:
                        return PCC_ATTESTATION_RECORD_GENERATED;
                    case AIFeature.Id.BUMBLEBEE /* 111 */:
                        return AIAI_TOAST_FA_INTERACTION_AIAI;
                    case AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM /* 112 */:
                        return AIAI_TOAST_FA_INTERACTION_OTHER;
                    case 113:
                        return PCS_TRAINING_STATS_UNAVAILABLE_EXCEPTION;
                    case 114:
                        return PCS_TRAINING_STATS_QUERY_EXCEPTION;
                    case 115:
                        return PCS_TRAINING_STATS_QUERY_SUCCESS;
                    case 116:
                        return PCS_TRAINING_STATS_ATTEMPTED;
                    case 117:
                        return PCS_TRAINING_STATS_EXCEPTION_NO_CONFIGS_FOUND;
                    case 118:
                        return PCS_TRAINING_STATS_EXCEPTION_NO_MATCHING_RESTRICTED_CONFIGS;
                    case 119:
                        return PCS_TRAINING_STATS_EXCEPTION_AMBIGUOUS_CONFIG_KEY;
                    case 120:
                        return PCS_TRAINING_STATS_EXCEPTION_INCONSISTENT_ROW_SIZES;
                    case 121:
                        return PCS_TRAINING_STATS_EXCEPTION_UNKNOWN;
                    case 122:
                        return AIAI_AUTOFILL_REQUEST_TIMEOUT;
                    case 123:
                        return AIAI_SHARESHEET_APP_SHARE_REQUEST;
                    case 124:
                        return AIAI_SHARESHEET_DIRECT_SHARE_REQUEST;
                    case 125:
                        return PCS_TRAINING_BINDER_DIED;
                    case 126:
                        return PCS_TRAINING_BINDER_NULL;
                    case 127:
                        return PCS_TRAINING_BINDER_SERVICE_DISCONNECTED;
                    case 128:
                        return PCS_TRAINING_BINDER_SERVICE_CONNECTED;
                    case 129:
                        return AIAI_SMARTSPACE_DOORBELL_EXPIRES_BY_TIME_COUNT;
                    case 130:
                        return AIAI_SMARTSPACE_BEDTIME_EXPIRES_BY_TIME_COUNT;
                    case 131:
                        return AIAI_SMARTSPACE_EARTHQUAKE_EXPIRES_BY_TIME_COUNT;
                    case 132:
                        return AIAI_SMART_SUGGESTIONS_NOTIFICATION_ENQUEUED;
                    case 133:
                        return AIAI_SMART_SUGGESTIONS_OTP_NOT_CHECKED;
                    case 134:
                        return AIAI_SMART_SUGGESTIONS_OTP_CHECKED;
                    case 135:
                        return AIAI_SMART_SUGGESTIONS_OTP_FOUND;
                    case 136:
                        return AIAI_SMART_SUGGESTIONS_ADDED_REPLIES_OR_ACTIONS;
                    case 137:
                        return AIAI_SMART_SUGGESTIONS_DEADLINE_MISSED;
                    case 138:
                        return AIAI_SMART_SUGGESTIONS_NOTIFICATION_SKIPPED_DUE_TO_LOAD;
                    case 139:
                        return AIAI_SMART_SUGGESTIONS_VERY_HIGH_PROCESSING_TIME;
                    case 140:
                        return AIAI_SMART_SUGGESTIONS_SMS_CHANGED_BROADCAST;
                    case 141:
                        return AIAI_SMART_SUGGESTIONS_SMS_CHANGED_POLL;
                    case 142:
                        return AIAI_SMART_SUGGESTIONS_OTP_DETECTION_METHOD_TEXT_CLASSIFIER;
                    case 143:
                        return AIAI_SMART_SUGGESTIONS_OTP_DETECTION_METHOD_LOCAL_HELPER;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.bG;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.bG);
    }
}
