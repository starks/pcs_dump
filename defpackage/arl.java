package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.net.Uri;
import android.os.StrictMode;
import android.system.virtualmachine.VirtualMachine;
import android.system.virtualmachine.VirtualMachineDescriptor;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.apps.miphone.astrea.common.jobs.HeartbeatService;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import java.io.IOException;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class arl implements crp {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ arl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [bbd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [bbd, java.lang.Object] */
    @Override // defpackage.crp
    public final Object a(Object obj) {
        att attVar;
        switch (this.b) {
            case 0:
                EnumMap enumMap = new EnumMap(att.class);
                final arp arpVar = (arp) this.a;
                JobScheduler jobScheduler = (JobScheduler) arpVar.c.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
                    while (it.hasNext()) {
                        int id = it.next().getId();
                        cxg cxgVar = aru.a;
                        int iAbs = Math.abs(id);
                        cxg cxgVar2 = aru.a;
                        Integer numValueOf = Integer.valueOf(iAbs);
                        if (cxgVar2.containsKey(numValueOf)) {
                            attVar = (att) aru.a.get(numValueOf);
                        } else {
                            arv arvVar = (arv) arv.jX.get(Integer.valueOf(iAbs));
                            if (arvVar != null) {
                                String str = arvVar.jY;
                                attVar = str.startsWith("nowplaying") ? att.NOW_PLAYING_POPULATION_SCHEDULED_COUNT : str.startsWith("smartselect") ? att.SMARTSELECT_POPULATION_SCHEDULED_COUNT : str.startsWith("safecomms") ? att.SAFE_COMMS_POPULATION_SCHEDULED_COUNT : str.startsWith("nextconversation") ? att.NEXT_CONVERSATION_POPULATION_SCHEDULED_COUNT : str.startsWith("autofill") ? att.AUTOFILL_POPULATION_SCHEDULED_COUNT : str.startsWith("contentcapture") ? att.CONTENT_CAPTURE_POPULATION_SCHEDULED_COUNT : str.startsWith("echo") ? att.ECHO_POPULATION_SCHEDULED_COUNT : str.startsWith("overview") ? att.OVERVIEW_POPULATION_SCHEDULED_COUNT : str.startsWith("pecan") ? att.PECAN_POPULATION_SCHEDULED_COUNT : str.startsWith("livetranslate") ? att.LIVE_TRANSLATE_POPULATION_SCHEDULED_COUNT : str.startsWith("search") ? att.TOAST_SEARCH_POPULATION_SCHEDULED_COUNT : str.startsWith("toastquery") ? att.TOAST_QUERY_POPULATION_SCHEDULED_COUNT : str.startsWith("ambientcontext") ? att.AMBIENT_CONTEXT_POPULATION_SCHEDULED_COUNT : str.startsWith("odad") ? att.PLAY_PROTECTION_POPULATION_SCHEDULED_COUNT : str.contains("platform_logging") ? att.PLATFORM_LOGGING_POPULATION_SCHEDULED_COUNT : att.UNKNOWN_POPULATION_SCHEDULED_COUNT;
                            } else {
                                attVar = null;
                            }
                        }
                        if (attVar != null) {
                            Map.EL.merge(enumMap, attVar, 1, new BiFunction() { // from class: aro
                                public final /* synthetic */ BiFunction andThen(Function function) {
                                    return BiFunction$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj2, Object obj3) {
                                    return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    Map.EL.forEach(enumMap, new BiConsumer() { // from class: arj
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            att attVar2 = (att) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            asr asrVar = (asr) ati.a.createBuilder();
                            if (!asrVar.a.isMutable()) {
                                asrVar.B();
                            }
                            ati atiVar = (ati) asrVar.a;
                            atiVar.c = attVar2.u;
                            atiVar.b |= 1;
                            if (!asrVar.a.isMutable()) {
                                asrVar.B();
                            }
                            arp arpVar2 = arpVar;
                            ati atiVar2 = (ati) asrVar.a;
                            atiVar2.b |= 2;
                            atiVar2.d = iIntValue;
                            arpVar2.e.f((ati) asrVar.z());
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                        }
                    });
                }
                return null;
            case 1:
                HashSet hashSet = new HashSet();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    hashSet.add(new aou((HeartbeatService) this.a, (Long) it2.next(), 0));
                }
                return hashSet;
            case 2:
                Optional optional = (Optional) obj;
                czn cznVar = bbq.b;
                boolean zIsPresent = optional.isPresent();
                Object obj2 = this.a;
                if (zIsPresent) {
                    ((czl) ((czl) bbq.b.c()).i("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl", "readOrCreatePersistentState", AIFeature.Id.MALATAO, "ProtectedDownloadProcessorImpl.java")).r("found persistent state for client %s", obj2);
                } else {
                    ((czl) ((czl) bbq.b.c()).i("com/google/android/apps/miphone/astrea/pd/processor/impl/ProtectedDownloadProcessorImpl", "readOrCreatePersistentState", AIFeature.Id.ROSIE_ROBOT_DICTATION, "ProtectedDownloadProcessorImpl.java")).r("creating new persistent state for client %s", obj2);
                }
                return (bbc) optional.orElse(bbq.c);
            case 3:
                return ((bbq) this.a).d((Optional) obj);
            case 4:
                return this.a.b((axv) obj);
            case 5:
                return this.a.a((axt) obj);
            case 6:
                czn cznVar2 = bcy.a;
                ((AtomicReference) this.a).set((VirtualMachineDescriptor) obj);
                return axy.a;
            case 7:
                czn cznVar3 = bcy.a;
                ((VirtualMachine) this.a).close();
                return null;
            case 8:
                return bcy.e((VirtualMachine) this.a);
            case 9:
                bgf bgfVar = (bgf) obj;
                if (bgfVar != null) {
                    bfx bfxVar = (bfx) this.a;
                    eja ejaVar = ((eix) bfxVar.b.a).k;
                    if (ejaVar == null) {
                        ejaVar = eja.b;
                    }
                    eiw eiwVar = (eiw) ejaVar.toBuilder();
                    eja ejaVar2 = ((eix) bfxVar.b.a).k;
                    if (ejaVar2 == null) {
                        ejaVar2 = eja.b;
                    }
                    dxn dxnVar = ejaVar2.f;
                    if (dxnVar == null) {
                        dxnVar = dxn.a;
                    }
                    asr asrVar = (asr) dxnVar.toBuilder();
                    String strB = bgfVar.b();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    dxn dxnVar2 = (dxn) asrVar.a;
                    strB.getClass();
                    dxnVar2.c = strB;
                    dxm dxmVarA = bgfVar.a();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    dxn dxnVar3 = (dxn) asrVar.a;
                    dxmVarA.getClass();
                    dxnVar3.d = dxmVarA;
                    dxnVar3.b |= 1;
                    if (!eiwVar.a.isMutable()) {
                        eiwVar.B();
                    }
                    eja ejaVar3 = (eja) eiwVar.a;
                    dxn dxnVar4 = (dxn) asrVar.z();
                    dxnVar4.getClass();
                    ejaVar3.f = dxnVar4;
                    ejaVar3.c |= 4;
                    eja ejaVar4 = (eja) eiwVar.z();
                    eiw eiwVar2 = bfxVar.b;
                    if (!eiwVar2.a.isMutable()) {
                        eiwVar2.B();
                    }
                    eix eixVar = (eix) eiwVar2.a;
                    ejaVar4.getClass();
                    eixVar.k = ejaVar4;
                    eixVar.c |= 268435456;
                }
                return null;
            case 10:
                return ((bhc) this.a).a((bfx) obj, bgv.b);
            case 11:
                if (!((Boolean) obj).booleanValue()) {
                    Object obj3 = this.a;
                    bxh.a.h("JobScheduler returned failure after successful run!");
                    ((bxh) obj3).d.k(ccj.cL);
                }
                return null;
            case 12:
                return ((AtomicReference) this.a).get();
            case 13:
                throw null;
            case 14:
                int i = cgi.a;
                asr asrVar2 = (asr) cfy.a.createBuilder();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((cfy) obj).b).entrySet()) {
                    Object obj4 = this.a;
                    cfw cfwVar = (cfw) entry.getValue();
                    asr asrVar3 = (asr) cfw.a.createBuilder();
                    if (!cfwVar.d.equals(obj4)) {
                        String str2 = cfwVar.d;
                        if (!asrVar3.a.isMutable()) {
                            asrVar3.B();
                        }
                        cfw cfwVar2 = (cfw) asrVar3.a;
                        str2.getClass();
                        cfwVar2.b |= 1;
                        cfwVar2.d = str2;
                    }
                    for (String str3 : cfwVar.c) {
                        if (!str3.equals(obj4)) {
                            asrVar3.d(str3);
                        }
                    }
                    asrVar2.c((String) entry.getKey(), (cfw) asrVar3.z());
                }
                return (cfy) asrVar2.z();
            case 15:
                int i2 = cgi.a;
                cfw cfwVar3 = cfw.a;
                egd egdVar = ((cfy) obj).b;
                Object obj5 = this.a;
                if (egdVar.containsKey(obj5)) {
                    cfwVar3 = (cfw) egdVar.get(obj5);
                }
                return cfwVar3.c;
            case 16:
                int i3 = cgi.a;
                Object obj6 = this.a;
                cfw cfwVar4 = cfw.a;
                obj6.getClass();
                egd egdVar2 = ((cfy) obj).b;
                if (egdVar2.containsKey(obj6)) {
                    cfwVar4 = (cfw) egdVar2.get(obj6);
                }
                return cfwVar4.d;
            case 17:
                cfv cfvVar = (cfv) obj;
                eqh eqhVar = new eqh((char[]) null, (byte[]) null);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                Object obj7 = this.a;
                try {
                    try {
                        synchronized (chi.a) {
                            fcy fcyVar = (fcy) ((chi) obj7).f.a();
                            Uri uri = ((chi) obj7).i;
                            cfr cfrVar = cfvVar.c;
                            if (cfrVar == null) {
                                cfrVar = cfr.b;
                            }
                            cii ciiVar = new cii(cfrVar);
                            ciiVar.a = new eqh[]{eqhVar};
                            fcyVar.g(uri, ciiVar);
                            cfr cfrVar2 = cfvVar.c;
                            if (cfrVar2 == null) {
                                cfrVar2 = cfr.b;
                            }
                            ((chi) obj7).j = cfrVar2;
                        }
                        synchronized (chi.b) {
                            fcy fcyVar2 = (fcy) ((chi) obj7).f.a();
                            Uri uri2 = ((chi) obj7).k;
                            cft cftVar = cfvVar.d;
                            if (cftVar == null) {
                                cftVar = cft.b;
                            }
                            cii ciiVar2 = new cii(cftVar);
                            ciiVar2.a = new eqh[]{eqhVar};
                            fcyVar2.g(uri2, ciiVar2);
                            cft cftVar2 = cfvVar.d;
                            if (cftVar2 == null) {
                                cftVar2 = cft.b;
                            }
                            ((chi) obj7).l = cftVar2;
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            default:
                ((ctv) this.a).j(obj);
                return obj;
        }
    }
}
