package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import defpackage.clq;
import defpackage.crt;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AIFeature extends bmr {
    public static final Parcelable.Creator CREATOR = new AIFeatureParcelableCreator();
    private final int id;
    private final String modelName;
    private final String name;
    private final int type;
    private final int variant;
    private final int version;

    /* compiled from: PG */
    public @interface Id {
        public static final int AIAI_ZERO_STATE = 205;
        public static final int AIAI_ZERO_STATE_10 = 231;
        public static final int AIAI_ZERO_STATE_11 = 232;
        public static final int AIAI_ZERO_STATE_12 = 233;
        public static final int AIAI_ZERO_STATE_2 = 206;
        public static final int AIAI_ZERO_STATE_3 = 210;
        public static final int AIAI_ZERO_STATE_4 = 225;
        public static final int AIAI_ZERO_STATE_5 = 226;
        public static final int AIAI_ZERO_STATE_6 = 227;
        public static final int AIAI_ZERO_STATE_7 = 228;
        public static final int AIAI_ZERO_STATE_8 = 229;
        public static final int AIAI_ZERO_STATE_9 = 230;
        public static final int AIAI_ZERO_STATE_MAP = 214;
        public static final int AIAI_ZERO_STATE_TEXT_ONLY_EE0 = 211;
        public static final int AIAI_ZERO_STATE_TEXT_ONLY_EE1 = 212;
        public static final int AIAI_ZERO_STATE_WEB = 213;
        public static final int ASTROBOY_V1 = 224;
        public static final int AVA_GEM = 244;
        public static final int BARD_ACTION = 207;
        public static final int BASE_MODEL = 234;
        public static final int BAYMAX_T5X = 221;
        public static final int BUMBLEBEE = 111;
        public static final int BURROW_GEM = 245;
        public static final int CHAPPIE = 253;
        public static final int CHROME_SUMMARIZATION_PER_LAYER_GEM = 112;
        public static final int DIALER_SCAM_GUARD = 237;
        public static final int DIALER_SMART_NOTES = 208;
        public static final int DIALER_SMART_NOTES_2 = 217;
        public static final int DIALER_SMART_NOTES_3 = 218;
        public static final int DIALER_SMART_NOTES_4 = 219;
        public static final int DIALER_SMART_REPLY = 209;
        public static final int DIPPER_GEM_SAMSUNG = 1014;
        public static final int FILES_SMART_DESCRIPTION = 236;
        public static final int FRIDAY = 252;
        public static final int GBOARD_PROOFREADING_PER_LAYER_GEM_1 = 109;
        public static final int GBOARD_PROOFREADING_PER_LAYER_GEM_2 = 110;
        public static final int GBOARD_SMARTREPLY_GPU_CROS = 502;
        public static final int GBOARD_SMARTREPLY_PER_LAYER_GEM = 103;
        public static final int GBOARD_WRITING_TOOLS = 242;
        public static final int HOLLY_GEM = 249;
        public static final int IMAGE_DESCRIPTION_SMALL_TALKBACK = 235;
        public static final int IMAGE_DESCRIPTION_TALKBACK = 223;
        public static final int JARVIS = 251;
        public static final int KRYTEN_GEM = 248;
        public static final int LLM_CPU_GEM = 1;
        public static final int LLM_CPU_GEM_QUALCOMM = 1001;
        public static final int LLM_CPU_GEM_SAMSUNG = 1003;
        public static final int LLM_IT_CPU_GEM = 2;
        public static final int LLM_IT_PER_LAYER_GEM = 108;
        public static final int LLM_IT_QNNHTP_GEM = 1013;
        public static final int LLM_IT_XS_GEM = 201;
        public static final int LLM_MMIT_XS_GEM = 203;
        public static final int LLM_PER_LAYER_GEM = 101;
        public static final int LLM_QNNHTP_GEM = 1012;
        public static final int LLM_QNNHTP_GEM_SAMSUNG = 1005;
        public static final int MALATAO = 239;
        public static final int MESSAGES_MAGICREWRITE_GEM_SAMSUNG = 1008;
        public static final int MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1 = 104;
        public static final int MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2 = 106;
        public static final int MESSAGES_SUGGESTEDTEXT_GEM_SAMSUNG = 1009;
        public static final int MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1 = 105;
        public static final int MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2 = 107;
        public static final int OPTIMUS_BASE = 243;
        public static final int PIXEL_AI_FEATURE_1 = 2001;
        public static final int PIXEL_AI_FEATURE_10 = 2010;
        public static final int PIXEL_AI_FEATURE_10_FEATURE_API = 2022;
        public static final int PIXEL_AI_FEATURE_11 = 2011;
        public static final int PIXEL_AI_FEATURE_11_FEATURE_API = 2023;
        public static final int PIXEL_AI_FEATURE_12 = 2012;
        public static final int PIXEL_AI_FEATURE_12_FEATURE_API = 2024;
        public static final int PIXEL_AI_FEATURE_13 = 2013;
        public static final int PIXEL_AI_FEATURE_13_FEATURE_API = 2025;
        public static final int PIXEL_AI_FEATURE_14 = 2014;
        public static final int PIXEL_AI_FEATURE_14_FEATURE_API = 2026;
        public static final int PIXEL_AI_FEATURE_15 = 2015;
        public static final int PIXEL_AI_FEATURE_15_FEATURE_API = 2027;
        public static final int PIXEL_AI_FEATURE_16 = 2016;
        public static final int PIXEL_AI_FEATURE_16_FEATURE_API = 2028;
        public static final int PIXEL_AI_FEATURE_17 = 2017;
        public static final int PIXEL_AI_FEATURE_18 = 2018;
        public static final int PIXEL_AI_FEATURE_19 = 2019;
        public static final int PIXEL_AI_FEATURE_2 = 2002;
        public static final int PIXEL_AI_FEATURE_20 = 2020;
        public static final int PIXEL_AI_FEATURE_29 = 2029;
        public static final int PIXEL_AI_FEATURE_3 = 2003;
        public static final int PIXEL_AI_FEATURE_30 = 2030;
        public static final int PIXEL_AI_FEATURE_31 = 2031;
        public static final int PIXEL_AI_FEATURE_32 = 2032;
        public static final int PIXEL_AI_FEATURE_33 = 2033;
        public static final int PIXEL_AI_FEATURE_34 = 2034;
        public static final int PIXEL_AI_FEATURE_35 = 2035;
        public static final int PIXEL_AI_FEATURE_36 = 2036;
        public static final int PIXEL_AI_FEATURE_37 = 2037;
        public static final int PIXEL_AI_FEATURE_38 = 2038;
        public static final int PIXEL_AI_FEATURE_39 = 2039;
        public static final int PIXEL_AI_FEATURE_4 = 2004;
        public static final int PIXEL_AI_FEATURE_40 = 2040;
        public static final int PIXEL_AI_FEATURE_41 = 2041;
        public static final int PIXEL_AI_FEATURE_42 = 2042;
        public static final int PIXEL_AI_FEATURE_43 = 2043;
        public static final int PIXEL_AI_FEATURE_44 = 2044;
        public static final int PIXEL_AI_FEATURE_45 = 2045;
        public static final int PIXEL_AI_FEATURE_46 = 2046;
        public static final int PIXEL_AI_FEATURE_47 = 2047;
        public static final int PIXEL_AI_FEATURE_48 = 2048;
        public static final int PIXEL_AI_FEATURE_5 = 2005;
        public static final int PIXEL_AI_FEATURE_6 = 2006;
        public static final int PIXEL_AI_FEATURE_7 = 2007;
        public static final int PIXEL_AI_FEATURE_8 = 2008;
        public static final int PIXEL_AI_FEATURE_9 = 2009;
        public static final int PIXEL_AI_FEATURE_9_FEATURE_API = 2021;
        public static final int R2D2 = 240;
        public static final int RECORDER_SUMMARIZATION_IT_XS_GEM = 202;
        public static final int RECORDER_SUMMARIZATION_PER_LAYER_GEM = 102;
        public static final int ROSEY = 220;
        public static final int ROSIE_ROBOT_CONTINUOUS = 238;
        public static final int ROSIE_ROBOT_DICTATION = 241;
        public static final int ROSIE_ROBOT_GEM = 222;
        public static final int ROSIE_ROBOT_GEM_AUDIO = 254;
        public static final int ROSIE_ROBOT_TRANSLATE = 255;
        public static final int RS_L2 = 215;
        public static final int SAPI_IMAGE_DESCRIPTION_EN_1 = 627;
        public static final int SAPI_IMAGE_DESCRIPTION_EN_2 = 628;
        public static final int SAPI_IMAGE_DESCRIPTION_JP = 629;
        public static final int SAPI_IMAGE_DESCRIPTION_KO = 630;
        public static final int SAPI_PROOFREADING_1 = 603;
        public static final int SAPI_PROOFREADING_DE = 617;
        public static final int SAPI_PROOFREADING_EN = 614;
        public static final int SAPI_PROOFREADING_ES = 620;
        public static final int SAPI_PROOFREADING_FR = 618;
        public static final int SAPI_PROOFREADING_IT = 619;
        public static final int SAPI_PROOFREADING_JA = 615;
        public static final int SAPI_PROOFREADING_KO = 616;
        public static final int SAPI_PROOFREADING_ZH = 626;
        public static final int SAPI_REWRITE_1 = 602;
        public static final int SAPI_REWRITE_DE = 610;
        public static final int SAPI_REWRITE_EN = 607;
        public static final int SAPI_REWRITE_ES = 613;
        public static final int SAPI_REWRITE_FR = 611;
        public static final int SAPI_REWRITE_IT = 612;
        public static final int SAPI_REWRITE_JA = 608;
        public static final int SAPI_REWRITE_KO = 609;
        public static final int SAPI_REWRITE_ZH = 625;
        public static final int SAPI_SUMMARIZATION_1 = 601;
        public static final int SAPI_SUMMARIZATION_2 = 604;
        public static final int SAPI_SUMMARIZATION_3 = 605;
        public static final int SAPI_SUMMARIZATION_4 = 606;
        public static final int SAPI_SUMMARIZATION_EN_1 = 621;
        public static final int SAPI_SUMMARIZATION_EN_2 = 622;
        public static final int SAPI_SUMMARIZATION_EN_3 = 623;
        public static final int SAPI_SUMMARIZATION_EN_4 = 624;
        public static final int SAPI_SUMMARIZATION_JP = 631;
        public static final int SAPI_SUMMARIZATION_KO = 632;
        public static final int SMARTREPLY_QNNHTP_GEM_SAMSUNG = 1006;
        public static final int SMARTREPLY_QNNHTP_GEM_SAMSUNG_KOREAN = 1010;
        public static final int SUMMARIZATION_CPU_GEM_QUALCOMM = 1002;
        public static final int SUMMARIZATION_CPU_GEM_SAMSUNG = 1004;
        public static final int SUMMARIZATION_GPU_CROS = 501;
        public static final int SUMMARIZATION_QNNHTP_GEM_SAMSUNG = 1007;
        public static final int SUMMARIZATION_QNNHTP_GEM_SAMSUNG_KOREAN = 1011;
        public static final int TEXT_EMBEDDING_ST5 = 204;
        public static final int TINKERBELL = 216;
        public static final int TWIKI_GEM = 246;
        public static final int VIKI_GEM = 247;
        public static final int VISION = 250;
    }

    /* compiled from: PG */
    public @interface Type {
        public static final int ASTROBOY = 17;

        @Deprecated
        public static final int AUTOFILL_SMART_REPLY = 6;
        public static final int BAYMAX = 14;
        public static final int IMAGE_DESCRIPTION = 19;
        public static final int INFO_EXTRACTION = 13;
        public static final int LLM = 1;
        public static final int MAGIC_REWRITE = 7;
        public static final int OCR = 10;
        public static final int OPTIMUS = 18;
        public static final int PROOFREADING = 5;
        public static final int QUESTION_TO_ANSWER = 12;
        public static final int ROSIE_ROBOT = 16;
        public static final int SMART_REPLY = 4;
        public static final int SONNY = 20;
        public static final int SUGGESTED_TEXT = 8;
        public static final int SUMMARIZATION = 3;
        public static final int TARS = 15;
        public static final int TEXT_CLASSIFICATION = 11;
        public static final int TEXT_EMBEDDING = 9;
        public static final int TEXT_TO_IMAGE = 2;
    }

    /* compiled from: PG */
    public @interface Variant {
        public static final int CPU = 1;
        public static final int GOOGLE_EDGETPU = 7;

        @Deprecated
        public static final int GOOGLE_HYBRID = 4;

        @Deprecated
        public static final int GOOGLE_TPU = 3;
        public static final int GPU = 2;
        public static final int IREE = 11;
        public static final int MOCK = 10;
        public static final int MTK_APU = 9;
        public static final int OTHER = 5;
        public static final int QNN_HTP = 6;
        public static final int SLSI_NPU = 8;
    }

    public AIFeature(String str, String str2, int i, int i2, int i3, int i4) {
        this.name = str;
        this.modelName = str2;
        this.type = i;
        this.variant = i2;
        this.id = i3;
        this.version = i4;
    }

    public static AIFeature create(String str, String str2, int i, int i2, int i3) {
        return new AIFeature(str, str2, i, i2, i3, 0);
    }

    public static Predicate getIdMatcher(final int i) {
        return new Predicate() { // from class: com.google.android.apps.aicore.aidl.AIFeature$$ExternalSyntheticLambda1
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AIFeature.lambda$getIdMatcher$0(i, (AIFeature) obj);
            }
        };
    }

    public static Predicate getMatcher(final int i, final int i2) {
        return new Predicate() { // from class: com.google.android.apps.aicore.aidl.AIFeature$$ExternalSyntheticLambda0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AIFeature.lambda$getMatcher$0(i, i2, (AIFeature) obj);
            }
        };
    }

    static /* synthetic */ boolean lambda$getIdMatcher$0(int i, AIFeature aIFeature) {
        return aIFeature.getId() == i;
    }

    static /* synthetic */ boolean lambda$getMatcher$0(int i, int i2, AIFeature aIFeature) {
        return aIFeature.getId() == i && aIFeature.getVersion() == i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIFeature)) {
            return false;
        }
        AIFeature aIFeature = (AIFeature) obj;
        return this.type == aIFeature.type && this.variant == aIFeature.variant && Objects.equals(this.name, aIFeature.name) && this.id == aIFeature.id && this.version == aIFeature.version;
    }

    public int getId() {
        return this.id;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public int getVariant() {
        return this.variant;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, Integer.valueOf(this.type), Integer.valueOf(this.variant), Integer.valueOf(this.id), Integer.valueOf(this.version));
    }

    public String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("name", this.name);
        crtVarQ.e("modelName", this.modelName);
        return crtVarQ.a("type", this.type).a("variant", this.variant).a("id", this.id).a("version", this.version).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AIFeatureParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static AIFeature create(String str, String str2, int i, int i2, int i3, int i4) {
        return new AIFeature(str, str2, i, i2, i3, i4);
    }
}
