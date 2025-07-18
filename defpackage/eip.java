package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eip implements eff {
    UNKNOWN_VALUE(0),
    AIAI_USAGE_SCHEDULED_EXECUTOR_TOTAL_DAYS_UPLOADED(1),
    AIAI_USAGE_PRIORITY_SUGGESTION_NUM_EXISTING_PRIORITIES(2),
    AIAI_USAGE_PRIORITY_SUGGESTION_NUM_PRIORITY_CANDIDATES(3),
    AIAI_SMARTSPACE_WEATHER_MISSING_DURATION(4),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_TEXT_MEDIA_LATENCY(5),
    AIAI_SMARTSPACE_PACKAGE_DELIVERY_PICK_UP_DURATION(6),
    AIAI_SMARTSPACE_DOORBELL_NOTIFICATION_LATENCY_MS(7),
    AIAI_SMARTSPACE_TOTAL_TARGETS_POST_TWIDDLING(8),
    AIAI_SMARTSPACE_TOTAL_TARGETS_FILTERED_BY_TWIDDLERS(9),
    PCS_STATSMANAGER_QUERY_SUCCESS_LATENCY_MS(100),
    PCS_STATSMANAGER_QUERY_FAILURE_LATENCY_MS(AIFeature.Id.LLM_PER_LAYER_GEM),
    PCS_NUM_JOBS_SCHEDULED_COUNT(AIFeature.Id.RECORDER_SUMMARIZATION_PER_LAYER_GEM),
    NOW_PLAYING_POPULATION_SCHEDULED_COUNT(AIFeature.Id.GBOARD_SMARTREPLY_PER_LAYER_GEM),
    NEXT_CONVERSATION_POPULATION_SCHEDULED_COUNT(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1),
    SAFE_COMMS_POPULATION_SCHEDULED_COUNT(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1),
    AUTOFILL_POPULATION_SCHEDULED_COUNT(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2),
    CONTENT_CAPTURE_POPULATION_SCHEDULED_COUNT(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2),
    ECHO_POPULATION_SCHEDULED_COUNT(AIFeature.Id.LLM_IT_PER_LAYER_GEM),
    OVERVIEW_POPULATION_SCHEDULED_COUNT(AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1),
    LIVE_TRANSLATE_POPULATION_SCHEDULED_COUNT(130),
    TOAST_SEARCH_POPULATION_SCHEDULED_COUNT(AIFeature.Id.BUMBLEBEE),
    TOAST_QUERY_POPULATION_SCHEDULED_COUNT(AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM),
    AMBIENT_CONTEXT_POPULATION_SCHEDULED_COUNT(113),
    PECAN_POPULATION_SCHEDULED_COUNT(114),
    PLAY_PROTECTION_POPULATION_SCHEDULED_COUNT(115),
    PLATFORM_LOGGING_POPULATION_SCHEDULED_COUNT(116),
    SMARTSELECT_POPULATION_SCHEDULED_COUNT(117),
    UNKNOWN_POPULATION_SCHEDULED_COUNT(118);

    public final int D;

    eip(int i) {
        this.D = i;
    }

    public static eip b(int i) {
        if (i == 130) {
            return LIVE_TRANSLATE_POPULATION_SCHEDULED_COUNT;
        }
        switch (i) {
            case 0:
                return UNKNOWN_VALUE;
            case 1:
                return AIAI_USAGE_SCHEDULED_EXECUTOR_TOTAL_DAYS_UPLOADED;
            case 2:
                return AIAI_USAGE_PRIORITY_SUGGESTION_NUM_EXISTING_PRIORITIES;
            case 3:
                return AIAI_USAGE_PRIORITY_SUGGESTION_NUM_PRIORITY_CANDIDATES;
            case 4:
                return AIAI_SMARTSPACE_WEATHER_MISSING_DURATION;
            case 5:
                return AIAI_SMARTSPACE_PACKAGE_DELIVERY_TEXT_MEDIA_LATENCY;
            case 6:
                return AIAI_SMARTSPACE_PACKAGE_DELIVERY_PICK_UP_DURATION;
            case 7:
                return AIAI_SMARTSPACE_DOORBELL_NOTIFICATION_LATENCY_MS;
            case 8:
                return AIAI_SMARTSPACE_TOTAL_TARGETS_POST_TWIDDLING;
            case 9:
                return AIAI_SMARTSPACE_TOTAL_TARGETS_FILTERED_BY_TWIDDLERS;
            default:
                switch (i) {
                    case 100:
                        return PCS_STATSMANAGER_QUERY_SUCCESS_LATENCY_MS;
                    case AIFeature.Id.LLM_PER_LAYER_GEM /* 101 */:
                        return PCS_STATSMANAGER_QUERY_FAILURE_LATENCY_MS;
                    case AIFeature.Id.RECORDER_SUMMARIZATION_PER_LAYER_GEM /* 102 */:
                        return PCS_NUM_JOBS_SCHEDULED_COUNT;
                    case AIFeature.Id.GBOARD_SMARTREPLY_PER_LAYER_GEM /* 103 */:
                        return NOW_PLAYING_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1 /* 104 */:
                        return NEXT_CONVERSATION_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1 /* 105 */:
                        return SAFE_COMMS_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2 /* 106 */:
                        return AUTOFILL_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2 /* 107 */:
                        return CONTENT_CAPTURE_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Id.LLM_IT_PER_LAYER_GEM /* 108 */:
                        return ECHO_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1 /* 109 */:
                        return OVERVIEW_POPULATION_SCHEDULED_COUNT;
                    default:
                        switch (i) {
                            case AIFeature.Id.BUMBLEBEE /* 111 */:
                                return TOAST_SEARCH_POPULATION_SCHEDULED_COUNT;
                            case AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM /* 112 */:
                                return TOAST_QUERY_POPULATION_SCHEDULED_COUNT;
                            case 113:
                                return AMBIENT_CONTEXT_POPULATION_SCHEDULED_COUNT;
                            case 114:
                                return PECAN_POPULATION_SCHEDULED_COUNT;
                            case 115:
                                return PLAY_PROTECTION_POPULATION_SCHEDULED_COUNT;
                            case 116:
                                return PLATFORM_LOGGING_POPULATION_SCHEDULED_COUNT;
                            case 117:
                                return SMARTSELECT_POPULATION_SCHEDULED_COUNT;
                            case 118:
                                return UNKNOWN_POPULATION_SCHEDULED_COUNT;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.D;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.D);
    }
}
