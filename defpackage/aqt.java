package defpackage;

import android.provider.DeviceConfig;
import android.util.Base64;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqt extends aqr {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/federatedcompute/config/impl/PcsFcDeviceConfigFlags");
    private static final String b = aog.DEVICE_PERSONALIZATION_SERVICES.e;

    @Override // defpackage.aqr
    public final int a() {
        return DeviceConfig.getInt(b, "Brella__attestation_mode", 3);
    }

    @Override // defpackage.aqr
    public final int b() {
        return DeviceConfig.getInt(b, "Brella__log_counter_sampling_percentage", 0);
    }

    @Override // defpackage.aqr
    public final int c() {
        return DeviceConfig.getInt(b, "Brella__log_sampling_percentage", 5);
    }

    @Override // defpackage.aqr
    public final int d() {
        return DeviceConfig.getInt(b, "Brella__max_binder_delay_seconds", 100);
    }

    @Override // defpackage.aqr
    public final int e() {
        return DeviceConfig.getInt(b, "Brella__max_serialized_atom_size", AIFeature.Id.PIXEL_AI_FEATURE_48);
    }

    @Override // defpackage.aqr
    public final String g() {
        return DeviceConfig.getString(b, "Brella__session_name_prefix_for_debug_override", "");
    }

    @Override // defpackage.aqr
    public final boolean i() {
        return DeviceConfig.getBoolean(b, "Brella__allow_logging_error_message", true);
    }

    @Override // defpackage.aqr
    public final boolean j() {
        return DeviceConfig.getBoolean(b, "Brella__allow_logging_sec_agg_client_event", true);
    }

    @Override // defpackage.aqr
    public final boolean k() {
        return DeviceConfig.getBoolean(b, "Brella__enable_device_config_overrides", true);
    }

    @Override // defpackage.aqr
    public final boolean l() {
        return DeviceConfig.getBoolean(b, "Brella__enable_federated_computation_in_pcs", false);
    }

    @Override // defpackage.aqr
    public final boolean m() {
        return DeviceConfig.getBoolean(b, "Brella__enable_westworld_logging_override", false);
    }

    @Override // defpackage.bra
    protected final double p(tn tnVar, cgr cgrVar) {
        String property = DeviceConfig.getProperty(b, cgrVar.a);
        if (property == null) {
            return ((Double) cgrVar.b()).doubleValue();
        }
        try {
            return Double.parseDouble(property);
        } catch (NumberFormatException e) {
            ((czl) ((czl) ((czl) a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/config/impl/PcsFcDeviceConfigFlags", "getDouble", 71, "PcsFcDeviceConfigFlags.java")).r("DeviceConfig value for flag [%s] could not be parsed as a Double, returning safe default.", cgrVar.a);
            return ((Double) cgrVar.b()).doubleValue();
        }
    }

    @Override // defpackage.bra, defpackage.bpz
    public final int q() {
        return DeviceConfig.getInt(b, "Brella__inapp_training_on_trim_memory_interrupt_level", 10);
    }

    @Override // defpackage.bra
    protected final long r(tn tnVar, cgr cgrVar) {
        return DeviceConfig.getLong(b, cgrVar.a, ((Long) cgrVar.b()).longValue());
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [egi, java.lang.Object] */
    @Override // defpackage.bra
    protected final egi s(egi egiVar, tn tnVar, cgr cgrVar) {
        String property = DeviceConfig.getProperty(b, cgrVar.a);
        if (property == null) {
            return cgrVar.b() == null ? egiVar : (egi) cgrVar.b();
        }
        try {
            return egiVar.getParserForType().c(Base64.decode(property, 0), een.a());
        } catch (efp e) {
            ((czl) ((czl) ((czl) a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/config/impl/PcsFcDeviceConfigFlags", "getProto", 152, "PcsFcDeviceConfigFlags.java")).r("DeviceConfig value for flag [%s] could not be parsed", cgrVar.a);
            return egiVar;
        }
    }

    @Override // defpackage.bra
    protected final String t(tn tnVar, cgr cgrVar) {
        return DeviceConfig.getString(b, cgrVar.a, (String) cgrVar.b());
    }

    @Override // defpackage.bra
    protected final List u(tn tnVar, cgr cgrVar) {
        efm efmVar = ((eid) cgrVar.b()).b;
        String str = b;
        String str2 = cgrVar.a;
        String property = DeviceConfig.getProperty(str, str2);
        if (property == null) {
            if (efmVar != null) {
                return cxc.o(efmVar);
            }
            int i = cxc.d;
            return cyp.a;
        }
        try {
            return cxc.o(((eid) efb.parseFrom(eid.a, Base64.decode(property, 0), een.a())).b);
        } catch (efp e) {
            ((czl) ((czl) ((czl) a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/config/impl/PcsFcDeviceConfigFlags", "getStringList", 123, "PcsFcDeviceConfigFlags.java")).r("DeviceConfig value for flag [%s] could not be parsed as StringListParam", str2);
            int i2 = cxc.d;
            return cyp.a;
        }
    }

    @Override // defpackage.bra
    protected final boolean v(tn tnVar, cgr cgrVar) {
        return DeviceConfig.getBoolean(b, cgrVar.a, ((Boolean) cgrVar.b()).booleanValue());
    }

    @Override // defpackage.bra
    protected final List w(cgr cgrVar) {
        String property = DeviceConfig.getProperty(b, cgrVar.a);
        if (property == null) {
            if (cgrVar.b() != null) {
                return ((eic) cgrVar.b()).b;
            }
            int i = cxc.d;
            return cyp.a;
        }
        try {
            return ((eic) efb.parseFrom(eic.a, Base64.decode(property, 0), een.a())).b;
        } catch (efp e) {
            ((czl) ((czl) ((czl) a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/config/impl/PcsFcDeviceConfigFlags", "getIntList", 96, "PcsFcDeviceConfigFlags.java")).r("DeviceConfig value for flag [%s] could not be parsed as Int32ListParam", cgrVar.a);
            int i2 = cxc.d;
            return cyp.a;
        }
    }
}
