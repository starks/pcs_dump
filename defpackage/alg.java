package defpackage;

import android.util.Pair;
import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alg implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ alg(int i) {
        this.a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        euw euwVar;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((aot) obj).a());
            case 1:
                return ((Method) obj).getName();
            case 2:
                return Integer.valueOf(((aqr) obj).a());
            case 3:
                return (arq) ((Optional) obj).get();
            case 4:
                arv arvVar = arv.UNKNOWN_POPULATION;
                return ((arv) obj).jY;
            case 5:
                arv arvVar2 = (arv) obj;
                arv arvVar3 = arv.UNKNOWN_POPULATION;
                return arvVar2;
            case 6:
                arv arvVar4 = arv.UNKNOWN_POPULATION;
                return Integer.valueOf(Math.abs(arv.a(((arv) obj).jY)));
            case 7:
                arv arvVar5 = (arv) obj;
                arv arvVar6 = arv.UNKNOWN_POPULATION;
                return arvVar5;
            case 8:
                Comparator comparator = ava.a;
                return ((ava) obj).i();
            case 9:
                Collection<ava> collection = (Collection) obj;
                HashSet hashSet = new HashSet();
                for (ava avaVar : collection) {
                    auj aujVarA = avaVar.g().a();
                    if (((aujVarA.b == 1 ? (auk) aujVarA.c : auk.a).b & 1) != 0) {
                        auj aujVarA2 = avaVar.g().a();
                        if (!(aujVarA2.b == 1 ? (auk) aujVarA2.c : auk.a).c.isEmpty()) {
                            auj aujVarA3 = avaVar.g().a();
                            hashSet.add(Pair.create((aujVarA3.b == 1 ? (auk) aujVarA3.c : auk.a).c, avaVar.g().c()));
                        }
                    }
                }
                clq.w(hashSet.size() <= 1, "Unexpected logs found for FC entities.");
                if (hashSet.isEmpty()) {
                    euwVar = new euw(ayg.n(auw.FC_CHECK_IN).k());
                } else {
                    cxo cxoVar = aux.a;
                    euwVar = new euw((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
                    asr asrVar = (asr) auj.a.createBuilder();
                    asr asrVar2 = (asr) auk.a.createBuilder();
                    String str = (String) ((Pair) hashSet.iterator().next()).first;
                    if (!asrVar2.a.isMutable()) {
                        asrVar2.B();
                    }
                    auk aukVar = (auk) asrVar2.a;
                    str.getClass();
                    aukVar.b |= 1;
                    aukVar.c = str;
                    auk aukVar2 = (auk) asrVar2.z();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    auj aujVar = (auj) asrVar.a;
                    aukVar2.getClass();
                    aujVar.c = aukVar2;
                    aujVar.b = 1;
                    euwVar.l((auj) asrVar.z());
                    euwVar.m((String) ((Pair) hashSet.iterator().next()).second);
                }
                int i = cxc.d;
                cwy cwyVar = new cwy();
                if (hashSet.isEmpty()) {
                    cwyVar.j((Iterable) Collection.EL.stream(collection).map(new akn(euwVar, 4)).collect(cvu.a));
                } else {
                    cwyVar.j((Iterable) Collection.EL.stream(collection).map(new akn(euwVar, 5)).collect(cvu.a));
                }
                return new aww(cwyVar.g());
            case 10:
                return new aww(cxc.q((ava) obj));
            case 11:
                return Collection.EL.stream((cxc) obj);
            case 12:
                return ((aww) obj).f();
            case 13:
                return ((ayt) obj).c();
            case 14:
                return ((axn) obj).name();
            case 15:
                axn axnVar = (axn) obj;
                cwr cwrVar = ayu.a;
                return axnVar;
            case 16:
                cwr cwrVar2 = ayu.a;
                return ((ayt) ((Map.Entry) obj).getValue()).c();
            case 17:
                return (axi) ((Map.Entry) obj).getKey();
            case 18:
                return (Long) ((bal) obj).b();
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return Optional.ofNullable((bcu) ((ffk) obj).b());
            default:
                return ((bez) obj).b;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
