package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum att implements eff {
    UNKNOWN_VALUE(0),
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

    public final int u;

    att(int i) {
        this.u = i;
    }

    public static att b(int i) {
        if (i == 0) {
            return UNKNOWN_VALUE;
        }
        if (i == 130) {
            return LIVE_TRANSLATE_POPULATION_SCHEDULED_COUNT;
        }
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

    @Override // defpackage.eff
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
