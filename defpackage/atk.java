package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atk implements eff {
    UNKNOWN_COUNT(0),
    PCS_HTTP_DOWNLOAD_SUCCESS(13),
    PCS_HTTP_DOWNLOAD_FAILURE(14),
    PCS_INPROCESS_HTTP_DOWNLOAD_SUCCESS(15),
    PCS_INPROCESS_HTTP_DOWNLOAD_FAILURE(16),
    PCS_PIR_DOWNLOAD_SUCCESS(17),
    PCS_PIR_DOWNLOAD_FAILURE(18),
    PCS_INPROCESS_PIR_DOWNLOAD_SUCCESS(19),
    PCS_INPROCESS_PIR_DOWNLOAD_FAILURE(20),
    PCC_SETTINGS_OPENED(90),
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
    PCS_TRAINING_BINDER_SERVICE_CONNECTED(128);

    public final int H;

    atk(int i) {
        this.H = i;
    }

    public static atk b(int i) {
        if (i == 0) {
            return UNKNOWN_COUNT;
        }
        if (i == 90) {
            return PCC_SETTINGS_OPENED;
        }
        if (i == 109) {
            return PCC_ATTESTATION_MEASUREMENT_REQUEST;
        }
        if (i == 110) {
            return PCC_ATTESTATION_RECORD_GENERATED;
        }
        switch (i) {
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
            default:
                switch (i) {
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
                    default:
                        switch (i) {
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
                            default:
                                switch (i) {
                                    case 125:
                                        return PCS_TRAINING_BINDER_DIED;
                                    case 126:
                                        return PCS_TRAINING_BINDER_NULL;
                                    case 127:
                                        return PCS_TRAINING_BINDER_SERVICE_DISCONNECTED;
                                    case 128:
                                        return PCS_TRAINING_BINDER_SERVICE_CONNECTED;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.H);
    }
}
